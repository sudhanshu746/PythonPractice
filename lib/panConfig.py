

import ConfigParser
import os
import StringIO

"""
Panara Configuration Manager
"""

class panConfig:

   """
   Wraps SafeConfigParser to provide configuration data based on the
   current environment

   Loads INI files contained in a directory ../config from where
   this Python module is located.

   USAGE:

     Two ini files in play.  an_app.ini overrides panera.ini's value
     of edw_data.  We use interpolation to build up values.
     We substitute %(db_prefix)s with  hdfs:///prod/db

       panera.ini and another over-riding INI file

           >cat ../../config/panera.ini
           [DEFAULT]
           hdfs_prefix = hdfs:///prod
           [DIRS]
           db_prefix = %(hdfs_prefix)s/db
           edw_data = %(db_prefix)s/edw
           
           >cat ../../config/an_app.ini
           [DIRS]
           edw_data = %(db_prefix)s/edw_new
           
           
       Small script to use the INI files

           >cat testConfig.py
           import panConfig
           theIni = panConfig.panConfig(['an_app.ini'])
           print theIni.get('edw_data', 'DIRS')
           
           
       Results showing that an_app.ini over-rode DIRS edw_data with
       a different value

           >python testConfig.py
           hdfs:///prod/db/edw_new



   """
   def __init__ (self, ini_overrides=None):


      """
      Sets up configuration based on the filenames in ini_overrides plus
      the default of panera.ini.  ini_overrides must be a list of strings.

      Files that appear last in ini_overrides take precedence.

      For details on the format of INI files check out 
      https://docs.python.org/library/configparser
      """

      # Setup configDir.  It will be at ../config from the location of this
      # python module
      abspath = os.path.abspath(__file__)
      configDir = os.path.dirname(os.path.dirname(abspath)) + "/config/"

      # Setup the list of fully qualified ini_files to read.
      # Prepend configDir to each element in ini_overrides
      ini_files = [] 
      ini_files.append(configDir + 'panera.ini')
      if ini_overrides:
          if type(ini_overrides).__name__ == 'list':
              for ini_file in ini_overrides:
                  ini_files.append(configDir + ini_file)
          else:
              raise Exception ("ini_overrides must be a list of strings")

      # Add in the default panera.ini file as the las file
      # ini_files.append(configDir + 'panera.ini')

      # Read the INI files into self.config
      self.config = ConfigParser.SafeConfigParser()
      self.config.read (ini_files)

   def get (self, optionName, sectionName='DEFAULT'):

      """
      Get the configuration value of optionName in sectionName.  When
      sectionName is not supplied, then get the option value from the DEFAULT section
      """
      return self.config.get(sectionName, optionName)


   def get_int (self, optionName, sectionName='DEFAULT'):

      """
      Get the configuration value of optionName in sectionName as an integer.  When
      sectionName is not supplied, then get the option value from the DEFAULT section
      """
      return int(self.get(optionName, sectionName))

   def get_float (self, optionName, sectionName='DEFAULT'):

      """
      Get the configuration value of optionName in sectionName as an float.  When
      sectionName is not supplied, then get the option value from the DEFAULT section
      """
      return float(self.get(optionName, sectionName))

   def dump (self):

      """
      For debugging purposes, return a merged configuration file.
      """
      fp = StringIO.StringIO()
      self.config.write(fp)
      return fp.getvalue()
