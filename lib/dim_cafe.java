// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 29 17:01:30 GMT 2017
// For connector: org.apache.sqoop.manager.OracleManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class dim_cafe extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Z_CAFE_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Z_CAFE_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("CAFE_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CAFE_NBR = (java.math.BigDecimal)value;
      }
    });
    setters.put("CAFE_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CAFE_NAME = (String)value;
      }
    });
    setters.put("OPENED_DATE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        OPENED_DATE = (java.sql.Timestamp)value;
      }
    });
    setters.put("CLOSED_DATE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CLOSED_DATE = (java.sql.Timestamp)value;
      }
    });
    setters.put("LOC_CURRENCY_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LOC_CURRENCY_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("POS_SYSTEM_TYPE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        POS_SYSTEM_TYPE = (String)value;
      }
    });
    setters.put("POS_POLLING_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        POS_POLLING_FLAG = (java.math.BigDecimal)value;
      }
    });
    setters.put("TIMEZONE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TIMEZONE = (String)value;
      }
    });
    setters.put("CAFE_DRIVETHRU_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CAFE_DRIVETHRU_FLAG = (java.math.BigDecimal)value;
      }
    });
    setters.put("POS_SYSTEM_UPGRADE_DATE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        POS_SYSTEM_UPGRADE_DATE = (java.sql.Timestamp)value;
      }
    });
    setters.put("TMX_CUTOVER_DATE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TMX_CUTOVER_DATE = (java.sql.Timestamp)value;
      }
    });
    setters.put("POSTAL_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        POSTAL_CODE = (String)value;
      }
    });
    setters.put("TMX_INTEGRATION_DATE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TMX_INTEGRATION_DATE = (java.sql.Timestamp)value;
      }
    });
    setters.put("TMX_FORECAST_DATE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TMX_FORECAST_DATE = (java.sql.Timestamp)value;
      }
    });
    setters.put("CORPORATE_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CORPORATE_FLAG = (String)value;
      }
    });
    setters.put("RECIPE_TYPE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        RECIPE_TYPE = (String)value;
      }
    });
    setters.put("OPEN_SUN_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        OPEN_SUN_FLAG = (java.math.BigDecimal)value;
      }
    });
    setters.put("OPEN_MON_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        OPEN_MON_FLAG = (java.math.BigDecimal)value;
      }
    });
    setters.put("OPEN_TUE_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        OPEN_TUE_FLAG = (java.math.BigDecimal)value;
      }
    });
    setters.put("OPEN_WED_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        OPEN_WED_FLAG = (java.math.BigDecimal)value;
      }
    });
    setters.put("OPEN_THUR_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        OPEN_THUR_FLAG = (java.math.BigDecimal)value;
      }
    });
    setters.put("OPEN_FRI_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        OPEN_FRI_FLAG = (java.math.BigDecimal)value;
      }
    });
    setters.put("OPEN_SAT_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        OPEN_SAT_FLAG = (java.math.BigDecimal)value;
      }
    });
    setters.put("ACQUISITION_DATE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ACQUISITION_DATE = (java.sql.Timestamp)value;
      }
    });
    setters.put("COMP_OPENED_DATE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        COMP_OPENED_DATE = (java.sql.Timestamp)value;
      }
    });
    setters.put("CLOSED_YEAR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CLOSED_YEAR = (java.math.BigDecimal)value;
      }
    });
    setters.put("CAFE_SVS_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CAFE_SVS_NBR = (String)value;
      }
    });
    setters.put("CITY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CITY = (String)value;
      }
    });
    setters.put("STATE_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        STATE_CODE = (String)value;
      }
    });
    setters.put("ADDRESS", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ADDRESS = (String)value;
      }
    });
    setters.put("PRICE_TIER_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PRICE_TIER_CODE = (String)value;
      }
    });
    setters.put("TAX_STATE_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TAX_STATE_CODE = (String)value;
      }
    });
    setters.put("PHONE_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PHONE_NBR = (String)value;
      }
    });
    setters.put("FAX_NUMBER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FAX_NUMBER = (String)value;
      }
    });
    setters.put("BROADBAND_IP", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        BROADBAND_IP = (String)value;
      }
    });
    setters.put("ROPE_IP", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ROPE_IP = (String)value;
      }
    });
    setters.put("ISP_TYPE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ISP_TYPE = (String)value;
      }
    });
    setters.put("ISP_PROVIDER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ISP_PROVIDER = (String)value;
      }
    });
    setters.put("FRANCHISE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FRANCHISE = (String)value;
      }
    });
    setters.put("DISTRICT_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DISTRICT_NAME = (String)value;
      }
    });
    setters.put("HARDWARE_SERVICE_PROVIDER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HARDWARE_SERVICE_PROVIDER = (String)value;
      }
    });
    setters.put("PHONE_SERVICE_PROVIDER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PHONE_SERVICE_PROVIDER = (String)value;
      }
    });
    setters.put("CAFE_STATUS", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CAFE_STATUS = (String)value;
      }
    });
    setters.put("CAFE_TYPE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CAFE_TYPE = (String)value;
      }
    });
    setters.put("LOCATION_TYPE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LOCATION_TYPE = (String)value;
      }
    });
    setters.put("SUPPORT_LEVEL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SUPPORT_LEVEL = (String)value;
      }
    });
    setters.put("CAFE_EMAIL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CAFE_EMAIL = (String)value;
      }
    });
    setters.put("DATABASE_TYPE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DATABASE_TYPE = (String)value;
      }
    });
    setters.put("DATABASE_VERSION", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DATABASE_VERSION = (String)value;
      }
    });
    setters.put("SYSTEM_COORDINATOR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SYSTEM_COORDINATOR = (String)value;
      }
    });
    setters.put("DISTRICT_NUMBER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DISTRICT_NUMBER = (String)value;
      }
    });
    setters.put("REGION_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        REGION_NAME = (String)value;
      }
    });
    setters.put("AREA_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        AREA_NAME = (String)value;
      }
    });
    setters.put("POS_INSTALL_DATE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        POS_INSTALL_DATE = (java.sql.Timestamp)value;
      }
    });
    setters.put("POS_INSTALLER_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        POS_INSTALLER_NAME = (String)value;
      }
    });
    setters.put("CABLING_INSTALLER_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CABLING_INSTALLER_NAME = (String)value;
      }
    });
    setters.put("CREDIT_MERCHANT_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CREDIT_MERCHANT_ID = (String)value;
      }
    });
    setters.put("NETWORK_LOCATION", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NETWORK_LOCATION = (String)value;
      }
    });
    setters.put("VOIP_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        VOIP_FLAG = (java.math.BigDecimal)value;
      }
    });
    setters.put("ELEARN_IP", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ELEARN_IP = (String)value;
      }
    });
    setters.put("SYSTEM_ATT_VOIP", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SYSTEM_ATT_VOIP = (java.math.BigDecimal)value;
      }
    });
    setters.put("CAFE_AMAZON_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CAFE_AMAZON_FLAG = (java.math.BigDecimal)value;
      }
    });
    setters.put("CUST_FACING_DISP_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CUST_FACING_DISP_FLAG = (java.math.BigDecimal)value;
      }
    });
    setters.put("TABLE_SERVICE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TABLE_SERVICE = (String)value;
      }
    });
    setters.put("KDS_SCHEMES", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        KDS_SCHEMES = (String)value;
      }
    });
    setters.put("EOU_STATUS_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EOU_STATUS_FLAG = (java.math.BigDecimal)value;
      }
    });
    setters.put("SYSTEM_TMX_CUTOVER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SYSTEM_TMX_CUTOVER = (String)value;
      }
    });
    setters.put("AREA_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        AREA_DESC = (String)value;
      }
    });
    setters.put("DISTRICT_MGRCELL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DISTRICT_MGRCELL = (String)value;
      }
    });
    setters.put("DISTRICT_MGREMAIL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DISTRICT_MGREMAIL = (String)value;
      }
    });
    setters.put("DISTRICT_MGRNAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DISTRICT_MGRNAME = (String)value;
      }
    });
    setters.put("ORG_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ORG_NAME = (String)value;
      }
    });
    setters.put("BOH_NETWORK_IP", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        BOH_NETWORK_IP = (String)value;
      }
    });
    setters.put("PHONE_SUPPORT_PROVIDER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PHONE_SUPPORT_PROVIDER = (String)value;
      }
    });
    setters.put("ADDRESS2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ADDRESS2 = (String)value;
      }
    });
    setters.put("PHONE2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PHONE2 = (String)value;
      }
    });
    setters.put("FTA_EMAILADDR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FTA_EMAILADDR = (String)value;
      }
    });
    setters.put("ELEARNING_IP", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ELEARNING_IP = (String)value;
      }
    });
    setters.put("NETWORK_LOCATION_SIDE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NETWORK_LOCATION_SIDE = (String)value;
      }
    });
    setters.put("COMPANY_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        COMPANY_NAME = (String)value;
      }
    });
    setters.put("COMPANY_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        COMPANY_DESC = (String)value;
      }
    });
    setters.put("LOY_LAUNCH_DATE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LOY_LAUNCH_DATE = (java.sql.Timestamp)value;
      }
    });
    setters.put("MAIN_LEVEL1_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL1_NAME = (String)value;
      }
    });
    setters.put("MAIN_LEVEL1_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL1_DESC = (String)value;
      }
    });
    setters.put("MAIN_LEVEL1_MGR_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL1_MGR_NAME = (String)value;
      }
    });
    setters.put("MAIN_LEVEL2_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL2_NAME = (String)value;
      }
    });
    setters.put("MAIN_LEVEL2_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL2_DESC = (String)value;
      }
    });
    setters.put("MAIN_LEVEL2_MGR_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL2_MGR_NAME = (String)value;
      }
    });
    setters.put("MAIN_LEVEL3_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL3_NAME = (String)value;
      }
    });
    setters.put("MAIN_LEVEL3_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL3_DESC = (String)value;
      }
    });
    setters.put("MAIN_LEVEL3_MGR_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL3_MGR_NAME = (String)value;
      }
    });
    setters.put("MAIN_LEVEL4_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL4_NAME = (String)value;
      }
    });
    setters.put("MAIN_LEVEL4_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL4_DESC = (String)value;
      }
    });
    setters.put("MAIN_LEVEL4_MGR_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL4_MGR_NAME = (String)value;
      }
    });
    setters.put("MAIN_LEVEL5_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL5_NAME = (String)value;
      }
    });
    setters.put("MAIN_LEVEL5_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL5_DESC = (String)value;
      }
    });
    setters.put("MAIN_LEVEL5_MGR_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL5_MGR_NAME = (String)value;
      }
    });
    setters.put("MAIN_LEVEL6_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL6_NAME = (String)value;
      }
    });
    setters.put("MAIN_LEVEL6_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL6_DESC = (String)value;
      }
    });
    setters.put("MAIN_LEVEL6_MGR_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL6_MGR_NAME = (String)value;
      }
    });
    setters.put("MAIN_LEVEL7_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL7_NAME = (String)value;
      }
    });
    setters.put("MAIN_LEVEL7_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL7_DESC = (String)value;
      }
    });
    setters.put("MAIN_LEVEL7_MGR_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL7_MGR_NAME = (String)value;
      }
    });
    setters.put("MAIN_LEVEL8_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL8_NAME = (String)value;
      }
    });
    setters.put("MAIN_LEVEL8_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL8_DESC = (String)value;
      }
    });
    setters.put("MAIN_LEVEL8_MGR_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL8_MGR_NAME = (String)value;
      }
    });
    setters.put("MAIN_LEVEL9_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL9_NAME = (String)value;
      }
    });
    setters.put("MAIN_LEVEL9_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL9_DESC = (String)value;
      }
    });
    setters.put("MAIN_LEVEL9_MGR_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL9_MGR_NAME = (String)value;
      }
    });
    setters.put("MAIN_LEVEL10_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL10_NAME = (String)value;
      }
    });
    setters.put("MAIN_LEVEL10_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL10_DESC = (String)value;
      }
    });
    setters.put("MAIN_LEVEL10_MGR_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_LEVEL10_MGR_NAME = (String)value;
      }
    });
    setters.put("FILE_DTTM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FILE_DTTM = (java.sql.Timestamp)value;
      }
    });
    setters.put("INSERT_DTTM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        INSERT_DTTM = (java.sql.Timestamp)value;
      }
    });
    setters.put("UPDATE_DTTM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        UPDATE_DTTM = (java.sql.Timestamp)value;
      }
    });
    setters.put("LOAD_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LOAD_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("VERSION", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        VERSION = (java.math.BigDecimal)value;
      }
    });
    setters.put("COUNTRY_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        COUNTRY_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("COMPANY_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        COMPANY_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("COMPANY_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        COMPANY_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("CAFE_MANAGER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CAFE_MANAGER = (String)value;
      }
    });
    setters.put("CATERING_COORDINATORS", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CATERING_COORDINATORS = (String)value;
      }
    });
    setters.put("MARKET_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MARKET_NAME = (String)value;
      }
    });
    setters.put("YEAR_BASE_CAFE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        YEAR_BASE_CAFE = (java.math.BigDecimal)value;
      }
    });
    setters.put("MARKETING_LOCATION_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MARKETING_LOCATION_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("DMA_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DMA_NAME = (String)value;
      }
    });
    setters.put("LABOR_INVESTMENT_AMT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LABOR_INVESTMENT_AMT = (java.math.BigDecimal)value;
      }
    });
    setters.put("CATERING_RCSM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CATERING_RCSM = (String)value;
      }
    });
    setters.put("CATERING_SR_RCSM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CATERING_SR_RCSM = (String)value;
      }
    });
    setters.put("PANERA_2_0_STATUS", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PANERA_2_0_STATUS = (java.math.BigDecimal)value;
      }
    });
    setters.put("RPU_STATUS", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        RPU_STATUS = (java.math.BigDecimal)value;
      }
    });
    setters.put("HUB_CLUSTER_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HUB_CLUSTER_NAME = (String)value;
      }
    });
    setters.put("HUB_CLUSTER_CLASS", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HUB_CLUSTER_CLASS = (String)value;
      }
    });
    setters.put("ECOMMERCE_CAFE_TYPE_CATERING", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ECOMMERCE_CAFE_TYPE_CATERING = (String)value;
      }
    });
    setters.put("ECOMMERCE_CAFE_TYPE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ECOMMERCE_CAFE_TYPE = (String)value;
      }
    });
    setters.put("CATERING_ONLINE_DESIGNATION", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CATERING_ONLINE_DESIGNATION = (String)value;
      }
    });
    setters.put("ECOMMERCE_CATERING_HUB_PARENT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ECOMMERCE_CATERING_HUB_PARENT = (String)value;
      }
    });
    setters.put("CATERING_ONLINE_STATUS", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CATERING_ONLINE_STATUS = (String)value;
      }
    });
    setters.put("ECOMMERCE_KIOSKS_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ECOMMERCE_KIOSKS_FLAG = (java.math.BigDecimal)value;
      }
    });
    setters.put("ECOMMERCE_RETAIL_DELIVERY_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ECOMMERCE_RETAIL_DELIVERY_FLAG = (java.math.BigDecimal)value;
      }
    });
    setters.put("ECOMMERCE_RETAIL_DINE_IN_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ECOMMERCE_RETAIL_DINE_IN_FLAG = (java.math.BigDecimal)value;
      }
    });
    setters.put("ECOMMERCE_RETAIL_PICKUP_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ECOMMERCE_RETAIL_PICKUP_FLAG = (java.math.BigDecimal)value;
      }
    });
    setters.put("ECOMMERCE_LAUNCH_CATERING_2_0", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ECOMMERCE_LAUNCH_CATERING_2_0 = (java.sql.Timestamp)value;
      }
    });
    setters.put("ECOMMERCE_LAUNCH_RPU", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ECOMMERCE_LAUNCH_RPU = (java.sql.Timestamp)value;
      }
    });
    setters.put("ECOMMERCE_LAUNCH_PANERA_2_0", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ECOMMERCE_LAUNCH_PANERA_2_0 = (java.sql.Timestamp)value;
      }
    });
    setters.put("ECOMMERCE_LAUNCH_DELIVERY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ECOMMERCE_LAUNCH_DELIVERY = (java.sql.Timestamp)value;
      }
    });
    setters.put("ECOMMERCE_LAUNCH_DINE_IN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ECOMMERCE_LAUNCH_DINE_IN = (java.sql.Timestamp)value;
      }
    });
    setters.put("ECOMMERCE_LAUNCH_KIOSKS", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ECOMMERCE_LAUNCH_KIOSKS = (java.sql.Timestamp)value;
      }
    });
    setters.put("LAUNCH_2_0_PERIOD_NBR_IN_EPOCH", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LAUNCH_2_0_PERIOD_NBR_IN_EPOCH = (java.math.BigDecimal)value;
      }
    });
    setters.put("LAUNCH_2_0_WEEK_NBR_IN_EPOCH", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LAUNCH_2_0_WEEK_NBR_IN_EPOCH = (java.math.BigDecimal)value;
      }
    });
    setters.put("LAUNCH_DEL_PERIOD_NBR_IN_EPOCH", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LAUNCH_DEL_PERIOD_NBR_IN_EPOCH = (java.math.BigDecimal)value;
      }
    });
    setters.put("LAUNCH_DEL_WEEK_NBR_IN_EPOCH", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LAUNCH_DEL_WEEK_NBR_IN_EPOCH = (java.math.BigDecimal)value;
      }
    });
    setters.put("CAFE_GROUP_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CAFE_GROUP_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("DISTRIBUTION_CTR_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DISTRIBUTION_CTR_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("DISTRICT_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DISTRICT_DESC = (String)value;
      }
    });
    setters.put("PRIMARY_MENU_GROUP", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PRIMARY_MENU_GROUP = (java.math.BigDecimal)value;
      }
    });
    setters.put("PRICING_TIER_GROUP", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PRICING_TIER_GROUP = (String)value;
      }
    });
    setters.put("ECOMMERCE_LAUNCH_OPS_INTEGRITY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ECOMMERCE_LAUNCH_OPS_INTEGRITY = (java.sql.Timestamp)value;
      }
    });
    setters.put("CERTIFIED_TRAINING_CAFE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CERTIFIED_TRAINING_CAFE = (java.math.BigDecimal)value;
      }
    });
    setters.put("COMMISSARY_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        COMMISSARY_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("COMMISSARY_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        COMMISSARY_NBR = (java.math.BigDecimal)value;
      }
    });
    setters.put("COMMISSARY_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        COMMISSARY_NAME = (String)value;
      }
    });
    setters.put("OPENED_DT_PERIOD_NBR_IN_EPOCH", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        OPENED_DT_PERIOD_NBR_IN_EPOCH = (java.math.BigDecimal)value;
      }
    });
    setters.put("OPENED_DT_WEEK_NBR_IN_EPOCH", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        OPENED_DT_WEEK_NBR_IN_EPOCH = (java.math.BigDecimal)value;
      }
    });
    setters.put("GL_STORE_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        GL_STORE_NBR = (String)value;
      }
    });
    setters.put("PAYROLL_PROCESSOR_BRANCH", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PAYROLL_PROCESSOR_BRANCH = (String)value;
      }
    });
    setters.put("PAYROLL_PROCESSOR_DIVISION", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PAYROLL_PROCESSOR_DIVISION = (String)value;
      }
    });
    setters.put("LOAD_DTTM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LOAD_DTTM = (java.sql.Timestamp)value;
      }
    });
    setters.put("LOAD_BY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LOAD_BY = (String)value;
      }
    });
  }
  public dim_cafe() {
    init0();
  }
  private java.math.BigDecimal Z_CAFE_DW_ID;
  public java.math.BigDecimal get_Z_CAFE_DW_ID() {
    return Z_CAFE_DW_ID;
  }
  public void set_Z_CAFE_DW_ID(java.math.BigDecimal Z_CAFE_DW_ID) {
    this.Z_CAFE_DW_ID = Z_CAFE_DW_ID;
  }
  public dim_cafe with_Z_CAFE_DW_ID(java.math.BigDecimal Z_CAFE_DW_ID) {
    this.Z_CAFE_DW_ID = Z_CAFE_DW_ID;
    return this;
  }
  private java.math.BigDecimal CAFE_NBR;
  public java.math.BigDecimal get_CAFE_NBR() {
    return CAFE_NBR;
  }
  public void set_CAFE_NBR(java.math.BigDecimal CAFE_NBR) {
    this.CAFE_NBR = CAFE_NBR;
  }
  public dim_cafe with_CAFE_NBR(java.math.BigDecimal CAFE_NBR) {
    this.CAFE_NBR = CAFE_NBR;
    return this;
  }
  private String CAFE_NAME;
  public String get_CAFE_NAME() {
    return CAFE_NAME;
  }
  public void set_CAFE_NAME(String CAFE_NAME) {
    this.CAFE_NAME = CAFE_NAME;
  }
  public dim_cafe with_CAFE_NAME(String CAFE_NAME) {
    this.CAFE_NAME = CAFE_NAME;
    return this;
  }
  private java.sql.Timestamp OPENED_DATE;
  public java.sql.Timestamp get_OPENED_DATE() {
    return OPENED_DATE;
  }
  public void set_OPENED_DATE(java.sql.Timestamp OPENED_DATE) {
    this.OPENED_DATE = OPENED_DATE;
  }
  public dim_cafe with_OPENED_DATE(java.sql.Timestamp OPENED_DATE) {
    this.OPENED_DATE = OPENED_DATE;
    return this;
  }
  private java.sql.Timestamp CLOSED_DATE;
  public java.sql.Timestamp get_CLOSED_DATE() {
    return CLOSED_DATE;
  }
  public void set_CLOSED_DATE(java.sql.Timestamp CLOSED_DATE) {
    this.CLOSED_DATE = CLOSED_DATE;
  }
  public dim_cafe with_CLOSED_DATE(java.sql.Timestamp CLOSED_DATE) {
    this.CLOSED_DATE = CLOSED_DATE;
    return this;
  }
  private java.math.BigDecimal LOC_CURRENCY_DW_ID;
  public java.math.BigDecimal get_LOC_CURRENCY_DW_ID() {
    return LOC_CURRENCY_DW_ID;
  }
  public void set_LOC_CURRENCY_DW_ID(java.math.BigDecimal LOC_CURRENCY_DW_ID) {
    this.LOC_CURRENCY_DW_ID = LOC_CURRENCY_DW_ID;
  }
  public dim_cafe with_LOC_CURRENCY_DW_ID(java.math.BigDecimal LOC_CURRENCY_DW_ID) {
    this.LOC_CURRENCY_DW_ID = LOC_CURRENCY_DW_ID;
    return this;
  }
  private String POS_SYSTEM_TYPE;
  public String get_POS_SYSTEM_TYPE() {
    return POS_SYSTEM_TYPE;
  }
  public void set_POS_SYSTEM_TYPE(String POS_SYSTEM_TYPE) {
    this.POS_SYSTEM_TYPE = POS_SYSTEM_TYPE;
  }
  public dim_cafe with_POS_SYSTEM_TYPE(String POS_SYSTEM_TYPE) {
    this.POS_SYSTEM_TYPE = POS_SYSTEM_TYPE;
    return this;
  }
  private java.math.BigDecimal POS_POLLING_FLAG;
  public java.math.BigDecimal get_POS_POLLING_FLAG() {
    return POS_POLLING_FLAG;
  }
  public void set_POS_POLLING_FLAG(java.math.BigDecimal POS_POLLING_FLAG) {
    this.POS_POLLING_FLAG = POS_POLLING_FLAG;
  }
  public dim_cafe with_POS_POLLING_FLAG(java.math.BigDecimal POS_POLLING_FLAG) {
    this.POS_POLLING_FLAG = POS_POLLING_FLAG;
    return this;
  }
  private String TIMEZONE;
  public String get_TIMEZONE() {
    return TIMEZONE;
  }
  public void set_TIMEZONE(String TIMEZONE) {
    this.TIMEZONE = TIMEZONE;
  }
  public dim_cafe with_TIMEZONE(String TIMEZONE) {
    this.TIMEZONE = TIMEZONE;
    return this;
  }
  private java.math.BigDecimal CAFE_DRIVETHRU_FLAG;
  public java.math.BigDecimal get_CAFE_DRIVETHRU_FLAG() {
    return CAFE_DRIVETHRU_FLAG;
  }
  public void set_CAFE_DRIVETHRU_FLAG(java.math.BigDecimal CAFE_DRIVETHRU_FLAG) {
    this.CAFE_DRIVETHRU_FLAG = CAFE_DRIVETHRU_FLAG;
  }
  public dim_cafe with_CAFE_DRIVETHRU_FLAG(java.math.BigDecimal CAFE_DRIVETHRU_FLAG) {
    this.CAFE_DRIVETHRU_FLAG = CAFE_DRIVETHRU_FLAG;
    return this;
  }
  private java.sql.Timestamp POS_SYSTEM_UPGRADE_DATE;
  public java.sql.Timestamp get_POS_SYSTEM_UPGRADE_DATE() {
    return POS_SYSTEM_UPGRADE_DATE;
  }
  public void set_POS_SYSTEM_UPGRADE_DATE(java.sql.Timestamp POS_SYSTEM_UPGRADE_DATE) {
    this.POS_SYSTEM_UPGRADE_DATE = POS_SYSTEM_UPGRADE_DATE;
  }
  public dim_cafe with_POS_SYSTEM_UPGRADE_DATE(java.sql.Timestamp POS_SYSTEM_UPGRADE_DATE) {
    this.POS_SYSTEM_UPGRADE_DATE = POS_SYSTEM_UPGRADE_DATE;
    return this;
  }
  private java.sql.Timestamp TMX_CUTOVER_DATE;
  public java.sql.Timestamp get_TMX_CUTOVER_DATE() {
    return TMX_CUTOVER_DATE;
  }
  public void set_TMX_CUTOVER_DATE(java.sql.Timestamp TMX_CUTOVER_DATE) {
    this.TMX_CUTOVER_DATE = TMX_CUTOVER_DATE;
  }
  public dim_cafe with_TMX_CUTOVER_DATE(java.sql.Timestamp TMX_CUTOVER_DATE) {
    this.TMX_CUTOVER_DATE = TMX_CUTOVER_DATE;
    return this;
  }
  private String POSTAL_CODE;
  public String get_POSTAL_CODE() {
    return POSTAL_CODE;
  }
  public void set_POSTAL_CODE(String POSTAL_CODE) {
    this.POSTAL_CODE = POSTAL_CODE;
  }
  public dim_cafe with_POSTAL_CODE(String POSTAL_CODE) {
    this.POSTAL_CODE = POSTAL_CODE;
    return this;
  }
  private java.sql.Timestamp TMX_INTEGRATION_DATE;
  public java.sql.Timestamp get_TMX_INTEGRATION_DATE() {
    return TMX_INTEGRATION_DATE;
  }
  public void set_TMX_INTEGRATION_DATE(java.sql.Timestamp TMX_INTEGRATION_DATE) {
    this.TMX_INTEGRATION_DATE = TMX_INTEGRATION_DATE;
  }
  public dim_cafe with_TMX_INTEGRATION_DATE(java.sql.Timestamp TMX_INTEGRATION_DATE) {
    this.TMX_INTEGRATION_DATE = TMX_INTEGRATION_DATE;
    return this;
  }
  private java.sql.Timestamp TMX_FORECAST_DATE;
  public java.sql.Timestamp get_TMX_FORECAST_DATE() {
    return TMX_FORECAST_DATE;
  }
  public void set_TMX_FORECAST_DATE(java.sql.Timestamp TMX_FORECAST_DATE) {
    this.TMX_FORECAST_DATE = TMX_FORECAST_DATE;
  }
  public dim_cafe with_TMX_FORECAST_DATE(java.sql.Timestamp TMX_FORECAST_DATE) {
    this.TMX_FORECAST_DATE = TMX_FORECAST_DATE;
    return this;
  }
  private String CORPORATE_FLAG;
  public String get_CORPORATE_FLAG() {
    return CORPORATE_FLAG;
  }
  public void set_CORPORATE_FLAG(String CORPORATE_FLAG) {
    this.CORPORATE_FLAG = CORPORATE_FLAG;
  }
  public dim_cafe with_CORPORATE_FLAG(String CORPORATE_FLAG) {
    this.CORPORATE_FLAG = CORPORATE_FLAG;
    return this;
  }
  private String RECIPE_TYPE;
  public String get_RECIPE_TYPE() {
    return RECIPE_TYPE;
  }
  public void set_RECIPE_TYPE(String RECIPE_TYPE) {
    this.RECIPE_TYPE = RECIPE_TYPE;
  }
  public dim_cafe with_RECIPE_TYPE(String RECIPE_TYPE) {
    this.RECIPE_TYPE = RECIPE_TYPE;
    return this;
  }
  private java.math.BigDecimal OPEN_SUN_FLAG;
  public java.math.BigDecimal get_OPEN_SUN_FLAG() {
    return OPEN_SUN_FLAG;
  }
  public void set_OPEN_SUN_FLAG(java.math.BigDecimal OPEN_SUN_FLAG) {
    this.OPEN_SUN_FLAG = OPEN_SUN_FLAG;
  }
  public dim_cafe with_OPEN_SUN_FLAG(java.math.BigDecimal OPEN_SUN_FLAG) {
    this.OPEN_SUN_FLAG = OPEN_SUN_FLAG;
    return this;
  }
  private java.math.BigDecimal OPEN_MON_FLAG;
  public java.math.BigDecimal get_OPEN_MON_FLAG() {
    return OPEN_MON_FLAG;
  }
  public void set_OPEN_MON_FLAG(java.math.BigDecimal OPEN_MON_FLAG) {
    this.OPEN_MON_FLAG = OPEN_MON_FLAG;
  }
  public dim_cafe with_OPEN_MON_FLAG(java.math.BigDecimal OPEN_MON_FLAG) {
    this.OPEN_MON_FLAG = OPEN_MON_FLAG;
    return this;
  }
  private java.math.BigDecimal OPEN_TUE_FLAG;
  public java.math.BigDecimal get_OPEN_TUE_FLAG() {
    return OPEN_TUE_FLAG;
  }
  public void set_OPEN_TUE_FLAG(java.math.BigDecimal OPEN_TUE_FLAG) {
    this.OPEN_TUE_FLAG = OPEN_TUE_FLAG;
  }
  public dim_cafe with_OPEN_TUE_FLAG(java.math.BigDecimal OPEN_TUE_FLAG) {
    this.OPEN_TUE_FLAG = OPEN_TUE_FLAG;
    return this;
  }
  private java.math.BigDecimal OPEN_WED_FLAG;
  public java.math.BigDecimal get_OPEN_WED_FLAG() {
    return OPEN_WED_FLAG;
  }
  public void set_OPEN_WED_FLAG(java.math.BigDecimal OPEN_WED_FLAG) {
    this.OPEN_WED_FLAG = OPEN_WED_FLAG;
  }
  public dim_cafe with_OPEN_WED_FLAG(java.math.BigDecimal OPEN_WED_FLAG) {
    this.OPEN_WED_FLAG = OPEN_WED_FLAG;
    return this;
  }
  private java.math.BigDecimal OPEN_THUR_FLAG;
  public java.math.BigDecimal get_OPEN_THUR_FLAG() {
    return OPEN_THUR_FLAG;
  }
  public void set_OPEN_THUR_FLAG(java.math.BigDecimal OPEN_THUR_FLAG) {
    this.OPEN_THUR_FLAG = OPEN_THUR_FLAG;
  }
  public dim_cafe with_OPEN_THUR_FLAG(java.math.BigDecimal OPEN_THUR_FLAG) {
    this.OPEN_THUR_FLAG = OPEN_THUR_FLAG;
    return this;
  }
  private java.math.BigDecimal OPEN_FRI_FLAG;
  public java.math.BigDecimal get_OPEN_FRI_FLAG() {
    return OPEN_FRI_FLAG;
  }
  public void set_OPEN_FRI_FLAG(java.math.BigDecimal OPEN_FRI_FLAG) {
    this.OPEN_FRI_FLAG = OPEN_FRI_FLAG;
  }
  public dim_cafe with_OPEN_FRI_FLAG(java.math.BigDecimal OPEN_FRI_FLAG) {
    this.OPEN_FRI_FLAG = OPEN_FRI_FLAG;
    return this;
  }
  private java.math.BigDecimal OPEN_SAT_FLAG;
  public java.math.BigDecimal get_OPEN_SAT_FLAG() {
    return OPEN_SAT_FLAG;
  }
  public void set_OPEN_SAT_FLAG(java.math.BigDecimal OPEN_SAT_FLAG) {
    this.OPEN_SAT_FLAG = OPEN_SAT_FLAG;
  }
  public dim_cafe with_OPEN_SAT_FLAG(java.math.BigDecimal OPEN_SAT_FLAG) {
    this.OPEN_SAT_FLAG = OPEN_SAT_FLAG;
    return this;
  }
  private java.sql.Timestamp ACQUISITION_DATE;
  public java.sql.Timestamp get_ACQUISITION_DATE() {
    return ACQUISITION_DATE;
  }
  public void set_ACQUISITION_DATE(java.sql.Timestamp ACQUISITION_DATE) {
    this.ACQUISITION_DATE = ACQUISITION_DATE;
  }
  public dim_cafe with_ACQUISITION_DATE(java.sql.Timestamp ACQUISITION_DATE) {
    this.ACQUISITION_DATE = ACQUISITION_DATE;
    return this;
  }
  private java.sql.Timestamp COMP_OPENED_DATE;
  public java.sql.Timestamp get_COMP_OPENED_DATE() {
    return COMP_OPENED_DATE;
  }
  public void set_COMP_OPENED_DATE(java.sql.Timestamp COMP_OPENED_DATE) {
    this.COMP_OPENED_DATE = COMP_OPENED_DATE;
  }
  public dim_cafe with_COMP_OPENED_DATE(java.sql.Timestamp COMP_OPENED_DATE) {
    this.COMP_OPENED_DATE = COMP_OPENED_DATE;
    return this;
  }
  private java.math.BigDecimal CLOSED_YEAR;
  public java.math.BigDecimal get_CLOSED_YEAR() {
    return CLOSED_YEAR;
  }
  public void set_CLOSED_YEAR(java.math.BigDecimal CLOSED_YEAR) {
    this.CLOSED_YEAR = CLOSED_YEAR;
  }
  public dim_cafe with_CLOSED_YEAR(java.math.BigDecimal CLOSED_YEAR) {
    this.CLOSED_YEAR = CLOSED_YEAR;
    return this;
  }
  private String CAFE_SVS_NBR;
  public String get_CAFE_SVS_NBR() {
    return CAFE_SVS_NBR;
  }
  public void set_CAFE_SVS_NBR(String CAFE_SVS_NBR) {
    this.CAFE_SVS_NBR = CAFE_SVS_NBR;
  }
  public dim_cafe with_CAFE_SVS_NBR(String CAFE_SVS_NBR) {
    this.CAFE_SVS_NBR = CAFE_SVS_NBR;
    return this;
  }
  private String CITY;
  public String get_CITY() {
    return CITY;
  }
  public void set_CITY(String CITY) {
    this.CITY = CITY;
  }
  public dim_cafe with_CITY(String CITY) {
    this.CITY = CITY;
    return this;
  }
  private String STATE_CODE;
  public String get_STATE_CODE() {
    return STATE_CODE;
  }
  public void set_STATE_CODE(String STATE_CODE) {
    this.STATE_CODE = STATE_CODE;
  }
  public dim_cafe with_STATE_CODE(String STATE_CODE) {
    this.STATE_CODE = STATE_CODE;
    return this;
  }
  private String ADDRESS;
  public String get_ADDRESS() {
    return ADDRESS;
  }
  public void set_ADDRESS(String ADDRESS) {
    this.ADDRESS = ADDRESS;
  }
  public dim_cafe with_ADDRESS(String ADDRESS) {
    this.ADDRESS = ADDRESS;
    return this;
  }
  private String PRICE_TIER_CODE;
  public String get_PRICE_TIER_CODE() {
    return PRICE_TIER_CODE;
  }
  public void set_PRICE_TIER_CODE(String PRICE_TIER_CODE) {
    this.PRICE_TIER_CODE = PRICE_TIER_CODE;
  }
  public dim_cafe with_PRICE_TIER_CODE(String PRICE_TIER_CODE) {
    this.PRICE_TIER_CODE = PRICE_TIER_CODE;
    return this;
  }
  private String TAX_STATE_CODE;
  public String get_TAX_STATE_CODE() {
    return TAX_STATE_CODE;
  }
  public void set_TAX_STATE_CODE(String TAX_STATE_CODE) {
    this.TAX_STATE_CODE = TAX_STATE_CODE;
  }
  public dim_cafe with_TAX_STATE_CODE(String TAX_STATE_CODE) {
    this.TAX_STATE_CODE = TAX_STATE_CODE;
    return this;
  }
  private String PHONE_NBR;
  public String get_PHONE_NBR() {
    return PHONE_NBR;
  }
  public void set_PHONE_NBR(String PHONE_NBR) {
    this.PHONE_NBR = PHONE_NBR;
  }
  public dim_cafe with_PHONE_NBR(String PHONE_NBR) {
    this.PHONE_NBR = PHONE_NBR;
    return this;
  }
  private String FAX_NUMBER;
  public String get_FAX_NUMBER() {
    return FAX_NUMBER;
  }
  public void set_FAX_NUMBER(String FAX_NUMBER) {
    this.FAX_NUMBER = FAX_NUMBER;
  }
  public dim_cafe with_FAX_NUMBER(String FAX_NUMBER) {
    this.FAX_NUMBER = FAX_NUMBER;
    return this;
  }
  private String BROADBAND_IP;
  public String get_BROADBAND_IP() {
    return BROADBAND_IP;
  }
  public void set_BROADBAND_IP(String BROADBAND_IP) {
    this.BROADBAND_IP = BROADBAND_IP;
  }
  public dim_cafe with_BROADBAND_IP(String BROADBAND_IP) {
    this.BROADBAND_IP = BROADBAND_IP;
    return this;
  }
  private String ROPE_IP;
  public String get_ROPE_IP() {
    return ROPE_IP;
  }
  public void set_ROPE_IP(String ROPE_IP) {
    this.ROPE_IP = ROPE_IP;
  }
  public dim_cafe with_ROPE_IP(String ROPE_IP) {
    this.ROPE_IP = ROPE_IP;
    return this;
  }
  private String ISP_TYPE;
  public String get_ISP_TYPE() {
    return ISP_TYPE;
  }
  public void set_ISP_TYPE(String ISP_TYPE) {
    this.ISP_TYPE = ISP_TYPE;
  }
  public dim_cafe with_ISP_TYPE(String ISP_TYPE) {
    this.ISP_TYPE = ISP_TYPE;
    return this;
  }
  private String ISP_PROVIDER;
  public String get_ISP_PROVIDER() {
    return ISP_PROVIDER;
  }
  public void set_ISP_PROVIDER(String ISP_PROVIDER) {
    this.ISP_PROVIDER = ISP_PROVIDER;
  }
  public dim_cafe with_ISP_PROVIDER(String ISP_PROVIDER) {
    this.ISP_PROVIDER = ISP_PROVIDER;
    return this;
  }
  private String FRANCHISE;
  public String get_FRANCHISE() {
    return FRANCHISE;
  }
  public void set_FRANCHISE(String FRANCHISE) {
    this.FRANCHISE = FRANCHISE;
  }
  public dim_cafe with_FRANCHISE(String FRANCHISE) {
    this.FRANCHISE = FRANCHISE;
    return this;
  }
  private String DISTRICT_NAME;
  public String get_DISTRICT_NAME() {
    return DISTRICT_NAME;
  }
  public void set_DISTRICT_NAME(String DISTRICT_NAME) {
    this.DISTRICT_NAME = DISTRICT_NAME;
  }
  public dim_cafe with_DISTRICT_NAME(String DISTRICT_NAME) {
    this.DISTRICT_NAME = DISTRICT_NAME;
    return this;
  }
  private String HARDWARE_SERVICE_PROVIDER;
  public String get_HARDWARE_SERVICE_PROVIDER() {
    return HARDWARE_SERVICE_PROVIDER;
  }
  public void set_HARDWARE_SERVICE_PROVIDER(String HARDWARE_SERVICE_PROVIDER) {
    this.HARDWARE_SERVICE_PROVIDER = HARDWARE_SERVICE_PROVIDER;
  }
  public dim_cafe with_HARDWARE_SERVICE_PROVIDER(String HARDWARE_SERVICE_PROVIDER) {
    this.HARDWARE_SERVICE_PROVIDER = HARDWARE_SERVICE_PROVIDER;
    return this;
  }
  private String PHONE_SERVICE_PROVIDER;
  public String get_PHONE_SERVICE_PROVIDER() {
    return PHONE_SERVICE_PROVIDER;
  }
  public void set_PHONE_SERVICE_PROVIDER(String PHONE_SERVICE_PROVIDER) {
    this.PHONE_SERVICE_PROVIDER = PHONE_SERVICE_PROVIDER;
  }
  public dim_cafe with_PHONE_SERVICE_PROVIDER(String PHONE_SERVICE_PROVIDER) {
    this.PHONE_SERVICE_PROVIDER = PHONE_SERVICE_PROVIDER;
    return this;
  }
  private String CAFE_STATUS;
  public String get_CAFE_STATUS() {
    return CAFE_STATUS;
  }
  public void set_CAFE_STATUS(String CAFE_STATUS) {
    this.CAFE_STATUS = CAFE_STATUS;
  }
  public dim_cafe with_CAFE_STATUS(String CAFE_STATUS) {
    this.CAFE_STATUS = CAFE_STATUS;
    return this;
  }
  private String CAFE_TYPE;
  public String get_CAFE_TYPE() {
    return CAFE_TYPE;
  }
  public void set_CAFE_TYPE(String CAFE_TYPE) {
    this.CAFE_TYPE = CAFE_TYPE;
  }
  public dim_cafe with_CAFE_TYPE(String CAFE_TYPE) {
    this.CAFE_TYPE = CAFE_TYPE;
    return this;
  }
  private String LOCATION_TYPE;
  public String get_LOCATION_TYPE() {
    return LOCATION_TYPE;
  }
  public void set_LOCATION_TYPE(String LOCATION_TYPE) {
    this.LOCATION_TYPE = LOCATION_TYPE;
  }
  public dim_cafe with_LOCATION_TYPE(String LOCATION_TYPE) {
    this.LOCATION_TYPE = LOCATION_TYPE;
    return this;
  }
  private String SUPPORT_LEVEL;
  public String get_SUPPORT_LEVEL() {
    return SUPPORT_LEVEL;
  }
  public void set_SUPPORT_LEVEL(String SUPPORT_LEVEL) {
    this.SUPPORT_LEVEL = SUPPORT_LEVEL;
  }
  public dim_cafe with_SUPPORT_LEVEL(String SUPPORT_LEVEL) {
    this.SUPPORT_LEVEL = SUPPORT_LEVEL;
    return this;
  }
  private String CAFE_EMAIL;
  public String get_CAFE_EMAIL() {
    return CAFE_EMAIL;
  }
  public void set_CAFE_EMAIL(String CAFE_EMAIL) {
    this.CAFE_EMAIL = CAFE_EMAIL;
  }
  public dim_cafe with_CAFE_EMAIL(String CAFE_EMAIL) {
    this.CAFE_EMAIL = CAFE_EMAIL;
    return this;
  }
  private String DATABASE_TYPE;
  public String get_DATABASE_TYPE() {
    return DATABASE_TYPE;
  }
  public void set_DATABASE_TYPE(String DATABASE_TYPE) {
    this.DATABASE_TYPE = DATABASE_TYPE;
  }
  public dim_cafe with_DATABASE_TYPE(String DATABASE_TYPE) {
    this.DATABASE_TYPE = DATABASE_TYPE;
    return this;
  }
  private String DATABASE_VERSION;
  public String get_DATABASE_VERSION() {
    return DATABASE_VERSION;
  }
  public void set_DATABASE_VERSION(String DATABASE_VERSION) {
    this.DATABASE_VERSION = DATABASE_VERSION;
  }
  public dim_cafe with_DATABASE_VERSION(String DATABASE_VERSION) {
    this.DATABASE_VERSION = DATABASE_VERSION;
    return this;
  }
  private String SYSTEM_COORDINATOR;
  public String get_SYSTEM_COORDINATOR() {
    return SYSTEM_COORDINATOR;
  }
  public void set_SYSTEM_COORDINATOR(String SYSTEM_COORDINATOR) {
    this.SYSTEM_COORDINATOR = SYSTEM_COORDINATOR;
  }
  public dim_cafe with_SYSTEM_COORDINATOR(String SYSTEM_COORDINATOR) {
    this.SYSTEM_COORDINATOR = SYSTEM_COORDINATOR;
    return this;
  }
  private String DISTRICT_NUMBER;
  public String get_DISTRICT_NUMBER() {
    return DISTRICT_NUMBER;
  }
  public void set_DISTRICT_NUMBER(String DISTRICT_NUMBER) {
    this.DISTRICT_NUMBER = DISTRICT_NUMBER;
  }
  public dim_cafe with_DISTRICT_NUMBER(String DISTRICT_NUMBER) {
    this.DISTRICT_NUMBER = DISTRICT_NUMBER;
    return this;
  }
  private String REGION_NAME;
  public String get_REGION_NAME() {
    return REGION_NAME;
  }
  public void set_REGION_NAME(String REGION_NAME) {
    this.REGION_NAME = REGION_NAME;
  }
  public dim_cafe with_REGION_NAME(String REGION_NAME) {
    this.REGION_NAME = REGION_NAME;
    return this;
  }
  private String AREA_NAME;
  public String get_AREA_NAME() {
    return AREA_NAME;
  }
  public void set_AREA_NAME(String AREA_NAME) {
    this.AREA_NAME = AREA_NAME;
  }
  public dim_cafe with_AREA_NAME(String AREA_NAME) {
    this.AREA_NAME = AREA_NAME;
    return this;
  }
  private java.sql.Timestamp POS_INSTALL_DATE;
  public java.sql.Timestamp get_POS_INSTALL_DATE() {
    return POS_INSTALL_DATE;
  }
  public void set_POS_INSTALL_DATE(java.sql.Timestamp POS_INSTALL_DATE) {
    this.POS_INSTALL_DATE = POS_INSTALL_DATE;
  }
  public dim_cafe with_POS_INSTALL_DATE(java.sql.Timestamp POS_INSTALL_DATE) {
    this.POS_INSTALL_DATE = POS_INSTALL_DATE;
    return this;
  }
  private String POS_INSTALLER_NAME;
  public String get_POS_INSTALLER_NAME() {
    return POS_INSTALLER_NAME;
  }
  public void set_POS_INSTALLER_NAME(String POS_INSTALLER_NAME) {
    this.POS_INSTALLER_NAME = POS_INSTALLER_NAME;
  }
  public dim_cafe with_POS_INSTALLER_NAME(String POS_INSTALLER_NAME) {
    this.POS_INSTALLER_NAME = POS_INSTALLER_NAME;
    return this;
  }
  private String CABLING_INSTALLER_NAME;
  public String get_CABLING_INSTALLER_NAME() {
    return CABLING_INSTALLER_NAME;
  }
  public void set_CABLING_INSTALLER_NAME(String CABLING_INSTALLER_NAME) {
    this.CABLING_INSTALLER_NAME = CABLING_INSTALLER_NAME;
  }
  public dim_cafe with_CABLING_INSTALLER_NAME(String CABLING_INSTALLER_NAME) {
    this.CABLING_INSTALLER_NAME = CABLING_INSTALLER_NAME;
    return this;
  }
  private String CREDIT_MERCHANT_ID;
  public String get_CREDIT_MERCHANT_ID() {
    return CREDIT_MERCHANT_ID;
  }
  public void set_CREDIT_MERCHANT_ID(String CREDIT_MERCHANT_ID) {
    this.CREDIT_MERCHANT_ID = CREDIT_MERCHANT_ID;
  }
  public dim_cafe with_CREDIT_MERCHANT_ID(String CREDIT_MERCHANT_ID) {
    this.CREDIT_MERCHANT_ID = CREDIT_MERCHANT_ID;
    return this;
  }
  private String NETWORK_LOCATION;
  public String get_NETWORK_LOCATION() {
    return NETWORK_LOCATION;
  }
  public void set_NETWORK_LOCATION(String NETWORK_LOCATION) {
    this.NETWORK_LOCATION = NETWORK_LOCATION;
  }
  public dim_cafe with_NETWORK_LOCATION(String NETWORK_LOCATION) {
    this.NETWORK_LOCATION = NETWORK_LOCATION;
    return this;
  }
  private java.math.BigDecimal VOIP_FLAG;
  public java.math.BigDecimal get_VOIP_FLAG() {
    return VOIP_FLAG;
  }
  public void set_VOIP_FLAG(java.math.BigDecimal VOIP_FLAG) {
    this.VOIP_FLAG = VOIP_FLAG;
  }
  public dim_cafe with_VOIP_FLAG(java.math.BigDecimal VOIP_FLAG) {
    this.VOIP_FLAG = VOIP_FLAG;
    return this;
  }
  private String ELEARN_IP;
  public String get_ELEARN_IP() {
    return ELEARN_IP;
  }
  public void set_ELEARN_IP(String ELEARN_IP) {
    this.ELEARN_IP = ELEARN_IP;
  }
  public dim_cafe with_ELEARN_IP(String ELEARN_IP) {
    this.ELEARN_IP = ELEARN_IP;
    return this;
  }
  private java.math.BigDecimal SYSTEM_ATT_VOIP;
  public java.math.BigDecimal get_SYSTEM_ATT_VOIP() {
    return SYSTEM_ATT_VOIP;
  }
  public void set_SYSTEM_ATT_VOIP(java.math.BigDecimal SYSTEM_ATT_VOIP) {
    this.SYSTEM_ATT_VOIP = SYSTEM_ATT_VOIP;
  }
  public dim_cafe with_SYSTEM_ATT_VOIP(java.math.BigDecimal SYSTEM_ATT_VOIP) {
    this.SYSTEM_ATT_VOIP = SYSTEM_ATT_VOIP;
    return this;
  }
  private java.math.BigDecimal CAFE_AMAZON_FLAG;
  public java.math.BigDecimal get_CAFE_AMAZON_FLAG() {
    return CAFE_AMAZON_FLAG;
  }
  public void set_CAFE_AMAZON_FLAG(java.math.BigDecimal CAFE_AMAZON_FLAG) {
    this.CAFE_AMAZON_FLAG = CAFE_AMAZON_FLAG;
  }
  public dim_cafe with_CAFE_AMAZON_FLAG(java.math.BigDecimal CAFE_AMAZON_FLAG) {
    this.CAFE_AMAZON_FLAG = CAFE_AMAZON_FLAG;
    return this;
  }
  private java.math.BigDecimal CUST_FACING_DISP_FLAG;
  public java.math.BigDecimal get_CUST_FACING_DISP_FLAG() {
    return CUST_FACING_DISP_FLAG;
  }
  public void set_CUST_FACING_DISP_FLAG(java.math.BigDecimal CUST_FACING_DISP_FLAG) {
    this.CUST_FACING_DISP_FLAG = CUST_FACING_DISP_FLAG;
  }
  public dim_cafe with_CUST_FACING_DISP_FLAG(java.math.BigDecimal CUST_FACING_DISP_FLAG) {
    this.CUST_FACING_DISP_FLAG = CUST_FACING_DISP_FLAG;
    return this;
  }
  private String TABLE_SERVICE;
  public String get_TABLE_SERVICE() {
    return TABLE_SERVICE;
  }
  public void set_TABLE_SERVICE(String TABLE_SERVICE) {
    this.TABLE_SERVICE = TABLE_SERVICE;
  }
  public dim_cafe with_TABLE_SERVICE(String TABLE_SERVICE) {
    this.TABLE_SERVICE = TABLE_SERVICE;
    return this;
  }
  private String KDS_SCHEMES;
  public String get_KDS_SCHEMES() {
    return KDS_SCHEMES;
  }
  public void set_KDS_SCHEMES(String KDS_SCHEMES) {
    this.KDS_SCHEMES = KDS_SCHEMES;
  }
  public dim_cafe with_KDS_SCHEMES(String KDS_SCHEMES) {
    this.KDS_SCHEMES = KDS_SCHEMES;
    return this;
  }
  private java.math.BigDecimal EOU_STATUS_FLAG;
  public java.math.BigDecimal get_EOU_STATUS_FLAG() {
    return EOU_STATUS_FLAG;
  }
  public void set_EOU_STATUS_FLAG(java.math.BigDecimal EOU_STATUS_FLAG) {
    this.EOU_STATUS_FLAG = EOU_STATUS_FLAG;
  }
  public dim_cafe with_EOU_STATUS_FLAG(java.math.BigDecimal EOU_STATUS_FLAG) {
    this.EOU_STATUS_FLAG = EOU_STATUS_FLAG;
    return this;
  }
  private String SYSTEM_TMX_CUTOVER;
  public String get_SYSTEM_TMX_CUTOVER() {
    return SYSTEM_TMX_CUTOVER;
  }
  public void set_SYSTEM_TMX_CUTOVER(String SYSTEM_TMX_CUTOVER) {
    this.SYSTEM_TMX_CUTOVER = SYSTEM_TMX_CUTOVER;
  }
  public dim_cafe with_SYSTEM_TMX_CUTOVER(String SYSTEM_TMX_CUTOVER) {
    this.SYSTEM_TMX_CUTOVER = SYSTEM_TMX_CUTOVER;
    return this;
  }
  private String AREA_DESC;
  public String get_AREA_DESC() {
    return AREA_DESC;
  }
  public void set_AREA_DESC(String AREA_DESC) {
    this.AREA_DESC = AREA_DESC;
  }
  public dim_cafe with_AREA_DESC(String AREA_DESC) {
    this.AREA_DESC = AREA_DESC;
    return this;
  }
  private String DISTRICT_MGRCELL;
  public String get_DISTRICT_MGRCELL() {
    return DISTRICT_MGRCELL;
  }
  public void set_DISTRICT_MGRCELL(String DISTRICT_MGRCELL) {
    this.DISTRICT_MGRCELL = DISTRICT_MGRCELL;
  }
  public dim_cafe with_DISTRICT_MGRCELL(String DISTRICT_MGRCELL) {
    this.DISTRICT_MGRCELL = DISTRICT_MGRCELL;
    return this;
  }
  private String DISTRICT_MGREMAIL;
  public String get_DISTRICT_MGREMAIL() {
    return DISTRICT_MGREMAIL;
  }
  public void set_DISTRICT_MGREMAIL(String DISTRICT_MGREMAIL) {
    this.DISTRICT_MGREMAIL = DISTRICT_MGREMAIL;
  }
  public dim_cafe with_DISTRICT_MGREMAIL(String DISTRICT_MGREMAIL) {
    this.DISTRICT_MGREMAIL = DISTRICT_MGREMAIL;
    return this;
  }
  private String DISTRICT_MGRNAME;
  public String get_DISTRICT_MGRNAME() {
    return DISTRICT_MGRNAME;
  }
  public void set_DISTRICT_MGRNAME(String DISTRICT_MGRNAME) {
    this.DISTRICT_MGRNAME = DISTRICT_MGRNAME;
  }
  public dim_cafe with_DISTRICT_MGRNAME(String DISTRICT_MGRNAME) {
    this.DISTRICT_MGRNAME = DISTRICT_MGRNAME;
    return this;
  }
  private String ORG_NAME;
  public String get_ORG_NAME() {
    return ORG_NAME;
  }
  public void set_ORG_NAME(String ORG_NAME) {
    this.ORG_NAME = ORG_NAME;
  }
  public dim_cafe with_ORG_NAME(String ORG_NAME) {
    this.ORG_NAME = ORG_NAME;
    return this;
  }
  private String BOH_NETWORK_IP;
  public String get_BOH_NETWORK_IP() {
    return BOH_NETWORK_IP;
  }
  public void set_BOH_NETWORK_IP(String BOH_NETWORK_IP) {
    this.BOH_NETWORK_IP = BOH_NETWORK_IP;
  }
  public dim_cafe with_BOH_NETWORK_IP(String BOH_NETWORK_IP) {
    this.BOH_NETWORK_IP = BOH_NETWORK_IP;
    return this;
  }
  private String PHONE_SUPPORT_PROVIDER;
  public String get_PHONE_SUPPORT_PROVIDER() {
    return PHONE_SUPPORT_PROVIDER;
  }
  public void set_PHONE_SUPPORT_PROVIDER(String PHONE_SUPPORT_PROVIDER) {
    this.PHONE_SUPPORT_PROVIDER = PHONE_SUPPORT_PROVIDER;
  }
  public dim_cafe with_PHONE_SUPPORT_PROVIDER(String PHONE_SUPPORT_PROVIDER) {
    this.PHONE_SUPPORT_PROVIDER = PHONE_SUPPORT_PROVIDER;
    return this;
  }
  private String ADDRESS2;
  public String get_ADDRESS2() {
    return ADDRESS2;
  }
  public void set_ADDRESS2(String ADDRESS2) {
    this.ADDRESS2 = ADDRESS2;
  }
  public dim_cafe with_ADDRESS2(String ADDRESS2) {
    this.ADDRESS2 = ADDRESS2;
    return this;
  }
  private String PHONE2;
  public String get_PHONE2() {
    return PHONE2;
  }
  public void set_PHONE2(String PHONE2) {
    this.PHONE2 = PHONE2;
  }
  public dim_cafe with_PHONE2(String PHONE2) {
    this.PHONE2 = PHONE2;
    return this;
  }
  private String FTA_EMAILADDR;
  public String get_FTA_EMAILADDR() {
    return FTA_EMAILADDR;
  }
  public void set_FTA_EMAILADDR(String FTA_EMAILADDR) {
    this.FTA_EMAILADDR = FTA_EMAILADDR;
  }
  public dim_cafe with_FTA_EMAILADDR(String FTA_EMAILADDR) {
    this.FTA_EMAILADDR = FTA_EMAILADDR;
    return this;
  }
  private String ELEARNING_IP;
  public String get_ELEARNING_IP() {
    return ELEARNING_IP;
  }
  public void set_ELEARNING_IP(String ELEARNING_IP) {
    this.ELEARNING_IP = ELEARNING_IP;
  }
  public dim_cafe with_ELEARNING_IP(String ELEARNING_IP) {
    this.ELEARNING_IP = ELEARNING_IP;
    return this;
  }
  private String NETWORK_LOCATION_SIDE;
  public String get_NETWORK_LOCATION_SIDE() {
    return NETWORK_LOCATION_SIDE;
  }
  public void set_NETWORK_LOCATION_SIDE(String NETWORK_LOCATION_SIDE) {
    this.NETWORK_LOCATION_SIDE = NETWORK_LOCATION_SIDE;
  }
  public dim_cafe with_NETWORK_LOCATION_SIDE(String NETWORK_LOCATION_SIDE) {
    this.NETWORK_LOCATION_SIDE = NETWORK_LOCATION_SIDE;
    return this;
  }
  private String COMPANY_NAME;
  public String get_COMPANY_NAME() {
    return COMPANY_NAME;
  }
  public void set_COMPANY_NAME(String COMPANY_NAME) {
    this.COMPANY_NAME = COMPANY_NAME;
  }
  public dim_cafe with_COMPANY_NAME(String COMPANY_NAME) {
    this.COMPANY_NAME = COMPANY_NAME;
    return this;
  }
  private String COMPANY_DESC;
  public String get_COMPANY_DESC() {
    return COMPANY_DESC;
  }
  public void set_COMPANY_DESC(String COMPANY_DESC) {
    this.COMPANY_DESC = COMPANY_DESC;
  }
  public dim_cafe with_COMPANY_DESC(String COMPANY_DESC) {
    this.COMPANY_DESC = COMPANY_DESC;
    return this;
  }
  private java.sql.Timestamp LOY_LAUNCH_DATE;
  public java.sql.Timestamp get_LOY_LAUNCH_DATE() {
    return LOY_LAUNCH_DATE;
  }
  public void set_LOY_LAUNCH_DATE(java.sql.Timestamp LOY_LAUNCH_DATE) {
    this.LOY_LAUNCH_DATE = LOY_LAUNCH_DATE;
  }
  public dim_cafe with_LOY_LAUNCH_DATE(java.sql.Timestamp LOY_LAUNCH_DATE) {
    this.LOY_LAUNCH_DATE = LOY_LAUNCH_DATE;
    return this;
  }
  private String MAIN_LEVEL1_NAME;
  public String get_MAIN_LEVEL1_NAME() {
    return MAIN_LEVEL1_NAME;
  }
  public void set_MAIN_LEVEL1_NAME(String MAIN_LEVEL1_NAME) {
    this.MAIN_LEVEL1_NAME = MAIN_LEVEL1_NAME;
  }
  public dim_cafe with_MAIN_LEVEL1_NAME(String MAIN_LEVEL1_NAME) {
    this.MAIN_LEVEL1_NAME = MAIN_LEVEL1_NAME;
    return this;
  }
  private String MAIN_LEVEL1_DESC;
  public String get_MAIN_LEVEL1_DESC() {
    return MAIN_LEVEL1_DESC;
  }
  public void set_MAIN_LEVEL1_DESC(String MAIN_LEVEL1_DESC) {
    this.MAIN_LEVEL1_DESC = MAIN_LEVEL1_DESC;
  }
  public dim_cafe with_MAIN_LEVEL1_DESC(String MAIN_LEVEL1_DESC) {
    this.MAIN_LEVEL1_DESC = MAIN_LEVEL1_DESC;
    return this;
  }
  private String MAIN_LEVEL1_MGR_NAME;
  public String get_MAIN_LEVEL1_MGR_NAME() {
    return MAIN_LEVEL1_MGR_NAME;
  }
  public void set_MAIN_LEVEL1_MGR_NAME(String MAIN_LEVEL1_MGR_NAME) {
    this.MAIN_LEVEL1_MGR_NAME = MAIN_LEVEL1_MGR_NAME;
  }
  public dim_cafe with_MAIN_LEVEL1_MGR_NAME(String MAIN_LEVEL1_MGR_NAME) {
    this.MAIN_LEVEL1_MGR_NAME = MAIN_LEVEL1_MGR_NAME;
    return this;
  }
  private String MAIN_LEVEL2_NAME;
  public String get_MAIN_LEVEL2_NAME() {
    return MAIN_LEVEL2_NAME;
  }
  public void set_MAIN_LEVEL2_NAME(String MAIN_LEVEL2_NAME) {
    this.MAIN_LEVEL2_NAME = MAIN_LEVEL2_NAME;
  }
  public dim_cafe with_MAIN_LEVEL2_NAME(String MAIN_LEVEL2_NAME) {
    this.MAIN_LEVEL2_NAME = MAIN_LEVEL2_NAME;
    return this;
  }
  private String MAIN_LEVEL2_DESC;
  public String get_MAIN_LEVEL2_DESC() {
    return MAIN_LEVEL2_DESC;
  }
  public void set_MAIN_LEVEL2_DESC(String MAIN_LEVEL2_DESC) {
    this.MAIN_LEVEL2_DESC = MAIN_LEVEL2_DESC;
  }
  public dim_cafe with_MAIN_LEVEL2_DESC(String MAIN_LEVEL2_DESC) {
    this.MAIN_LEVEL2_DESC = MAIN_LEVEL2_DESC;
    return this;
  }
  private String MAIN_LEVEL2_MGR_NAME;
  public String get_MAIN_LEVEL2_MGR_NAME() {
    return MAIN_LEVEL2_MGR_NAME;
  }
  public void set_MAIN_LEVEL2_MGR_NAME(String MAIN_LEVEL2_MGR_NAME) {
    this.MAIN_LEVEL2_MGR_NAME = MAIN_LEVEL2_MGR_NAME;
  }
  public dim_cafe with_MAIN_LEVEL2_MGR_NAME(String MAIN_LEVEL2_MGR_NAME) {
    this.MAIN_LEVEL2_MGR_NAME = MAIN_LEVEL2_MGR_NAME;
    return this;
  }
  private String MAIN_LEVEL3_NAME;
  public String get_MAIN_LEVEL3_NAME() {
    return MAIN_LEVEL3_NAME;
  }
  public void set_MAIN_LEVEL3_NAME(String MAIN_LEVEL3_NAME) {
    this.MAIN_LEVEL3_NAME = MAIN_LEVEL3_NAME;
  }
  public dim_cafe with_MAIN_LEVEL3_NAME(String MAIN_LEVEL3_NAME) {
    this.MAIN_LEVEL3_NAME = MAIN_LEVEL3_NAME;
    return this;
  }
  private String MAIN_LEVEL3_DESC;
  public String get_MAIN_LEVEL3_DESC() {
    return MAIN_LEVEL3_DESC;
  }
  public void set_MAIN_LEVEL3_DESC(String MAIN_LEVEL3_DESC) {
    this.MAIN_LEVEL3_DESC = MAIN_LEVEL3_DESC;
  }
  public dim_cafe with_MAIN_LEVEL3_DESC(String MAIN_LEVEL3_DESC) {
    this.MAIN_LEVEL3_DESC = MAIN_LEVEL3_DESC;
    return this;
  }
  private String MAIN_LEVEL3_MGR_NAME;
  public String get_MAIN_LEVEL3_MGR_NAME() {
    return MAIN_LEVEL3_MGR_NAME;
  }
  public void set_MAIN_LEVEL3_MGR_NAME(String MAIN_LEVEL3_MGR_NAME) {
    this.MAIN_LEVEL3_MGR_NAME = MAIN_LEVEL3_MGR_NAME;
  }
  public dim_cafe with_MAIN_LEVEL3_MGR_NAME(String MAIN_LEVEL3_MGR_NAME) {
    this.MAIN_LEVEL3_MGR_NAME = MAIN_LEVEL3_MGR_NAME;
    return this;
  }
  private String MAIN_LEVEL4_NAME;
  public String get_MAIN_LEVEL4_NAME() {
    return MAIN_LEVEL4_NAME;
  }
  public void set_MAIN_LEVEL4_NAME(String MAIN_LEVEL4_NAME) {
    this.MAIN_LEVEL4_NAME = MAIN_LEVEL4_NAME;
  }
  public dim_cafe with_MAIN_LEVEL4_NAME(String MAIN_LEVEL4_NAME) {
    this.MAIN_LEVEL4_NAME = MAIN_LEVEL4_NAME;
    return this;
  }
  private String MAIN_LEVEL4_DESC;
  public String get_MAIN_LEVEL4_DESC() {
    return MAIN_LEVEL4_DESC;
  }
  public void set_MAIN_LEVEL4_DESC(String MAIN_LEVEL4_DESC) {
    this.MAIN_LEVEL4_DESC = MAIN_LEVEL4_DESC;
  }
  public dim_cafe with_MAIN_LEVEL4_DESC(String MAIN_LEVEL4_DESC) {
    this.MAIN_LEVEL4_DESC = MAIN_LEVEL4_DESC;
    return this;
  }
  private String MAIN_LEVEL4_MGR_NAME;
  public String get_MAIN_LEVEL4_MGR_NAME() {
    return MAIN_LEVEL4_MGR_NAME;
  }
  public void set_MAIN_LEVEL4_MGR_NAME(String MAIN_LEVEL4_MGR_NAME) {
    this.MAIN_LEVEL4_MGR_NAME = MAIN_LEVEL4_MGR_NAME;
  }
  public dim_cafe with_MAIN_LEVEL4_MGR_NAME(String MAIN_LEVEL4_MGR_NAME) {
    this.MAIN_LEVEL4_MGR_NAME = MAIN_LEVEL4_MGR_NAME;
    return this;
  }
  private String MAIN_LEVEL5_NAME;
  public String get_MAIN_LEVEL5_NAME() {
    return MAIN_LEVEL5_NAME;
  }
  public void set_MAIN_LEVEL5_NAME(String MAIN_LEVEL5_NAME) {
    this.MAIN_LEVEL5_NAME = MAIN_LEVEL5_NAME;
  }
  public dim_cafe with_MAIN_LEVEL5_NAME(String MAIN_LEVEL5_NAME) {
    this.MAIN_LEVEL5_NAME = MAIN_LEVEL5_NAME;
    return this;
  }
  private String MAIN_LEVEL5_DESC;
  public String get_MAIN_LEVEL5_DESC() {
    return MAIN_LEVEL5_DESC;
  }
  public void set_MAIN_LEVEL5_DESC(String MAIN_LEVEL5_DESC) {
    this.MAIN_LEVEL5_DESC = MAIN_LEVEL5_DESC;
  }
  public dim_cafe with_MAIN_LEVEL5_DESC(String MAIN_LEVEL5_DESC) {
    this.MAIN_LEVEL5_DESC = MAIN_LEVEL5_DESC;
    return this;
  }
  private String MAIN_LEVEL5_MGR_NAME;
  public String get_MAIN_LEVEL5_MGR_NAME() {
    return MAIN_LEVEL5_MGR_NAME;
  }
  public void set_MAIN_LEVEL5_MGR_NAME(String MAIN_LEVEL5_MGR_NAME) {
    this.MAIN_LEVEL5_MGR_NAME = MAIN_LEVEL5_MGR_NAME;
  }
  public dim_cafe with_MAIN_LEVEL5_MGR_NAME(String MAIN_LEVEL5_MGR_NAME) {
    this.MAIN_LEVEL5_MGR_NAME = MAIN_LEVEL5_MGR_NAME;
    return this;
  }
  private String MAIN_LEVEL6_NAME;
  public String get_MAIN_LEVEL6_NAME() {
    return MAIN_LEVEL6_NAME;
  }
  public void set_MAIN_LEVEL6_NAME(String MAIN_LEVEL6_NAME) {
    this.MAIN_LEVEL6_NAME = MAIN_LEVEL6_NAME;
  }
  public dim_cafe with_MAIN_LEVEL6_NAME(String MAIN_LEVEL6_NAME) {
    this.MAIN_LEVEL6_NAME = MAIN_LEVEL6_NAME;
    return this;
  }
  private String MAIN_LEVEL6_DESC;
  public String get_MAIN_LEVEL6_DESC() {
    return MAIN_LEVEL6_DESC;
  }
  public void set_MAIN_LEVEL6_DESC(String MAIN_LEVEL6_DESC) {
    this.MAIN_LEVEL6_DESC = MAIN_LEVEL6_DESC;
  }
  public dim_cafe with_MAIN_LEVEL6_DESC(String MAIN_LEVEL6_DESC) {
    this.MAIN_LEVEL6_DESC = MAIN_LEVEL6_DESC;
    return this;
  }
  private String MAIN_LEVEL6_MGR_NAME;
  public String get_MAIN_LEVEL6_MGR_NAME() {
    return MAIN_LEVEL6_MGR_NAME;
  }
  public void set_MAIN_LEVEL6_MGR_NAME(String MAIN_LEVEL6_MGR_NAME) {
    this.MAIN_LEVEL6_MGR_NAME = MAIN_LEVEL6_MGR_NAME;
  }
  public dim_cafe with_MAIN_LEVEL6_MGR_NAME(String MAIN_LEVEL6_MGR_NAME) {
    this.MAIN_LEVEL6_MGR_NAME = MAIN_LEVEL6_MGR_NAME;
    return this;
  }
  private String MAIN_LEVEL7_NAME;
  public String get_MAIN_LEVEL7_NAME() {
    return MAIN_LEVEL7_NAME;
  }
  public void set_MAIN_LEVEL7_NAME(String MAIN_LEVEL7_NAME) {
    this.MAIN_LEVEL7_NAME = MAIN_LEVEL7_NAME;
  }
  public dim_cafe with_MAIN_LEVEL7_NAME(String MAIN_LEVEL7_NAME) {
    this.MAIN_LEVEL7_NAME = MAIN_LEVEL7_NAME;
    return this;
  }
  private String MAIN_LEVEL7_DESC;
  public String get_MAIN_LEVEL7_DESC() {
    return MAIN_LEVEL7_DESC;
  }
  public void set_MAIN_LEVEL7_DESC(String MAIN_LEVEL7_DESC) {
    this.MAIN_LEVEL7_DESC = MAIN_LEVEL7_DESC;
  }
  public dim_cafe with_MAIN_LEVEL7_DESC(String MAIN_LEVEL7_DESC) {
    this.MAIN_LEVEL7_DESC = MAIN_LEVEL7_DESC;
    return this;
  }
  private String MAIN_LEVEL7_MGR_NAME;
  public String get_MAIN_LEVEL7_MGR_NAME() {
    return MAIN_LEVEL7_MGR_NAME;
  }
  public void set_MAIN_LEVEL7_MGR_NAME(String MAIN_LEVEL7_MGR_NAME) {
    this.MAIN_LEVEL7_MGR_NAME = MAIN_LEVEL7_MGR_NAME;
  }
  public dim_cafe with_MAIN_LEVEL7_MGR_NAME(String MAIN_LEVEL7_MGR_NAME) {
    this.MAIN_LEVEL7_MGR_NAME = MAIN_LEVEL7_MGR_NAME;
    return this;
  }
  private String MAIN_LEVEL8_NAME;
  public String get_MAIN_LEVEL8_NAME() {
    return MAIN_LEVEL8_NAME;
  }
  public void set_MAIN_LEVEL8_NAME(String MAIN_LEVEL8_NAME) {
    this.MAIN_LEVEL8_NAME = MAIN_LEVEL8_NAME;
  }
  public dim_cafe with_MAIN_LEVEL8_NAME(String MAIN_LEVEL8_NAME) {
    this.MAIN_LEVEL8_NAME = MAIN_LEVEL8_NAME;
    return this;
  }
  private String MAIN_LEVEL8_DESC;
  public String get_MAIN_LEVEL8_DESC() {
    return MAIN_LEVEL8_DESC;
  }
  public void set_MAIN_LEVEL8_DESC(String MAIN_LEVEL8_DESC) {
    this.MAIN_LEVEL8_DESC = MAIN_LEVEL8_DESC;
  }
  public dim_cafe with_MAIN_LEVEL8_DESC(String MAIN_LEVEL8_DESC) {
    this.MAIN_LEVEL8_DESC = MAIN_LEVEL8_DESC;
    return this;
  }
  private String MAIN_LEVEL8_MGR_NAME;
  public String get_MAIN_LEVEL8_MGR_NAME() {
    return MAIN_LEVEL8_MGR_NAME;
  }
  public void set_MAIN_LEVEL8_MGR_NAME(String MAIN_LEVEL8_MGR_NAME) {
    this.MAIN_LEVEL8_MGR_NAME = MAIN_LEVEL8_MGR_NAME;
  }
  public dim_cafe with_MAIN_LEVEL8_MGR_NAME(String MAIN_LEVEL8_MGR_NAME) {
    this.MAIN_LEVEL8_MGR_NAME = MAIN_LEVEL8_MGR_NAME;
    return this;
  }
  private String MAIN_LEVEL9_NAME;
  public String get_MAIN_LEVEL9_NAME() {
    return MAIN_LEVEL9_NAME;
  }
  public void set_MAIN_LEVEL9_NAME(String MAIN_LEVEL9_NAME) {
    this.MAIN_LEVEL9_NAME = MAIN_LEVEL9_NAME;
  }
  public dim_cafe with_MAIN_LEVEL9_NAME(String MAIN_LEVEL9_NAME) {
    this.MAIN_LEVEL9_NAME = MAIN_LEVEL9_NAME;
    return this;
  }
  private String MAIN_LEVEL9_DESC;
  public String get_MAIN_LEVEL9_DESC() {
    return MAIN_LEVEL9_DESC;
  }
  public void set_MAIN_LEVEL9_DESC(String MAIN_LEVEL9_DESC) {
    this.MAIN_LEVEL9_DESC = MAIN_LEVEL9_DESC;
  }
  public dim_cafe with_MAIN_LEVEL9_DESC(String MAIN_LEVEL9_DESC) {
    this.MAIN_LEVEL9_DESC = MAIN_LEVEL9_DESC;
    return this;
  }
  private String MAIN_LEVEL9_MGR_NAME;
  public String get_MAIN_LEVEL9_MGR_NAME() {
    return MAIN_LEVEL9_MGR_NAME;
  }
  public void set_MAIN_LEVEL9_MGR_NAME(String MAIN_LEVEL9_MGR_NAME) {
    this.MAIN_LEVEL9_MGR_NAME = MAIN_LEVEL9_MGR_NAME;
  }
  public dim_cafe with_MAIN_LEVEL9_MGR_NAME(String MAIN_LEVEL9_MGR_NAME) {
    this.MAIN_LEVEL9_MGR_NAME = MAIN_LEVEL9_MGR_NAME;
    return this;
  }
  private String MAIN_LEVEL10_NAME;
  public String get_MAIN_LEVEL10_NAME() {
    return MAIN_LEVEL10_NAME;
  }
  public void set_MAIN_LEVEL10_NAME(String MAIN_LEVEL10_NAME) {
    this.MAIN_LEVEL10_NAME = MAIN_LEVEL10_NAME;
  }
  public dim_cafe with_MAIN_LEVEL10_NAME(String MAIN_LEVEL10_NAME) {
    this.MAIN_LEVEL10_NAME = MAIN_LEVEL10_NAME;
    return this;
  }
  private String MAIN_LEVEL10_DESC;
  public String get_MAIN_LEVEL10_DESC() {
    return MAIN_LEVEL10_DESC;
  }
  public void set_MAIN_LEVEL10_DESC(String MAIN_LEVEL10_DESC) {
    this.MAIN_LEVEL10_DESC = MAIN_LEVEL10_DESC;
  }
  public dim_cafe with_MAIN_LEVEL10_DESC(String MAIN_LEVEL10_DESC) {
    this.MAIN_LEVEL10_DESC = MAIN_LEVEL10_DESC;
    return this;
  }
  private String MAIN_LEVEL10_MGR_NAME;
  public String get_MAIN_LEVEL10_MGR_NAME() {
    return MAIN_LEVEL10_MGR_NAME;
  }
  public void set_MAIN_LEVEL10_MGR_NAME(String MAIN_LEVEL10_MGR_NAME) {
    this.MAIN_LEVEL10_MGR_NAME = MAIN_LEVEL10_MGR_NAME;
  }
  public dim_cafe with_MAIN_LEVEL10_MGR_NAME(String MAIN_LEVEL10_MGR_NAME) {
    this.MAIN_LEVEL10_MGR_NAME = MAIN_LEVEL10_MGR_NAME;
    return this;
  }
  private java.sql.Timestamp FILE_DTTM;
  public java.sql.Timestamp get_FILE_DTTM() {
    return FILE_DTTM;
  }
  public void set_FILE_DTTM(java.sql.Timestamp FILE_DTTM) {
    this.FILE_DTTM = FILE_DTTM;
  }
  public dim_cafe with_FILE_DTTM(java.sql.Timestamp FILE_DTTM) {
    this.FILE_DTTM = FILE_DTTM;
    return this;
  }
  private java.sql.Timestamp INSERT_DTTM;
  public java.sql.Timestamp get_INSERT_DTTM() {
    return INSERT_DTTM;
  }
  public void set_INSERT_DTTM(java.sql.Timestamp INSERT_DTTM) {
    this.INSERT_DTTM = INSERT_DTTM;
  }
  public dim_cafe with_INSERT_DTTM(java.sql.Timestamp INSERT_DTTM) {
    this.INSERT_DTTM = INSERT_DTTM;
    return this;
  }
  private java.sql.Timestamp UPDATE_DTTM;
  public java.sql.Timestamp get_UPDATE_DTTM() {
    return UPDATE_DTTM;
  }
  public void set_UPDATE_DTTM(java.sql.Timestamp UPDATE_DTTM) {
    this.UPDATE_DTTM = UPDATE_DTTM;
  }
  public dim_cafe with_UPDATE_DTTM(java.sql.Timestamp UPDATE_DTTM) {
    this.UPDATE_DTTM = UPDATE_DTTM;
    return this;
  }
  private java.math.BigDecimal LOAD_DW_ID;
  public java.math.BigDecimal get_LOAD_DW_ID() {
    return LOAD_DW_ID;
  }
  public void set_LOAD_DW_ID(java.math.BigDecimal LOAD_DW_ID) {
    this.LOAD_DW_ID = LOAD_DW_ID;
  }
  public dim_cafe with_LOAD_DW_ID(java.math.BigDecimal LOAD_DW_ID) {
    this.LOAD_DW_ID = LOAD_DW_ID;
    return this;
  }
  private java.math.BigDecimal VERSION;
  public java.math.BigDecimal get_VERSION() {
    return VERSION;
  }
  public void set_VERSION(java.math.BigDecimal VERSION) {
    this.VERSION = VERSION;
  }
  public dim_cafe with_VERSION(java.math.BigDecimal VERSION) {
    this.VERSION = VERSION;
    return this;
  }
  private java.math.BigDecimal COUNTRY_DW_ID;
  public java.math.BigDecimal get_COUNTRY_DW_ID() {
    return COUNTRY_DW_ID;
  }
  public void set_COUNTRY_DW_ID(java.math.BigDecimal COUNTRY_DW_ID) {
    this.COUNTRY_DW_ID = COUNTRY_DW_ID;
  }
  public dim_cafe with_COUNTRY_DW_ID(java.math.BigDecimal COUNTRY_DW_ID) {
    this.COUNTRY_DW_ID = COUNTRY_DW_ID;
    return this;
  }
  private java.math.BigDecimal COMPANY_ID;
  public java.math.BigDecimal get_COMPANY_ID() {
    return COMPANY_ID;
  }
  public void set_COMPANY_ID(java.math.BigDecimal COMPANY_ID) {
    this.COMPANY_ID = COMPANY_ID;
  }
  public dim_cafe with_COMPANY_ID(java.math.BigDecimal COMPANY_ID) {
    this.COMPANY_ID = COMPANY_ID;
    return this;
  }
  private java.math.BigDecimal COMPANY_DW_ID;
  public java.math.BigDecimal get_COMPANY_DW_ID() {
    return COMPANY_DW_ID;
  }
  public void set_COMPANY_DW_ID(java.math.BigDecimal COMPANY_DW_ID) {
    this.COMPANY_DW_ID = COMPANY_DW_ID;
  }
  public dim_cafe with_COMPANY_DW_ID(java.math.BigDecimal COMPANY_DW_ID) {
    this.COMPANY_DW_ID = COMPANY_DW_ID;
    return this;
  }
  private String CAFE_MANAGER;
  public String get_CAFE_MANAGER() {
    return CAFE_MANAGER;
  }
  public void set_CAFE_MANAGER(String CAFE_MANAGER) {
    this.CAFE_MANAGER = CAFE_MANAGER;
  }
  public dim_cafe with_CAFE_MANAGER(String CAFE_MANAGER) {
    this.CAFE_MANAGER = CAFE_MANAGER;
    return this;
  }
  private String CATERING_COORDINATORS;
  public String get_CATERING_COORDINATORS() {
    return CATERING_COORDINATORS;
  }
  public void set_CATERING_COORDINATORS(String CATERING_COORDINATORS) {
    this.CATERING_COORDINATORS = CATERING_COORDINATORS;
  }
  public dim_cafe with_CATERING_COORDINATORS(String CATERING_COORDINATORS) {
    this.CATERING_COORDINATORS = CATERING_COORDINATORS;
    return this;
  }
  private String MARKET_NAME;
  public String get_MARKET_NAME() {
    return MARKET_NAME;
  }
  public void set_MARKET_NAME(String MARKET_NAME) {
    this.MARKET_NAME = MARKET_NAME;
  }
  public dim_cafe with_MARKET_NAME(String MARKET_NAME) {
    this.MARKET_NAME = MARKET_NAME;
    return this;
  }
  private java.math.BigDecimal YEAR_BASE_CAFE;
  public java.math.BigDecimal get_YEAR_BASE_CAFE() {
    return YEAR_BASE_CAFE;
  }
  public void set_YEAR_BASE_CAFE(java.math.BigDecimal YEAR_BASE_CAFE) {
    this.YEAR_BASE_CAFE = YEAR_BASE_CAFE;
  }
  public dim_cafe with_YEAR_BASE_CAFE(java.math.BigDecimal YEAR_BASE_CAFE) {
    this.YEAR_BASE_CAFE = YEAR_BASE_CAFE;
    return this;
  }
  private java.math.BigDecimal MARKETING_LOCATION_DW_ID;
  public java.math.BigDecimal get_MARKETING_LOCATION_DW_ID() {
    return MARKETING_LOCATION_DW_ID;
  }
  public void set_MARKETING_LOCATION_DW_ID(java.math.BigDecimal MARKETING_LOCATION_DW_ID) {
    this.MARKETING_LOCATION_DW_ID = MARKETING_LOCATION_DW_ID;
  }
  public dim_cafe with_MARKETING_LOCATION_DW_ID(java.math.BigDecimal MARKETING_LOCATION_DW_ID) {
    this.MARKETING_LOCATION_DW_ID = MARKETING_LOCATION_DW_ID;
    return this;
  }
  private String DMA_NAME;
  public String get_DMA_NAME() {
    return DMA_NAME;
  }
  public void set_DMA_NAME(String DMA_NAME) {
    this.DMA_NAME = DMA_NAME;
  }
  public dim_cafe with_DMA_NAME(String DMA_NAME) {
    this.DMA_NAME = DMA_NAME;
    return this;
  }
  private java.math.BigDecimal LABOR_INVESTMENT_AMT;
  public java.math.BigDecimal get_LABOR_INVESTMENT_AMT() {
    return LABOR_INVESTMENT_AMT;
  }
  public void set_LABOR_INVESTMENT_AMT(java.math.BigDecimal LABOR_INVESTMENT_AMT) {
    this.LABOR_INVESTMENT_AMT = LABOR_INVESTMENT_AMT;
  }
  public dim_cafe with_LABOR_INVESTMENT_AMT(java.math.BigDecimal LABOR_INVESTMENT_AMT) {
    this.LABOR_INVESTMENT_AMT = LABOR_INVESTMENT_AMT;
    return this;
  }
  private String CATERING_RCSM;
  public String get_CATERING_RCSM() {
    return CATERING_RCSM;
  }
  public void set_CATERING_RCSM(String CATERING_RCSM) {
    this.CATERING_RCSM = CATERING_RCSM;
  }
  public dim_cafe with_CATERING_RCSM(String CATERING_RCSM) {
    this.CATERING_RCSM = CATERING_RCSM;
    return this;
  }
  private String CATERING_SR_RCSM;
  public String get_CATERING_SR_RCSM() {
    return CATERING_SR_RCSM;
  }
  public void set_CATERING_SR_RCSM(String CATERING_SR_RCSM) {
    this.CATERING_SR_RCSM = CATERING_SR_RCSM;
  }
  public dim_cafe with_CATERING_SR_RCSM(String CATERING_SR_RCSM) {
    this.CATERING_SR_RCSM = CATERING_SR_RCSM;
    return this;
  }
  private java.math.BigDecimal PANERA_2_0_STATUS;
  public java.math.BigDecimal get_PANERA_2_0_STATUS() {
    return PANERA_2_0_STATUS;
  }
  public void set_PANERA_2_0_STATUS(java.math.BigDecimal PANERA_2_0_STATUS) {
    this.PANERA_2_0_STATUS = PANERA_2_0_STATUS;
  }
  public dim_cafe with_PANERA_2_0_STATUS(java.math.BigDecimal PANERA_2_0_STATUS) {
    this.PANERA_2_0_STATUS = PANERA_2_0_STATUS;
    return this;
  }
  private java.math.BigDecimal RPU_STATUS;
  public java.math.BigDecimal get_RPU_STATUS() {
    return RPU_STATUS;
  }
  public void set_RPU_STATUS(java.math.BigDecimal RPU_STATUS) {
    this.RPU_STATUS = RPU_STATUS;
  }
  public dim_cafe with_RPU_STATUS(java.math.BigDecimal RPU_STATUS) {
    this.RPU_STATUS = RPU_STATUS;
    return this;
  }
  private String HUB_CLUSTER_NAME;
  public String get_HUB_CLUSTER_NAME() {
    return HUB_CLUSTER_NAME;
  }
  public void set_HUB_CLUSTER_NAME(String HUB_CLUSTER_NAME) {
    this.HUB_CLUSTER_NAME = HUB_CLUSTER_NAME;
  }
  public dim_cafe with_HUB_CLUSTER_NAME(String HUB_CLUSTER_NAME) {
    this.HUB_CLUSTER_NAME = HUB_CLUSTER_NAME;
    return this;
  }
  private String HUB_CLUSTER_CLASS;
  public String get_HUB_CLUSTER_CLASS() {
    return HUB_CLUSTER_CLASS;
  }
  public void set_HUB_CLUSTER_CLASS(String HUB_CLUSTER_CLASS) {
    this.HUB_CLUSTER_CLASS = HUB_CLUSTER_CLASS;
  }
  public dim_cafe with_HUB_CLUSTER_CLASS(String HUB_CLUSTER_CLASS) {
    this.HUB_CLUSTER_CLASS = HUB_CLUSTER_CLASS;
    return this;
  }
  private String ECOMMERCE_CAFE_TYPE_CATERING;
  public String get_ECOMMERCE_CAFE_TYPE_CATERING() {
    return ECOMMERCE_CAFE_TYPE_CATERING;
  }
  public void set_ECOMMERCE_CAFE_TYPE_CATERING(String ECOMMERCE_CAFE_TYPE_CATERING) {
    this.ECOMMERCE_CAFE_TYPE_CATERING = ECOMMERCE_CAFE_TYPE_CATERING;
  }
  public dim_cafe with_ECOMMERCE_CAFE_TYPE_CATERING(String ECOMMERCE_CAFE_TYPE_CATERING) {
    this.ECOMMERCE_CAFE_TYPE_CATERING = ECOMMERCE_CAFE_TYPE_CATERING;
    return this;
  }
  private String ECOMMERCE_CAFE_TYPE;
  public String get_ECOMMERCE_CAFE_TYPE() {
    return ECOMMERCE_CAFE_TYPE;
  }
  public void set_ECOMMERCE_CAFE_TYPE(String ECOMMERCE_CAFE_TYPE) {
    this.ECOMMERCE_CAFE_TYPE = ECOMMERCE_CAFE_TYPE;
  }
  public dim_cafe with_ECOMMERCE_CAFE_TYPE(String ECOMMERCE_CAFE_TYPE) {
    this.ECOMMERCE_CAFE_TYPE = ECOMMERCE_CAFE_TYPE;
    return this;
  }
  private String CATERING_ONLINE_DESIGNATION;
  public String get_CATERING_ONLINE_DESIGNATION() {
    return CATERING_ONLINE_DESIGNATION;
  }
  public void set_CATERING_ONLINE_DESIGNATION(String CATERING_ONLINE_DESIGNATION) {
    this.CATERING_ONLINE_DESIGNATION = CATERING_ONLINE_DESIGNATION;
  }
  public dim_cafe with_CATERING_ONLINE_DESIGNATION(String CATERING_ONLINE_DESIGNATION) {
    this.CATERING_ONLINE_DESIGNATION = CATERING_ONLINE_DESIGNATION;
    return this;
  }
  private String ECOMMERCE_CATERING_HUB_PARENT;
  public String get_ECOMMERCE_CATERING_HUB_PARENT() {
    return ECOMMERCE_CATERING_HUB_PARENT;
  }
  public void set_ECOMMERCE_CATERING_HUB_PARENT(String ECOMMERCE_CATERING_HUB_PARENT) {
    this.ECOMMERCE_CATERING_HUB_PARENT = ECOMMERCE_CATERING_HUB_PARENT;
  }
  public dim_cafe with_ECOMMERCE_CATERING_HUB_PARENT(String ECOMMERCE_CATERING_HUB_PARENT) {
    this.ECOMMERCE_CATERING_HUB_PARENT = ECOMMERCE_CATERING_HUB_PARENT;
    return this;
  }
  private String CATERING_ONLINE_STATUS;
  public String get_CATERING_ONLINE_STATUS() {
    return CATERING_ONLINE_STATUS;
  }
  public void set_CATERING_ONLINE_STATUS(String CATERING_ONLINE_STATUS) {
    this.CATERING_ONLINE_STATUS = CATERING_ONLINE_STATUS;
  }
  public dim_cafe with_CATERING_ONLINE_STATUS(String CATERING_ONLINE_STATUS) {
    this.CATERING_ONLINE_STATUS = CATERING_ONLINE_STATUS;
    return this;
  }
  private java.math.BigDecimal ECOMMERCE_KIOSKS_FLAG;
  public java.math.BigDecimal get_ECOMMERCE_KIOSKS_FLAG() {
    return ECOMMERCE_KIOSKS_FLAG;
  }
  public void set_ECOMMERCE_KIOSKS_FLAG(java.math.BigDecimal ECOMMERCE_KIOSKS_FLAG) {
    this.ECOMMERCE_KIOSKS_FLAG = ECOMMERCE_KIOSKS_FLAG;
  }
  public dim_cafe with_ECOMMERCE_KIOSKS_FLAG(java.math.BigDecimal ECOMMERCE_KIOSKS_FLAG) {
    this.ECOMMERCE_KIOSKS_FLAG = ECOMMERCE_KIOSKS_FLAG;
    return this;
  }
  private java.math.BigDecimal ECOMMERCE_RETAIL_DELIVERY_FLAG;
  public java.math.BigDecimal get_ECOMMERCE_RETAIL_DELIVERY_FLAG() {
    return ECOMMERCE_RETAIL_DELIVERY_FLAG;
  }
  public void set_ECOMMERCE_RETAIL_DELIVERY_FLAG(java.math.BigDecimal ECOMMERCE_RETAIL_DELIVERY_FLAG) {
    this.ECOMMERCE_RETAIL_DELIVERY_FLAG = ECOMMERCE_RETAIL_DELIVERY_FLAG;
  }
  public dim_cafe with_ECOMMERCE_RETAIL_DELIVERY_FLAG(java.math.BigDecimal ECOMMERCE_RETAIL_DELIVERY_FLAG) {
    this.ECOMMERCE_RETAIL_DELIVERY_FLAG = ECOMMERCE_RETAIL_DELIVERY_FLAG;
    return this;
  }
  private java.math.BigDecimal ECOMMERCE_RETAIL_DINE_IN_FLAG;
  public java.math.BigDecimal get_ECOMMERCE_RETAIL_DINE_IN_FLAG() {
    return ECOMMERCE_RETAIL_DINE_IN_FLAG;
  }
  public void set_ECOMMERCE_RETAIL_DINE_IN_FLAG(java.math.BigDecimal ECOMMERCE_RETAIL_DINE_IN_FLAG) {
    this.ECOMMERCE_RETAIL_DINE_IN_FLAG = ECOMMERCE_RETAIL_DINE_IN_FLAG;
  }
  public dim_cafe with_ECOMMERCE_RETAIL_DINE_IN_FLAG(java.math.BigDecimal ECOMMERCE_RETAIL_DINE_IN_FLAG) {
    this.ECOMMERCE_RETAIL_DINE_IN_FLAG = ECOMMERCE_RETAIL_DINE_IN_FLAG;
    return this;
  }
  private java.math.BigDecimal ECOMMERCE_RETAIL_PICKUP_FLAG;
  public java.math.BigDecimal get_ECOMMERCE_RETAIL_PICKUP_FLAG() {
    return ECOMMERCE_RETAIL_PICKUP_FLAG;
  }
  public void set_ECOMMERCE_RETAIL_PICKUP_FLAG(java.math.BigDecimal ECOMMERCE_RETAIL_PICKUP_FLAG) {
    this.ECOMMERCE_RETAIL_PICKUP_FLAG = ECOMMERCE_RETAIL_PICKUP_FLAG;
  }
  public dim_cafe with_ECOMMERCE_RETAIL_PICKUP_FLAG(java.math.BigDecimal ECOMMERCE_RETAIL_PICKUP_FLAG) {
    this.ECOMMERCE_RETAIL_PICKUP_FLAG = ECOMMERCE_RETAIL_PICKUP_FLAG;
    return this;
  }
  private java.sql.Timestamp ECOMMERCE_LAUNCH_CATERING_2_0;
  public java.sql.Timestamp get_ECOMMERCE_LAUNCH_CATERING_2_0() {
    return ECOMMERCE_LAUNCH_CATERING_2_0;
  }
  public void set_ECOMMERCE_LAUNCH_CATERING_2_0(java.sql.Timestamp ECOMMERCE_LAUNCH_CATERING_2_0) {
    this.ECOMMERCE_LAUNCH_CATERING_2_0 = ECOMMERCE_LAUNCH_CATERING_2_0;
  }
  public dim_cafe with_ECOMMERCE_LAUNCH_CATERING_2_0(java.sql.Timestamp ECOMMERCE_LAUNCH_CATERING_2_0) {
    this.ECOMMERCE_LAUNCH_CATERING_2_0 = ECOMMERCE_LAUNCH_CATERING_2_0;
    return this;
  }
  private java.sql.Timestamp ECOMMERCE_LAUNCH_RPU;
  public java.sql.Timestamp get_ECOMMERCE_LAUNCH_RPU() {
    return ECOMMERCE_LAUNCH_RPU;
  }
  public void set_ECOMMERCE_LAUNCH_RPU(java.sql.Timestamp ECOMMERCE_LAUNCH_RPU) {
    this.ECOMMERCE_LAUNCH_RPU = ECOMMERCE_LAUNCH_RPU;
  }
  public dim_cafe with_ECOMMERCE_LAUNCH_RPU(java.sql.Timestamp ECOMMERCE_LAUNCH_RPU) {
    this.ECOMMERCE_LAUNCH_RPU = ECOMMERCE_LAUNCH_RPU;
    return this;
  }
  private java.sql.Timestamp ECOMMERCE_LAUNCH_PANERA_2_0;
  public java.sql.Timestamp get_ECOMMERCE_LAUNCH_PANERA_2_0() {
    return ECOMMERCE_LAUNCH_PANERA_2_0;
  }
  public void set_ECOMMERCE_LAUNCH_PANERA_2_0(java.sql.Timestamp ECOMMERCE_LAUNCH_PANERA_2_0) {
    this.ECOMMERCE_LAUNCH_PANERA_2_0 = ECOMMERCE_LAUNCH_PANERA_2_0;
  }
  public dim_cafe with_ECOMMERCE_LAUNCH_PANERA_2_0(java.sql.Timestamp ECOMMERCE_LAUNCH_PANERA_2_0) {
    this.ECOMMERCE_LAUNCH_PANERA_2_0 = ECOMMERCE_LAUNCH_PANERA_2_0;
    return this;
  }
  private java.sql.Timestamp ECOMMERCE_LAUNCH_DELIVERY;
  public java.sql.Timestamp get_ECOMMERCE_LAUNCH_DELIVERY() {
    return ECOMMERCE_LAUNCH_DELIVERY;
  }
  public void set_ECOMMERCE_LAUNCH_DELIVERY(java.sql.Timestamp ECOMMERCE_LAUNCH_DELIVERY) {
    this.ECOMMERCE_LAUNCH_DELIVERY = ECOMMERCE_LAUNCH_DELIVERY;
  }
  public dim_cafe with_ECOMMERCE_LAUNCH_DELIVERY(java.sql.Timestamp ECOMMERCE_LAUNCH_DELIVERY) {
    this.ECOMMERCE_LAUNCH_DELIVERY = ECOMMERCE_LAUNCH_DELIVERY;
    return this;
  }
  private java.sql.Timestamp ECOMMERCE_LAUNCH_DINE_IN;
  public java.sql.Timestamp get_ECOMMERCE_LAUNCH_DINE_IN() {
    return ECOMMERCE_LAUNCH_DINE_IN;
  }
  public void set_ECOMMERCE_LAUNCH_DINE_IN(java.sql.Timestamp ECOMMERCE_LAUNCH_DINE_IN) {
    this.ECOMMERCE_LAUNCH_DINE_IN = ECOMMERCE_LAUNCH_DINE_IN;
  }
  public dim_cafe with_ECOMMERCE_LAUNCH_DINE_IN(java.sql.Timestamp ECOMMERCE_LAUNCH_DINE_IN) {
    this.ECOMMERCE_LAUNCH_DINE_IN = ECOMMERCE_LAUNCH_DINE_IN;
    return this;
  }
  private java.sql.Timestamp ECOMMERCE_LAUNCH_KIOSKS;
  public java.sql.Timestamp get_ECOMMERCE_LAUNCH_KIOSKS() {
    return ECOMMERCE_LAUNCH_KIOSKS;
  }
  public void set_ECOMMERCE_LAUNCH_KIOSKS(java.sql.Timestamp ECOMMERCE_LAUNCH_KIOSKS) {
    this.ECOMMERCE_LAUNCH_KIOSKS = ECOMMERCE_LAUNCH_KIOSKS;
  }
  public dim_cafe with_ECOMMERCE_LAUNCH_KIOSKS(java.sql.Timestamp ECOMMERCE_LAUNCH_KIOSKS) {
    this.ECOMMERCE_LAUNCH_KIOSKS = ECOMMERCE_LAUNCH_KIOSKS;
    return this;
  }
  private java.math.BigDecimal LAUNCH_2_0_PERIOD_NBR_IN_EPOCH;
  public java.math.BigDecimal get_LAUNCH_2_0_PERIOD_NBR_IN_EPOCH() {
    return LAUNCH_2_0_PERIOD_NBR_IN_EPOCH;
  }
  public void set_LAUNCH_2_0_PERIOD_NBR_IN_EPOCH(java.math.BigDecimal LAUNCH_2_0_PERIOD_NBR_IN_EPOCH) {
    this.LAUNCH_2_0_PERIOD_NBR_IN_EPOCH = LAUNCH_2_0_PERIOD_NBR_IN_EPOCH;
  }
  public dim_cafe with_LAUNCH_2_0_PERIOD_NBR_IN_EPOCH(java.math.BigDecimal LAUNCH_2_0_PERIOD_NBR_IN_EPOCH) {
    this.LAUNCH_2_0_PERIOD_NBR_IN_EPOCH = LAUNCH_2_0_PERIOD_NBR_IN_EPOCH;
    return this;
  }
  private java.math.BigDecimal LAUNCH_2_0_WEEK_NBR_IN_EPOCH;
  public java.math.BigDecimal get_LAUNCH_2_0_WEEK_NBR_IN_EPOCH() {
    return LAUNCH_2_0_WEEK_NBR_IN_EPOCH;
  }
  public void set_LAUNCH_2_0_WEEK_NBR_IN_EPOCH(java.math.BigDecimal LAUNCH_2_0_WEEK_NBR_IN_EPOCH) {
    this.LAUNCH_2_0_WEEK_NBR_IN_EPOCH = LAUNCH_2_0_WEEK_NBR_IN_EPOCH;
  }
  public dim_cafe with_LAUNCH_2_0_WEEK_NBR_IN_EPOCH(java.math.BigDecimal LAUNCH_2_0_WEEK_NBR_IN_EPOCH) {
    this.LAUNCH_2_0_WEEK_NBR_IN_EPOCH = LAUNCH_2_0_WEEK_NBR_IN_EPOCH;
    return this;
  }
  private java.math.BigDecimal LAUNCH_DEL_PERIOD_NBR_IN_EPOCH;
  public java.math.BigDecimal get_LAUNCH_DEL_PERIOD_NBR_IN_EPOCH() {
    return LAUNCH_DEL_PERIOD_NBR_IN_EPOCH;
  }
  public void set_LAUNCH_DEL_PERIOD_NBR_IN_EPOCH(java.math.BigDecimal LAUNCH_DEL_PERIOD_NBR_IN_EPOCH) {
    this.LAUNCH_DEL_PERIOD_NBR_IN_EPOCH = LAUNCH_DEL_PERIOD_NBR_IN_EPOCH;
  }
  public dim_cafe with_LAUNCH_DEL_PERIOD_NBR_IN_EPOCH(java.math.BigDecimal LAUNCH_DEL_PERIOD_NBR_IN_EPOCH) {
    this.LAUNCH_DEL_PERIOD_NBR_IN_EPOCH = LAUNCH_DEL_PERIOD_NBR_IN_EPOCH;
    return this;
  }
  private java.math.BigDecimal LAUNCH_DEL_WEEK_NBR_IN_EPOCH;
  public java.math.BigDecimal get_LAUNCH_DEL_WEEK_NBR_IN_EPOCH() {
    return LAUNCH_DEL_WEEK_NBR_IN_EPOCH;
  }
  public void set_LAUNCH_DEL_WEEK_NBR_IN_EPOCH(java.math.BigDecimal LAUNCH_DEL_WEEK_NBR_IN_EPOCH) {
    this.LAUNCH_DEL_WEEK_NBR_IN_EPOCH = LAUNCH_DEL_WEEK_NBR_IN_EPOCH;
  }
  public dim_cafe with_LAUNCH_DEL_WEEK_NBR_IN_EPOCH(java.math.BigDecimal LAUNCH_DEL_WEEK_NBR_IN_EPOCH) {
    this.LAUNCH_DEL_WEEK_NBR_IN_EPOCH = LAUNCH_DEL_WEEK_NBR_IN_EPOCH;
    return this;
  }
  private java.math.BigDecimal CAFE_GROUP_DW_ID;
  public java.math.BigDecimal get_CAFE_GROUP_DW_ID() {
    return CAFE_GROUP_DW_ID;
  }
  public void set_CAFE_GROUP_DW_ID(java.math.BigDecimal CAFE_GROUP_DW_ID) {
    this.CAFE_GROUP_DW_ID = CAFE_GROUP_DW_ID;
  }
  public dim_cafe with_CAFE_GROUP_DW_ID(java.math.BigDecimal CAFE_GROUP_DW_ID) {
    this.CAFE_GROUP_DW_ID = CAFE_GROUP_DW_ID;
    return this;
  }
  private java.math.BigDecimal DISTRIBUTION_CTR_DW_ID;
  public java.math.BigDecimal get_DISTRIBUTION_CTR_DW_ID() {
    return DISTRIBUTION_CTR_DW_ID;
  }
  public void set_DISTRIBUTION_CTR_DW_ID(java.math.BigDecimal DISTRIBUTION_CTR_DW_ID) {
    this.DISTRIBUTION_CTR_DW_ID = DISTRIBUTION_CTR_DW_ID;
  }
  public dim_cafe with_DISTRIBUTION_CTR_DW_ID(java.math.BigDecimal DISTRIBUTION_CTR_DW_ID) {
    this.DISTRIBUTION_CTR_DW_ID = DISTRIBUTION_CTR_DW_ID;
    return this;
  }
  private String DISTRICT_DESC;
  public String get_DISTRICT_DESC() {
    return DISTRICT_DESC;
  }
  public void set_DISTRICT_DESC(String DISTRICT_DESC) {
    this.DISTRICT_DESC = DISTRICT_DESC;
  }
  public dim_cafe with_DISTRICT_DESC(String DISTRICT_DESC) {
    this.DISTRICT_DESC = DISTRICT_DESC;
    return this;
  }
  private java.math.BigDecimal PRIMARY_MENU_GROUP;
  public java.math.BigDecimal get_PRIMARY_MENU_GROUP() {
    return PRIMARY_MENU_GROUP;
  }
  public void set_PRIMARY_MENU_GROUP(java.math.BigDecimal PRIMARY_MENU_GROUP) {
    this.PRIMARY_MENU_GROUP = PRIMARY_MENU_GROUP;
  }
  public dim_cafe with_PRIMARY_MENU_GROUP(java.math.BigDecimal PRIMARY_MENU_GROUP) {
    this.PRIMARY_MENU_GROUP = PRIMARY_MENU_GROUP;
    return this;
  }
  private String PRICING_TIER_GROUP;
  public String get_PRICING_TIER_GROUP() {
    return PRICING_TIER_GROUP;
  }
  public void set_PRICING_TIER_GROUP(String PRICING_TIER_GROUP) {
    this.PRICING_TIER_GROUP = PRICING_TIER_GROUP;
  }
  public dim_cafe with_PRICING_TIER_GROUP(String PRICING_TIER_GROUP) {
    this.PRICING_TIER_GROUP = PRICING_TIER_GROUP;
    return this;
  }
  private java.sql.Timestamp ECOMMERCE_LAUNCH_OPS_INTEGRITY;
  public java.sql.Timestamp get_ECOMMERCE_LAUNCH_OPS_INTEGRITY() {
    return ECOMMERCE_LAUNCH_OPS_INTEGRITY;
  }
  public void set_ECOMMERCE_LAUNCH_OPS_INTEGRITY(java.sql.Timestamp ECOMMERCE_LAUNCH_OPS_INTEGRITY) {
    this.ECOMMERCE_LAUNCH_OPS_INTEGRITY = ECOMMERCE_LAUNCH_OPS_INTEGRITY;
  }
  public dim_cafe with_ECOMMERCE_LAUNCH_OPS_INTEGRITY(java.sql.Timestamp ECOMMERCE_LAUNCH_OPS_INTEGRITY) {
    this.ECOMMERCE_LAUNCH_OPS_INTEGRITY = ECOMMERCE_LAUNCH_OPS_INTEGRITY;
    return this;
  }
  private java.math.BigDecimal CERTIFIED_TRAINING_CAFE;
  public java.math.BigDecimal get_CERTIFIED_TRAINING_CAFE() {
    return CERTIFIED_TRAINING_CAFE;
  }
  public void set_CERTIFIED_TRAINING_CAFE(java.math.BigDecimal CERTIFIED_TRAINING_CAFE) {
    this.CERTIFIED_TRAINING_CAFE = CERTIFIED_TRAINING_CAFE;
  }
  public dim_cafe with_CERTIFIED_TRAINING_CAFE(java.math.BigDecimal CERTIFIED_TRAINING_CAFE) {
    this.CERTIFIED_TRAINING_CAFE = CERTIFIED_TRAINING_CAFE;
    return this;
  }
  private java.math.BigDecimal COMMISSARY_DW_ID;
  public java.math.BigDecimal get_COMMISSARY_DW_ID() {
    return COMMISSARY_DW_ID;
  }
  public void set_COMMISSARY_DW_ID(java.math.BigDecimal COMMISSARY_DW_ID) {
    this.COMMISSARY_DW_ID = COMMISSARY_DW_ID;
  }
  public dim_cafe with_COMMISSARY_DW_ID(java.math.BigDecimal COMMISSARY_DW_ID) {
    this.COMMISSARY_DW_ID = COMMISSARY_DW_ID;
    return this;
  }
  private java.math.BigDecimal COMMISSARY_NBR;
  public java.math.BigDecimal get_COMMISSARY_NBR() {
    return COMMISSARY_NBR;
  }
  public void set_COMMISSARY_NBR(java.math.BigDecimal COMMISSARY_NBR) {
    this.COMMISSARY_NBR = COMMISSARY_NBR;
  }
  public dim_cafe with_COMMISSARY_NBR(java.math.BigDecimal COMMISSARY_NBR) {
    this.COMMISSARY_NBR = COMMISSARY_NBR;
    return this;
  }
  private String COMMISSARY_NAME;
  public String get_COMMISSARY_NAME() {
    return COMMISSARY_NAME;
  }
  public void set_COMMISSARY_NAME(String COMMISSARY_NAME) {
    this.COMMISSARY_NAME = COMMISSARY_NAME;
  }
  public dim_cafe with_COMMISSARY_NAME(String COMMISSARY_NAME) {
    this.COMMISSARY_NAME = COMMISSARY_NAME;
    return this;
  }
  private java.math.BigDecimal OPENED_DT_PERIOD_NBR_IN_EPOCH;
  public java.math.BigDecimal get_OPENED_DT_PERIOD_NBR_IN_EPOCH() {
    return OPENED_DT_PERIOD_NBR_IN_EPOCH;
  }
  public void set_OPENED_DT_PERIOD_NBR_IN_EPOCH(java.math.BigDecimal OPENED_DT_PERIOD_NBR_IN_EPOCH) {
    this.OPENED_DT_PERIOD_NBR_IN_EPOCH = OPENED_DT_PERIOD_NBR_IN_EPOCH;
  }
  public dim_cafe with_OPENED_DT_PERIOD_NBR_IN_EPOCH(java.math.BigDecimal OPENED_DT_PERIOD_NBR_IN_EPOCH) {
    this.OPENED_DT_PERIOD_NBR_IN_EPOCH = OPENED_DT_PERIOD_NBR_IN_EPOCH;
    return this;
  }
  private java.math.BigDecimal OPENED_DT_WEEK_NBR_IN_EPOCH;
  public java.math.BigDecimal get_OPENED_DT_WEEK_NBR_IN_EPOCH() {
    return OPENED_DT_WEEK_NBR_IN_EPOCH;
  }
  public void set_OPENED_DT_WEEK_NBR_IN_EPOCH(java.math.BigDecimal OPENED_DT_WEEK_NBR_IN_EPOCH) {
    this.OPENED_DT_WEEK_NBR_IN_EPOCH = OPENED_DT_WEEK_NBR_IN_EPOCH;
  }
  public dim_cafe with_OPENED_DT_WEEK_NBR_IN_EPOCH(java.math.BigDecimal OPENED_DT_WEEK_NBR_IN_EPOCH) {
    this.OPENED_DT_WEEK_NBR_IN_EPOCH = OPENED_DT_WEEK_NBR_IN_EPOCH;
    return this;
  }
  private String GL_STORE_NBR;
  public String get_GL_STORE_NBR() {
    return GL_STORE_NBR;
  }
  public void set_GL_STORE_NBR(String GL_STORE_NBR) {
    this.GL_STORE_NBR = GL_STORE_NBR;
  }
  public dim_cafe with_GL_STORE_NBR(String GL_STORE_NBR) {
    this.GL_STORE_NBR = GL_STORE_NBR;
    return this;
  }
  private String PAYROLL_PROCESSOR_BRANCH;
  public String get_PAYROLL_PROCESSOR_BRANCH() {
    return PAYROLL_PROCESSOR_BRANCH;
  }
  public void set_PAYROLL_PROCESSOR_BRANCH(String PAYROLL_PROCESSOR_BRANCH) {
    this.PAYROLL_PROCESSOR_BRANCH = PAYROLL_PROCESSOR_BRANCH;
  }
  public dim_cafe with_PAYROLL_PROCESSOR_BRANCH(String PAYROLL_PROCESSOR_BRANCH) {
    this.PAYROLL_PROCESSOR_BRANCH = PAYROLL_PROCESSOR_BRANCH;
    return this;
  }
  private String PAYROLL_PROCESSOR_DIVISION;
  public String get_PAYROLL_PROCESSOR_DIVISION() {
    return PAYROLL_PROCESSOR_DIVISION;
  }
  public void set_PAYROLL_PROCESSOR_DIVISION(String PAYROLL_PROCESSOR_DIVISION) {
    this.PAYROLL_PROCESSOR_DIVISION = PAYROLL_PROCESSOR_DIVISION;
  }
  public dim_cafe with_PAYROLL_PROCESSOR_DIVISION(String PAYROLL_PROCESSOR_DIVISION) {
    this.PAYROLL_PROCESSOR_DIVISION = PAYROLL_PROCESSOR_DIVISION;
    return this;
  }
  private java.sql.Timestamp LOAD_DTTM;
  public java.sql.Timestamp get_LOAD_DTTM() {
    return LOAD_DTTM;
  }
  public void set_LOAD_DTTM(java.sql.Timestamp LOAD_DTTM) {
    this.LOAD_DTTM = LOAD_DTTM;
  }
  public dim_cafe with_LOAD_DTTM(java.sql.Timestamp LOAD_DTTM) {
    this.LOAD_DTTM = LOAD_DTTM;
    return this;
  }
  private String LOAD_BY;
  public String get_LOAD_BY() {
    return LOAD_BY;
  }
  public void set_LOAD_BY(String LOAD_BY) {
    this.LOAD_BY = LOAD_BY;
  }
  public dim_cafe with_LOAD_BY(String LOAD_BY) {
    this.LOAD_BY = LOAD_BY;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_cafe)) {
      return false;
    }
    dim_cafe that = (dim_cafe) o;
    boolean equal = true;
    equal = equal && (this.Z_CAFE_DW_ID == null ? that.Z_CAFE_DW_ID == null : this.Z_CAFE_DW_ID.equals(that.Z_CAFE_DW_ID));
    equal = equal && (this.CAFE_NBR == null ? that.CAFE_NBR == null : this.CAFE_NBR.equals(that.CAFE_NBR));
    equal = equal && (this.CAFE_NAME == null ? that.CAFE_NAME == null : this.CAFE_NAME.equals(that.CAFE_NAME));
    equal = equal && (this.OPENED_DATE == null ? that.OPENED_DATE == null : this.OPENED_DATE.equals(that.OPENED_DATE));
    equal = equal && (this.CLOSED_DATE == null ? that.CLOSED_DATE == null : this.CLOSED_DATE.equals(that.CLOSED_DATE));
    equal = equal && (this.LOC_CURRENCY_DW_ID == null ? that.LOC_CURRENCY_DW_ID == null : this.LOC_CURRENCY_DW_ID.equals(that.LOC_CURRENCY_DW_ID));
    equal = equal && (this.POS_SYSTEM_TYPE == null ? that.POS_SYSTEM_TYPE == null : this.POS_SYSTEM_TYPE.equals(that.POS_SYSTEM_TYPE));
    equal = equal && (this.POS_POLLING_FLAG == null ? that.POS_POLLING_FLAG == null : this.POS_POLLING_FLAG.equals(that.POS_POLLING_FLAG));
    equal = equal && (this.TIMEZONE == null ? that.TIMEZONE == null : this.TIMEZONE.equals(that.TIMEZONE));
    equal = equal && (this.CAFE_DRIVETHRU_FLAG == null ? that.CAFE_DRIVETHRU_FLAG == null : this.CAFE_DRIVETHRU_FLAG.equals(that.CAFE_DRIVETHRU_FLAG));
    equal = equal && (this.POS_SYSTEM_UPGRADE_DATE == null ? that.POS_SYSTEM_UPGRADE_DATE == null : this.POS_SYSTEM_UPGRADE_DATE.equals(that.POS_SYSTEM_UPGRADE_DATE));
    equal = equal && (this.TMX_CUTOVER_DATE == null ? that.TMX_CUTOVER_DATE == null : this.TMX_CUTOVER_DATE.equals(that.TMX_CUTOVER_DATE));
    equal = equal && (this.POSTAL_CODE == null ? that.POSTAL_CODE == null : this.POSTAL_CODE.equals(that.POSTAL_CODE));
    equal = equal && (this.TMX_INTEGRATION_DATE == null ? that.TMX_INTEGRATION_DATE == null : this.TMX_INTEGRATION_DATE.equals(that.TMX_INTEGRATION_DATE));
    equal = equal && (this.TMX_FORECAST_DATE == null ? that.TMX_FORECAST_DATE == null : this.TMX_FORECAST_DATE.equals(that.TMX_FORECAST_DATE));
    equal = equal && (this.CORPORATE_FLAG == null ? that.CORPORATE_FLAG == null : this.CORPORATE_FLAG.equals(that.CORPORATE_FLAG));
    equal = equal && (this.RECIPE_TYPE == null ? that.RECIPE_TYPE == null : this.RECIPE_TYPE.equals(that.RECIPE_TYPE));
    equal = equal && (this.OPEN_SUN_FLAG == null ? that.OPEN_SUN_FLAG == null : this.OPEN_SUN_FLAG.equals(that.OPEN_SUN_FLAG));
    equal = equal && (this.OPEN_MON_FLAG == null ? that.OPEN_MON_FLAG == null : this.OPEN_MON_FLAG.equals(that.OPEN_MON_FLAG));
    equal = equal && (this.OPEN_TUE_FLAG == null ? that.OPEN_TUE_FLAG == null : this.OPEN_TUE_FLAG.equals(that.OPEN_TUE_FLAG));
    equal = equal && (this.OPEN_WED_FLAG == null ? that.OPEN_WED_FLAG == null : this.OPEN_WED_FLAG.equals(that.OPEN_WED_FLAG));
    equal = equal && (this.OPEN_THUR_FLAG == null ? that.OPEN_THUR_FLAG == null : this.OPEN_THUR_FLAG.equals(that.OPEN_THUR_FLAG));
    equal = equal && (this.OPEN_FRI_FLAG == null ? that.OPEN_FRI_FLAG == null : this.OPEN_FRI_FLAG.equals(that.OPEN_FRI_FLAG));
    equal = equal && (this.OPEN_SAT_FLAG == null ? that.OPEN_SAT_FLAG == null : this.OPEN_SAT_FLAG.equals(that.OPEN_SAT_FLAG));
    equal = equal && (this.ACQUISITION_DATE == null ? that.ACQUISITION_DATE == null : this.ACQUISITION_DATE.equals(that.ACQUISITION_DATE));
    equal = equal && (this.COMP_OPENED_DATE == null ? that.COMP_OPENED_DATE == null : this.COMP_OPENED_DATE.equals(that.COMP_OPENED_DATE));
    equal = equal && (this.CLOSED_YEAR == null ? that.CLOSED_YEAR == null : this.CLOSED_YEAR.equals(that.CLOSED_YEAR));
    equal = equal && (this.CAFE_SVS_NBR == null ? that.CAFE_SVS_NBR == null : this.CAFE_SVS_NBR.equals(that.CAFE_SVS_NBR));
    equal = equal && (this.CITY == null ? that.CITY == null : this.CITY.equals(that.CITY));
    equal = equal && (this.STATE_CODE == null ? that.STATE_CODE == null : this.STATE_CODE.equals(that.STATE_CODE));
    equal = equal && (this.ADDRESS == null ? that.ADDRESS == null : this.ADDRESS.equals(that.ADDRESS));
    equal = equal && (this.PRICE_TIER_CODE == null ? that.PRICE_TIER_CODE == null : this.PRICE_TIER_CODE.equals(that.PRICE_TIER_CODE));
    equal = equal && (this.TAX_STATE_CODE == null ? that.TAX_STATE_CODE == null : this.TAX_STATE_CODE.equals(that.TAX_STATE_CODE));
    equal = equal && (this.PHONE_NBR == null ? that.PHONE_NBR == null : this.PHONE_NBR.equals(that.PHONE_NBR));
    equal = equal && (this.FAX_NUMBER == null ? that.FAX_NUMBER == null : this.FAX_NUMBER.equals(that.FAX_NUMBER));
    equal = equal && (this.BROADBAND_IP == null ? that.BROADBAND_IP == null : this.BROADBAND_IP.equals(that.BROADBAND_IP));
    equal = equal && (this.ROPE_IP == null ? that.ROPE_IP == null : this.ROPE_IP.equals(that.ROPE_IP));
    equal = equal && (this.ISP_TYPE == null ? that.ISP_TYPE == null : this.ISP_TYPE.equals(that.ISP_TYPE));
    equal = equal && (this.ISP_PROVIDER == null ? that.ISP_PROVIDER == null : this.ISP_PROVIDER.equals(that.ISP_PROVIDER));
    equal = equal && (this.FRANCHISE == null ? that.FRANCHISE == null : this.FRANCHISE.equals(that.FRANCHISE));
    equal = equal && (this.DISTRICT_NAME == null ? that.DISTRICT_NAME == null : this.DISTRICT_NAME.equals(that.DISTRICT_NAME));
    equal = equal && (this.HARDWARE_SERVICE_PROVIDER == null ? that.HARDWARE_SERVICE_PROVIDER == null : this.HARDWARE_SERVICE_PROVIDER.equals(that.HARDWARE_SERVICE_PROVIDER));
    equal = equal && (this.PHONE_SERVICE_PROVIDER == null ? that.PHONE_SERVICE_PROVIDER == null : this.PHONE_SERVICE_PROVIDER.equals(that.PHONE_SERVICE_PROVIDER));
    equal = equal && (this.CAFE_STATUS == null ? that.CAFE_STATUS == null : this.CAFE_STATUS.equals(that.CAFE_STATUS));
    equal = equal && (this.CAFE_TYPE == null ? that.CAFE_TYPE == null : this.CAFE_TYPE.equals(that.CAFE_TYPE));
    equal = equal && (this.LOCATION_TYPE == null ? that.LOCATION_TYPE == null : this.LOCATION_TYPE.equals(that.LOCATION_TYPE));
    equal = equal && (this.SUPPORT_LEVEL == null ? that.SUPPORT_LEVEL == null : this.SUPPORT_LEVEL.equals(that.SUPPORT_LEVEL));
    equal = equal && (this.CAFE_EMAIL == null ? that.CAFE_EMAIL == null : this.CAFE_EMAIL.equals(that.CAFE_EMAIL));
    equal = equal && (this.DATABASE_TYPE == null ? that.DATABASE_TYPE == null : this.DATABASE_TYPE.equals(that.DATABASE_TYPE));
    equal = equal && (this.DATABASE_VERSION == null ? that.DATABASE_VERSION == null : this.DATABASE_VERSION.equals(that.DATABASE_VERSION));
    equal = equal && (this.SYSTEM_COORDINATOR == null ? that.SYSTEM_COORDINATOR == null : this.SYSTEM_COORDINATOR.equals(that.SYSTEM_COORDINATOR));
    equal = equal && (this.DISTRICT_NUMBER == null ? that.DISTRICT_NUMBER == null : this.DISTRICT_NUMBER.equals(that.DISTRICT_NUMBER));
    equal = equal && (this.REGION_NAME == null ? that.REGION_NAME == null : this.REGION_NAME.equals(that.REGION_NAME));
    equal = equal && (this.AREA_NAME == null ? that.AREA_NAME == null : this.AREA_NAME.equals(that.AREA_NAME));
    equal = equal && (this.POS_INSTALL_DATE == null ? that.POS_INSTALL_DATE == null : this.POS_INSTALL_DATE.equals(that.POS_INSTALL_DATE));
    equal = equal && (this.POS_INSTALLER_NAME == null ? that.POS_INSTALLER_NAME == null : this.POS_INSTALLER_NAME.equals(that.POS_INSTALLER_NAME));
    equal = equal && (this.CABLING_INSTALLER_NAME == null ? that.CABLING_INSTALLER_NAME == null : this.CABLING_INSTALLER_NAME.equals(that.CABLING_INSTALLER_NAME));
    equal = equal && (this.CREDIT_MERCHANT_ID == null ? that.CREDIT_MERCHANT_ID == null : this.CREDIT_MERCHANT_ID.equals(that.CREDIT_MERCHANT_ID));
    equal = equal && (this.NETWORK_LOCATION == null ? that.NETWORK_LOCATION == null : this.NETWORK_LOCATION.equals(that.NETWORK_LOCATION));
    equal = equal && (this.VOIP_FLAG == null ? that.VOIP_FLAG == null : this.VOIP_FLAG.equals(that.VOIP_FLAG));
    equal = equal && (this.ELEARN_IP == null ? that.ELEARN_IP == null : this.ELEARN_IP.equals(that.ELEARN_IP));
    equal = equal && (this.SYSTEM_ATT_VOIP == null ? that.SYSTEM_ATT_VOIP == null : this.SYSTEM_ATT_VOIP.equals(that.SYSTEM_ATT_VOIP));
    equal = equal && (this.CAFE_AMAZON_FLAG == null ? that.CAFE_AMAZON_FLAG == null : this.CAFE_AMAZON_FLAG.equals(that.CAFE_AMAZON_FLAG));
    equal = equal && (this.CUST_FACING_DISP_FLAG == null ? that.CUST_FACING_DISP_FLAG == null : this.CUST_FACING_DISP_FLAG.equals(that.CUST_FACING_DISP_FLAG));
    equal = equal && (this.TABLE_SERVICE == null ? that.TABLE_SERVICE == null : this.TABLE_SERVICE.equals(that.TABLE_SERVICE));
    equal = equal && (this.KDS_SCHEMES == null ? that.KDS_SCHEMES == null : this.KDS_SCHEMES.equals(that.KDS_SCHEMES));
    equal = equal && (this.EOU_STATUS_FLAG == null ? that.EOU_STATUS_FLAG == null : this.EOU_STATUS_FLAG.equals(that.EOU_STATUS_FLAG));
    equal = equal && (this.SYSTEM_TMX_CUTOVER == null ? that.SYSTEM_TMX_CUTOVER == null : this.SYSTEM_TMX_CUTOVER.equals(that.SYSTEM_TMX_CUTOVER));
    equal = equal && (this.AREA_DESC == null ? that.AREA_DESC == null : this.AREA_DESC.equals(that.AREA_DESC));
    equal = equal && (this.DISTRICT_MGRCELL == null ? that.DISTRICT_MGRCELL == null : this.DISTRICT_MGRCELL.equals(that.DISTRICT_MGRCELL));
    equal = equal && (this.DISTRICT_MGREMAIL == null ? that.DISTRICT_MGREMAIL == null : this.DISTRICT_MGREMAIL.equals(that.DISTRICT_MGREMAIL));
    equal = equal && (this.DISTRICT_MGRNAME == null ? that.DISTRICT_MGRNAME == null : this.DISTRICT_MGRNAME.equals(that.DISTRICT_MGRNAME));
    equal = equal && (this.ORG_NAME == null ? that.ORG_NAME == null : this.ORG_NAME.equals(that.ORG_NAME));
    equal = equal && (this.BOH_NETWORK_IP == null ? that.BOH_NETWORK_IP == null : this.BOH_NETWORK_IP.equals(that.BOH_NETWORK_IP));
    equal = equal && (this.PHONE_SUPPORT_PROVIDER == null ? that.PHONE_SUPPORT_PROVIDER == null : this.PHONE_SUPPORT_PROVIDER.equals(that.PHONE_SUPPORT_PROVIDER));
    equal = equal && (this.ADDRESS2 == null ? that.ADDRESS2 == null : this.ADDRESS2.equals(that.ADDRESS2));
    equal = equal && (this.PHONE2 == null ? that.PHONE2 == null : this.PHONE2.equals(that.PHONE2));
    equal = equal && (this.FTA_EMAILADDR == null ? that.FTA_EMAILADDR == null : this.FTA_EMAILADDR.equals(that.FTA_EMAILADDR));
    equal = equal && (this.ELEARNING_IP == null ? that.ELEARNING_IP == null : this.ELEARNING_IP.equals(that.ELEARNING_IP));
    equal = equal && (this.NETWORK_LOCATION_SIDE == null ? that.NETWORK_LOCATION_SIDE == null : this.NETWORK_LOCATION_SIDE.equals(that.NETWORK_LOCATION_SIDE));
    equal = equal && (this.COMPANY_NAME == null ? that.COMPANY_NAME == null : this.COMPANY_NAME.equals(that.COMPANY_NAME));
    equal = equal && (this.COMPANY_DESC == null ? that.COMPANY_DESC == null : this.COMPANY_DESC.equals(that.COMPANY_DESC));
    equal = equal && (this.LOY_LAUNCH_DATE == null ? that.LOY_LAUNCH_DATE == null : this.LOY_LAUNCH_DATE.equals(that.LOY_LAUNCH_DATE));
    equal = equal && (this.MAIN_LEVEL1_NAME == null ? that.MAIN_LEVEL1_NAME == null : this.MAIN_LEVEL1_NAME.equals(that.MAIN_LEVEL1_NAME));
    equal = equal && (this.MAIN_LEVEL1_DESC == null ? that.MAIN_LEVEL1_DESC == null : this.MAIN_LEVEL1_DESC.equals(that.MAIN_LEVEL1_DESC));
    equal = equal && (this.MAIN_LEVEL1_MGR_NAME == null ? that.MAIN_LEVEL1_MGR_NAME == null : this.MAIN_LEVEL1_MGR_NAME.equals(that.MAIN_LEVEL1_MGR_NAME));
    equal = equal && (this.MAIN_LEVEL2_NAME == null ? that.MAIN_LEVEL2_NAME == null : this.MAIN_LEVEL2_NAME.equals(that.MAIN_LEVEL2_NAME));
    equal = equal && (this.MAIN_LEVEL2_DESC == null ? that.MAIN_LEVEL2_DESC == null : this.MAIN_LEVEL2_DESC.equals(that.MAIN_LEVEL2_DESC));
    equal = equal && (this.MAIN_LEVEL2_MGR_NAME == null ? that.MAIN_LEVEL2_MGR_NAME == null : this.MAIN_LEVEL2_MGR_NAME.equals(that.MAIN_LEVEL2_MGR_NAME));
    equal = equal && (this.MAIN_LEVEL3_NAME == null ? that.MAIN_LEVEL3_NAME == null : this.MAIN_LEVEL3_NAME.equals(that.MAIN_LEVEL3_NAME));
    equal = equal && (this.MAIN_LEVEL3_DESC == null ? that.MAIN_LEVEL3_DESC == null : this.MAIN_LEVEL3_DESC.equals(that.MAIN_LEVEL3_DESC));
    equal = equal && (this.MAIN_LEVEL3_MGR_NAME == null ? that.MAIN_LEVEL3_MGR_NAME == null : this.MAIN_LEVEL3_MGR_NAME.equals(that.MAIN_LEVEL3_MGR_NAME));
    equal = equal && (this.MAIN_LEVEL4_NAME == null ? that.MAIN_LEVEL4_NAME == null : this.MAIN_LEVEL4_NAME.equals(that.MAIN_LEVEL4_NAME));
    equal = equal && (this.MAIN_LEVEL4_DESC == null ? that.MAIN_LEVEL4_DESC == null : this.MAIN_LEVEL4_DESC.equals(that.MAIN_LEVEL4_DESC));
    equal = equal && (this.MAIN_LEVEL4_MGR_NAME == null ? that.MAIN_LEVEL4_MGR_NAME == null : this.MAIN_LEVEL4_MGR_NAME.equals(that.MAIN_LEVEL4_MGR_NAME));
    equal = equal && (this.MAIN_LEVEL5_NAME == null ? that.MAIN_LEVEL5_NAME == null : this.MAIN_LEVEL5_NAME.equals(that.MAIN_LEVEL5_NAME));
    equal = equal && (this.MAIN_LEVEL5_DESC == null ? that.MAIN_LEVEL5_DESC == null : this.MAIN_LEVEL5_DESC.equals(that.MAIN_LEVEL5_DESC));
    equal = equal && (this.MAIN_LEVEL5_MGR_NAME == null ? that.MAIN_LEVEL5_MGR_NAME == null : this.MAIN_LEVEL5_MGR_NAME.equals(that.MAIN_LEVEL5_MGR_NAME));
    equal = equal && (this.MAIN_LEVEL6_NAME == null ? that.MAIN_LEVEL6_NAME == null : this.MAIN_LEVEL6_NAME.equals(that.MAIN_LEVEL6_NAME));
    equal = equal && (this.MAIN_LEVEL6_DESC == null ? that.MAIN_LEVEL6_DESC == null : this.MAIN_LEVEL6_DESC.equals(that.MAIN_LEVEL6_DESC));
    equal = equal && (this.MAIN_LEVEL6_MGR_NAME == null ? that.MAIN_LEVEL6_MGR_NAME == null : this.MAIN_LEVEL6_MGR_NAME.equals(that.MAIN_LEVEL6_MGR_NAME));
    equal = equal && (this.MAIN_LEVEL7_NAME == null ? that.MAIN_LEVEL7_NAME == null : this.MAIN_LEVEL7_NAME.equals(that.MAIN_LEVEL7_NAME));
    equal = equal && (this.MAIN_LEVEL7_DESC == null ? that.MAIN_LEVEL7_DESC == null : this.MAIN_LEVEL7_DESC.equals(that.MAIN_LEVEL7_DESC));
    equal = equal && (this.MAIN_LEVEL7_MGR_NAME == null ? that.MAIN_LEVEL7_MGR_NAME == null : this.MAIN_LEVEL7_MGR_NAME.equals(that.MAIN_LEVEL7_MGR_NAME));
    equal = equal && (this.MAIN_LEVEL8_NAME == null ? that.MAIN_LEVEL8_NAME == null : this.MAIN_LEVEL8_NAME.equals(that.MAIN_LEVEL8_NAME));
    equal = equal && (this.MAIN_LEVEL8_DESC == null ? that.MAIN_LEVEL8_DESC == null : this.MAIN_LEVEL8_DESC.equals(that.MAIN_LEVEL8_DESC));
    equal = equal && (this.MAIN_LEVEL8_MGR_NAME == null ? that.MAIN_LEVEL8_MGR_NAME == null : this.MAIN_LEVEL8_MGR_NAME.equals(that.MAIN_LEVEL8_MGR_NAME));
    equal = equal && (this.MAIN_LEVEL9_NAME == null ? that.MAIN_LEVEL9_NAME == null : this.MAIN_LEVEL9_NAME.equals(that.MAIN_LEVEL9_NAME));
    equal = equal && (this.MAIN_LEVEL9_DESC == null ? that.MAIN_LEVEL9_DESC == null : this.MAIN_LEVEL9_DESC.equals(that.MAIN_LEVEL9_DESC));
    equal = equal && (this.MAIN_LEVEL9_MGR_NAME == null ? that.MAIN_LEVEL9_MGR_NAME == null : this.MAIN_LEVEL9_MGR_NAME.equals(that.MAIN_LEVEL9_MGR_NAME));
    equal = equal && (this.MAIN_LEVEL10_NAME == null ? that.MAIN_LEVEL10_NAME == null : this.MAIN_LEVEL10_NAME.equals(that.MAIN_LEVEL10_NAME));
    equal = equal && (this.MAIN_LEVEL10_DESC == null ? that.MAIN_LEVEL10_DESC == null : this.MAIN_LEVEL10_DESC.equals(that.MAIN_LEVEL10_DESC));
    equal = equal && (this.MAIN_LEVEL10_MGR_NAME == null ? that.MAIN_LEVEL10_MGR_NAME == null : this.MAIN_LEVEL10_MGR_NAME.equals(that.MAIN_LEVEL10_MGR_NAME));
    equal = equal && (this.FILE_DTTM == null ? that.FILE_DTTM == null : this.FILE_DTTM.equals(that.FILE_DTTM));
    equal = equal && (this.INSERT_DTTM == null ? that.INSERT_DTTM == null : this.INSERT_DTTM.equals(that.INSERT_DTTM));
    equal = equal && (this.UPDATE_DTTM == null ? that.UPDATE_DTTM == null : this.UPDATE_DTTM.equals(that.UPDATE_DTTM));
    equal = equal && (this.LOAD_DW_ID == null ? that.LOAD_DW_ID == null : this.LOAD_DW_ID.equals(that.LOAD_DW_ID));
    equal = equal && (this.VERSION == null ? that.VERSION == null : this.VERSION.equals(that.VERSION));
    equal = equal && (this.COUNTRY_DW_ID == null ? that.COUNTRY_DW_ID == null : this.COUNTRY_DW_ID.equals(that.COUNTRY_DW_ID));
    equal = equal && (this.COMPANY_ID == null ? that.COMPANY_ID == null : this.COMPANY_ID.equals(that.COMPANY_ID));
    equal = equal && (this.COMPANY_DW_ID == null ? that.COMPANY_DW_ID == null : this.COMPANY_DW_ID.equals(that.COMPANY_DW_ID));
    equal = equal && (this.CAFE_MANAGER == null ? that.CAFE_MANAGER == null : this.CAFE_MANAGER.equals(that.CAFE_MANAGER));
    equal = equal && (this.CATERING_COORDINATORS == null ? that.CATERING_COORDINATORS == null : this.CATERING_COORDINATORS.equals(that.CATERING_COORDINATORS));
    equal = equal && (this.MARKET_NAME == null ? that.MARKET_NAME == null : this.MARKET_NAME.equals(that.MARKET_NAME));
    equal = equal && (this.YEAR_BASE_CAFE == null ? that.YEAR_BASE_CAFE == null : this.YEAR_BASE_CAFE.equals(that.YEAR_BASE_CAFE));
    equal = equal && (this.MARKETING_LOCATION_DW_ID == null ? that.MARKETING_LOCATION_DW_ID == null : this.MARKETING_LOCATION_DW_ID.equals(that.MARKETING_LOCATION_DW_ID));
    equal = equal && (this.DMA_NAME == null ? that.DMA_NAME == null : this.DMA_NAME.equals(that.DMA_NAME));
    equal = equal && (this.LABOR_INVESTMENT_AMT == null ? that.LABOR_INVESTMENT_AMT == null : this.LABOR_INVESTMENT_AMT.equals(that.LABOR_INVESTMENT_AMT));
    equal = equal && (this.CATERING_RCSM == null ? that.CATERING_RCSM == null : this.CATERING_RCSM.equals(that.CATERING_RCSM));
    equal = equal && (this.CATERING_SR_RCSM == null ? that.CATERING_SR_RCSM == null : this.CATERING_SR_RCSM.equals(that.CATERING_SR_RCSM));
    equal = equal && (this.PANERA_2_0_STATUS == null ? that.PANERA_2_0_STATUS == null : this.PANERA_2_0_STATUS.equals(that.PANERA_2_0_STATUS));
    equal = equal && (this.RPU_STATUS == null ? that.RPU_STATUS == null : this.RPU_STATUS.equals(that.RPU_STATUS));
    equal = equal && (this.HUB_CLUSTER_NAME == null ? that.HUB_CLUSTER_NAME == null : this.HUB_CLUSTER_NAME.equals(that.HUB_CLUSTER_NAME));
    equal = equal && (this.HUB_CLUSTER_CLASS == null ? that.HUB_CLUSTER_CLASS == null : this.HUB_CLUSTER_CLASS.equals(that.HUB_CLUSTER_CLASS));
    equal = equal && (this.ECOMMERCE_CAFE_TYPE_CATERING == null ? that.ECOMMERCE_CAFE_TYPE_CATERING == null : this.ECOMMERCE_CAFE_TYPE_CATERING.equals(that.ECOMMERCE_CAFE_TYPE_CATERING));
    equal = equal && (this.ECOMMERCE_CAFE_TYPE == null ? that.ECOMMERCE_CAFE_TYPE == null : this.ECOMMERCE_CAFE_TYPE.equals(that.ECOMMERCE_CAFE_TYPE));
    equal = equal && (this.CATERING_ONLINE_DESIGNATION == null ? that.CATERING_ONLINE_DESIGNATION == null : this.CATERING_ONLINE_DESIGNATION.equals(that.CATERING_ONLINE_DESIGNATION));
    equal = equal && (this.ECOMMERCE_CATERING_HUB_PARENT == null ? that.ECOMMERCE_CATERING_HUB_PARENT == null : this.ECOMMERCE_CATERING_HUB_PARENT.equals(that.ECOMMERCE_CATERING_HUB_PARENT));
    equal = equal && (this.CATERING_ONLINE_STATUS == null ? that.CATERING_ONLINE_STATUS == null : this.CATERING_ONLINE_STATUS.equals(that.CATERING_ONLINE_STATUS));
    equal = equal && (this.ECOMMERCE_KIOSKS_FLAG == null ? that.ECOMMERCE_KIOSKS_FLAG == null : this.ECOMMERCE_KIOSKS_FLAG.equals(that.ECOMMERCE_KIOSKS_FLAG));
    equal = equal && (this.ECOMMERCE_RETAIL_DELIVERY_FLAG == null ? that.ECOMMERCE_RETAIL_DELIVERY_FLAG == null : this.ECOMMERCE_RETAIL_DELIVERY_FLAG.equals(that.ECOMMERCE_RETAIL_DELIVERY_FLAG));
    equal = equal && (this.ECOMMERCE_RETAIL_DINE_IN_FLAG == null ? that.ECOMMERCE_RETAIL_DINE_IN_FLAG == null : this.ECOMMERCE_RETAIL_DINE_IN_FLAG.equals(that.ECOMMERCE_RETAIL_DINE_IN_FLAG));
    equal = equal && (this.ECOMMERCE_RETAIL_PICKUP_FLAG == null ? that.ECOMMERCE_RETAIL_PICKUP_FLAG == null : this.ECOMMERCE_RETAIL_PICKUP_FLAG.equals(that.ECOMMERCE_RETAIL_PICKUP_FLAG));
    equal = equal && (this.ECOMMERCE_LAUNCH_CATERING_2_0 == null ? that.ECOMMERCE_LAUNCH_CATERING_2_0 == null : this.ECOMMERCE_LAUNCH_CATERING_2_0.equals(that.ECOMMERCE_LAUNCH_CATERING_2_0));
    equal = equal && (this.ECOMMERCE_LAUNCH_RPU == null ? that.ECOMMERCE_LAUNCH_RPU == null : this.ECOMMERCE_LAUNCH_RPU.equals(that.ECOMMERCE_LAUNCH_RPU));
    equal = equal && (this.ECOMMERCE_LAUNCH_PANERA_2_0 == null ? that.ECOMMERCE_LAUNCH_PANERA_2_0 == null : this.ECOMMERCE_LAUNCH_PANERA_2_0.equals(that.ECOMMERCE_LAUNCH_PANERA_2_0));
    equal = equal && (this.ECOMMERCE_LAUNCH_DELIVERY == null ? that.ECOMMERCE_LAUNCH_DELIVERY == null : this.ECOMMERCE_LAUNCH_DELIVERY.equals(that.ECOMMERCE_LAUNCH_DELIVERY));
    equal = equal && (this.ECOMMERCE_LAUNCH_DINE_IN == null ? that.ECOMMERCE_LAUNCH_DINE_IN == null : this.ECOMMERCE_LAUNCH_DINE_IN.equals(that.ECOMMERCE_LAUNCH_DINE_IN));
    equal = equal && (this.ECOMMERCE_LAUNCH_KIOSKS == null ? that.ECOMMERCE_LAUNCH_KIOSKS == null : this.ECOMMERCE_LAUNCH_KIOSKS.equals(that.ECOMMERCE_LAUNCH_KIOSKS));
    equal = equal && (this.LAUNCH_2_0_PERIOD_NBR_IN_EPOCH == null ? that.LAUNCH_2_0_PERIOD_NBR_IN_EPOCH == null : this.LAUNCH_2_0_PERIOD_NBR_IN_EPOCH.equals(that.LAUNCH_2_0_PERIOD_NBR_IN_EPOCH));
    equal = equal && (this.LAUNCH_2_0_WEEK_NBR_IN_EPOCH == null ? that.LAUNCH_2_0_WEEK_NBR_IN_EPOCH == null : this.LAUNCH_2_0_WEEK_NBR_IN_EPOCH.equals(that.LAUNCH_2_0_WEEK_NBR_IN_EPOCH));
    equal = equal && (this.LAUNCH_DEL_PERIOD_NBR_IN_EPOCH == null ? that.LAUNCH_DEL_PERIOD_NBR_IN_EPOCH == null : this.LAUNCH_DEL_PERIOD_NBR_IN_EPOCH.equals(that.LAUNCH_DEL_PERIOD_NBR_IN_EPOCH));
    equal = equal && (this.LAUNCH_DEL_WEEK_NBR_IN_EPOCH == null ? that.LAUNCH_DEL_WEEK_NBR_IN_EPOCH == null : this.LAUNCH_DEL_WEEK_NBR_IN_EPOCH.equals(that.LAUNCH_DEL_WEEK_NBR_IN_EPOCH));
    equal = equal && (this.CAFE_GROUP_DW_ID == null ? that.CAFE_GROUP_DW_ID == null : this.CAFE_GROUP_DW_ID.equals(that.CAFE_GROUP_DW_ID));
    equal = equal && (this.DISTRIBUTION_CTR_DW_ID == null ? that.DISTRIBUTION_CTR_DW_ID == null : this.DISTRIBUTION_CTR_DW_ID.equals(that.DISTRIBUTION_CTR_DW_ID));
    equal = equal && (this.DISTRICT_DESC == null ? that.DISTRICT_DESC == null : this.DISTRICT_DESC.equals(that.DISTRICT_DESC));
    equal = equal && (this.PRIMARY_MENU_GROUP == null ? that.PRIMARY_MENU_GROUP == null : this.PRIMARY_MENU_GROUP.equals(that.PRIMARY_MENU_GROUP));
    equal = equal && (this.PRICING_TIER_GROUP == null ? that.PRICING_TIER_GROUP == null : this.PRICING_TIER_GROUP.equals(that.PRICING_TIER_GROUP));
    equal = equal && (this.ECOMMERCE_LAUNCH_OPS_INTEGRITY == null ? that.ECOMMERCE_LAUNCH_OPS_INTEGRITY == null : this.ECOMMERCE_LAUNCH_OPS_INTEGRITY.equals(that.ECOMMERCE_LAUNCH_OPS_INTEGRITY));
    equal = equal && (this.CERTIFIED_TRAINING_CAFE == null ? that.CERTIFIED_TRAINING_CAFE == null : this.CERTIFIED_TRAINING_CAFE.equals(that.CERTIFIED_TRAINING_CAFE));
    equal = equal && (this.COMMISSARY_DW_ID == null ? that.COMMISSARY_DW_ID == null : this.COMMISSARY_DW_ID.equals(that.COMMISSARY_DW_ID));
    equal = equal && (this.COMMISSARY_NBR == null ? that.COMMISSARY_NBR == null : this.COMMISSARY_NBR.equals(that.COMMISSARY_NBR));
    equal = equal && (this.COMMISSARY_NAME == null ? that.COMMISSARY_NAME == null : this.COMMISSARY_NAME.equals(that.COMMISSARY_NAME));
    equal = equal && (this.OPENED_DT_PERIOD_NBR_IN_EPOCH == null ? that.OPENED_DT_PERIOD_NBR_IN_EPOCH == null : this.OPENED_DT_PERIOD_NBR_IN_EPOCH.equals(that.OPENED_DT_PERIOD_NBR_IN_EPOCH));
    equal = equal && (this.OPENED_DT_WEEK_NBR_IN_EPOCH == null ? that.OPENED_DT_WEEK_NBR_IN_EPOCH == null : this.OPENED_DT_WEEK_NBR_IN_EPOCH.equals(that.OPENED_DT_WEEK_NBR_IN_EPOCH));
    equal = equal && (this.GL_STORE_NBR == null ? that.GL_STORE_NBR == null : this.GL_STORE_NBR.equals(that.GL_STORE_NBR));
    equal = equal && (this.PAYROLL_PROCESSOR_BRANCH == null ? that.PAYROLL_PROCESSOR_BRANCH == null : this.PAYROLL_PROCESSOR_BRANCH.equals(that.PAYROLL_PROCESSOR_BRANCH));
    equal = equal && (this.PAYROLL_PROCESSOR_DIVISION == null ? that.PAYROLL_PROCESSOR_DIVISION == null : this.PAYROLL_PROCESSOR_DIVISION.equals(that.PAYROLL_PROCESSOR_DIVISION));
    equal = equal && (this.LOAD_DTTM == null ? that.LOAD_DTTM == null : this.LOAD_DTTM.equals(that.LOAD_DTTM));
    equal = equal && (this.LOAD_BY == null ? that.LOAD_BY == null : this.LOAD_BY.equals(that.LOAD_BY));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_cafe)) {
      return false;
    }
    dim_cafe that = (dim_cafe) o;
    boolean equal = true;
    equal = equal && (this.Z_CAFE_DW_ID == null ? that.Z_CAFE_DW_ID == null : this.Z_CAFE_DW_ID.equals(that.Z_CAFE_DW_ID));
    equal = equal && (this.CAFE_NBR == null ? that.CAFE_NBR == null : this.CAFE_NBR.equals(that.CAFE_NBR));
    equal = equal && (this.CAFE_NAME == null ? that.CAFE_NAME == null : this.CAFE_NAME.equals(that.CAFE_NAME));
    equal = equal && (this.OPENED_DATE == null ? that.OPENED_DATE == null : this.OPENED_DATE.equals(that.OPENED_DATE));
    equal = equal && (this.CLOSED_DATE == null ? that.CLOSED_DATE == null : this.CLOSED_DATE.equals(that.CLOSED_DATE));
    equal = equal && (this.LOC_CURRENCY_DW_ID == null ? that.LOC_CURRENCY_DW_ID == null : this.LOC_CURRENCY_DW_ID.equals(that.LOC_CURRENCY_DW_ID));
    equal = equal && (this.POS_SYSTEM_TYPE == null ? that.POS_SYSTEM_TYPE == null : this.POS_SYSTEM_TYPE.equals(that.POS_SYSTEM_TYPE));
    equal = equal && (this.POS_POLLING_FLAG == null ? that.POS_POLLING_FLAG == null : this.POS_POLLING_FLAG.equals(that.POS_POLLING_FLAG));
    equal = equal && (this.TIMEZONE == null ? that.TIMEZONE == null : this.TIMEZONE.equals(that.TIMEZONE));
    equal = equal && (this.CAFE_DRIVETHRU_FLAG == null ? that.CAFE_DRIVETHRU_FLAG == null : this.CAFE_DRIVETHRU_FLAG.equals(that.CAFE_DRIVETHRU_FLAG));
    equal = equal && (this.POS_SYSTEM_UPGRADE_DATE == null ? that.POS_SYSTEM_UPGRADE_DATE == null : this.POS_SYSTEM_UPGRADE_DATE.equals(that.POS_SYSTEM_UPGRADE_DATE));
    equal = equal && (this.TMX_CUTOVER_DATE == null ? that.TMX_CUTOVER_DATE == null : this.TMX_CUTOVER_DATE.equals(that.TMX_CUTOVER_DATE));
    equal = equal && (this.POSTAL_CODE == null ? that.POSTAL_CODE == null : this.POSTAL_CODE.equals(that.POSTAL_CODE));
    equal = equal && (this.TMX_INTEGRATION_DATE == null ? that.TMX_INTEGRATION_DATE == null : this.TMX_INTEGRATION_DATE.equals(that.TMX_INTEGRATION_DATE));
    equal = equal && (this.TMX_FORECAST_DATE == null ? that.TMX_FORECAST_DATE == null : this.TMX_FORECAST_DATE.equals(that.TMX_FORECAST_DATE));
    equal = equal && (this.CORPORATE_FLAG == null ? that.CORPORATE_FLAG == null : this.CORPORATE_FLAG.equals(that.CORPORATE_FLAG));
    equal = equal && (this.RECIPE_TYPE == null ? that.RECIPE_TYPE == null : this.RECIPE_TYPE.equals(that.RECIPE_TYPE));
    equal = equal && (this.OPEN_SUN_FLAG == null ? that.OPEN_SUN_FLAG == null : this.OPEN_SUN_FLAG.equals(that.OPEN_SUN_FLAG));
    equal = equal && (this.OPEN_MON_FLAG == null ? that.OPEN_MON_FLAG == null : this.OPEN_MON_FLAG.equals(that.OPEN_MON_FLAG));
    equal = equal && (this.OPEN_TUE_FLAG == null ? that.OPEN_TUE_FLAG == null : this.OPEN_TUE_FLAG.equals(that.OPEN_TUE_FLAG));
    equal = equal && (this.OPEN_WED_FLAG == null ? that.OPEN_WED_FLAG == null : this.OPEN_WED_FLAG.equals(that.OPEN_WED_FLAG));
    equal = equal && (this.OPEN_THUR_FLAG == null ? that.OPEN_THUR_FLAG == null : this.OPEN_THUR_FLAG.equals(that.OPEN_THUR_FLAG));
    equal = equal && (this.OPEN_FRI_FLAG == null ? that.OPEN_FRI_FLAG == null : this.OPEN_FRI_FLAG.equals(that.OPEN_FRI_FLAG));
    equal = equal && (this.OPEN_SAT_FLAG == null ? that.OPEN_SAT_FLAG == null : this.OPEN_SAT_FLAG.equals(that.OPEN_SAT_FLAG));
    equal = equal && (this.ACQUISITION_DATE == null ? that.ACQUISITION_DATE == null : this.ACQUISITION_DATE.equals(that.ACQUISITION_DATE));
    equal = equal && (this.COMP_OPENED_DATE == null ? that.COMP_OPENED_DATE == null : this.COMP_OPENED_DATE.equals(that.COMP_OPENED_DATE));
    equal = equal && (this.CLOSED_YEAR == null ? that.CLOSED_YEAR == null : this.CLOSED_YEAR.equals(that.CLOSED_YEAR));
    equal = equal && (this.CAFE_SVS_NBR == null ? that.CAFE_SVS_NBR == null : this.CAFE_SVS_NBR.equals(that.CAFE_SVS_NBR));
    equal = equal && (this.CITY == null ? that.CITY == null : this.CITY.equals(that.CITY));
    equal = equal && (this.STATE_CODE == null ? that.STATE_CODE == null : this.STATE_CODE.equals(that.STATE_CODE));
    equal = equal && (this.ADDRESS == null ? that.ADDRESS == null : this.ADDRESS.equals(that.ADDRESS));
    equal = equal && (this.PRICE_TIER_CODE == null ? that.PRICE_TIER_CODE == null : this.PRICE_TIER_CODE.equals(that.PRICE_TIER_CODE));
    equal = equal && (this.TAX_STATE_CODE == null ? that.TAX_STATE_CODE == null : this.TAX_STATE_CODE.equals(that.TAX_STATE_CODE));
    equal = equal && (this.PHONE_NBR == null ? that.PHONE_NBR == null : this.PHONE_NBR.equals(that.PHONE_NBR));
    equal = equal && (this.FAX_NUMBER == null ? that.FAX_NUMBER == null : this.FAX_NUMBER.equals(that.FAX_NUMBER));
    equal = equal && (this.BROADBAND_IP == null ? that.BROADBAND_IP == null : this.BROADBAND_IP.equals(that.BROADBAND_IP));
    equal = equal && (this.ROPE_IP == null ? that.ROPE_IP == null : this.ROPE_IP.equals(that.ROPE_IP));
    equal = equal && (this.ISP_TYPE == null ? that.ISP_TYPE == null : this.ISP_TYPE.equals(that.ISP_TYPE));
    equal = equal && (this.ISP_PROVIDER == null ? that.ISP_PROVIDER == null : this.ISP_PROVIDER.equals(that.ISP_PROVIDER));
    equal = equal && (this.FRANCHISE == null ? that.FRANCHISE == null : this.FRANCHISE.equals(that.FRANCHISE));
    equal = equal && (this.DISTRICT_NAME == null ? that.DISTRICT_NAME == null : this.DISTRICT_NAME.equals(that.DISTRICT_NAME));
    equal = equal && (this.HARDWARE_SERVICE_PROVIDER == null ? that.HARDWARE_SERVICE_PROVIDER == null : this.HARDWARE_SERVICE_PROVIDER.equals(that.HARDWARE_SERVICE_PROVIDER));
    equal = equal && (this.PHONE_SERVICE_PROVIDER == null ? that.PHONE_SERVICE_PROVIDER == null : this.PHONE_SERVICE_PROVIDER.equals(that.PHONE_SERVICE_PROVIDER));
    equal = equal && (this.CAFE_STATUS == null ? that.CAFE_STATUS == null : this.CAFE_STATUS.equals(that.CAFE_STATUS));
    equal = equal && (this.CAFE_TYPE == null ? that.CAFE_TYPE == null : this.CAFE_TYPE.equals(that.CAFE_TYPE));
    equal = equal && (this.LOCATION_TYPE == null ? that.LOCATION_TYPE == null : this.LOCATION_TYPE.equals(that.LOCATION_TYPE));
    equal = equal && (this.SUPPORT_LEVEL == null ? that.SUPPORT_LEVEL == null : this.SUPPORT_LEVEL.equals(that.SUPPORT_LEVEL));
    equal = equal && (this.CAFE_EMAIL == null ? that.CAFE_EMAIL == null : this.CAFE_EMAIL.equals(that.CAFE_EMAIL));
    equal = equal && (this.DATABASE_TYPE == null ? that.DATABASE_TYPE == null : this.DATABASE_TYPE.equals(that.DATABASE_TYPE));
    equal = equal && (this.DATABASE_VERSION == null ? that.DATABASE_VERSION == null : this.DATABASE_VERSION.equals(that.DATABASE_VERSION));
    equal = equal && (this.SYSTEM_COORDINATOR == null ? that.SYSTEM_COORDINATOR == null : this.SYSTEM_COORDINATOR.equals(that.SYSTEM_COORDINATOR));
    equal = equal && (this.DISTRICT_NUMBER == null ? that.DISTRICT_NUMBER == null : this.DISTRICT_NUMBER.equals(that.DISTRICT_NUMBER));
    equal = equal && (this.REGION_NAME == null ? that.REGION_NAME == null : this.REGION_NAME.equals(that.REGION_NAME));
    equal = equal && (this.AREA_NAME == null ? that.AREA_NAME == null : this.AREA_NAME.equals(that.AREA_NAME));
    equal = equal && (this.POS_INSTALL_DATE == null ? that.POS_INSTALL_DATE == null : this.POS_INSTALL_DATE.equals(that.POS_INSTALL_DATE));
    equal = equal && (this.POS_INSTALLER_NAME == null ? that.POS_INSTALLER_NAME == null : this.POS_INSTALLER_NAME.equals(that.POS_INSTALLER_NAME));
    equal = equal && (this.CABLING_INSTALLER_NAME == null ? that.CABLING_INSTALLER_NAME == null : this.CABLING_INSTALLER_NAME.equals(that.CABLING_INSTALLER_NAME));
    equal = equal && (this.CREDIT_MERCHANT_ID == null ? that.CREDIT_MERCHANT_ID == null : this.CREDIT_MERCHANT_ID.equals(that.CREDIT_MERCHANT_ID));
    equal = equal && (this.NETWORK_LOCATION == null ? that.NETWORK_LOCATION == null : this.NETWORK_LOCATION.equals(that.NETWORK_LOCATION));
    equal = equal && (this.VOIP_FLAG == null ? that.VOIP_FLAG == null : this.VOIP_FLAG.equals(that.VOIP_FLAG));
    equal = equal && (this.ELEARN_IP == null ? that.ELEARN_IP == null : this.ELEARN_IP.equals(that.ELEARN_IP));
    equal = equal && (this.SYSTEM_ATT_VOIP == null ? that.SYSTEM_ATT_VOIP == null : this.SYSTEM_ATT_VOIP.equals(that.SYSTEM_ATT_VOIP));
    equal = equal && (this.CAFE_AMAZON_FLAG == null ? that.CAFE_AMAZON_FLAG == null : this.CAFE_AMAZON_FLAG.equals(that.CAFE_AMAZON_FLAG));
    equal = equal && (this.CUST_FACING_DISP_FLAG == null ? that.CUST_FACING_DISP_FLAG == null : this.CUST_FACING_DISP_FLAG.equals(that.CUST_FACING_DISP_FLAG));
    equal = equal && (this.TABLE_SERVICE == null ? that.TABLE_SERVICE == null : this.TABLE_SERVICE.equals(that.TABLE_SERVICE));
    equal = equal && (this.KDS_SCHEMES == null ? that.KDS_SCHEMES == null : this.KDS_SCHEMES.equals(that.KDS_SCHEMES));
    equal = equal && (this.EOU_STATUS_FLAG == null ? that.EOU_STATUS_FLAG == null : this.EOU_STATUS_FLAG.equals(that.EOU_STATUS_FLAG));
    equal = equal && (this.SYSTEM_TMX_CUTOVER == null ? that.SYSTEM_TMX_CUTOVER == null : this.SYSTEM_TMX_CUTOVER.equals(that.SYSTEM_TMX_CUTOVER));
    equal = equal && (this.AREA_DESC == null ? that.AREA_DESC == null : this.AREA_DESC.equals(that.AREA_DESC));
    equal = equal && (this.DISTRICT_MGRCELL == null ? that.DISTRICT_MGRCELL == null : this.DISTRICT_MGRCELL.equals(that.DISTRICT_MGRCELL));
    equal = equal && (this.DISTRICT_MGREMAIL == null ? that.DISTRICT_MGREMAIL == null : this.DISTRICT_MGREMAIL.equals(that.DISTRICT_MGREMAIL));
    equal = equal && (this.DISTRICT_MGRNAME == null ? that.DISTRICT_MGRNAME == null : this.DISTRICT_MGRNAME.equals(that.DISTRICT_MGRNAME));
    equal = equal && (this.ORG_NAME == null ? that.ORG_NAME == null : this.ORG_NAME.equals(that.ORG_NAME));
    equal = equal && (this.BOH_NETWORK_IP == null ? that.BOH_NETWORK_IP == null : this.BOH_NETWORK_IP.equals(that.BOH_NETWORK_IP));
    equal = equal && (this.PHONE_SUPPORT_PROVIDER == null ? that.PHONE_SUPPORT_PROVIDER == null : this.PHONE_SUPPORT_PROVIDER.equals(that.PHONE_SUPPORT_PROVIDER));
    equal = equal && (this.ADDRESS2 == null ? that.ADDRESS2 == null : this.ADDRESS2.equals(that.ADDRESS2));
    equal = equal && (this.PHONE2 == null ? that.PHONE2 == null : this.PHONE2.equals(that.PHONE2));
    equal = equal && (this.FTA_EMAILADDR == null ? that.FTA_EMAILADDR == null : this.FTA_EMAILADDR.equals(that.FTA_EMAILADDR));
    equal = equal && (this.ELEARNING_IP == null ? that.ELEARNING_IP == null : this.ELEARNING_IP.equals(that.ELEARNING_IP));
    equal = equal && (this.NETWORK_LOCATION_SIDE == null ? that.NETWORK_LOCATION_SIDE == null : this.NETWORK_LOCATION_SIDE.equals(that.NETWORK_LOCATION_SIDE));
    equal = equal && (this.COMPANY_NAME == null ? that.COMPANY_NAME == null : this.COMPANY_NAME.equals(that.COMPANY_NAME));
    equal = equal && (this.COMPANY_DESC == null ? that.COMPANY_DESC == null : this.COMPANY_DESC.equals(that.COMPANY_DESC));
    equal = equal && (this.LOY_LAUNCH_DATE == null ? that.LOY_LAUNCH_DATE == null : this.LOY_LAUNCH_DATE.equals(that.LOY_LAUNCH_DATE));
    equal = equal && (this.MAIN_LEVEL1_NAME == null ? that.MAIN_LEVEL1_NAME == null : this.MAIN_LEVEL1_NAME.equals(that.MAIN_LEVEL1_NAME));
    equal = equal && (this.MAIN_LEVEL1_DESC == null ? that.MAIN_LEVEL1_DESC == null : this.MAIN_LEVEL1_DESC.equals(that.MAIN_LEVEL1_DESC));
    equal = equal && (this.MAIN_LEVEL1_MGR_NAME == null ? that.MAIN_LEVEL1_MGR_NAME == null : this.MAIN_LEVEL1_MGR_NAME.equals(that.MAIN_LEVEL1_MGR_NAME));
    equal = equal && (this.MAIN_LEVEL2_NAME == null ? that.MAIN_LEVEL2_NAME == null : this.MAIN_LEVEL2_NAME.equals(that.MAIN_LEVEL2_NAME));
    equal = equal && (this.MAIN_LEVEL2_DESC == null ? that.MAIN_LEVEL2_DESC == null : this.MAIN_LEVEL2_DESC.equals(that.MAIN_LEVEL2_DESC));
    equal = equal && (this.MAIN_LEVEL2_MGR_NAME == null ? that.MAIN_LEVEL2_MGR_NAME == null : this.MAIN_LEVEL2_MGR_NAME.equals(that.MAIN_LEVEL2_MGR_NAME));
    equal = equal && (this.MAIN_LEVEL3_NAME == null ? that.MAIN_LEVEL3_NAME == null : this.MAIN_LEVEL3_NAME.equals(that.MAIN_LEVEL3_NAME));
    equal = equal && (this.MAIN_LEVEL3_DESC == null ? that.MAIN_LEVEL3_DESC == null : this.MAIN_LEVEL3_DESC.equals(that.MAIN_LEVEL3_DESC));
    equal = equal && (this.MAIN_LEVEL3_MGR_NAME == null ? that.MAIN_LEVEL3_MGR_NAME == null : this.MAIN_LEVEL3_MGR_NAME.equals(that.MAIN_LEVEL3_MGR_NAME));
    equal = equal && (this.MAIN_LEVEL4_NAME == null ? that.MAIN_LEVEL4_NAME == null : this.MAIN_LEVEL4_NAME.equals(that.MAIN_LEVEL4_NAME));
    equal = equal && (this.MAIN_LEVEL4_DESC == null ? that.MAIN_LEVEL4_DESC == null : this.MAIN_LEVEL4_DESC.equals(that.MAIN_LEVEL4_DESC));
    equal = equal && (this.MAIN_LEVEL4_MGR_NAME == null ? that.MAIN_LEVEL4_MGR_NAME == null : this.MAIN_LEVEL4_MGR_NAME.equals(that.MAIN_LEVEL4_MGR_NAME));
    equal = equal && (this.MAIN_LEVEL5_NAME == null ? that.MAIN_LEVEL5_NAME == null : this.MAIN_LEVEL5_NAME.equals(that.MAIN_LEVEL5_NAME));
    equal = equal && (this.MAIN_LEVEL5_DESC == null ? that.MAIN_LEVEL5_DESC == null : this.MAIN_LEVEL5_DESC.equals(that.MAIN_LEVEL5_DESC));
    equal = equal && (this.MAIN_LEVEL5_MGR_NAME == null ? that.MAIN_LEVEL5_MGR_NAME == null : this.MAIN_LEVEL5_MGR_NAME.equals(that.MAIN_LEVEL5_MGR_NAME));
    equal = equal && (this.MAIN_LEVEL6_NAME == null ? that.MAIN_LEVEL6_NAME == null : this.MAIN_LEVEL6_NAME.equals(that.MAIN_LEVEL6_NAME));
    equal = equal && (this.MAIN_LEVEL6_DESC == null ? that.MAIN_LEVEL6_DESC == null : this.MAIN_LEVEL6_DESC.equals(that.MAIN_LEVEL6_DESC));
    equal = equal && (this.MAIN_LEVEL6_MGR_NAME == null ? that.MAIN_LEVEL6_MGR_NAME == null : this.MAIN_LEVEL6_MGR_NAME.equals(that.MAIN_LEVEL6_MGR_NAME));
    equal = equal && (this.MAIN_LEVEL7_NAME == null ? that.MAIN_LEVEL7_NAME == null : this.MAIN_LEVEL7_NAME.equals(that.MAIN_LEVEL7_NAME));
    equal = equal && (this.MAIN_LEVEL7_DESC == null ? that.MAIN_LEVEL7_DESC == null : this.MAIN_LEVEL7_DESC.equals(that.MAIN_LEVEL7_DESC));
    equal = equal && (this.MAIN_LEVEL7_MGR_NAME == null ? that.MAIN_LEVEL7_MGR_NAME == null : this.MAIN_LEVEL7_MGR_NAME.equals(that.MAIN_LEVEL7_MGR_NAME));
    equal = equal && (this.MAIN_LEVEL8_NAME == null ? that.MAIN_LEVEL8_NAME == null : this.MAIN_LEVEL8_NAME.equals(that.MAIN_LEVEL8_NAME));
    equal = equal && (this.MAIN_LEVEL8_DESC == null ? that.MAIN_LEVEL8_DESC == null : this.MAIN_LEVEL8_DESC.equals(that.MAIN_LEVEL8_DESC));
    equal = equal && (this.MAIN_LEVEL8_MGR_NAME == null ? that.MAIN_LEVEL8_MGR_NAME == null : this.MAIN_LEVEL8_MGR_NAME.equals(that.MAIN_LEVEL8_MGR_NAME));
    equal = equal && (this.MAIN_LEVEL9_NAME == null ? that.MAIN_LEVEL9_NAME == null : this.MAIN_LEVEL9_NAME.equals(that.MAIN_LEVEL9_NAME));
    equal = equal && (this.MAIN_LEVEL9_DESC == null ? that.MAIN_LEVEL9_DESC == null : this.MAIN_LEVEL9_DESC.equals(that.MAIN_LEVEL9_DESC));
    equal = equal && (this.MAIN_LEVEL9_MGR_NAME == null ? that.MAIN_LEVEL9_MGR_NAME == null : this.MAIN_LEVEL9_MGR_NAME.equals(that.MAIN_LEVEL9_MGR_NAME));
    equal = equal && (this.MAIN_LEVEL10_NAME == null ? that.MAIN_LEVEL10_NAME == null : this.MAIN_LEVEL10_NAME.equals(that.MAIN_LEVEL10_NAME));
    equal = equal && (this.MAIN_LEVEL10_DESC == null ? that.MAIN_LEVEL10_DESC == null : this.MAIN_LEVEL10_DESC.equals(that.MAIN_LEVEL10_DESC));
    equal = equal && (this.MAIN_LEVEL10_MGR_NAME == null ? that.MAIN_LEVEL10_MGR_NAME == null : this.MAIN_LEVEL10_MGR_NAME.equals(that.MAIN_LEVEL10_MGR_NAME));
    equal = equal && (this.FILE_DTTM == null ? that.FILE_DTTM == null : this.FILE_DTTM.equals(that.FILE_DTTM));
    equal = equal && (this.INSERT_DTTM == null ? that.INSERT_DTTM == null : this.INSERT_DTTM.equals(that.INSERT_DTTM));
    equal = equal && (this.UPDATE_DTTM == null ? that.UPDATE_DTTM == null : this.UPDATE_DTTM.equals(that.UPDATE_DTTM));
    equal = equal && (this.LOAD_DW_ID == null ? that.LOAD_DW_ID == null : this.LOAD_DW_ID.equals(that.LOAD_DW_ID));
    equal = equal && (this.VERSION == null ? that.VERSION == null : this.VERSION.equals(that.VERSION));
    equal = equal && (this.COUNTRY_DW_ID == null ? that.COUNTRY_DW_ID == null : this.COUNTRY_DW_ID.equals(that.COUNTRY_DW_ID));
    equal = equal && (this.COMPANY_ID == null ? that.COMPANY_ID == null : this.COMPANY_ID.equals(that.COMPANY_ID));
    equal = equal && (this.COMPANY_DW_ID == null ? that.COMPANY_DW_ID == null : this.COMPANY_DW_ID.equals(that.COMPANY_DW_ID));
    equal = equal && (this.CAFE_MANAGER == null ? that.CAFE_MANAGER == null : this.CAFE_MANAGER.equals(that.CAFE_MANAGER));
    equal = equal && (this.CATERING_COORDINATORS == null ? that.CATERING_COORDINATORS == null : this.CATERING_COORDINATORS.equals(that.CATERING_COORDINATORS));
    equal = equal && (this.MARKET_NAME == null ? that.MARKET_NAME == null : this.MARKET_NAME.equals(that.MARKET_NAME));
    equal = equal && (this.YEAR_BASE_CAFE == null ? that.YEAR_BASE_CAFE == null : this.YEAR_BASE_CAFE.equals(that.YEAR_BASE_CAFE));
    equal = equal && (this.MARKETING_LOCATION_DW_ID == null ? that.MARKETING_LOCATION_DW_ID == null : this.MARKETING_LOCATION_DW_ID.equals(that.MARKETING_LOCATION_DW_ID));
    equal = equal && (this.DMA_NAME == null ? that.DMA_NAME == null : this.DMA_NAME.equals(that.DMA_NAME));
    equal = equal && (this.LABOR_INVESTMENT_AMT == null ? that.LABOR_INVESTMENT_AMT == null : this.LABOR_INVESTMENT_AMT.equals(that.LABOR_INVESTMENT_AMT));
    equal = equal && (this.CATERING_RCSM == null ? that.CATERING_RCSM == null : this.CATERING_RCSM.equals(that.CATERING_RCSM));
    equal = equal && (this.CATERING_SR_RCSM == null ? that.CATERING_SR_RCSM == null : this.CATERING_SR_RCSM.equals(that.CATERING_SR_RCSM));
    equal = equal && (this.PANERA_2_0_STATUS == null ? that.PANERA_2_0_STATUS == null : this.PANERA_2_0_STATUS.equals(that.PANERA_2_0_STATUS));
    equal = equal && (this.RPU_STATUS == null ? that.RPU_STATUS == null : this.RPU_STATUS.equals(that.RPU_STATUS));
    equal = equal && (this.HUB_CLUSTER_NAME == null ? that.HUB_CLUSTER_NAME == null : this.HUB_CLUSTER_NAME.equals(that.HUB_CLUSTER_NAME));
    equal = equal && (this.HUB_CLUSTER_CLASS == null ? that.HUB_CLUSTER_CLASS == null : this.HUB_CLUSTER_CLASS.equals(that.HUB_CLUSTER_CLASS));
    equal = equal && (this.ECOMMERCE_CAFE_TYPE_CATERING == null ? that.ECOMMERCE_CAFE_TYPE_CATERING == null : this.ECOMMERCE_CAFE_TYPE_CATERING.equals(that.ECOMMERCE_CAFE_TYPE_CATERING));
    equal = equal && (this.ECOMMERCE_CAFE_TYPE == null ? that.ECOMMERCE_CAFE_TYPE == null : this.ECOMMERCE_CAFE_TYPE.equals(that.ECOMMERCE_CAFE_TYPE));
    equal = equal && (this.CATERING_ONLINE_DESIGNATION == null ? that.CATERING_ONLINE_DESIGNATION == null : this.CATERING_ONLINE_DESIGNATION.equals(that.CATERING_ONLINE_DESIGNATION));
    equal = equal && (this.ECOMMERCE_CATERING_HUB_PARENT == null ? that.ECOMMERCE_CATERING_HUB_PARENT == null : this.ECOMMERCE_CATERING_HUB_PARENT.equals(that.ECOMMERCE_CATERING_HUB_PARENT));
    equal = equal && (this.CATERING_ONLINE_STATUS == null ? that.CATERING_ONLINE_STATUS == null : this.CATERING_ONLINE_STATUS.equals(that.CATERING_ONLINE_STATUS));
    equal = equal && (this.ECOMMERCE_KIOSKS_FLAG == null ? that.ECOMMERCE_KIOSKS_FLAG == null : this.ECOMMERCE_KIOSKS_FLAG.equals(that.ECOMMERCE_KIOSKS_FLAG));
    equal = equal && (this.ECOMMERCE_RETAIL_DELIVERY_FLAG == null ? that.ECOMMERCE_RETAIL_DELIVERY_FLAG == null : this.ECOMMERCE_RETAIL_DELIVERY_FLAG.equals(that.ECOMMERCE_RETAIL_DELIVERY_FLAG));
    equal = equal && (this.ECOMMERCE_RETAIL_DINE_IN_FLAG == null ? that.ECOMMERCE_RETAIL_DINE_IN_FLAG == null : this.ECOMMERCE_RETAIL_DINE_IN_FLAG.equals(that.ECOMMERCE_RETAIL_DINE_IN_FLAG));
    equal = equal && (this.ECOMMERCE_RETAIL_PICKUP_FLAG == null ? that.ECOMMERCE_RETAIL_PICKUP_FLAG == null : this.ECOMMERCE_RETAIL_PICKUP_FLAG.equals(that.ECOMMERCE_RETAIL_PICKUP_FLAG));
    equal = equal && (this.ECOMMERCE_LAUNCH_CATERING_2_0 == null ? that.ECOMMERCE_LAUNCH_CATERING_2_0 == null : this.ECOMMERCE_LAUNCH_CATERING_2_0.equals(that.ECOMMERCE_LAUNCH_CATERING_2_0));
    equal = equal && (this.ECOMMERCE_LAUNCH_RPU == null ? that.ECOMMERCE_LAUNCH_RPU == null : this.ECOMMERCE_LAUNCH_RPU.equals(that.ECOMMERCE_LAUNCH_RPU));
    equal = equal && (this.ECOMMERCE_LAUNCH_PANERA_2_0 == null ? that.ECOMMERCE_LAUNCH_PANERA_2_0 == null : this.ECOMMERCE_LAUNCH_PANERA_2_0.equals(that.ECOMMERCE_LAUNCH_PANERA_2_0));
    equal = equal && (this.ECOMMERCE_LAUNCH_DELIVERY == null ? that.ECOMMERCE_LAUNCH_DELIVERY == null : this.ECOMMERCE_LAUNCH_DELIVERY.equals(that.ECOMMERCE_LAUNCH_DELIVERY));
    equal = equal && (this.ECOMMERCE_LAUNCH_DINE_IN == null ? that.ECOMMERCE_LAUNCH_DINE_IN == null : this.ECOMMERCE_LAUNCH_DINE_IN.equals(that.ECOMMERCE_LAUNCH_DINE_IN));
    equal = equal && (this.ECOMMERCE_LAUNCH_KIOSKS == null ? that.ECOMMERCE_LAUNCH_KIOSKS == null : this.ECOMMERCE_LAUNCH_KIOSKS.equals(that.ECOMMERCE_LAUNCH_KIOSKS));
    equal = equal && (this.LAUNCH_2_0_PERIOD_NBR_IN_EPOCH == null ? that.LAUNCH_2_0_PERIOD_NBR_IN_EPOCH == null : this.LAUNCH_2_0_PERIOD_NBR_IN_EPOCH.equals(that.LAUNCH_2_0_PERIOD_NBR_IN_EPOCH));
    equal = equal && (this.LAUNCH_2_0_WEEK_NBR_IN_EPOCH == null ? that.LAUNCH_2_0_WEEK_NBR_IN_EPOCH == null : this.LAUNCH_2_0_WEEK_NBR_IN_EPOCH.equals(that.LAUNCH_2_0_WEEK_NBR_IN_EPOCH));
    equal = equal && (this.LAUNCH_DEL_PERIOD_NBR_IN_EPOCH == null ? that.LAUNCH_DEL_PERIOD_NBR_IN_EPOCH == null : this.LAUNCH_DEL_PERIOD_NBR_IN_EPOCH.equals(that.LAUNCH_DEL_PERIOD_NBR_IN_EPOCH));
    equal = equal && (this.LAUNCH_DEL_WEEK_NBR_IN_EPOCH == null ? that.LAUNCH_DEL_WEEK_NBR_IN_EPOCH == null : this.LAUNCH_DEL_WEEK_NBR_IN_EPOCH.equals(that.LAUNCH_DEL_WEEK_NBR_IN_EPOCH));
    equal = equal && (this.CAFE_GROUP_DW_ID == null ? that.CAFE_GROUP_DW_ID == null : this.CAFE_GROUP_DW_ID.equals(that.CAFE_GROUP_DW_ID));
    equal = equal && (this.DISTRIBUTION_CTR_DW_ID == null ? that.DISTRIBUTION_CTR_DW_ID == null : this.DISTRIBUTION_CTR_DW_ID.equals(that.DISTRIBUTION_CTR_DW_ID));
    equal = equal && (this.DISTRICT_DESC == null ? that.DISTRICT_DESC == null : this.DISTRICT_DESC.equals(that.DISTRICT_DESC));
    equal = equal && (this.PRIMARY_MENU_GROUP == null ? that.PRIMARY_MENU_GROUP == null : this.PRIMARY_MENU_GROUP.equals(that.PRIMARY_MENU_GROUP));
    equal = equal && (this.PRICING_TIER_GROUP == null ? that.PRICING_TIER_GROUP == null : this.PRICING_TIER_GROUP.equals(that.PRICING_TIER_GROUP));
    equal = equal && (this.ECOMMERCE_LAUNCH_OPS_INTEGRITY == null ? that.ECOMMERCE_LAUNCH_OPS_INTEGRITY == null : this.ECOMMERCE_LAUNCH_OPS_INTEGRITY.equals(that.ECOMMERCE_LAUNCH_OPS_INTEGRITY));
    equal = equal && (this.CERTIFIED_TRAINING_CAFE == null ? that.CERTIFIED_TRAINING_CAFE == null : this.CERTIFIED_TRAINING_CAFE.equals(that.CERTIFIED_TRAINING_CAFE));
    equal = equal && (this.COMMISSARY_DW_ID == null ? that.COMMISSARY_DW_ID == null : this.COMMISSARY_DW_ID.equals(that.COMMISSARY_DW_ID));
    equal = equal && (this.COMMISSARY_NBR == null ? that.COMMISSARY_NBR == null : this.COMMISSARY_NBR.equals(that.COMMISSARY_NBR));
    equal = equal && (this.COMMISSARY_NAME == null ? that.COMMISSARY_NAME == null : this.COMMISSARY_NAME.equals(that.COMMISSARY_NAME));
    equal = equal && (this.OPENED_DT_PERIOD_NBR_IN_EPOCH == null ? that.OPENED_DT_PERIOD_NBR_IN_EPOCH == null : this.OPENED_DT_PERIOD_NBR_IN_EPOCH.equals(that.OPENED_DT_PERIOD_NBR_IN_EPOCH));
    equal = equal && (this.OPENED_DT_WEEK_NBR_IN_EPOCH == null ? that.OPENED_DT_WEEK_NBR_IN_EPOCH == null : this.OPENED_DT_WEEK_NBR_IN_EPOCH.equals(that.OPENED_DT_WEEK_NBR_IN_EPOCH));
    equal = equal && (this.GL_STORE_NBR == null ? that.GL_STORE_NBR == null : this.GL_STORE_NBR.equals(that.GL_STORE_NBR));
    equal = equal && (this.PAYROLL_PROCESSOR_BRANCH == null ? that.PAYROLL_PROCESSOR_BRANCH == null : this.PAYROLL_PROCESSOR_BRANCH.equals(that.PAYROLL_PROCESSOR_BRANCH));
    equal = equal && (this.PAYROLL_PROCESSOR_DIVISION == null ? that.PAYROLL_PROCESSOR_DIVISION == null : this.PAYROLL_PROCESSOR_DIVISION.equals(that.PAYROLL_PROCESSOR_DIVISION));
    equal = equal && (this.LOAD_DTTM == null ? that.LOAD_DTTM == null : this.LOAD_DTTM.equals(that.LOAD_DTTM));
    equal = equal && (this.LOAD_BY == null ? that.LOAD_BY == null : this.LOAD_BY.equals(that.LOAD_BY));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Z_CAFE_DW_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.CAFE_NBR = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.CAFE_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.OPENED_DATE = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.CLOSED_DATE = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.LOC_CURRENCY_DW_ID = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.POS_SYSTEM_TYPE = JdbcWritableBridge.readString(7, __dbResults);
    this.POS_POLLING_FLAG = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.TIMEZONE = JdbcWritableBridge.readString(9, __dbResults);
    this.CAFE_DRIVETHRU_FLAG = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.POS_SYSTEM_UPGRADE_DATE = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.TMX_CUTOVER_DATE = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.POSTAL_CODE = JdbcWritableBridge.readString(13, __dbResults);
    this.TMX_INTEGRATION_DATE = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.TMX_FORECAST_DATE = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.CORPORATE_FLAG = JdbcWritableBridge.readString(16, __dbResults);
    this.RECIPE_TYPE = JdbcWritableBridge.readString(17, __dbResults);
    this.OPEN_SUN_FLAG = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.OPEN_MON_FLAG = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.OPEN_TUE_FLAG = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.OPEN_WED_FLAG = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.OPEN_THUR_FLAG = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.OPEN_FRI_FLAG = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.OPEN_SAT_FLAG = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.ACQUISITION_DATE = JdbcWritableBridge.readTimestamp(25, __dbResults);
    this.COMP_OPENED_DATE = JdbcWritableBridge.readTimestamp(26, __dbResults);
    this.CLOSED_YEAR = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.CAFE_SVS_NBR = JdbcWritableBridge.readString(28, __dbResults);
    this.CITY = JdbcWritableBridge.readString(29, __dbResults);
    this.STATE_CODE = JdbcWritableBridge.readString(30, __dbResults);
    this.ADDRESS = JdbcWritableBridge.readString(31, __dbResults);
    this.PRICE_TIER_CODE = JdbcWritableBridge.readString(32, __dbResults);
    this.TAX_STATE_CODE = JdbcWritableBridge.readString(33, __dbResults);
    this.PHONE_NBR = JdbcWritableBridge.readString(34, __dbResults);
    this.FAX_NUMBER = JdbcWritableBridge.readString(35, __dbResults);
    this.BROADBAND_IP = JdbcWritableBridge.readString(36, __dbResults);
    this.ROPE_IP = JdbcWritableBridge.readString(37, __dbResults);
    this.ISP_TYPE = JdbcWritableBridge.readString(38, __dbResults);
    this.ISP_PROVIDER = JdbcWritableBridge.readString(39, __dbResults);
    this.FRANCHISE = JdbcWritableBridge.readString(40, __dbResults);
    this.DISTRICT_NAME = JdbcWritableBridge.readString(41, __dbResults);
    this.HARDWARE_SERVICE_PROVIDER = JdbcWritableBridge.readString(42, __dbResults);
    this.PHONE_SERVICE_PROVIDER = JdbcWritableBridge.readString(43, __dbResults);
    this.CAFE_STATUS = JdbcWritableBridge.readString(44, __dbResults);
    this.CAFE_TYPE = JdbcWritableBridge.readString(45, __dbResults);
    this.LOCATION_TYPE = JdbcWritableBridge.readString(46, __dbResults);
    this.SUPPORT_LEVEL = JdbcWritableBridge.readString(47, __dbResults);
    this.CAFE_EMAIL = JdbcWritableBridge.readString(48, __dbResults);
    this.DATABASE_TYPE = JdbcWritableBridge.readString(49, __dbResults);
    this.DATABASE_VERSION = JdbcWritableBridge.readString(50, __dbResults);
    this.SYSTEM_COORDINATOR = JdbcWritableBridge.readString(51, __dbResults);
    this.DISTRICT_NUMBER = JdbcWritableBridge.readString(52, __dbResults);
    this.REGION_NAME = JdbcWritableBridge.readString(53, __dbResults);
    this.AREA_NAME = JdbcWritableBridge.readString(54, __dbResults);
    this.POS_INSTALL_DATE = JdbcWritableBridge.readTimestamp(55, __dbResults);
    this.POS_INSTALLER_NAME = JdbcWritableBridge.readString(56, __dbResults);
    this.CABLING_INSTALLER_NAME = JdbcWritableBridge.readString(57, __dbResults);
    this.CREDIT_MERCHANT_ID = JdbcWritableBridge.readString(58, __dbResults);
    this.NETWORK_LOCATION = JdbcWritableBridge.readString(59, __dbResults);
    this.VOIP_FLAG = JdbcWritableBridge.readBigDecimal(60, __dbResults);
    this.ELEARN_IP = JdbcWritableBridge.readString(61, __dbResults);
    this.SYSTEM_ATT_VOIP = JdbcWritableBridge.readBigDecimal(62, __dbResults);
    this.CAFE_AMAZON_FLAG = JdbcWritableBridge.readBigDecimal(63, __dbResults);
    this.CUST_FACING_DISP_FLAG = JdbcWritableBridge.readBigDecimal(64, __dbResults);
    this.TABLE_SERVICE = JdbcWritableBridge.readString(65, __dbResults);
    this.KDS_SCHEMES = JdbcWritableBridge.readString(66, __dbResults);
    this.EOU_STATUS_FLAG = JdbcWritableBridge.readBigDecimal(67, __dbResults);
    this.SYSTEM_TMX_CUTOVER = JdbcWritableBridge.readString(68, __dbResults);
    this.AREA_DESC = JdbcWritableBridge.readString(69, __dbResults);
    this.DISTRICT_MGRCELL = JdbcWritableBridge.readString(70, __dbResults);
    this.DISTRICT_MGREMAIL = JdbcWritableBridge.readString(71, __dbResults);
    this.DISTRICT_MGRNAME = JdbcWritableBridge.readString(72, __dbResults);
    this.ORG_NAME = JdbcWritableBridge.readString(73, __dbResults);
    this.BOH_NETWORK_IP = JdbcWritableBridge.readString(74, __dbResults);
    this.PHONE_SUPPORT_PROVIDER = JdbcWritableBridge.readString(75, __dbResults);
    this.ADDRESS2 = JdbcWritableBridge.readString(76, __dbResults);
    this.PHONE2 = JdbcWritableBridge.readString(77, __dbResults);
    this.FTA_EMAILADDR = JdbcWritableBridge.readString(78, __dbResults);
    this.ELEARNING_IP = JdbcWritableBridge.readString(79, __dbResults);
    this.NETWORK_LOCATION_SIDE = JdbcWritableBridge.readString(80, __dbResults);
    this.COMPANY_NAME = JdbcWritableBridge.readString(81, __dbResults);
    this.COMPANY_DESC = JdbcWritableBridge.readString(82, __dbResults);
    this.LOY_LAUNCH_DATE = JdbcWritableBridge.readTimestamp(83, __dbResults);
    this.MAIN_LEVEL1_NAME = JdbcWritableBridge.readString(84, __dbResults);
    this.MAIN_LEVEL1_DESC = JdbcWritableBridge.readString(85, __dbResults);
    this.MAIN_LEVEL1_MGR_NAME = JdbcWritableBridge.readString(86, __dbResults);
    this.MAIN_LEVEL2_NAME = JdbcWritableBridge.readString(87, __dbResults);
    this.MAIN_LEVEL2_DESC = JdbcWritableBridge.readString(88, __dbResults);
    this.MAIN_LEVEL2_MGR_NAME = JdbcWritableBridge.readString(89, __dbResults);
    this.MAIN_LEVEL3_NAME = JdbcWritableBridge.readString(90, __dbResults);
    this.MAIN_LEVEL3_DESC = JdbcWritableBridge.readString(91, __dbResults);
    this.MAIN_LEVEL3_MGR_NAME = JdbcWritableBridge.readString(92, __dbResults);
    this.MAIN_LEVEL4_NAME = JdbcWritableBridge.readString(93, __dbResults);
    this.MAIN_LEVEL4_DESC = JdbcWritableBridge.readString(94, __dbResults);
    this.MAIN_LEVEL4_MGR_NAME = JdbcWritableBridge.readString(95, __dbResults);
    this.MAIN_LEVEL5_NAME = JdbcWritableBridge.readString(96, __dbResults);
    this.MAIN_LEVEL5_DESC = JdbcWritableBridge.readString(97, __dbResults);
    this.MAIN_LEVEL5_MGR_NAME = JdbcWritableBridge.readString(98, __dbResults);
    this.MAIN_LEVEL6_NAME = JdbcWritableBridge.readString(99, __dbResults);
    this.MAIN_LEVEL6_DESC = JdbcWritableBridge.readString(100, __dbResults);
    this.MAIN_LEVEL6_MGR_NAME = JdbcWritableBridge.readString(101, __dbResults);
    this.MAIN_LEVEL7_NAME = JdbcWritableBridge.readString(102, __dbResults);
    this.MAIN_LEVEL7_DESC = JdbcWritableBridge.readString(103, __dbResults);
    this.MAIN_LEVEL7_MGR_NAME = JdbcWritableBridge.readString(104, __dbResults);
    this.MAIN_LEVEL8_NAME = JdbcWritableBridge.readString(105, __dbResults);
    this.MAIN_LEVEL8_DESC = JdbcWritableBridge.readString(106, __dbResults);
    this.MAIN_LEVEL8_MGR_NAME = JdbcWritableBridge.readString(107, __dbResults);
    this.MAIN_LEVEL9_NAME = JdbcWritableBridge.readString(108, __dbResults);
    this.MAIN_LEVEL9_DESC = JdbcWritableBridge.readString(109, __dbResults);
    this.MAIN_LEVEL9_MGR_NAME = JdbcWritableBridge.readString(110, __dbResults);
    this.MAIN_LEVEL10_NAME = JdbcWritableBridge.readString(111, __dbResults);
    this.MAIN_LEVEL10_DESC = JdbcWritableBridge.readString(112, __dbResults);
    this.MAIN_LEVEL10_MGR_NAME = JdbcWritableBridge.readString(113, __dbResults);
    this.FILE_DTTM = JdbcWritableBridge.readTimestamp(114, __dbResults);
    this.INSERT_DTTM = JdbcWritableBridge.readTimestamp(115, __dbResults);
    this.UPDATE_DTTM = JdbcWritableBridge.readTimestamp(116, __dbResults);
    this.LOAD_DW_ID = JdbcWritableBridge.readBigDecimal(117, __dbResults);
    this.VERSION = JdbcWritableBridge.readBigDecimal(118, __dbResults);
    this.COUNTRY_DW_ID = JdbcWritableBridge.readBigDecimal(119, __dbResults);
    this.COMPANY_ID = JdbcWritableBridge.readBigDecimal(120, __dbResults);
    this.COMPANY_DW_ID = JdbcWritableBridge.readBigDecimal(121, __dbResults);
    this.CAFE_MANAGER = JdbcWritableBridge.readString(122, __dbResults);
    this.CATERING_COORDINATORS = JdbcWritableBridge.readString(123, __dbResults);
    this.MARKET_NAME = JdbcWritableBridge.readString(124, __dbResults);
    this.YEAR_BASE_CAFE = JdbcWritableBridge.readBigDecimal(125, __dbResults);
    this.MARKETING_LOCATION_DW_ID = JdbcWritableBridge.readBigDecimal(126, __dbResults);
    this.DMA_NAME = JdbcWritableBridge.readString(127, __dbResults);
    this.LABOR_INVESTMENT_AMT = JdbcWritableBridge.readBigDecimal(128, __dbResults);
    this.CATERING_RCSM = JdbcWritableBridge.readString(129, __dbResults);
    this.CATERING_SR_RCSM = JdbcWritableBridge.readString(130, __dbResults);
    this.PANERA_2_0_STATUS = JdbcWritableBridge.readBigDecimal(131, __dbResults);
    this.RPU_STATUS = JdbcWritableBridge.readBigDecimal(132, __dbResults);
    this.HUB_CLUSTER_NAME = JdbcWritableBridge.readString(133, __dbResults);
    this.HUB_CLUSTER_CLASS = JdbcWritableBridge.readString(134, __dbResults);
    this.ECOMMERCE_CAFE_TYPE_CATERING = JdbcWritableBridge.readString(135, __dbResults);
    this.ECOMMERCE_CAFE_TYPE = JdbcWritableBridge.readString(136, __dbResults);
    this.CATERING_ONLINE_DESIGNATION = JdbcWritableBridge.readString(137, __dbResults);
    this.ECOMMERCE_CATERING_HUB_PARENT = JdbcWritableBridge.readString(138, __dbResults);
    this.CATERING_ONLINE_STATUS = JdbcWritableBridge.readString(139, __dbResults);
    this.ECOMMERCE_KIOSKS_FLAG = JdbcWritableBridge.readBigDecimal(140, __dbResults);
    this.ECOMMERCE_RETAIL_DELIVERY_FLAG = JdbcWritableBridge.readBigDecimal(141, __dbResults);
    this.ECOMMERCE_RETAIL_DINE_IN_FLAG = JdbcWritableBridge.readBigDecimal(142, __dbResults);
    this.ECOMMERCE_RETAIL_PICKUP_FLAG = JdbcWritableBridge.readBigDecimal(143, __dbResults);
    this.ECOMMERCE_LAUNCH_CATERING_2_0 = JdbcWritableBridge.readTimestamp(144, __dbResults);
    this.ECOMMERCE_LAUNCH_RPU = JdbcWritableBridge.readTimestamp(145, __dbResults);
    this.ECOMMERCE_LAUNCH_PANERA_2_0 = JdbcWritableBridge.readTimestamp(146, __dbResults);
    this.ECOMMERCE_LAUNCH_DELIVERY = JdbcWritableBridge.readTimestamp(147, __dbResults);
    this.ECOMMERCE_LAUNCH_DINE_IN = JdbcWritableBridge.readTimestamp(148, __dbResults);
    this.ECOMMERCE_LAUNCH_KIOSKS = JdbcWritableBridge.readTimestamp(149, __dbResults);
    this.LAUNCH_2_0_PERIOD_NBR_IN_EPOCH = JdbcWritableBridge.readBigDecimal(150, __dbResults);
    this.LAUNCH_2_0_WEEK_NBR_IN_EPOCH = JdbcWritableBridge.readBigDecimal(151, __dbResults);
    this.LAUNCH_DEL_PERIOD_NBR_IN_EPOCH = JdbcWritableBridge.readBigDecimal(152, __dbResults);
    this.LAUNCH_DEL_WEEK_NBR_IN_EPOCH = JdbcWritableBridge.readBigDecimal(153, __dbResults);
    this.CAFE_GROUP_DW_ID = JdbcWritableBridge.readBigDecimal(154, __dbResults);
    this.DISTRIBUTION_CTR_DW_ID = JdbcWritableBridge.readBigDecimal(155, __dbResults);
    this.DISTRICT_DESC = JdbcWritableBridge.readString(156, __dbResults);
    this.PRIMARY_MENU_GROUP = JdbcWritableBridge.readBigDecimal(157, __dbResults);
    this.PRICING_TIER_GROUP = JdbcWritableBridge.readString(158, __dbResults);
    this.ECOMMERCE_LAUNCH_OPS_INTEGRITY = JdbcWritableBridge.readTimestamp(159, __dbResults);
    this.CERTIFIED_TRAINING_CAFE = JdbcWritableBridge.readBigDecimal(160, __dbResults);
    this.COMMISSARY_DW_ID = JdbcWritableBridge.readBigDecimal(161, __dbResults);
    this.COMMISSARY_NBR = JdbcWritableBridge.readBigDecimal(162, __dbResults);
    this.COMMISSARY_NAME = JdbcWritableBridge.readString(163, __dbResults);
    this.OPENED_DT_PERIOD_NBR_IN_EPOCH = JdbcWritableBridge.readBigDecimal(164, __dbResults);
    this.OPENED_DT_WEEK_NBR_IN_EPOCH = JdbcWritableBridge.readBigDecimal(165, __dbResults);
    this.GL_STORE_NBR = JdbcWritableBridge.readString(166, __dbResults);
    this.PAYROLL_PROCESSOR_BRANCH = JdbcWritableBridge.readString(167, __dbResults);
    this.PAYROLL_PROCESSOR_DIVISION = JdbcWritableBridge.readString(168, __dbResults);
    this.LOAD_DTTM = JdbcWritableBridge.readTimestamp(169, __dbResults);
    this.LOAD_BY = JdbcWritableBridge.readString(170, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Z_CAFE_DW_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.CAFE_NBR = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.CAFE_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.OPENED_DATE = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.CLOSED_DATE = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.LOC_CURRENCY_DW_ID = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.POS_SYSTEM_TYPE = JdbcWritableBridge.readString(7, __dbResults);
    this.POS_POLLING_FLAG = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.TIMEZONE = JdbcWritableBridge.readString(9, __dbResults);
    this.CAFE_DRIVETHRU_FLAG = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.POS_SYSTEM_UPGRADE_DATE = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.TMX_CUTOVER_DATE = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.POSTAL_CODE = JdbcWritableBridge.readString(13, __dbResults);
    this.TMX_INTEGRATION_DATE = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.TMX_FORECAST_DATE = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.CORPORATE_FLAG = JdbcWritableBridge.readString(16, __dbResults);
    this.RECIPE_TYPE = JdbcWritableBridge.readString(17, __dbResults);
    this.OPEN_SUN_FLAG = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.OPEN_MON_FLAG = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.OPEN_TUE_FLAG = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.OPEN_WED_FLAG = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.OPEN_THUR_FLAG = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.OPEN_FRI_FLAG = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.OPEN_SAT_FLAG = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.ACQUISITION_DATE = JdbcWritableBridge.readTimestamp(25, __dbResults);
    this.COMP_OPENED_DATE = JdbcWritableBridge.readTimestamp(26, __dbResults);
    this.CLOSED_YEAR = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.CAFE_SVS_NBR = JdbcWritableBridge.readString(28, __dbResults);
    this.CITY = JdbcWritableBridge.readString(29, __dbResults);
    this.STATE_CODE = JdbcWritableBridge.readString(30, __dbResults);
    this.ADDRESS = JdbcWritableBridge.readString(31, __dbResults);
    this.PRICE_TIER_CODE = JdbcWritableBridge.readString(32, __dbResults);
    this.TAX_STATE_CODE = JdbcWritableBridge.readString(33, __dbResults);
    this.PHONE_NBR = JdbcWritableBridge.readString(34, __dbResults);
    this.FAX_NUMBER = JdbcWritableBridge.readString(35, __dbResults);
    this.BROADBAND_IP = JdbcWritableBridge.readString(36, __dbResults);
    this.ROPE_IP = JdbcWritableBridge.readString(37, __dbResults);
    this.ISP_TYPE = JdbcWritableBridge.readString(38, __dbResults);
    this.ISP_PROVIDER = JdbcWritableBridge.readString(39, __dbResults);
    this.FRANCHISE = JdbcWritableBridge.readString(40, __dbResults);
    this.DISTRICT_NAME = JdbcWritableBridge.readString(41, __dbResults);
    this.HARDWARE_SERVICE_PROVIDER = JdbcWritableBridge.readString(42, __dbResults);
    this.PHONE_SERVICE_PROVIDER = JdbcWritableBridge.readString(43, __dbResults);
    this.CAFE_STATUS = JdbcWritableBridge.readString(44, __dbResults);
    this.CAFE_TYPE = JdbcWritableBridge.readString(45, __dbResults);
    this.LOCATION_TYPE = JdbcWritableBridge.readString(46, __dbResults);
    this.SUPPORT_LEVEL = JdbcWritableBridge.readString(47, __dbResults);
    this.CAFE_EMAIL = JdbcWritableBridge.readString(48, __dbResults);
    this.DATABASE_TYPE = JdbcWritableBridge.readString(49, __dbResults);
    this.DATABASE_VERSION = JdbcWritableBridge.readString(50, __dbResults);
    this.SYSTEM_COORDINATOR = JdbcWritableBridge.readString(51, __dbResults);
    this.DISTRICT_NUMBER = JdbcWritableBridge.readString(52, __dbResults);
    this.REGION_NAME = JdbcWritableBridge.readString(53, __dbResults);
    this.AREA_NAME = JdbcWritableBridge.readString(54, __dbResults);
    this.POS_INSTALL_DATE = JdbcWritableBridge.readTimestamp(55, __dbResults);
    this.POS_INSTALLER_NAME = JdbcWritableBridge.readString(56, __dbResults);
    this.CABLING_INSTALLER_NAME = JdbcWritableBridge.readString(57, __dbResults);
    this.CREDIT_MERCHANT_ID = JdbcWritableBridge.readString(58, __dbResults);
    this.NETWORK_LOCATION = JdbcWritableBridge.readString(59, __dbResults);
    this.VOIP_FLAG = JdbcWritableBridge.readBigDecimal(60, __dbResults);
    this.ELEARN_IP = JdbcWritableBridge.readString(61, __dbResults);
    this.SYSTEM_ATT_VOIP = JdbcWritableBridge.readBigDecimal(62, __dbResults);
    this.CAFE_AMAZON_FLAG = JdbcWritableBridge.readBigDecimal(63, __dbResults);
    this.CUST_FACING_DISP_FLAG = JdbcWritableBridge.readBigDecimal(64, __dbResults);
    this.TABLE_SERVICE = JdbcWritableBridge.readString(65, __dbResults);
    this.KDS_SCHEMES = JdbcWritableBridge.readString(66, __dbResults);
    this.EOU_STATUS_FLAG = JdbcWritableBridge.readBigDecimal(67, __dbResults);
    this.SYSTEM_TMX_CUTOVER = JdbcWritableBridge.readString(68, __dbResults);
    this.AREA_DESC = JdbcWritableBridge.readString(69, __dbResults);
    this.DISTRICT_MGRCELL = JdbcWritableBridge.readString(70, __dbResults);
    this.DISTRICT_MGREMAIL = JdbcWritableBridge.readString(71, __dbResults);
    this.DISTRICT_MGRNAME = JdbcWritableBridge.readString(72, __dbResults);
    this.ORG_NAME = JdbcWritableBridge.readString(73, __dbResults);
    this.BOH_NETWORK_IP = JdbcWritableBridge.readString(74, __dbResults);
    this.PHONE_SUPPORT_PROVIDER = JdbcWritableBridge.readString(75, __dbResults);
    this.ADDRESS2 = JdbcWritableBridge.readString(76, __dbResults);
    this.PHONE2 = JdbcWritableBridge.readString(77, __dbResults);
    this.FTA_EMAILADDR = JdbcWritableBridge.readString(78, __dbResults);
    this.ELEARNING_IP = JdbcWritableBridge.readString(79, __dbResults);
    this.NETWORK_LOCATION_SIDE = JdbcWritableBridge.readString(80, __dbResults);
    this.COMPANY_NAME = JdbcWritableBridge.readString(81, __dbResults);
    this.COMPANY_DESC = JdbcWritableBridge.readString(82, __dbResults);
    this.LOY_LAUNCH_DATE = JdbcWritableBridge.readTimestamp(83, __dbResults);
    this.MAIN_LEVEL1_NAME = JdbcWritableBridge.readString(84, __dbResults);
    this.MAIN_LEVEL1_DESC = JdbcWritableBridge.readString(85, __dbResults);
    this.MAIN_LEVEL1_MGR_NAME = JdbcWritableBridge.readString(86, __dbResults);
    this.MAIN_LEVEL2_NAME = JdbcWritableBridge.readString(87, __dbResults);
    this.MAIN_LEVEL2_DESC = JdbcWritableBridge.readString(88, __dbResults);
    this.MAIN_LEVEL2_MGR_NAME = JdbcWritableBridge.readString(89, __dbResults);
    this.MAIN_LEVEL3_NAME = JdbcWritableBridge.readString(90, __dbResults);
    this.MAIN_LEVEL3_DESC = JdbcWritableBridge.readString(91, __dbResults);
    this.MAIN_LEVEL3_MGR_NAME = JdbcWritableBridge.readString(92, __dbResults);
    this.MAIN_LEVEL4_NAME = JdbcWritableBridge.readString(93, __dbResults);
    this.MAIN_LEVEL4_DESC = JdbcWritableBridge.readString(94, __dbResults);
    this.MAIN_LEVEL4_MGR_NAME = JdbcWritableBridge.readString(95, __dbResults);
    this.MAIN_LEVEL5_NAME = JdbcWritableBridge.readString(96, __dbResults);
    this.MAIN_LEVEL5_DESC = JdbcWritableBridge.readString(97, __dbResults);
    this.MAIN_LEVEL5_MGR_NAME = JdbcWritableBridge.readString(98, __dbResults);
    this.MAIN_LEVEL6_NAME = JdbcWritableBridge.readString(99, __dbResults);
    this.MAIN_LEVEL6_DESC = JdbcWritableBridge.readString(100, __dbResults);
    this.MAIN_LEVEL6_MGR_NAME = JdbcWritableBridge.readString(101, __dbResults);
    this.MAIN_LEVEL7_NAME = JdbcWritableBridge.readString(102, __dbResults);
    this.MAIN_LEVEL7_DESC = JdbcWritableBridge.readString(103, __dbResults);
    this.MAIN_LEVEL7_MGR_NAME = JdbcWritableBridge.readString(104, __dbResults);
    this.MAIN_LEVEL8_NAME = JdbcWritableBridge.readString(105, __dbResults);
    this.MAIN_LEVEL8_DESC = JdbcWritableBridge.readString(106, __dbResults);
    this.MAIN_LEVEL8_MGR_NAME = JdbcWritableBridge.readString(107, __dbResults);
    this.MAIN_LEVEL9_NAME = JdbcWritableBridge.readString(108, __dbResults);
    this.MAIN_LEVEL9_DESC = JdbcWritableBridge.readString(109, __dbResults);
    this.MAIN_LEVEL9_MGR_NAME = JdbcWritableBridge.readString(110, __dbResults);
    this.MAIN_LEVEL10_NAME = JdbcWritableBridge.readString(111, __dbResults);
    this.MAIN_LEVEL10_DESC = JdbcWritableBridge.readString(112, __dbResults);
    this.MAIN_LEVEL10_MGR_NAME = JdbcWritableBridge.readString(113, __dbResults);
    this.FILE_DTTM = JdbcWritableBridge.readTimestamp(114, __dbResults);
    this.INSERT_DTTM = JdbcWritableBridge.readTimestamp(115, __dbResults);
    this.UPDATE_DTTM = JdbcWritableBridge.readTimestamp(116, __dbResults);
    this.LOAD_DW_ID = JdbcWritableBridge.readBigDecimal(117, __dbResults);
    this.VERSION = JdbcWritableBridge.readBigDecimal(118, __dbResults);
    this.COUNTRY_DW_ID = JdbcWritableBridge.readBigDecimal(119, __dbResults);
    this.COMPANY_ID = JdbcWritableBridge.readBigDecimal(120, __dbResults);
    this.COMPANY_DW_ID = JdbcWritableBridge.readBigDecimal(121, __dbResults);
    this.CAFE_MANAGER = JdbcWritableBridge.readString(122, __dbResults);
    this.CATERING_COORDINATORS = JdbcWritableBridge.readString(123, __dbResults);
    this.MARKET_NAME = JdbcWritableBridge.readString(124, __dbResults);
    this.YEAR_BASE_CAFE = JdbcWritableBridge.readBigDecimal(125, __dbResults);
    this.MARKETING_LOCATION_DW_ID = JdbcWritableBridge.readBigDecimal(126, __dbResults);
    this.DMA_NAME = JdbcWritableBridge.readString(127, __dbResults);
    this.LABOR_INVESTMENT_AMT = JdbcWritableBridge.readBigDecimal(128, __dbResults);
    this.CATERING_RCSM = JdbcWritableBridge.readString(129, __dbResults);
    this.CATERING_SR_RCSM = JdbcWritableBridge.readString(130, __dbResults);
    this.PANERA_2_0_STATUS = JdbcWritableBridge.readBigDecimal(131, __dbResults);
    this.RPU_STATUS = JdbcWritableBridge.readBigDecimal(132, __dbResults);
    this.HUB_CLUSTER_NAME = JdbcWritableBridge.readString(133, __dbResults);
    this.HUB_CLUSTER_CLASS = JdbcWritableBridge.readString(134, __dbResults);
    this.ECOMMERCE_CAFE_TYPE_CATERING = JdbcWritableBridge.readString(135, __dbResults);
    this.ECOMMERCE_CAFE_TYPE = JdbcWritableBridge.readString(136, __dbResults);
    this.CATERING_ONLINE_DESIGNATION = JdbcWritableBridge.readString(137, __dbResults);
    this.ECOMMERCE_CATERING_HUB_PARENT = JdbcWritableBridge.readString(138, __dbResults);
    this.CATERING_ONLINE_STATUS = JdbcWritableBridge.readString(139, __dbResults);
    this.ECOMMERCE_KIOSKS_FLAG = JdbcWritableBridge.readBigDecimal(140, __dbResults);
    this.ECOMMERCE_RETAIL_DELIVERY_FLAG = JdbcWritableBridge.readBigDecimal(141, __dbResults);
    this.ECOMMERCE_RETAIL_DINE_IN_FLAG = JdbcWritableBridge.readBigDecimal(142, __dbResults);
    this.ECOMMERCE_RETAIL_PICKUP_FLAG = JdbcWritableBridge.readBigDecimal(143, __dbResults);
    this.ECOMMERCE_LAUNCH_CATERING_2_0 = JdbcWritableBridge.readTimestamp(144, __dbResults);
    this.ECOMMERCE_LAUNCH_RPU = JdbcWritableBridge.readTimestamp(145, __dbResults);
    this.ECOMMERCE_LAUNCH_PANERA_2_0 = JdbcWritableBridge.readTimestamp(146, __dbResults);
    this.ECOMMERCE_LAUNCH_DELIVERY = JdbcWritableBridge.readTimestamp(147, __dbResults);
    this.ECOMMERCE_LAUNCH_DINE_IN = JdbcWritableBridge.readTimestamp(148, __dbResults);
    this.ECOMMERCE_LAUNCH_KIOSKS = JdbcWritableBridge.readTimestamp(149, __dbResults);
    this.LAUNCH_2_0_PERIOD_NBR_IN_EPOCH = JdbcWritableBridge.readBigDecimal(150, __dbResults);
    this.LAUNCH_2_0_WEEK_NBR_IN_EPOCH = JdbcWritableBridge.readBigDecimal(151, __dbResults);
    this.LAUNCH_DEL_PERIOD_NBR_IN_EPOCH = JdbcWritableBridge.readBigDecimal(152, __dbResults);
    this.LAUNCH_DEL_WEEK_NBR_IN_EPOCH = JdbcWritableBridge.readBigDecimal(153, __dbResults);
    this.CAFE_GROUP_DW_ID = JdbcWritableBridge.readBigDecimal(154, __dbResults);
    this.DISTRIBUTION_CTR_DW_ID = JdbcWritableBridge.readBigDecimal(155, __dbResults);
    this.DISTRICT_DESC = JdbcWritableBridge.readString(156, __dbResults);
    this.PRIMARY_MENU_GROUP = JdbcWritableBridge.readBigDecimal(157, __dbResults);
    this.PRICING_TIER_GROUP = JdbcWritableBridge.readString(158, __dbResults);
    this.ECOMMERCE_LAUNCH_OPS_INTEGRITY = JdbcWritableBridge.readTimestamp(159, __dbResults);
    this.CERTIFIED_TRAINING_CAFE = JdbcWritableBridge.readBigDecimal(160, __dbResults);
    this.COMMISSARY_DW_ID = JdbcWritableBridge.readBigDecimal(161, __dbResults);
    this.COMMISSARY_NBR = JdbcWritableBridge.readBigDecimal(162, __dbResults);
    this.COMMISSARY_NAME = JdbcWritableBridge.readString(163, __dbResults);
    this.OPENED_DT_PERIOD_NBR_IN_EPOCH = JdbcWritableBridge.readBigDecimal(164, __dbResults);
    this.OPENED_DT_WEEK_NBR_IN_EPOCH = JdbcWritableBridge.readBigDecimal(165, __dbResults);
    this.GL_STORE_NBR = JdbcWritableBridge.readString(166, __dbResults);
    this.PAYROLL_PROCESSOR_BRANCH = JdbcWritableBridge.readString(167, __dbResults);
    this.PAYROLL_PROCESSOR_DIVISION = JdbcWritableBridge.readString(168, __dbResults);
    this.LOAD_DTTM = JdbcWritableBridge.readTimestamp(169, __dbResults);
    this.LOAD_BY = JdbcWritableBridge.readString(170, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(Z_CAFE_DW_ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CAFE_NBR, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(CAFE_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(OPENED_DATE, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CLOSED_DATE, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOC_CURRENCY_DW_ID, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(POS_SYSTEM_TYPE, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(POS_POLLING_FLAG, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(TIMEZONE, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CAFE_DRIVETHRU_FLAG, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(POS_SYSTEM_UPGRADE_DATE, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TMX_CUTOVER_DATE, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(POSTAL_CODE, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TMX_INTEGRATION_DATE, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TMX_FORECAST_DATE, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(CORPORATE_FLAG, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(RECIPE_TYPE, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(OPEN_SUN_FLAG, 18 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(OPEN_MON_FLAG, 19 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(OPEN_TUE_FLAG, 20 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(OPEN_WED_FLAG, 21 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(OPEN_THUR_FLAG, 22 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(OPEN_FRI_FLAG, 23 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(OPEN_SAT_FLAG, 24 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ACQUISITION_DATE, 25 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(COMP_OPENED_DATE, 26 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CLOSED_YEAR, 27 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(CAFE_SVS_NBR, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CITY, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STATE_CODE, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ADDRESS, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PRICE_TIER_CODE, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TAX_STATE_CODE, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PHONE_NBR, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FAX_NUMBER, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BROADBAND_IP, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ROPE_IP, 37 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ISP_TYPE, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ISP_PROVIDER, 39 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FRANCHISE, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DISTRICT_NAME, 41 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HARDWARE_SERVICE_PROVIDER, 42 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PHONE_SERVICE_PROVIDER, 43 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CAFE_STATUS, 44 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CAFE_TYPE, 45 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LOCATION_TYPE, 46 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SUPPORT_LEVEL, 47 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CAFE_EMAIL, 48 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DATABASE_TYPE, 49 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DATABASE_VERSION, 50 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SYSTEM_COORDINATOR, 51 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DISTRICT_NUMBER, 52 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REGION_NAME, 53 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AREA_NAME, 54 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(POS_INSTALL_DATE, 55 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(POS_INSTALLER_NAME, 56 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CABLING_INSTALLER_NAME, 57 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CREDIT_MERCHANT_ID, 58 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(NETWORK_LOCATION, 59 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VOIP_FLAG, 60 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(ELEARN_IP, 61 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SYSTEM_ATT_VOIP, 62 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CAFE_AMAZON_FLAG, 63 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CUST_FACING_DISP_FLAG, 64 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(TABLE_SERVICE, 65 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(KDS_SCHEMES, 66 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(EOU_STATUS_FLAG, 67 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(SYSTEM_TMX_CUTOVER, 68 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AREA_DESC, 69 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DISTRICT_MGRCELL, 70 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DISTRICT_MGREMAIL, 71 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DISTRICT_MGRNAME, 72 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ORG_NAME, 73 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BOH_NETWORK_IP, 74 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PHONE_SUPPORT_PROVIDER, 75 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ADDRESS2, 76 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PHONE2, 77 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FTA_EMAILADDR, 78 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ELEARNING_IP, 79 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(NETWORK_LOCATION_SIDE, 80 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(COMPANY_NAME, 81 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(COMPANY_DESC, 82 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOY_LAUNCH_DATE, 83 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL1_NAME, 84 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL1_DESC, 85 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL1_MGR_NAME, 86 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL2_NAME, 87 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL2_DESC, 88 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL2_MGR_NAME, 89 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL3_NAME, 90 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL3_DESC, 91 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL3_MGR_NAME, 92 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL4_NAME, 93 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL4_DESC, 94 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL4_MGR_NAME, 95 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL5_NAME, 96 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL5_DESC, 97 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL5_MGR_NAME, 98 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL6_NAME, 99 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL6_DESC, 100 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL6_MGR_NAME, 101 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL7_NAME, 102 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL7_DESC, 103 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL7_MGR_NAME, 104 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL8_NAME, 105 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL8_DESC, 106 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL8_MGR_NAME, 107 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL9_NAME, 108 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL9_DESC, 109 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL9_MGR_NAME, 110 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL10_NAME, 111 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL10_DESC, 112 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL10_MGR_NAME, 113 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FILE_DTTM, 114 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(INSERT_DTTM, 115 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATE_DTTM, 116 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOAD_DW_ID, 117 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VERSION, 118 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(COUNTRY_DW_ID, 119 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(COMPANY_ID, 120 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(COMPANY_DW_ID, 121 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(CAFE_MANAGER, 122 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CATERING_COORDINATORS, 123 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MARKET_NAME, 124 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(YEAR_BASE_CAFE, 125 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MARKETING_LOCATION_DW_ID, 126 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(DMA_NAME, 127 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LABOR_INVESTMENT_AMT, 128 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(CATERING_RCSM, 129 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CATERING_SR_RCSM, 130 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PANERA_2_0_STATUS, 131 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(RPU_STATUS, 132 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(HUB_CLUSTER_NAME, 133 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HUB_CLUSTER_CLASS, 134 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ECOMMERCE_CAFE_TYPE_CATERING, 135 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ECOMMERCE_CAFE_TYPE, 136 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CATERING_ONLINE_DESIGNATION, 137 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ECOMMERCE_CATERING_HUB_PARENT, 138 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CATERING_ONLINE_STATUS, 139 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ECOMMERCE_KIOSKS_FLAG, 140 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ECOMMERCE_RETAIL_DELIVERY_FLAG, 141 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ECOMMERCE_RETAIL_DINE_IN_FLAG, 142 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ECOMMERCE_RETAIL_PICKUP_FLAG, 143 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ECOMMERCE_LAUNCH_CATERING_2_0, 144 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ECOMMERCE_LAUNCH_RPU, 145 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ECOMMERCE_LAUNCH_PANERA_2_0, 146 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ECOMMERCE_LAUNCH_DELIVERY, 147 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ECOMMERCE_LAUNCH_DINE_IN, 148 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ECOMMERCE_LAUNCH_KIOSKS, 149 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LAUNCH_2_0_PERIOD_NBR_IN_EPOCH, 150 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LAUNCH_2_0_WEEK_NBR_IN_EPOCH, 151 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LAUNCH_DEL_PERIOD_NBR_IN_EPOCH, 152 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LAUNCH_DEL_WEEK_NBR_IN_EPOCH, 153 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CAFE_GROUP_DW_ID, 154 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DISTRIBUTION_CTR_DW_ID, 155 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(DISTRICT_DESC, 156 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PRIMARY_MENU_GROUP, 157 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(PRICING_TIER_GROUP, 158 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ECOMMERCE_LAUNCH_OPS_INTEGRITY, 159 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CERTIFIED_TRAINING_CAFE, 160 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(COMMISSARY_DW_ID, 161 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(COMMISSARY_NBR, 162 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(COMMISSARY_NAME, 163 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(OPENED_DT_PERIOD_NBR_IN_EPOCH, 164 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(OPENED_DT_WEEK_NBR_IN_EPOCH, 165 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(GL_STORE_NBR, 166 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PAYROLL_PROCESSOR_BRANCH, 167 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PAYROLL_PROCESSOR_DIVISION, 168 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOAD_DTTM, 169 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_BY, 170 + __off, 12, __dbStmt);
    return 170;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(Z_CAFE_DW_ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CAFE_NBR, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(CAFE_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(OPENED_DATE, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CLOSED_DATE, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOC_CURRENCY_DW_ID, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(POS_SYSTEM_TYPE, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(POS_POLLING_FLAG, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(TIMEZONE, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CAFE_DRIVETHRU_FLAG, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(POS_SYSTEM_UPGRADE_DATE, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TMX_CUTOVER_DATE, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(POSTAL_CODE, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TMX_INTEGRATION_DATE, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TMX_FORECAST_DATE, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(CORPORATE_FLAG, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(RECIPE_TYPE, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(OPEN_SUN_FLAG, 18 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(OPEN_MON_FLAG, 19 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(OPEN_TUE_FLAG, 20 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(OPEN_WED_FLAG, 21 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(OPEN_THUR_FLAG, 22 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(OPEN_FRI_FLAG, 23 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(OPEN_SAT_FLAG, 24 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ACQUISITION_DATE, 25 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(COMP_OPENED_DATE, 26 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CLOSED_YEAR, 27 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(CAFE_SVS_NBR, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CITY, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STATE_CODE, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ADDRESS, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PRICE_TIER_CODE, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TAX_STATE_CODE, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PHONE_NBR, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FAX_NUMBER, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BROADBAND_IP, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ROPE_IP, 37 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ISP_TYPE, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ISP_PROVIDER, 39 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FRANCHISE, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DISTRICT_NAME, 41 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HARDWARE_SERVICE_PROVIDER, 42 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PHONE_SERVICE_PROVIDER, 43 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CAFE_STATUS, 44 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CAFE_TYPE, 45 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LOCATION_TYPE, 46 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SUPPORT_LEVEL, 47 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CAFE_EMAIL, 48 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DATABASE_TYPE, 49 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DATABASE_VERSION, 50 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SYSTEM_COORDINATOR, 51 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DISTRICT_NUMBER, 52 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REGION_NAME, 53 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AREA_NAME, 54 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(POS_INSTALL_DATE, 55 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(POS_INSTALLER_NAME, 56 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CABLING_INSTALLER_NAME, 57 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CREDIT_MERCHANT_ID, 58 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(NETWORK_LOCATION, 59 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VOIP_FLAG, 60 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(ELEARN_IP, 61 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SYSTEM_ATT_VOIP, 62 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CAFE_AMAZON_FLAG, 63 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CUST_FACING_DISP_FLAG, 64 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(TABLE_SERVICE, 65 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(KDS_SCHEMES, 66 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(EOU_STATUS_FLAG, 67 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(SYSTEM_TMX_CUTOVER, 68 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AREA_DESC, 69 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DISTRICT_MGRCELL, 70 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DISTRICT_MGREMAIL, 71 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DISTRICT_MGRNAME, 72 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ORG_NAME, 73 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BOH_NETWORK_IP, 74 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PHONE_SUPPORT_PROVIDER, 75 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ADDRESS2, 76 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PHONE2, 77 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FTA_EMAILADDR, 78 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ELEARNING_IP, 79 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(NETWORK_LOCATION_SIDE, 80 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(COMPANY_NAME, 81 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(COMPANY_DESC, 82 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOY_LAUNCH_DATE, 83 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL1_NAME, 84 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL1_DESC, 85 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL1_MGR_NAME, 86 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL2_NAME, 87 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL2_DESC, 88 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL2_MGR_NAME, 89 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL3_NAME, 90 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL3_DESC, 91 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL3_MGR_NAME, 92 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL4_NAME, 93 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL4_DESC, 94 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL4_MGR_NAME, 95 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL5_NAME, 96 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL5_DESC, 97 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL5_MGR_NAME, 98 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL6_NAME, 99 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL6_DESC, 100 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL6_MGR_NAME, 101 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL7_NAME, 102 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL7_DESC, 103 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL7_MGR_NAME, 104 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL8_NAME, 105 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL8_DESC, 106 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL8_MGR_NAME, 107 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL9_NAME, 108 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL9_DESC, 109 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL9_MGR_NAME, 110 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL10_NAME, 111 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL10_DESC, 112 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_LEVEL10_MGR_NAME, 113 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FILE_DTTM, 114 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(INSERT_DTTM, 115 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATE_DTTM, 116 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOAD_DW_ID, 117 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VERSION, 118 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(COUNTRY_DW_ID, 119 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(COMPANY_ID, 120 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(COMPANY_DW_ID, 121 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(CAFE_MANAGER, 122 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CATERING_COORDINATORS, 123 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MARKET_NAME, 124 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(YEAR_BASE_CAFE, 125 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MARKETING_LOCATION_DW_ID, 126 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(DMA_NAME, 127 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LABOR_INVESTMENT_AMT, 128 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(CATERING_RCSM, 129 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CATERING_SR_RCSM, 130 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PANERA_2_0_STATUS, 131 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(RPU_STATUS, 132 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(HUB_CLUSTER_NAME, 133 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HUB_CLUSTER_CLASS, 134 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ECOMMERCE_CAFE_TYPE_CATERING, 135 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ECOMMERCE_CAFE_TYPE, 136 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CATERING_ONLINE_DESIGNATION, 137 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ECOMMERCE_CATERING_HUB_PARENT, 138 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CATERING_ONLINE_STATUS, 139 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ECOMMERCE_KIOSKS_FLAG, 140 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ECOMMERCE_RETAIL_DELIVERY_FLAG, 141 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ECOMMERCE_RETAIL_DINE_IN_FLAG, 142 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ECOMMERCE_RETAIL_PICKUP_FLAG, 143 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ECOMMERCE_LAUNCH_CATERING_2_0, 144 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ECOMMERCE_LAUNCH_RPU, 145 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ECOMMERCE_LAUNCH_PANERA_2_0, 146 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ECOMMERCE_LAUNCH_DELIVERY, 147 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ECOMMERCE_LAUNCH_DINE_IN, 148 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ECOMMERCE_LAUNCH_KIOSKS, 149 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LAUNCH_2_0_PERIOD_NBR_IN_EPOCH, 150 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LAUNCH_2_0_WEEK_NBR_IN_EPOCH, 151 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LAUNCH_DEL_PERIOD_NBR_IN_EPOCH, 152 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LAUNCH_DEL_WEEK_NBR_IN_EPOCH, 153 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CAFE_GROUP_DW_ID, 154 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DISTRIBUTION_CTR_DW_ID, 155 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(DISTRICT_DESC, 156 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PRIMARY_MENU_GROUP, 157 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(PRICING_TIER_GROUP, 158 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ECOMMERCE_LAUNCH_OPS_INTEGRITY, 159 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CERTIFIED_TRAINING_CAFE, 160 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(COMMISSARY_DW_ID, 161 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(COMMISSARY_NBR, 162 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(COMMISSARY_NAME, 163 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(OPENED_DT_PERIOD_NBR_IN_EPOCH, 164 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(OPENED_DT_WEEK_NBR_IN_EPOCH, 165 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(GL_STORE_NBR, 166 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PAYROLL_PROCESSOR_BRANCH, 167 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PAYROLL_PROCESSOR_DIVISION, 168 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOAD_DTTM, 169 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_BY, 170 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.Z_CAFE_DW_ID = null;
    } else {
    this.Z_CAFE_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CAFE_NBR = null;
    } else {
    this.CAFE_NBR = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CAFE_NAME = null;
    } else {
    this.CAFE_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OPENED_DATE = null;
    } else {
    this.OPENED_DATE = new Timestamp(__dataIn.readLong());
    this.OPENED_DATE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CLOSED_DATE = null;
    } else {
    this.CLOSED_DATE = new Timestamp(__dataIn.readLong());
    this.CLOSED_DATE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.LOC_CURRENCY_DW_ID = null;
    } else {
    this.LOC_CURRENCY_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.POS_SYSTEM_TYPE = null;
    } else {
    this.POS_SYSTEM_TYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.POS_POLLING_FLAG = null;
    } else {
    this.POS_POLLING_FLAG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TIMEZONE = null;
    } else {
    this.TIMEZONE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CAFE_DRIVETHRU_FLAG = null;
    } else {
    this.CAFE_DRIVETHRU_FLAG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.POS_SYSTEM_UPGRADE_DATE = null;
    } else {
    this.POS_SYSTEM_UPGRADE_DATE = new Timestamp(__dataIn.readLong());
    this.POS_SYSTEM_UPGRADE_DATE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TMX_CUTOVER_DATE = null;
    } else {
    this.TMX_CUTOVER_DATE = new Timestamp(__dataIn.readLong());
    this.TMX_CUTOVER_DATE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.POSTAL_CODE = null;
    } else {
    this.POSTAL_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TMX_INTEGRATION_DATE = null;
    } else {
    this.TMX_INTEGRATION_DATE = new Timestamp(__dataIn.readLong());
    this.TMX_INTEGRATION_DATE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TMX_FORECAST_DATE = null;
    } else {
    this.TMX_FORECAST_DATE = new Timestamp(__dataIn.readLong());
    this.TMX_FORECAST_DATE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CORPORATE_FLAG = null;
    } else {
    this.CORPORATE_FLAG = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.RECIPE_TYPE = null;
    } else {
    this.RECIPE_TYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OPEN_SUN_FLAG = null;
    } else {
    this.OPEN_SUN_FLAG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OPEN_MON_FLAG = null;
    } else {
    this.OPEN_MON_FLAG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OPEN_TUE_FLAG = null;
    } else {
    this.OPEN_TUE_FLAG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OPEN_WED_FLAG = null;
    } else {
    this.OPEN_WED_FLAG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OPEN_THUR_FLAG = null;
    } else {
    this.OPEN_THUR_FLAG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OPEN_FRI_FLAG = null;
    } else {
    this.OPEN_FRI_FLAG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OPEN_SAT_FLAG = null;
    } else {
    this.OPEN_SAT_FLAG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ACQUISITION_DATE = null;
    } else {
    this.ACQUISITION_DATE = new Timestamp(__dataIn.readLong());
    this.ACQUISITION_DATE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.COMP_OPENED_DATE = null;
    } else {
    this.COMP_OPENED_DATE = new Timestamp(__dataIn.readLong());
    this.COMP_OPENED_DATE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CLOSED_YEAR = null;
    } else {
    this.CLOSED_YEAR = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CAFE_SVS_NBR = null;
    } else {
    this.CAFE_SVS_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CITY = null;
    } else {
    this.CITY = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.STATE_CODE = null;
    } else {
    this.STATE_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ADDRESS = null;
    } else {
    this.ADDRESS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PRICE_TIER_CODE = null;
    } else {
    this.PRICE_TIER_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TAX_STATE_CODE = null;
    } else {
    this.TAX_STATE_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PHONE_NBR = null;
    } else {
    this.PHONE_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FAX_NUMBER = null;
    } else {
    this.FAX_NUMBER = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BROADBAND_IP = null;
    } else {
    this.BROADBAND_IP = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ROPE_IP = null;
    } else {
    this.ROPE_IP = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ISP_TYPE = null;
    } else {
    this.ISP_TYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ISP_PROVIDER = null;
    } else {
    this.ISP_PROVIDER = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FRANCHISE = null;
    } else {
    this.FRANCHISE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DISTRICT_NAME = null;
    } else {
    this.DISTRICT_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HARDWARE_SERVICE_PROVIDER = null;
    } else {
    this.HARDWARE_SERVICE_PROVIDER = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PHONE_SERVICE_PROVIDER = null;
    } else {
    this.PHONE_SERVICE_PROVIDER = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CAFE_STATUS = null;
    } else {
    this.CAFE_STATUS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CAFE_TYPE = null;
    } else {
    this.CAFE_TYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOCATION_TYPE = null;
    } else {
    this.LOCATION_TYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SUPPORT_LEVEL = null;
    } else {
    this.SUPPORT_LEVEL = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CAFE_EMAIL = null;
    } else {
    this.CAFE_EMAIL = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DATABASE_TYPE = null;
    } else {
    this.DATABASE_TYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DATABASE_VERSION = null;
    } else {
    this.DATABASE_VERSION = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SYSTEM_COORDINATOR = null;
    } else {
    this.SYSTEM_COORDINATOR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DISTRICT_NUMBER = null;
    } else {
    this.DISTRICT_NUMBER = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REGION_NAME = null;
    } else {
    this.REGION_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AREA_NAME = null;
    } else {
    this.AREA_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.POS_INSTALL_DATE = null;
    } else {
    this.POS_INSTALL_DATE = new Timestamp(__dataIn.readLong());
    this.POS_INSTALL_DATE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.POS_INSTALLER_NAME = null;
    } else {
    this.POS_INSTALLER_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CABLING_INSTALLER_NAME = null;
    } else {
    this.CABLING_INSTALLER_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CREDIT_MERCHANT_ID = null;
    } else {
    this.CREDIT_MERCHANT_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NETWORK_LOCATION = null;
    } else {
    this.NETWORK_LOCATION = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VOIP_FLAG = null;
    } else {
    this.VOIP_FLAG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ELEARN_IP = null;
    } else {
    this.ELEARN_IP = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SYSTEM_ATT_VOIP = null;
    } else {
    this.SYSTEM_ATT_VOIP = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CAFE_AMAZON_FLAG = null;
    } else {
    this.CAFE_AMAZON_FLAG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CUST_FACING_DISP_FLAG = null;
    } else {
    this.CUST_FACING_DISP_FLAG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TABLE_SERVICE = null;
    } else {
    this.TABLE_SERVICE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.KDS_SCHEMES = null;
    } else {
    this.KDS_SCHEMES = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EOU_STATUS_FLAG = null;
    } else {
    this.EOU_STATUS_FLAG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SYSTEM_TMX_CUTOVER = null;
    } else {
    this.SYSTEM_TMX_CUTOVER = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AREA_DESC = null;
    } else {
    this.AREA_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DISTRICT_MGRCELL = null;
    } else {
    this.DISTRICT_MGRCELL = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DISTRICT_MGREMAIL = null;
    } else {
    this.DISTRICT_MGREMAIL = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DISTRICT_MGRNAME = null;
    } else {
    this.DISTRICT_MGRNAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ORG_NAME = null;
    } else {
    this.ORG_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BOH_NETWORK_IP = null;
    } else {
    this.BOH_NETWORK_IP = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PHONE_SUPPORT_PROVIDER = null;
    } else {
    this.PHONE_SUPPORT_PROVIDER = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ADDRESS2 = null;
    } else {
    this.ADDRESS2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PHONE2 = null;
    } else {
    this.PHONE2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FTA_EMAILADDR = null;
    } else {
    this.FTA_EMAILADDR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ELEARNING_IP = null;
    } else {
    this.ELEARNING_IP = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NETWORK_LOCATION_SIDE = null;
    } else {
    this.NETWORK_LOCATION_SIDE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.COMPANY_NAME = null;
    } else {
    this.COMPANY_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.COMPANY_DESC = null;
    } else {
    this.COMPANY_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOY_LAUNCH_DATE = null;
    } else {
    this.LOY_LAUNCH_DATE = new Timestamp(__dataIn.readLong());
    this.LOY_LAUNCH_DATE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL1_NAME = null;
    } else {
    this.MAIN_LEVEL1_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL1_DESC = null;
    } else {
    this.MAIN_LEVEL1_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL1_MGR_NAME = null;
    } else {
    this.MAIN_LEVEL1_MGR_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL2_NAME = null;
    } else {
    this.MAIN_LEVEL2_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL2_DESC = null;
    } else {
    this.MAIN_LEVEL2_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL2_MGR_NAME = null;
    } else {
    this.MAIN_LEVEL2_MGR_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL3_NAME = null;
    } else {
    this.MAIN_LEVEL3_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL3_DESC = null;
    } else {
    this.MAIN_LEVEL3_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL3_MGR_NAME = null;
    } else {
    this.MAIN_LEVEL3_MGR_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL4_NAME = null;
    } else {
    this.MAIN_LEVEL4_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL4_DESC = null;
    } else {
    this.MAIN_LEVEL4_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL4_MGR_NAME = null;
    } else {
    this.MAIN_LEVEL4_MGR_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL5_NAME = null;
    } else {
    this.MAIN_LEVEL5_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL5_DESC = null;
    } else {
    this.MAIN_LEVEL5_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL5_MGR_NAME = null;
    } else {
    this.MAIN_LEVEL5_MGR_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL6_NAME = null;
    } else {
    this.MAIN_LEVEL6_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL6_DESC = null;
    } else {
    this.MAIN_LEVEL6_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL6_MGR_NAME = null;
    } else {
    this.MAIN_LEVEL6_MGR_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL7_NAME = null;
    } else {
    this.MAIN_LEVEL7_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL7_DESC = null;
    } else {
    this.MAIN_LEVEL7_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL7_MGR_NAME = null;
    } else {
    this.MAIN_LEVEL7_MGR_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL8_NAME = null;
    } else {
    this.MAIN_LEVEL8_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL8_DESC = null;
    } else {
    this.MAIN_LEVEL8_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL8_MGR_NAME = null;
    } else {
    this.MAIN_LEVEL8_MGR_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL9_NAME = null;
    } else {
    this.MAIN_LEVEL9_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL9_DESC = null;
    } else {
    this.MAIN_LEVEL9_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL9_MGR_NAME = null;
    } else {
    this.MAIN_LEVEL9_MGR_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL10_NAME = null;
    } else {
    this.MAIN_LEVEL10_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL10_DESC = null;
    } else {
    this.MAIN_LEVEL10_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_LEVEL10_MGR_NAME = null;
    } else {
    this.MAIN_LEVEL10_MGR_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FILE_DTTM = null;
    } else {
    this.FILE_DTTM = new Timestamp(__dataIn.readLong());
    this.FILE_DTTM.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.INSERT_DTTM = null;
    } else {
    this.INSERT_DTTM = new Timestamp(__dataIn.readLong());
    this.INSERT_DTTM.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.UPDATE_DTTM = null;
    } else {
    this.UPDATE_DTTM = new Timestamp(__dataIn.readLong());
    this.UPDATE_DTTM.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.LOAD_DW_ID = null;
    } else {
    this.LOAD_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VERSION = null;
    } else {
    this.VERSION = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.COUNTRY_DW_ID = null;
    } else {
    this.COUNTRY_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.COMPANY_ID = null;
    } else {
    this.COMPANY_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.COMPANY_DW_ID = null;
    } else {
    this.COMPANY_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CAFE_MANAGER = null;
    } else {
    this.CAFE_MANAGER = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CATERING_COORDINATORS = null;
    } else {
    this.CATERING_COORDINATORS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MARKET_NAME = null;
    } else {
    this.MARKET_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.YEAR_BASE_CAFE = null;
    } else {
    this.YEAR_BASE_CAFE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MARKETING_LOCATION_DW_ID = null;
    } else {
    this.MARKETING_LOCATION_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DMA_NAME = null;
    } else {
    this.DMA_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LABOR_INVESTMENT_AMT = null;
    } else {
    this.LABOR_INVESTMENT_AMT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CATERING_RCSM = null;
    } else {
    this.CATERING_RCSM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CATERING_SR_RCSM = null;
    } else {
    this.CATERING_SR_RCSM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PANERA_2_0_STATUS = null;
    } else {
    this.PANERA_2_0_STATUS = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.RPU_STATUS = null;
    } else {
    this.RPU_STATUS = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HUB_CLUSTER_NAME = null;
    } else {
    this.HUB_CLUSTER_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HUB_CLUSTER_CLASS = null;
    } else {
    this.HUB_CLUSTER_CLASS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ECOMMERCE_CAFE_TYPE_CATERING = null;
    } else {
    this.ECOMMERCE_CAFE_TYPE_CATERING = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ECOMMERCE_CAFE_TYPE = null;
    } else {
    this.ECOMMERCE_CAFE_TYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CATERING_ONLINE_DESIGNATION = null;
    } else {
    this.CATERING_ONLINE_DESIGNATION = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ECOMMERCE_CATERING_HUB_PARENT = null;
    } else {
    this.ECOMMERCE_CATERING_HUB_PARENT = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CATERING_ONLINE_STATUS = null;
    } else {
    this.CATERING_ONLINE_STATUS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ECOMMERCE_KIOSKS_FLAG = null;
    } else {
    this.ECOMMERCE_KIOSKS_FLAG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ECOMMERCE_RETAIL_DELIVERY_FLAG = null;
    } else {
    this.ECOMMERCE_RETAIL_DELIVERY_FLAG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ECOMMERCE_RETAIL_DINE_IN_FLAG = null;
    } else {
    this.ECOMMERCE_RETAIL_DINE_IN_FLAG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ECOMMERCE_RETAIL_PICKUP_FLAG = null;
    } else {
    this.ECOMMERCE_RETAIL_PICKUP_FLAG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ECOMMERCE_LAUNCH_CATERING_2_0 = null;
    } else {
    this.ECOMMERCE_LAUNCH_CATERING_2_0 = new Timestamp(__dataIn.readLong());
    this.ECOMMERCE_LAUNCH_CATERING_2_0.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ECOMMERCE_LAUNCH_RPU = null;
    } else {
    this.ECOMMERCE_LAUNCH_RPU = new Timestamp(__dataIn.readLong());
    this.ECOMMERCE_LAUNCH_RPU.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ECOMMERCE_LAUNCH_PANERA_2_0 = null;
    } else {
    this.ECOMMERCE_LAUNCH_PANERA_2_0 = new Timestamp(__dataIn.readLong());
    this.ECOMMERCE_LAUNCH_PANERA_2_0.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ECOMMERCE_LAUNCH_DELIVERY = null;
    } else {
    this.ECOMMERCE_LAUNCH_DELIVERY = new Timestamp(__dataIn.readLong());
    this.ECOMMERCE_LAUNCH_DELIVERY.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ECOMMERCE_LAUNCH_DINE_IN = null;
    } else {
    this.ECOMMERCE_LAUNCH_DINE_IN = new Timestamp(__dataIn.readLong());
    this.ECOMMERCE_LAUNCH_DINE_IN.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ECOMMERCE_LAUNCH_KIOSKS = null;
    } else {
    this.ECOMMERCE_LAUNCH_KIOSKS = new Timestamp(__dataIn.readLong());
    this.ECOMMERCE_LAUNCH_KIOSKS.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.LAUNCH_2_0_PERIOD_NBR_IN_EPOCH = null;
    } else {
    this.LAUNCH_2_0_PERIOD_NBR_IN_EPOCH = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LAUNCH_2_0_WEEK_NBR_IN_EPOCH = null;
    } else {
    this.LAUNCH_2_0_WEEK_NBR_IN_EPOCH = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LAUNCH_DEL_PERIOD_NBR_IN_EPOCH = null;
    } else {
    this.LAUNCH_DEL_PERIOD_NBR_IN_EPOCH = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LAUNCH_DEL_WEEK_NBR_IN_EPOCH = null;
    } else {
    this.LAUNCH_DEL_WEEK_NBR_IN_EPOCH = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CAFE_GROUP_DW_ID = null;
    } else {
    this.CAFE_GROUP_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DISTRIBUTION_CTR_DW_ID = null;
    } else {
    this.DISTRIBUTION_CTR_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DISTRICT_DESC = null;
    } else {
    this.DISTRICT_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PRIMARY_MENU_GROUP = null;
    } else {
    this.PRIMARY_MENU_GROUP = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PRICING_TIER_GROUP = null;
    } else {
    this.PRICING_TIER_GROUP = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ECOMMERCE_LAUNCH_OPS_INTEGRITY = null;
    } else {
    this.ECOMMERCE_LAUNCH_OPS_INTEGRITY = new Timestamp(__dataIn.readLong());
    this.ECOMMERCE_LAUNCH_OPS_INTEGRITY.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CERTIFIED_TRAINING_CAFE = null;
    } else {
    this.CERTIFIED_TRAINING_CAFE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.COMMISSARY_DW_ID = null;
    } else {
    this.COMMISSARY_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.COMMISSARY_NBR = null;
    } else {
    this.COMMISSARY_NBR = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.COMMISSARY_NAME = null;
    } else {
    this.COMMISSARY_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OPENED_DT_PERIOD_NBR_IN_EPOCH = null;
    } else {
    this.OPENED_DT_PERIOD_NBR_IN_EPOCH = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OPENED_DT_WEEK_NBR_IN_EPOCH = null;
    } else {
    this.OPENED_DT_WEEK_NBR_IN_EPOCH = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.GL_STORE_NBR = null;
    } else {
    this.GL_STORE_NBR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PAYROLL_PROCESSOR_BRANCH = null;
    } else {
    this.PAYROLL_PROCESSOR_BRANCH = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PAYROLL_PROCESSOR_DIVISION = null;
    } else {
    this.PAYROLL_PROCESSOR_DIVISION = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOAD_DTTM = null;
    } else {
    this.LOAD_DTTM = new Timestamp(__dataIn.readLong());
    this.LOAD_DTTM.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.LOAD_BY = null;
    } else {
    this.LOAD_BY = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.Z_CAFE_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Z_CAFE_DW_ID, __dataOut);
    }
    if (null == this.CAFE_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CAFE_NBR, __dataOut);
    }
    if (null == this.CAFE_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CAFE_NAME);
    }
    if (null == this.OPENED_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.OPENED_DATE.getTime());
    __dataOut.writeInt(this.OPENED_DATE.getNanos());
    }
    if (null == this.CLOSED_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CLOSED_DATE.getTime());
    __dataOut.writeInt(this.CLOSED_DATE.getNanos());
    }
    if (null == this.LOC_CURRENCY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOC_CURRENCY_DW_ID, __dataOut);
    }
    if (null == this.POS_SYSTEM_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POS_SYSTEM_TYPE);
    }
    if (null == this.POS_POLLING_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.POS_POLLING_FLAG, __dataOut);
    }
    if (null == this.TIMEZONE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TIMEZONE);
    }
    if (null == this.CAFE_DRIVETHRU_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CAFE_DRIVETHRU_FLAG, __dataOut);
    }
    if (null == this.POS_SYSTEM_UPGRADE_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.POS_SYSTEM_UPGRADE_DATE.getTime());
    __dataOut.writeInt(this.POS_SYSTEM_UPGRADE_DATE.getNanos());
    }
    if (null == this.TMX_CUTOVER_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TMX_CUTOVER_DATE.getTime());
    __dataOut.writeInt(this.TMX_CUTOVER_DATE.getNanos());
    }
    if (null == this.POSTAL_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POSTAL_CODE);
    }
    if (null == this.TMX_INTEGRATION_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TMX_INTEGRATION_DATE.getTime());
    __dataOut.writeInt(this.TMX_INTEGRATION_DATE.getNanos());
    }
    if (null == this.TMX_FORECAST_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TMX_FORECAST_DATE.getTime());
    __dataOut.writeInt(this.TMX_FORECAST_DATE.getNanos());
    }
    if (null == this.CORPORATE_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CORPORATE_FLAG);
    }
    if (null == this.RECIPE_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, RECIPE_TYPE);
    }
    if (null == this.OPEN_SUN_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OPEN_SUN_FLAG, __dataOut);
    }
    if (null == this.OPEN_MON_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OPEN_MON_FLAG, __dataOut);
    }
    if (null == this.OPEN_TUE_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OPEN_TUE_FLAG, __dataOut);
    }
    if (null == this.OPEN_WED_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OPEN_WED_FLAG, __dataOut);
    }
    if (null == this.OPEN_THUR_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OPEN_THUR_FLAG, __dataOut);
    }
    if (null == this.OPEN_FRI_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OPEN_FRI_FLAG, __dataOut);
    }
    if (null == this.OPEN_SAT_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OPEN_SAT_FLAG, __dataOut);
    }
    if (null == this.ACQUISITION_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ACQUISITION_DATE.getTime());
    __dataOut.writeInt(this.ACQUISITION_DATE.getNanos());
    }
    if (null == this.COMP_OPENED_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.COMP_OPENED_DATE.getTime());
    __dataOut.writeInt(this.COMP_OPENED_DATE.getNanos());
    }
    if (null == this.CLOSED_YEAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CLOSED_YEAR, __dataOut);
    }
    if (null == this.CAFE_SVS_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CAFE_SVS_NBR);
    }
    if (null == this.CITY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CITY);
    }
    if (null == this.STATE_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STATE_CODE);
    }
    if (null == this.ADDRESS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ADDRESS);
    }
    if (null == this.PRICE_TIER_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PRICE_TIER_CODE);
    }
    if (null == this.TAX_STATE_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TAX_STATE_CODE);
    }
    if (null == this.PHONE_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PHONE_NBR);
    }
    if (null == this.FAX_NUMBER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FAX_NUMBER);
    }
    if (null == this.BROADBAND_IP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BROADBAND_IP);
    }
    if (null == this.ROPE_IP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ROPE_IP);
    }
    if (null == this.ISP_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ISP_TYPE);
    }
    if (null == this.ISP_PROVIDER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ISP_PROVIDER);
    }
    if (null == this.FRANCHISE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FRANCHISE);
    }
    if (null == this.DISTRICT_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DISTRICT_NAME);
    }
    if (null == this.HARDWARE_SERVICE_PROVIDER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HARDWARE_SERVICE_PROVIDER);
    }
    if (null == this.PHONE_SERVICE_PROVIDER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PHONE_SERVICE_PROVIDER);
    }
    if (null == this.CAFE_STATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CAFE_STATUS);
    }
    if (null == this.CAFE_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CAFE_TYPE);
    }
    if (null == this.LOCATION_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LOCATION_TYPE);
    }
    if (null == this.SUPPORT_LEVEL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SUPPORT_LEVEL);
    }
    if (null == this.CAFE_EMAIL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CAFE_EMAIL);
    }
    if (null == this.DATABASE_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DATABASE_TYPE);
    }
    if (null == this.DATABASE_VERSION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DATABASE_VERSION);
    }
    if (null == this.SYSTEM_COORDINATOR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SYSTEM_COORDINATOR);
    }
    if (null == this.DISTRICT_NUMBER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DISTRICT_NUMBER);
    }
    if (null == this.REGION_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REGION_NAME);
    }
    if (null == this.AREA_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, AREA_NAME);
    }
    if (null == this.POS_INSTALL_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.POS_INSTALL_DATE.getTime());
    __dataOut.writeInt(this.POS_INSTALL_DATE.getNanos());
    }
    if (null == this.POS_INSTALLER_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POS_INSTALLER_NAME);
    }
    if (null == this.CABLING_INSTALLER_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CABLING_INSTALLER_NAME);
    }
    if (null == this.CREDIT_MERCHANT_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CREDIT_MERCHANT_ID);
    }
    if (null == this.NETWORK_LOCATION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, NETWORK_LOCATION);
    }
    if (null == this.VOIP_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VOIP_FLAG, __dataOut);
    }
    if (null == this.ELEARN_IP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ELEARN_IP);
    }
    if (null == this.SYSTEM_ATT_VOIP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SYSTEM_ATT_VOIP, __dataOut);
    }
    if (null == this.CAFE_AMAZON_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CAFE_AMAZON_FLAG, __dataOut);
    }
    if (null == this.CUST_FACING_DISP_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CUST_FACING_DISP_FLAG, __dataOut);
    }
    if (null == this.TABLE_SERVICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TABLE_SERVICE);
    }
    if (null == this.KDS_SCHEMES) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, KDS_SCHEMES);
    }
    if (null == this.EOU_STATUS_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.EOU_STATUS_FLAG, __dataOut);
    }
    if (null == this.SYSTEM_TMX_CUTOVER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SYSTEM_TMX_CUTOVER);
    }
    if (null == this.AREA_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, AREA_DESC);
    }
    if (null == this.DISTRICT_MGRCELL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DISTRICT_MGRCELL);
    }
    if (null == this.DISTRICT_MGREMAIL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DISTRICT_MGREMAIL);
    }
    if (null == this.DISTRICT_MGRNAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DISTRICT_MGRNAME);
    }
    if (null == this.ORG_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ORG_NAME);
    }
    if (null == this.BOH_NETWORK_IP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BOH_NETWORK_IP);
    }
    if (null == this.PHONE_SUPPORT_PROVIDER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PHONE_SUPPORT_PROVIDER);
    }
    if (null == this.ADDRESS2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ADDRESS2);
    }
    if (null == this.PHONE2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PHONE2);
    }
    if (null == this.FTA_EMAILADDR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FTA_EMAILADDR);
    }
    if (null == this.ELEARNING_IP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ELEARNING_IP);
    }
    if (null == this.NETWORK_LOCATION_SIDE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, NETWORK_LOCATION_SIDE);
    }
    if (null == this.COMPANY_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COMPANY_NAME);
    }
    if (null == this.COMPANY_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COMPANY_DESC);
    }
    if (null == this.LOY_LAUNCH_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.LOY_LAUNCH_DATE.getTime());
    __dataOut.writeInt(this.LOY_LAUNCH_DATE.getNanos());
    }
    if (null == this.MAIN_LEVEL1_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL1_NAME);
    }
    if (null == this.MAIN_LEVEL1_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL1_DESC);
    }
    if (null == this.MAIN_LEVEL1_MGR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL1_MGR_NAME);
    }
    if (null == this.MAIN_LEVEL2_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL2_NAME);
    }
    if (null == this.MAIN_LEVEL2_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL2_DESC);
    }
    if (null == this.MAIN_LEVEL2_MGR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL2_MGR_NAME);
    }
    if (null == this.MAIN_LEVEL3_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL3_NAME);
    }
    if (null == this.MAIN_LEVEL3_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL3_DESC);
    }
    if (null == this.MAIN_LEVEL3_MGR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL3_MGR_NAME);
    }
    if (null == this.MAIN_LEVEL4_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL4_NAME);
    }
    if (null == this.MAIN_LEVEL4_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL4_DESC);
    }
    if (null == this.MAIN_LEVEL4_MGR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL4_MGR_NAME);
    }
    if (null == this.MAIN_LEVEL5_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL5_NAME);
    }
    if (null == this.MAIN_LEVEL5_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL5_DESC);
    }
    if (null == this.MAIN_LEVEL5_MGR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL5_MGR_NAME);
    }
    if (null == this.MAIN_LEVEL6_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL6_NAME);
    }
    if (null == this.MAIN_LEVEL6_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL6_DESC);
    }
    if (null == this.MAIN_LEVEL6_MGR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL6_MGR_NAME);
    }
    if (null == this.MAIN_LEVEL7_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL7_NAME);
    }
    if (null == this.MAIN_LEVEL7_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL7_DESC);
    }
    if (null == this.MAIN_LEVEL7_MGR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL7_MGR_NAME);
    }
    if (null == this.MAIN_LEVEL8_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL8_NAME);
    }
    if (null == this.MAIN_LEVEL8_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL8_DESC);
    }
    if (null == this.MAIN_LEVEL8_MGR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL8_MGR_NAME);
    }
    if (null == this.MAIN_LEVEL9_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL9_NAME);
    }
    if (null == this.MAIN_LEVEL9_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL9_DESC);
    }
    if (null == this.MAIN_LEVEL9_MGR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL9_MGR_NAME);
    }
    if (null == this.MAIN_LEVEL10_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL10_NAME);
    }
    if (null == this.MAIN_LEVEL10_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL10_DESC);
    }
    if (null == this.MAIN_LEVEL10_MGR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL10_MGR_NAME);
    }
    if (null == this.FILE_DTTM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FILE_DTTM.getTime());
    __dataOut.writeInt(this.FILE_DTTM.getNanos());
    }
    if (null == this.INSERT_DTTM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.INSERT_DTTM.getTime());
    __dataOut.writeInt(this.INSERT_DTTM.getNanos());
    }
    if (null == this.UPDATE_DTTM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.UPDATE_DTTM.getTime());
    __dataOut.writeInt(this.UPDATE_DTTM.getNanos());
    }
    if (null == this.LOAD_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOAD_DW_ID, __dataOut);
    }
    if (null == this.VERSION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VERSION, __dataOut);
    }
    if (null == this.COUNTRY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.COUNTRY_DW_ID, __dataOut);
    }
    if (null == this.COMPANY_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.COMPANY_ID, __dataOut);
    }
    if (null == this.COMPANY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.COMPANY_DW_ID, __dataOut);
    }
    if (null == this.CAFE_MANAGER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CAFE_MANAGER);
    }
    if (null == this.CATERING_COORDINATORS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CATERING_COORDINATORS);
    }
    if (null == this.MARKET_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MARKET_NAME);
    }
    if (null == this.YEAR_BASE_CAFE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.YEAR_BASE_CAFE, __dataOut);
    }
    if (null == this.MARKETING_LOCATION_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MARKETING_LOCATION_DW_ID, __dataOut);
    }
    if (null == this.DMA_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DMA_NAME);
    }
    if (null == this.LABOR_INVESTMENT_AMT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LABOR_INVESTMENT_AMT, __dataOut);
    }
    if (null == this.CATERING_RCSM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CATERING_RCSM);
    }
    if (null == this.CATERING_SR_RCSM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CATERING_SR_RCSM);
    }
    if (null == this.PANERA_2_0_STATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PANERA_2_0_STATUS, __dataOut);
    }
    if (null == this.RPU_STATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.RPU_STATUS, __dataOut);
    }
    if (null == this.HUB_CLUSTER_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HUB_CLUSTER_NAME);
    }
    if (null == this.HUB_CLUSTER_CLASS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HUB_CLUSTER_CLASS);
    }
    if (null == this.ECOMMERCE_CAFE_TYPE_CATERING) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ECOMMERCE_CAFE_TYPE_CATERING);
    }
    if (null == this.ECOMMERCE_CAFE_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ECOMMERCE_CAFE_TYPE);
    }
    if (null == this.CATERING_ONLINE_DESIGNATION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CATERING_ONLINE_DESIGNATION);
    }
    if (null == this.ECOMMERCE_CATERING_HUB_PARENT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ECOMMERCE_CATERING_HUB_PARENT);
    }
    if (null == this.CATERING_ONLINE_STATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CATERING_ONLINE_STATUS);
    }
    if (null == this.ECOMMERCE_KIOSKS_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ECOMMERCE_KIOSKS_FLAG, __dataOut);
    }
    if (null == this.ECOMMERCE_RETAIL_DELIVERY_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ECOMMERCE_RETAIL_DELIVERY_FLAG, __dataOut);
    }
    if (null == this.ECOMMERCE_RETAIL_DINE_IN_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ECOMMERCE_RETAIL_DINE_IN_FLAG, __dataOut);
    }
    if (null == this.ECOMMERCE_RETAIL_PICKUP_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ECOMMERCE_RETAIL_PICKUP_FLAG, __dataOut);
    }
    if (null == this.ECOMMERCE_LAUNCH_CATERING_2_0) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ECOMMERCE_LAUNCH_CATERING_2_0.getTime());
    __dataOut.writeInt(this.ECOMMERCE_LAUNCH_CATERING_2_0.getNanos());
    }
    if (null == this.ECOMMERCE_LAUNCH_RPU) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ECOMMERCE_LAUNCH_RPU.getTime());
    __dataOut.writeInt(this.ECOMMERCE_LAUNCH_RPU.getNanos());
    }
    if (null == this.ECOMMERCE_LAUNCH_PANERA_2_0) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ECOMMERCE_LAUNCH_PANERA_2_0.getTime());
    __dataOut.writeInt(this.ECOMMERCE_LAUNCH_PANERA_2_0.getNanos());
    }
    if (null == this.ECOMMERCE_LAUNCH_DELIVERY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ECOMMERCE_LAUNCH_DELIVERY.getTime());
    __dataOut.writeInt(this.ECOMMERCE_LAUNCH_DELIVERY.getNanos());
    }
    if (null == this.ECOMMERCE_LAUNCH_DINE_IN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ECOMMERCE_LAUNCH_DINE_IN.getTime());
    __dataOut.writeInt(this.ECOMMERCE_LAUNCH_DINE_IN.getNanos());
    }
    if (null == this.ECOMMERCE_LAUNCH_KIOSKS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ECOMMERCE_LAUNCH_KIOSKS.getTime());
    __dataOut.writeInt(this.ECOMMERCE_LAUNCH_KIOSKS.getNanos());
    }
    if (null == this.LAUNCH_2_0_PERIOD_NBR_IN_EPOCH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LAUNCH_2_0_PERIOD_NBR_IN_EPOCH, __dataOut);
    }
    if (null == this.LAUNCH_2_0_WEEK_NBR_IN_EPOCH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LAUNCH_2_0_WEEK_NBR_IN_EPOCH, __dataOut);
    }
    if (null == this.LAUNCH_DEL_PERIOD_NBR_IN_EPOCH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LAUNCH_DEL_PERIOD_NBR_IN_EPOCH, __dataOut);
    }
    if (null == this.LAUNCH_DEL_WEEK_NBR_IN_EPOCH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LAUNCH_DEL_WEEK_NBR_IN_EPOCH, __dataOut);
    }
    if (null == this.CAFE_GROUP_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CAFE_GROUP_DW_ID, __dataOut);
    }
    if (null == this.DISTRIBUTION_CTR_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DISTRIBUTION_CTR_DW_ID, __dataOut);
    }
    if (null == this.DISTRICT_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DISTRICT_DESC);
    }
    if (null == this.PRIMARY_MENU_GROUP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PRIMARY_MENU_GROUP, __dataOut);
    }
    if (null == this.PRICING_TIER_GROUP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PRICING_TIER_GROUP);
    }
    if (null == this.ECOMMERCE_LAUNCH_OPS_INTEGRITY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ECOMMERCE_LAUNCH_OPS_INTEGRITY.getTime());
    __dataOut.writeInt(this.ECOMMERCE_LAUNCH_OPS_INTEGRITY.getNanos());
    }
    if (null == this.CERTIFIED_TRAINING_CAFE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CERTIFIED_TRAINING_CAFE, __dataOut);
    }
    if (null == this.COMMISSARY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.COMMISSARY_DW_ID, __dataOut);
    }
    if (null == this.COMMISSARY_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.COMMISSARY_NBR, __dataOut);
    }
    if (null == this.COMMISSARY_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COMMISSARY_NAME);
    }
    if (null == this.OPENED_DT_PERIOD_NBR_IN_EPOCH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OPENED_DT_PERIOD_NBR_IN_EPOCH, __dataOut);
    }
    if (null == this.OPENED_DT_WEEK_NBR_IN_EPOCH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OPENED_DT_WEEK_NBR_IN_EPOCH, __dataOut);
    }
    if (null == this.GL_STORE_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GL_STORE_NBR);
    }
    if (null == this.PAYROLL_PROCESSOR_BRANCH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PAYROLL_PROCESSOR_BRANCH);
    }
    if (null == this.PAYROLL_PROCESSOR_DIVISION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PAYROLL_PROCESSOR_DIVISION);
    }
    if (null == this.LOAD_DTTM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.LOAD_DTTM.getTime());
    __dataOut.writeInt(this.LOAD_DTTM.getNanos());
    }
    if (null == this.LOAD_BY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LOAD_BY);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.Z_CAFE_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Z_CAFE_DW_ID, __dataOut);
    }
    if (null == this.CAFE_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CAFE_NBR, __dataOut);
    }
    if (null == this.CAFE_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CAFE_NAME);
    }
    if (null == this.OPENED_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.OPENED_DATE.getTime());
    __dataOut.writeInt(this.OPENED_DATE.getNanos());
    }
    if (null == this.CLOSED_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CLOSED_DATE.getTime());
    __dataOut.writeInt(this.CLOSED_DATE.getNanos());
    }
    if (null == this.LOC_CURRENCY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOC_CURRENCY_DW_ID, __dataOut);
    }
    if (null == this.POS_SYSTEM_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POS_SYSTEM_TYPE);
    }
    if (null == this.POS_POLLING_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.POS_POLLING_FLAG, __dataOut);
    }
    if (null == this.TIMEZONE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TIMEZONE);
    }
    if (null == this.CAFE_DRIVETHRU_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CAFE_DRIVETHRU_FLAG, __dataOut);
    }
    if (null == this.POS_SYSTEM_UPGRADE_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.POS_SYSTEM_UPGRADE_DATE.getTime());
    __dataOut.writeInt(this.POS_SYSTEM_UPGRADE_DATE.getNanos());
    }
    if (null == this.TMX_CUTOVER_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TMX_CUTOVER_DATE.getTime());
    __dataOut.writeInt(this.TMX_CUTOVER_DATE.getNanos());
    }
    if (null == this.POSTAL_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POSTAL_CODE);
    }
    if (null == this.TMX_INTEGRATION_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TMX_INTEGRATION_DATE.getTime());
    __dataOut.writeInt(this.TMX_INTEGRATION_DATE.getNanos());
    }
    if (null == this.TMX_FORECAST_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TMX_FORECAST_DATE.getTime());
    __dataOut.writeInt(this.TMX_FORECAST_DATE.getNanos());
    }
    if (null == this.CORPORATE_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CORPORATE_FLAG);
    }
    if (null == this.RECIPE_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, RECIPE_TYPE);
    }
    if (null == this.OPEN_SUN_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OPEN_SUN_FLAG, __dataOut);
    }
    if (null == this.OPEN_MON_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OPEN_MON_FLAG, __dataOut);
    }
    if (null == this.OPEN_TUE_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OPEN_TUE_FLAG, __dataOut);
    }
    if (null == this.OPEN_WED_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OPEN_WED_FLAG, __dataOut);
    }
    if (null == this.OPEN_THUR_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OPEN_THUR_FLAG, __dataOut);
    }
    if (null == this.OPEN_FRI_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OPEN_FRI_FLAG, __dataOut);
    }
    if (null == this.OPEN_SAT_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OPEN_SAT_FLAG, __dataOut);
    }
    if (null == this.ACQUISITION_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ACQUISITION_DATE.getTime());
    __dataOut.writeInt(this.ACQUISITION_DATE.getNanos());
    }
    if (null == this.COMP_OPENED_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.COMP_OPENED_DATE.getTime());
    __dataOut.writeInt(this.COMP_OPENED_DATE.getNanos());
    }
    if (null == this.CLOSED_YEAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CLOSED_YEAR, __dataOut);
    }
    if (null == this.CAFE_SVS_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CAFE_SVS_NBR);
    }
    if (null == this.CITY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CITY);
    }
    if (null == this.STATE_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STATE_CODE);
    }
    if (null == this.ADDRESS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ADDRESS);
    }
    if (null == this.PRICE_TIER_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PRICE_TIER_CODE);
    }
    if (null == this.TAX_STATE_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TAX_STATE_CODE);
    }
    if (null == this.PHONE_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PHONE_NBR);
    }
    if (null == this.FAX_NUMBER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FAX_NUMBER);
    }
    if (null == this.BROADBAND_IP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BROADBAND_IP);
    }
    if (null == this.ROPE_IP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ROPE_IP);
    }
    if (null == this.ISP_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ISP_TYPE);
    }
    if (null == this.ISP_PROVIDER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ISP_PROVIDER);
    }
    if (null == this.FRANCHISE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FRANCHISE);
    }
    if (null == this.DISTRICT_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DISTRICT_NAME);
    }
    if (null == this.HARDWARE_SERVICE_PROVIDER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HARDWARE_SERVICE_PROVIDER);
    }
    if (null == this.PHONE_SERVICE_PROVIDER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PHONE_SERVICE_PROVIDER);
    }
    if (null == this.CAFE_STATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CAFE_STATUS);
    }
    if (null == this.CAFE_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CAFE_TYPE);
    }
    if (null == this.LOCATION_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LOCATION_TYPE);
    }
    if (null == this.SUPPORT_LEVEL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SUPPORT_LEVEL);
    }
    if (null == this.CAFE_EMAIL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CAFE_EMAIL);
    }
    if (null == this.DATABASE_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DATABASE_TYPE);
    }
    if (null == this.DATABASE_VERSION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DATABASE_VERSION);
    }
    if (null == this.SYSTEM_COORDINATOR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SYSTEM_COORDINATOR);
    }
    if (null == this.DISTRICT_NUMBER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DISTRICT_NUMBER);
    }
    if (null == this.REGION_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REGION_NAME);
    }
    if (null == this.AREA_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, AREA_NAME);
    }
    if (null == this.POS_INSTALL_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.POS_INSTALL_DATE.getTime());
    __dataOut.writeInt(this.POS_INSTALL_DATE.getNanos());
    }
    if (null == this.POS_INSTALLER_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POS_INSTALLER_NAME);
    }
    if (null == this.CABLING_INSTALLER_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CABLING_INSTALLER_NAME);
    }
    if (null == this.CREDIT_MERCHANT_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CREDIT_MERCHANT_ID);
    }
    if (null == this.NETWORK_LOCATION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, NETWORK_LOCATION);
    }
    if (null == this.VOIP_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VOIP_FLAG, __dataOut);
    }
    if (null == this.ELEARN_IP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ELEARN_IP);
    }
    if (null == this.SYSTEM_ATT_VOIP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SYSTEM_ATT_VOIP, __dataOut);
    }
    if (null == this.CAFE_AMAZON_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CAFE_AMAZON_FLAG, __dataOut);
    }
    if (null == this.CUST_FACING_DISP_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CUST_FACING_DISP_FLAG, __dataOut);
    }
    if (null == this.TABLE_SERVICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TABLE_SERVICE);
    }
    if (null == this.KDS_SCHEMES) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, KDS_SCHEMES);
    }
    if (null == this.EOU_STATUS_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.EOU_STATUS_FLAG, __dataOut);
    }
    if (null == this.SYSTEM_TMX_CUTOVER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SYSTEM_TMX_CUTOVER);
    }
    if (null == this.AREA_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, AREA_DESC);
    }
    if (null == this.DISTRICT_MGRCELL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DISTRICT_MGRCELL);
    }
    if (null == this.DISTRICT_MGREMAIL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DISTRICT_MGREMAIL);
    }
    if (null == this.DISTRICT_MGRNAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DISTRICT_MGRNAME);
    }
    if (null == this.ORG_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ORG_NAME);
    }
    if (null == this.BOH_NETWORK_IP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BOH_NETWORK_IP);
    }
    if (null == this.PHONE_SUPPORT_PROVIDER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PHONE_SUPPORT_PROVIDER);
    }
    if (null == this.ADDRESS2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ADDRESS2);
    }
    if (null == this.PHONE2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PHONE2);
    }
    if (null == this.FTA_EMAILADDR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FTA_EMAILADDR);
    }
    if (null == this.ELEARNING_IP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ELEARNING_IP);
    }
    if (null == this.NETWORK_LOCATION_SIDE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, NETWORK_LOCATION_SIDE);
    }
    if (null == this.COMPANY_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COMPANY_NAME);
    }
    if (null == this.COMPANY_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COMPANY_DESC);
    }
    if (null == this.LOY_LAUNCH_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.LOY_LAUNCH_DATE.getTime());
    __dataOut.writeInt(this.LOY_LAUNCH_DATE.getNanos());
    }
    if (null == this.MAIN_LEVEL1_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL1_NAME);
    }
    if (null == this.MAIN_LEVEL1_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL1_DESC);
    }
    if (null == this.MAIN_LEVEL1_MGR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL1_MGR_NAME);
    }
    if (null == this.MAIN_LEVEL2_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL2_NAME);
    }
    if (null == this.MAIN_LEVEL2_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL2_DESC);
    }
    if (null == this.MAIN_LEVEL2_MGR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL2_MGR_NAME);
    }
    if (null == this.MAIN_LEVEL3_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL3_NAME);
    }
    if (null == this.MAIN_LEVEL3_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL3_DESC);
    }
    if (null == this.MAIN_LEVEL3_MGR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL3_MGR_NAME);
    }
    if (null == this.MAIN_LEVEL4_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL4_NAME);
    }
    if (null == this.MAIN_LEVEL4_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL4_DESC);
    }
    if (null == this.MAIN_LEVEL4_MGR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL4_MGR_NAME);
    }
    if (null == this.MAIN_LEVEL5_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL5_NAME);
    }
    if (null == this.MAIN_LEVEL5_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL5_DESC);
    }
    if (null == this.MAIN_LEVEL5_MGR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL5_MGR_NAME);
    }
    if (null == this.MAIN_LEVEL6_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL6_NAME);
    }
    if (null == this.MAIN_LEVEL6_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL6_DESC);
    }
    if (null == this.MAIN_LEVEL6_MGR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL6_MGR_NAME);
    }
    if (null == this.MAIN_LEVEL7_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL7_NAME);
    }
    if (null == this.MAIN_LEVEL7_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL7_DESC);
    }
    if (null == this.MAIN_LEVEL7_MGR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL7_MGR_NAME);
    }
    if (null == this.MAIN_LEVEL8_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL8_NAME);
    }
    if (null == this.MAIN_LEVEL8_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL8_DESC);
    }
    if (null == this.MAIN_LEVEL8_MGR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL8_MGR_NAME);
    }
    if (null == this.MAIN_LEVEL9_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL9_NAME);
    }
    if (null == this.MAIN_LEVEL9_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL9_DESC);
    }
    if (null == this.MAIN_LEVEL9_MGR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL9_MGR_NAME);
    }
    if (null == this.MAIN_LEVEL10_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL10_NAME);
    }
    if (null == this.MAIN_LEVEL10_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL10_DESC);
    }
    if (null == this.MAIN_LEVEL10_MGR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_LEVEL10_MGR_NAME);
    }
    if (null == this.FILE_DTTM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FILE_DTTM.getTime());
    __dataOut.writeInt(this.FILE_DTTM.getNanos());
    }
    if (null == this.INSERT_DTTM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.INSERT_DTTM.getTime());
    __dataOut.writeInt(this.INSERT_DTTM.getNanos());
    }
    if (null == this.UPDATE_DTTM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.UPDATE_DTTM.getTime());
    __dataOut.writeInt(this.UPDATE_DTTM.getNanos());
    }
    if (null == this.LOAD_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOAD_DW_ID, __dataOut);
    }
    if (null == this.VERSION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VERSION, __dataOut);
    }
    if (null == this.COUNTRY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.COUNTRY_DW_ID, __dataOut);
    }
    if (null == this.COMPANY_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.COMPANY_ID, __dataOut);
    }
    if (null == this.COMPANY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.COMPANY_DW_ID, __dataOut);
    }
    if (null == this.CAFE_MANAGER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CAFE_MANAGER);
    }
    if (null == this.CATERING_COORDINATORS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CATERING_COORDINATORS);
    }
    if (null == this.MARKET_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MARKET_NAME);
    }
    if (null == this.YEAR_BASE_CAFE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.YEAR_BASE_CAFE, __dataOut);
    }
    if (null == this.MARKETING_LOCATION_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MARKETING_LOCATION_DW_ID, __dataOut);
    }
    if (null == this.DMA_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DMA_NAME);
    }
    if (null == this.LABOR_INVESTMENT_AMT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LABOR_INVESTMENT_AMT, __dataOut);
    }
    if (null == this.CATERING_RCSM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CATERING_RCSM);
    }
    if (null == this.CATERING_SR_RCSM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CATERING_SR_RCSM);
    }
    if (null == this.PANERA_2_0_STATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PANERA_2_0_STATUS, __dataOut);
    }
    if (null == this.RPU_STATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.RPU_STATUS, __dataOut);
    }
    if (null == this.HUB_CLUSTER_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HUB_CLUSTER_NAME);
    }
    if (null == this.HUB_CLUSTER_CLASS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HUB_CLUSTER_CLASS);
    }
    if (null == this.ECOMMERCE_CAFE_TYPE_CATERING) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ECOMMERCE_CAFE_TYPE_CATERING);
    }
    if (null == this.ECOMMERCE_CAFE_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ECOMMERCE_CAFE_TYPE);
    }
    if (null == this.CATERING_ONLINE_DESIGNATION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CATERING_ONLINE_DESIGNATION);
    }
    if (null == this.ECOMMERCE_CATERING_HUB_PARENT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ECOMMERCE_CATERING_HUB_PARENT);
    }
    if (null == this.CATERING_ONLINE_STATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CATERING_ONLINE_STATUS);
    }
    if (null == this.ECOMMERCE_KIOSKS_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ECOMMERCE_KIOSKS_FLAG, __dataOut);
    }
    if (null == this.ECOMMERCE_RETAIL_DELIVERY_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ECOMMERCE_RETAIL_DELIVERY_FLAG, __dataOut);
    }
    if (null == this.ECOMMERCE_RETAIL_DINE_IN_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ECOMMERCE_RETAIL_DINE_IN_FLAG, __dataOut);
    }
    if (null == this.ECOMMERCE_RETAIL_PICKUP_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ECOMMERCE_RETAIL_PICKUP_FLAG, __dataOut);
    }
    if (null == this.ECOMMERCE_LAUNCH_CATERING_2_0) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ECOMMERCE_LAUNCH_CATERING_2_0.getTime());
    __dataOut.writeInt(this.ECOMMERCE_LAUNCH_CATERING_2_0.getNanos());
    }
    if (null == this.ECOMMERCE_LAUNCH_RPU) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ECOMMERCE_LAUNCH_RPU.getTime());
    __dataOut.writeInt(this.ECOMMERCE_LAUNCH_RPU.getNanos());
    }
    if (null == this.ECOMMERCE_LAUNCH_PANERA_2_0) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ECOMMERCE_LAUNCH_PANERA_2_0.getTime());
    __dataOut.writeInt(this.ECOMMERCE_LAUNCH_PANERA_2_0.getNanos());
    }
    if (null == this.ECOMMERCE_LAUNCH_DELIVERY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ECOMMERCE_LAUNCH_DELIVERY.getTime());
    __dataOut.writeInt(this.ECOMMERCE_LAUNCH_DELIVERY.getNanos());
    }
    if (null == this.ECOMMERCE_LAUNCH_DINE_IN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ECOMMERCE_LAUNCH_DINE_IN.getTime());
    __dataOut.writeInt(this.ECOMMERCE_LAUNCH_DINE_IN.getNanos());
    }
    if (null == this.ECOMMERCE_LAUNCH_KIOSKS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ECOMMERCE_LAUNCH_KIOSKS.getTime());
    __dataOut.writeInt(this.ECOMMERCE_LAUNCH_KIOSKS.getNanos());
    }
    if (null == this.LAUNCH_2_0_PERIOD_NBR_IN_EPOCH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LAUNCH_2_0_PERIOD_NBR_IN_EPOCH, __dataOut);
    }
    if (null == this.LAUNCH_2_0_WEEK_NBR_IN_EPOCH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LAUNCH_2_0_WEEK_NBR_IN_EPOCH, __dataOut);
    }
    if (null == this.LAUNCH_DEL_PERIOD_NBR_IN_EPOCH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LAUNCH_DEL_PERIOD_NBR_IN_EPOCH, __dataOut);
    }
    if (null == this.LAUNCH_DEL_WEEK_NBR_IN_EPOCH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LAUNCH_DEL_WEEK_NBR_IN_EPOCH, __dataOut);
    }
    if (null == this.CAFE_GROUP_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CAFE_GROUP_DW_ID, __dataOut);
    }
    if (null == this.DISTRIBUTION_CTR_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DISTRIBUTION_CTR_DW_ID, __dataOut);
    }
    if (null == this.DISTRICT_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DISTRICT_DESC);
    }
    if (null == this.PRIMARY_MENU_GROUP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PRIMARY_MENU_GROUP, __dataOut);
    }
    if (null == this.PRICING_TIER_GROUP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PRICING_TIER_GROUP);
    }
    if (null == this.ECOMMERCE_LAUNCH_OPS_INTEGRITY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ECOMMERCE_LAUNCH_OPS_INTEGRITY.getTime());
    __dataOut.writeInt(this.ECOMMERCE_LAUNCH_OPS_INTEGRITY.getNanos());
    }
    if (null == this.CERTIFIED_TRAINING_CAFE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CERTIFIED_TRAINING_CAFE, __dataOut);
    }
    if (null == this.COMMISSARY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.COMMISSARY_DW_ID, __dataOut);
    }
    if (null == this.COMMISSARY_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.COMMISSARY_NBR, __dataOut);
    }
    if (null == this.COMMISSARY_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COMMISSARY_NAME);
    }
    if (null == this.OPENED_DT_PERIOD_NBR_IN_EPOCH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OPENED_DT_PERIOD_NBR_IN_EPOCH, __dataOut);
    }
    if (null == this.OPENED_DT_WEEK_NBR_IN_EPOCH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OPENED_DT_WEEK_NBR_IN_EPOCH, __dataOut);
    }
    if (null == this.GL_STORE_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GL_STORE_NBR);
    }
    if (null == this.PAYROLL_PROCESSOR_BRANCH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PAYROLL_PROCESSOR_BRANCH);
    }
    if (null == this.PAYROLL_PROCESSOR_DIVISION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PAYROLL_PROCESSOR_DIVISION);
    }
    if (null == this.LOAD_DTTM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.LOAD_DTTM.getTime());
    __dataOut.writeInt(this.LOAD_DTTM.getNanos());
    }
    if (null == this.LOAD_BY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LOAD_BY);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(Z_CAFE_DW_ID==null?"\\N":Z_CAFE_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAFE_NBR==null?"\\N":CAFE_NBR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CAFE_NAME==null?"\\N":CAFE_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPENED_DATE==null?"\\N":"" + OPENED_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CLOSED_DATE==null?"\\N":"" + CLOSED_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOC_CURRENCY_DW_ID==null?"\\N":LOC_CURRENCY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(POS_SYSTEM_TYPE==null?"\\N":POS_SYSTEM_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POS_POLLING_FLAG==null?"\\N":POS_POLLING_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(TIMEZONE==null?"\\N":TIMEZONE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAFE_DRIVETHRU_FLAG==null?"\\N":CAFE_DRIVETHRU_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POS_SYSTEM_UPGRADE_DATE==null?"\\N":"" + POS_SYSTEM_UPGRADE_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TMX_CUTOVER_DATE==null?"\\N":"" + TMX_CUTOVER_DATE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(POSTAL_CODE==null?"\\N":POSTAL_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TMX_INTEGRATION_DATE==null?"\\N":"" + TMX_INTEGRATION_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TMX_FORECAST_DATE==null?"\\N":"" + TMX_FORECAST_DATE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CORPORATE_FLAG==null?"\\N":CORPORATE_FLAG, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(RECIPE_TYPE==null?"\\N":RECIPE_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPEN_SUN_FLAG==null?"\\N":OPEN_SUN_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPEN_MON_FLAG==null?"\\N":OPEN_MON_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPEN_TUE_FLAG==null?"\\N":OPEN_TUE_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPEN_WED_FLAG==null?"\\N":OPEN_WED_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPEN_THUR_FLAG==null?"\\N":OPEN_THUR_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPEN_FRI_FLAG==null?"\\N":OPEN_FRI_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPEN_SAT_FLAG==null?"\\N":OPEN_SAT_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACQUISITION_DATE==null?"\\N":"" + ACQUISITION_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COMP_OPENED_DATE==null?"\\N":"" + COMP_OPENED_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CLOSED_YEAR==null?"\\N":CLOSED_YEAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CAFE_SVS_NBR==null?"\\N":CAFE_SVS_NBR, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CITY==null?"\\N":CITY, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(STATE_CODE==null?"\\N":STATE_CODE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(ADDRESS==null?"\\N":ADDRESS, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(PRICE_TIER_CODE==null?"\\N":PRICE_TIER_CODE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(TAX_STATE_CODE==null?"\\N":TAX_STATE_CODE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(PHONE_NBR==null?"\\N":PHONE_NBR, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(FAX_NUMBER==null?"\\N":FAX_NUMBER, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(BROADBAND_IP==null?"\\N":BROADBAND_IP, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(ROPE_IP==null?"\\N":ROPE_IP, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(ISP_TYPE==null?"\\N":ISP_TYPE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(ISP_PROVIDER==null?"\\N":ISP_PROVIDER, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(FRANCHISE==null?"\\N":FRANCHISE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(DISTRICT_NAME==null?"\\N":DISTRICT_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(HARDWARE_SERVICE_PROVIDER==null?"\\N":HARDWARE_SERVICE_PROVIDER, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(PHONE_SERVICE_PROVIDER==null?"\\N":PHONE_SERVICE_PROVIDER, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CAFE_STATUS==null?"\\N":CAFE_STATUS, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CAFE_TYPE==null?"\\N":CAFE_TYPE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(LOCATION_TYPE==null?"\\N":LOCATION_TYPE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(SUPPORT_LEVEL==null?"\\N":SUPPORT_LEVEL, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CAFE_EMAIL==null?"\\N":CAFE_EMAIL, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(DATABASE_TYPE==null?"\\N":DATABASE_TYPE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(DATABASE_VERSION==null?"\\N":DATABASE_VERSION, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(SYSTEM_COORDINATOR==null?"\\N":SYSTEM_COORDINATOR, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(DISTRICT_NUMBER==null?"\\N":DISTRICT_NUMBER, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(REGION_NAME==null?"\\N":REGION_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(AREA_NAME==null?"\\N":AREA_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POS_INSTALL_DATE==null?"\\N":"" + POS_INSTALL_DATE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(POS_INSTALLER_NAME==null?"\\N":POS_INSTALLER_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CABLING_INSTALLER_NAME==null?"\\N":CABLING_INSTALLER_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CREDIT_MERCHANT_ID==null?"\\N":CREDIT_MERCHANT_ID, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(NETWORK_LOCATION==null?"\\N":NETWORK_LOCATION, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VOIP_FLAG==null?"\\N":VOIP_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(ELEARN_IP==null?"\\N":ELEARN_IP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SYSTEM_ATT_VOIP==null?"\\N":SYSTEM_ATT_VOIP.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAFE_AMAZON_FLAG==null?"\\N":CAFE_AMAZON_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUST_FACING_DISP_FLAG==null?"\\N":CUST_FACING_DISP_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(TABLE_SERVICE==null?"\\N":TABLE_SERVICE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(KDS_SCHEMES==null?"\\N":KDS_SCHEMES, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EOU_STATUS_FLAG==null?"\\N":EOU_STATUS_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(SYSTEM_TMX_CUTOVER==null?"\\N":SYSTEM_TMX_CUTOVER, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(AREA_DESC==null?"\\N":AREA_DESC, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(DISTRICT_MGRCELL==null?"\\N":DISTRICT_MGRCELL, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(DISTRICT_MGREMAIL==null?"\\N":DISTRICT_MGREMAIL, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(DISTRICT_MGRNAME==null?"\\N":DISTRICT_MGRNAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(ORG_NAME==null?"\\N":ORG_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(BOH_NETWORK_IP==null?"\\N":BOH_NETWORK_IP, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(PHONE_SUPPORT_PROVIDER==null?"\\N":PHONE_SUPPORT_PROVIDER, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(ADDRESS2==null?"\\N":ADDRESS2, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(PHONE2==null?"\\N":PHONE2, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(FTA_EMAILADDR==null?"\\N":FTA_EMAILADDR, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(ELEARNING_IP==null?"\\N":ELEARNING_IP, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(NETWORK_LOCATION_SIDE==null?"\\N":NETWORK_LOCATION_SIDE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(COMPANY_NAME==null?"\\N":COMPANY_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(COMPANY_DESC==null?"\\N":COMPANY_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOY_LAUNCH_DATE==null?"\\N":"" + LOY_LAUNCH_DATE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL1_NAME==null?"\\N":MAIN_LEVEL1_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL1_DESC==null?"\\N":MAIN_LEVEL1_DESC, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL1_MGR_NAME==null?"\\N":MAIN_LEVEL1_MGR_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL2_NAME==null?"\\N":MAIN_LEVEL2_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL2_DESC==null?"\\N":MAIN_LEVEL2_DESC, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL2_MGR_NAME==null?"\\N":MAIN_LEVEL2_MGR_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL3_NAME==null?"\\N":MAIN_LEVEL3_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL3_DESC==null?"\\N":MAIN_LEVEL3_DESC, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL3_MGR_NAME==null?"\\N":MAIN_LEVEL3_MGR_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL4_NAME==null?"\\N":MAIN_LEVEL4_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL4_DESC==null?"\\N":MAIN_LEVEL4_DESC, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL4_MGR_NAME==null?"\\N":MAIN_LEVEL4_MGR_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL5_NAME==null?"\\N":MAIN_LEVEL5_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL5_DESC==null?"\\N":MAIN_LEVEL5_DESC, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL5_MGR_NAME==null?"\\N":MAIN_LEVEL5_MGR_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL6_NAME==null?"\\N":MAIN_LEVEL6_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL6_DESC==null?"\\N":MAIN_LEVEL6_DESC, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL6_MGR_NAME==null?"\\N":MAIN_LEVEL6_MGR_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL7_NAME==null?"\\N":MAIN_LEVEL7_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL7_DESC==null?"\\N":MAIN_LEVEL7_DESC, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL7_MGR_NAME==null?"\\N":MAIN_LEVEL7_MGR_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL8_NAME==null?"\\N":MAIN_LEVEL8_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL8_DESC==null?"\\N":MAIN_LEVEL8_DESC, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL8_MGR_NAME==null?"\\N":MAIN_LEVEL8_MGR_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL9_NAME==null?"\\N":MAIN_LEVEL9_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL9_DESC==null?"\\N":MAIN_LEVEL9_DESC, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL9_MGR_NAME==null?"\\N":MAIN_LEVEL9_MGR_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL10_NAME==null?"\\N":MAIN_LEVEL10_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL10_DESC==null?"\\N":MAIN_LEVEL10_DESC, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL10_MGR_NAME==null?"\\N":MAIN_LEVEL10_MGR_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FILE_DTTM==null?"\\N":"" + FILE_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INSERT_DTTM==null?"\\N":"" + INSERT_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UPDATE_DTTM==null?"\\N":"" + UPDATE_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOAD_DW_ID==null?"\\N":LOAD_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERSION==null?"\\N":VERSION.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COUNTRY_DW_ID==null?"\\N":COUNTRY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COMPANY_ID==null?"\\N":COMPANY_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COMPANY_DW_ID==null?"\\N":COMPANY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CAFE_MANAGER==null?"\\N":CAFE_MANAGER, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CATERING_COORDINATORS==null?"\\N":CATERING_COORDINATORS, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MARKET_NAME==null?"\\N":MARKET_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YEAR_BASE_CAFE==null?"\\N":YEAR_BASE_CAFE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MARKETING_LOCATION_DW_ID==null?"\\N":MARKETING_LOCATION_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(DMA_NAME==null?"\\N":DMA_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LABOR_INVESTMENT_AMT==null?"\\N":LABOR_INVESTMENT_AMT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CATERING_RCSM==null?"\\N":CATERING_RCSM, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CATERING_SR_RCSM==null?"\\N":CATERING_SR_RCSM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PANERA_2_0_STATUS==null?"\\N":PANERA_2_0_STATUS.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RPU_STATUS==null?"\\N":RPU_STATUS.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(HUB_CLUSTER_NAME==null?"\\N":HUB_CLUSTER_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(HUB_CLUSTER_CLASS==null?"\\N":HUB_CLUSTER_CLASS, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(ECOMMERCE_CAFE_TYPE_CATERING==null?"\\N":ECOMMERCE_CAFE_TYPE_CATERING, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(ECOMMERCE_CAFE_TYPE==null?"\\N":ECOMMERCE_CAFE_TYPE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CATERING_ONLINE_DESIGNATION==null?"\\N":CATERING_ONLINE_DESIGNATION, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(ECOMMERCE_CATERING_HUB_PARENT==null?"\\N":ECOMMERCE_CATERING_HUB_PARENT, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CATERING_ONLINE_STATUS==null?"\\N":CATERING_ONLINE_STATUS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ECOMMERCE_KIOSKS_FLAG==null?"\\N":ECOMMERCE_KIOSKS_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ECOMMERCE_RETAIL_DELIVERY_FLAG==null?"\\N":ECOMMERCE_RETAIL_DELIVERY_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ECOMMERCE_RETAIL_DINE_IN_FLAG==null?"\\N":ECOMMERCE_RETAIL_DINE_IN_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ECOMMERCE_RETAIL_PICKUP_FLAG==null?"\\N":ECOMMERCE_RETAIL_PICKUP_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ECOMMERCE_LAUNCH_CATERING_2_0==null?"\\N":"" + ECOMMERCE_LAUNCH_CATERING_2_0, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ECOMMERCE_LAUNCH_RPU==null?"\\N":"" + ECOMMERCE_LAUNCH_RPU, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ECOMMERCE_LAUNCH_PANERA_2_0==null?"\\N":"" + ECOMMERCE_LAUNCH_PANERA_2_0, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ECOMMERCE_LAUNCH_DELIVERY==null?"\\N":"" + ECOMMERCE_LAUNCH_DELIVERY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ECOMMERCE_LAUNCH_DINE_IN==null?"\\N":"" + ECOMMERCE_LAUNCH_DINE_IN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ECOMMERCE_LAUNCH_KIOSKS==null?"\\N":"" + ECOMMERCE_LAUNCH_KIOSKS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAUNCH_2_0_PERIOD_NBR_IN_EPOCH==null?"\\N":LAUNCH_2_0_PERIOD_NBR_IN_EPOCH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAUNCH_2_0_WEEK_NBR_IN_EPOCH==null?"\\N":LAUNCH_2_0_WEEK_NBR_IN_EPOCH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAUNCH_DEL_PERIOD_NBR_IN_EPOCH==null?"\\N":LAUNCH_DEL_PERIOD_NBR_IN_EPOCH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAUNCH_DEL_WEEK_NBR_IN_EPOCH==null?"\\N":LAUNCH_DEL_WEEK_NBR_IN_EPOCH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAFE_GROUP_DW_ID==null?"\\N":CAFE_GROUP_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DISTRIBUTION_CTR_DW_ID==null?"\\N":DISTRIBUTION_CTR_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(DISTRICT_DESC==null?"\\N":DISTRICT_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRIMARY_MENU_GROUP==null?"\\N":PRIMARY_MENU_GROUP.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(PRICING_TIER_GROUP==null?"\\N":PRICING_TIER_GROUP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ECOMMERCE_LAUNCH_OPS_INTEGRITY==null?"\\N":"" + ECOMMERCE_LAUNCH_OPS_INTEGRITY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CERTIFIED_TRAINING_CAFE==null?"\\N":CERTIFIED_TRAINING_CAFE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COMMISSARY_DW_ID==null?"\\N":COMMISSARY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COMMISSARY_NBR==null?"\\N":COMMISSARY_NBR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(COMMISSARY_NAME==null?"\\N":COMMISSARY_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPENED_DT_PERIOD_NBR_IN_EPOCH==null?"\\N":OPENED_DT_PERIOD_NBR_IN_EPOCH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPENED_DT_WEEK_NBR_IN_EPOCH==null?"\\N":OPENED_DT_WEEK_NBR_IN_EPOCH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(GL_STORE_NBR==null?"\\N":GL_STORE_NBR, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(PAYROLL_PROCESSOR_BRANCH==null?"\\N":PAYROLL_PROCESSOR_BRANCH, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(PAYROLL_PROCESSOR_DIVISION==null?"\\N":PAYROLL_PROCESSOR_DIVISION, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOAD_DTTM==null?"\\N":"" + LOAD_DTTM, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(LOAD_BY==null?"\\N":LOAD_BY, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(Z_CAFE_DW_ID==null?"\\N":Z_CAFE_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAFE_NBR==null?"\\N":CAFE_NBR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CAFE_NAME==null?"\\N":CAFE_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPENED_DATE==null?"\\N":"" + OPENED_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CLOSED_DATE==null?"\\N":"" + CLOSED_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOC_CURRENCY_DW_ID==null?"\\N":LOC_CURRENCY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(POS_SYSTEM_TYPE==null?"\\N":POS_SYSTEM_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POS_POLLING_FLAG==null?"\\N":POS_POLLING_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(TIMEZONE==null?"\\N":TIMEZONE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAFE_DRIVETHRU_FLAG==null?"\\N":CAFE_DRIVETHRU_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POS_SYSTEM_UPGRADE_DATE==null?"\\N":"" + POS_SYSTEM_UPGRADE_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TMX_CUTOVER_DATE==null?"\\N":"" + TMX_CUTOVER_DATE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(POSTAL_CODE==null?"\\N":POSTAL_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TMX_INTEGRATION_DATE==null?"\\N":"" + TMX_INTEGRATION_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TMX_FORECAST_DATE==null?"\\N":"" + TMX_FORECAST_DATE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CORPORATE_FLAG==null?"\\N":CORPORATE_FLAG, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(RECIPE_TYPE==null?"\\N":RECIPE_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPEN_SUN_FLAG==null?"\\N":OPEN_SUN_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPEN_MON_FLAG==null?"\\N":OPEN_MON_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPEN_TUE_FLAG==null?"\\N":OPEN_TUE_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPEN_WED_FLAG==null?"\\N":OPEN_WED_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPEN_THUR_FLAG==null?"\\N":OPEN_THUR_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPEN_FRI_FLAG==null?"\\N":OPEN_FRI_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPEN_SAT_FLAG==null?"\\N":OPEN_SAT_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACQUISITION_DATE==null?"\\N":"" + ACQUISITION_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COMP_OPENED_DATE==null?"\\N":"" + COMP_OPENED_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CLOSED_YEAR==null?"\\N":CLOSED_YEAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CAFE_SVS_NBR==null?"\\N":CAFE_SVS_NBR, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CITY==null?"\\N":CITY, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(STATE_CODE==null?"\\N":STATE_CODE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(ADDRESS==null?"\\N":ADDRESS, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(PRICE_TIER_CODE==null?"\\N":PRICE_TIER_CODE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(TAX_STATE_CODE==null?"\\N":TAX_STATE_CODE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(PHONE_NBR==null?"\\N":PHONE_NBR, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(FAX_NUMBER==null?"\\N":FAX_NUMBER, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(BROADBAND_IP==null?"\\N":BROADBAND_IP, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(ROPE_IP==null?"\\N":ROPE_IP, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(ISP_TYPE==null?"\\N":ISP_TYPE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(ISP_PROVIDER==null?"\\N":ISP_PROVIDER, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(FRANCHISE==null?"\\N":FRANCHISE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(DISTRICT_NAME==null?"\\N":DISTRICT_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(HARDWARE_SERVICE_PROVIDER==null?"\\N":HARDWARE_SERVICE_PROVIDER, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(PHONE_SERVICE_PROVIDER==null?"\\N":PHONE_SERVICE_PROVIDER, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CAFE_STATUS==null?"\\N":CAFE_STATUS, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CAFE_TYPE==null?"\\N":CAFE_TYPE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(LOCATION_TYPE==null?"\\N":LOCATION_TYPE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(SUPPORT_LEVEL==null?"\\N":SUPPORT_LEVEL, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CAFE_EMAIL==null?"\\N":CAFE_EMAIL, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(DATABASE_TYPE==null?"\\N":DATABASE_TYPE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(DATABASE_VERSION==null?"\\N":DATABASE_VERSION, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(SYSTEM_COORDINATOR==null?"\\N":SYSTEM_COORDINATOR, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(DISTRICT_NUMBER==null?"\\N":DISTRICT_NUMBER, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(REGION_NAME==null?"\\N":REGION_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(AREA_NAME==null?"\\N":AREA_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POS_INSTALL_DATE==null?"\\N":"" + POS_INSTALL_DATE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(POS_INSTALLER_NAME==null?"\\N":POS_INSTALLER_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CABLING_INSTALLER_NAME==null?"\\N":CABLING_INSTALLER_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CREDIT_MERCHANT_ID==null?"\\N":CREDIT_MERCHANT_ID, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(NETWORK_LOCATION==null?"\\N":NETWORK_LOCATION, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VOIP_FLAG==null?"\\N":VOIP_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(ELEARN_IP==null?"\\N":ELEARN_IP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SYSTEM_ATT_VOIP==null?"\\N":SYSTEM_ATT_VOIP.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAFE_AMAZON_FLAG==null?"\\N":CAFE_AMAZON_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUST_FACING_DISP_FLAG==null?"\\N":CUST_FACING_DISP_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(TABLE_SERVICE==null?"\\N":TABLE_SERVICE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(KDS_SCHEMES==null?"\\N":KDS_SCHEMES, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EOU_STATUS_FLAG==null?"\\N":EOU_STATUS_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(SYSTEM_TMX_CUTOVER==null?"\\N":SYSTEM_TMX_CUTOVER, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(AREA_DESC==null?"\\N":AREA_DESC, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(DISTRICT_MGRCELL==null?"\\N":DISTRICT_MGRCELL, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(DISTRICT_MGREMAIL==null?"\\N":DISTRICT_MGREMAIL, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(DISTRICT_MGRNAME==null?"\\N":DISTRICT_MGRNAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(ORG_NAME==null?"\\N":ORG_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(BOH_NETWORK_IP==null?"\\N":BOH_NETWORK_IP, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(PHONE_SUPPORT_PROVIDER==null?"\\N":PHONE_SUPPORT_PROVIDER, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(ADDRESS2==null?"\\N":ADDRESS2, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(PHONE2==null?"\\N":PHONE2, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(FTA_EMAILADDR==null?"\\N":FTA_EMAILADDR, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(ELEARNING_IP==null?"\\N":ELEARNING_IP, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(NETWORK_LOCATION_SIDE==null?"\\N":NETWORK_LOCATION_SIDE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(COMPANY_NAME==null?"\\N":COMPANY_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(COMPANY_DESC==null?"\\N":COMPANY_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOY_LAUNCH_DATE==null?"\\N":"" + LOY_LAUNCH_DATE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL1_NAME==null?"\\N":MAIN_LEVEL1_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL1_DESC==null?"\\N":MAIN_LEVEL1_DESC, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL1_MGR_NAME==null?"\\N":MAIN_LEVEL1_MGR_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL2_NAME==null?"\\N":MAIN_LEVEL2_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL2_DESC==null?"\\N":MAIN_LEVEL2_DESC, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL2_MGR_NAME==null?"\\N":MAIN_LEVEL2_MGR_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL3_NAME==null?"\\N":MAIN_LEVEL3_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL3_DESC==null?"\\N":MAIN_LEVEL3_DESC, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL3_MGR_NAME==null?"\\N":MAIN_LEVEL3_MGR_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL4_NAME==null?"\\N":MAIN_LEVEL4_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL4_DESC==null?"\\N":MAIN_LEVEL4_DESC, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL4_MGR_NAME==null?"\\N":MAIN_LEVEL4_MGR_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL5_NAME==null?"\\N":MAIN_LEVEL5_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL5_DESC==null?"\\N":MAIN_LEVEL5_DESC, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL5_MGR_NAME==null?"\\N":MAIN_LEVEL5_MGR_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL6_NAME==null?"\\N":MAIN_LEVEL6_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL6_DESC==null?"\\N":MAIN_LEVEL6_DESC, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL6_MGR_NAME==null?"\\N":MAIN_LEVEL6_MGR_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL7_NAME==null?"\\N":MAIN_LEVEL7_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL7_DESC==null?"\\N":MAIN_LEVEL7_DESC, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL7_MGR_NAME==null?"\\N":MAIN_LEVEL7_MGR_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL8_NAME==null?"\\N":MAIN_LEVEL8_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL8_DESC==null?"\\N":MAIN_LEVEL8_DESC, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL8_MGR_NAME==null?"\\N":MAIN_LEVEL8_MGR_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL9_NAME==null?"\\N":MAIN_LEVEL9_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL9_DESC==null?"\\N":MAIN_LEVEL9_DESC, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL9_MGR_NAME==null?"\\N":MAIN_LEVEL9_MGR_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL10_NAME==null?"\\N":MAIN_LEVEL10_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL10_DESC==null?"\\N":MAIN_LEVEL10_DESC, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MAIN_LEVEL10_MGR_NAME==null?"\\N":MAIN_LEVEL10_MGR_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FILE_DTTM==null?"\\N":"" + FILE_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INSERT_DTTM==null?"\\N":"" + INSERT_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UPDATE_DTTM==null?"\\N":"" + UPDATE_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOAD_DW_ID==null?"\\N":LOAD_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERSION==null?"\\N":VERSION.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COUNTRY_DW_ID==null?"\\N":COUNTRY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COMPANY_ID==null?"\\N":COMPANY_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COMPANY_DW_ID==null?"\\N":COMPANY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CAFE_MANAGER==null?"\\N":CAFE_MANAGER, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CATERING_COORDINATORS==null?"\\N":CATERING_COORDINATORS, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(MARKET_NAME==null?"\\N":MARKET_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YEAR_BASE_CAFE==null?"\\N":YEAR_BASE_CAFE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MARKETING_LOCATION_DW_ID==null?"\\N":MARKETING_LOCATION_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(DMA_NAME==null?"\\N":DMA_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LABOR_INVESTMENT_AMT==null?"\\N":LABOR_INVESTMENT_AMT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CATERING_RCSM==null?"\\N":CATERING_RCSM, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CATERING_SR_RCSM==null?"\\N":CATERING_SR_RCSM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PANERA_2_0_STATUS==null?"\\N":PANERA_2_0_STATUS.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RPU_STATUS==null?"\\N":RPU_STATUS.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(HUB_CLUSTER_NAME==null?"\\N":HUB_CLUSTER_NAME, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(HUB_CLUSTER_CLASS==null?"\\N":HUB_CLUSTER_CLASS, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(ECOMMERCE_CAFE_TYPE_CATERING==null?"\\N":ECOMMERCE_CAFE_TYPE_CATERING, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(ECOMMERCE_CAFE_TYPE==null?"\\N":ECOMMERCE_CAFE_TYPE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CATERING_ONLINE_DESIGNATION==null?"\\N":CATERING_ONLINE_DESIGNATION, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(ECOMMERCE_CATERING_HUB_PARENT==null?"\\N":ECOMMERCE_CATERING_HUB_PARENT, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(CATERING_ONLINE_STATUS==null?"\\N":CATERING_ONLINE_STATUS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ECOMMERCE_KIOSKS_FLAG==null?"\\N":ECOMMERCE_KIOSKS_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ECOMMERCE_RETAIL_DELIVERY_FLAG==null?"\\N":ECOMMERCE_RETAIL_DELIVERY_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ECOMMERCE_RETAIL_DINE_IN_FLAG==null?"\\N":ECOMMERCE_RETAIL_DINE_IN_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ECOMMERCE_RETAIL_PICKUP_FLAG==null?"\\N":ECOMMERCE_RETAIL_PICKUP_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ECOMMERCE_LAUNCH_CATERING_2_0==null?"\\N":"" + ECOMMERCE_LAUNCH_CATERING_2_0, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ECOMMERCE_LAUNCH_RPU==null?"\\N":"" + ECOMMERCE_LAUNCH_RPU, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ECOMMERCE_LAUNCH_PANERA_2_0==null?"\\N":"" + ECOMMERCE_LAUNCH_PANERA_2_0, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ECOMMERCE_LAUNCH_DELIVERY==null?"\\N":"" + ECOMMERCE_LAUNCH_DELIVERY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ECOMMERCE_LAUNCH_DINE_IN==null?"\\N":"" + ECOMMERCE_LAUNCH_DINE_IN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ECOMMERCE_LAUNCH_KIOSKS==null?"\\N":"" + ECOMMERCE_LAUNCH_KIOSKS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAUNCH_2_0_PERIOD_NBR_IN_EPOCH==null?"\\N":LAUNCH_2_0_PERIOD_NBR_IN_EPOCH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAUNCH_2_0_WEEK_NBR_IN_EPOCH==null?"\\N":LAUNCH_2_0_WEEK_NBR_IN_EPOCH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAUNCH_DEL_PERIOD_NBR_IN_EPOCH==null?"\\N":LAUNCH_DEL_PERIOD_NBR_IN_EPOCH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAUNCH_DEL_WEEK_NBR_IN_EPOCH==null?"\\N":LAUNCH_DEL_WEEK_NBR_IN_EPOCH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAFE_GROUP_DW_ID==null?"\\N":CAFE_GROUP_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DISTRIBUTION_CTR_DW_ID==null?"\\N":DISTRIBUTION_CTR_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(DISTRICT_DESC==null?"\\N":DISTRICT_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRIMARY_MENU_GROUP==null?"\\N":PRIMARY_MENU_GROUP.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(PRICING_TIER_GROUP==null?"\\N":PRICING_TIER_GROUP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ECOMMERCE_LAUNCH_OPS_INTEGRITY==null?"\\N":"" + ECOMMERCE_LAUNCH_OPS_INTEGRITY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CERTIFIED_TRAINING_CAFE==null?"\\N":CERTIFIED_TRAINING_CAFE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COMMISSARY_DW_ID==null?"\\N":COMMISSARY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COMMISSARY_NBR==null?"\\N":COMMISSARY_NBR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(COMMISSARY_NAME==null?"\\N":COMMISSARY_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPENED_DT_PERIOD_NBR_IN_EPOCH==null?"\\N":OPENED_DT_PERIOD_NBR_IN_EPOCH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPENED_DT_WEEK_NBR_IN_EPOCH==null?"\\N":OPENED_DT_WEEK_NBR_IN_EPOCH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(GL_STORE_NBR==null?"\\N":GL_STORE_NBR, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(PAYROLL_PROCESSOR_BRANCH==null?"\\N":PAYROLL_PROCESSOR_BRANCH, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(PAYROLL_PROCESSOR_DIVISION==null?"\\N":PAYROLL_PROCESSOR_DIVISION, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOAD_DTTM==null?"\\N":"" + LOAD_DTTM, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(LOAD_BY==null?"\\N":LOAD_BY, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Z_CAFE_DW_ID = null; } else {
      this.Z_CAFE_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CAFE_NBR = null; } else {
      this.CAFE_NBR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CAFE_NAME = null; } else {
      this.CAFE_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPENED_DATE = null; } else {
      this.OPENED_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CLOSED_DATE = null; } else {
      this.CLOSED_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LOC_CURRENCY_DW_ID = null; } else {
      this.LOC_CURRENCY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POS_SYSTEM_TYPE = null; } else {
      this.POS_SYSTEM_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.POS_POLLING_FLAG = null; } else {
      this.POS_POLLING_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TIMEZONE = null; } else {
      this.TIMEZONE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CAFE_DRIVETHRU_FLAG = null; } else {
      this.CAFE_DRIVETHRU_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.POS_SYSTEM_UPGRADE_DATE = null; } else {
      this.POS_SYSTEM_UPGRADE_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TMX_CUTOVER_DATE = null; } else {
      this.TMX_CUTOVER_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POSTAL_CODE = null; } else {
      this.POSTAL_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TMX_INTEGRATION_DATE = null; } else {
      this.TMX_INTEGRATION_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TMX_FORECAST_DATE = null; } else {
      this.TMX_FORECAST_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CORPORATE_FLAG = null; } else {
      this.CORPORATE_FLAG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.RECIPE_TYPE = null; } else {
      this.RECIPE_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPEN_SUN_FLAG = null; } else {
      this.OPEN_SUN_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPEN_MON_FLAG = null; } else {
      this.OPEN_MON_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPEN_TUE_FLAG = null; } else {
      this.OPEN_TUE_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPEN_WED_FLAG = null; } else {
      this.OPEN_WED_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPEN_THUR_FLAG = null; } else {
      this.OPEN_THUR_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPEN_FRI_FLAG = null; } else {
      this.OPEN_FRI_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPEN_SAT_FLAG = null; } else {
      this.OPEN_SAT_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ACQUISITION_DATE = null; } else {
      this.ACQUISITION_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.COMP_OPENED_DATE = null; } else {
      this.COMP_OPENED_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CLOSED_YEAR = null; } else {
      this.CLOSED_YEAR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CAFE_SVS_NBR = null; } else {
      this.CAFE_SVS_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CITY = null; } else {
      this.CITY = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.STATE_CODE = null; } else {
      this.STATE_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ADDRESS = null; } else {
      this.ADDRESS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PRICE_TIER_CODE = null; } else {
      this.PRICE_TIER_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TAX_STATE_CODE = null; } else {
      this.TAX_STATE_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PHONE_NBR = null; } else {
      this.PHONE_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FAX_NUMBER = null; } else {
      this.FAX_NUMBER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BROADBAND_IP = null; } else {
      this.BROADBAND_IP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ROPE_IP = null; } else {
      this.ROPE_IP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ISP_TYPE = null; } else {
      this.ISP_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ISP_PROVIDER = null; } else {
      this.ISP_PROVIDER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FRANCHISE = null; } else {
      this.FRANCHISE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DISTRICT_NAME = null; } else {
      this.DISTRICT_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HARDWARE_SERVICE_PROVIDER = null; } else {
      this.HARDWARE_SERVICE_PROVIDER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PHONE_SERVICE_PROVIDER = null; } else {
      this.PHONE_SERVICE_PROVIDER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CAFE_STATUS = null; } else {
      this.CAFE_STATUS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CAFE_TYPE = null; } else {
      this.CAFE_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LOCATION_TYPE = null; } else {
      this.LOCATION_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SUPPORT_LEVEL = null; } else {
      this.SUPPORT_LEVEL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CAFE_EMAIL = null; } else {
      this.CAFE_EMAIL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DATABASE_TYPE = null; } else {
      this.DATABASE_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DATABASE_VERSION = null; } else {
      this.DATABASE_VERSION = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SYSTEM_COORDINATOR = null; } else {
      this.SYSTEM_COORDINATOR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DISTRICT_NUMBER = null; } else {
      this.DISTRICT_NUMBER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.REGION_NAME = null; } else {
      this.REGION_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.AREA_NAME = null; } else {
      this.AREA_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.POS_INSTALL_DATE = null; } else {
      this.POS_INSTALL_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POS_INSTALLER_NAME = null; } else {
      this.POS_INSTALLER_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CABLING_INSTALLER_NAME = null; } else {
      this.CABLING_INSTALLER_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CREDIT_MERCHANT_ID = null; } else {
      this.CREDIT_MERCHANT_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.NETWORK_LOCATION = null; } else {
      this.NETWORK_LOCATION = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VOIP_FLAG = null; } else {
      this.VOIP_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ELEARN_IP = null; } else {
      this.ELEARN_IP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SYSTEM_ATT_VOIP = null; } else {
      this.SYSTEM_ATT_VOIP = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CAFE_AMAZON_FLAG = null; } else {
      this.CAFE_AMAZON_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CUST_FACING_DISP_FLAG = null; } else {
      this.CUST_FACING_DISP_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TABLE_SERVICE = null; } else {
      this.TABLE_SERVICE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.KDS_SCHEMES = null; } else {
      this.KDS_SCHEMES = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EOU_STATUS_FLAG = null; } else {
      this.EOU_STATUS_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SYSTEM_TMX_CUTOVER = null; } else {
      this.SYSTEM_TMX_CUTOVER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.AREA_DESC = null; } else {
      this.AREA_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DISTRICT_MGRCELL = null; } else {
      this.DISTRICT_MGRCELL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DISTRICT_MGREMAIL = null; } else {
      this.DISTRICT_MGREMAIL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DISTRICT_MGRNAME = null; } else {
      this.DISTRICT_MGRNAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ORG_NAME = null; } else {
      this.ORG_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BOH_NETWORK_IP = null; } else {
      this.BOH_NETWORK_IP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PHONE_SUPPORT_PROVIDER = null; } else {
      this.PHONE_SUPPORT_PROVIDER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ADDRESS2 = null; } else {
      this.ADDRESS2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PHONE2 = null; } else {
      this.PHONE2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FTA_EMAILADDR = null; } else {
      this.FTA_EMAILADDR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ELEARNING_IP = null; } else {
      this.ELEARNING_IP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.NETWORK_LOCATION_SIDE = null; } else {
      this.NETWORK_LOCATION_SIDE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COMPANY_NAME = null; } else {
      this.COMPANY_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COMPANY_DESC = null; } else {
      this.COMPANY_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LOY_LAUNCH_DATE = null; } else {
      this.LOY_LAUNCH_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL1_NAME = null; } else {
      this.MAIN_LEVEL1_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL1_DESC = null; } else {
      this.MAIN_LEVEL1_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL1_MGR_NAME = null; } else {
      this.MAIN_LEVEL1_MGR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL2_NAME = null; } else {
      this.MAIN_LEVEL2_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL2_DESC = null; } else {
      this.MAIN_LEVEL2_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL2_MGR_NAME = null; } else {
      this.MAIN_LEVEL2_MGR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL3_NAME = null; } else {
      this.MAIN_LEVEL3_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL3_DESC = null; } else {
      this.MAIN_LEVEL3_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL3_MGR_NAME = null; } else {
      this.MAIN_LEVEL3_MGR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL4_NAME = null; } else {
      this.MAIN_LEVEL4_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL4_DESC = null; } else {
      this.MAIN_LEVEL4_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL4_MGR_NAME = null; } else {
      this.MAIN_LEVEL4_MGR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL5_NAME = null; } else {
      this.MAIN_LEVEL5_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL5_DESC = null; } else {
      this.MAIN_LEVEL5_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL5_MGR_NAME = null; } else {
      this.MAIN_LEVEL5_MGR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL6_NAME = null; } else {
      this.MAIN_LEVEL6_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL6_DESC = null; } else {
      this.MAIN_LEVEL6_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL6_MGR_NAME = null; } else {
      this.MAIN_LEVEL6_MGR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL7_NAME = null; } else {
      this.MAIN_LEVEL7_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL7_DESC = null; } else {
      this.MAIN_LEVEL7_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL7_MGR_NAME = null; } else {
      this.MAIN_LEVEL7_MGR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL8_NAME = null; } else {
      this.MAIN_LEVEL8_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL8_DESC = null; } else {
      this.MAIN_LEVEL8_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL8_MGR_NAME = null; } else {
      this.MAIN_LEVEL8_MGR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL9_NAME = null; } else {
      this.MAIN_LEVEL9_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL9_DESC = null; } else {
      this.MAIN_LEVEL9_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL9_MGR_NAME = null; } else {
      this.MAIN_LEVEL9_MGR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL10_NAME = null; } else {
      this.MAIN_LEVEL10_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL10_DESC = null; } else {
      this.MAIN_LEVEL10_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL10_MGR_NAME = null; } else {
      this.MAIN_LEVEL10_MGR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FILE_DTTM = null; } else {
      this.FILE_DTTM = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.INSERT_DTTM = null; } else {
      this.INSERT_DTTM = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UPDATE_DTTM = null; } else {
      this.UPDATE_DTTM = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LOAD_DW_ID = null; } else {
      this.LOAD_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VERSION = null; } else {
      this.VERSION = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.COUNTRY_DW_ID = null; } else {
      this.COUNTRY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.COMPANY_ID = null; } else {
      this.COMPANY_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.COMPANY_DW_ID = null; } else {
      this.COMPANY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CAFE_MANAGER = null; } else {
      this.CAFE_MANAGER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CATERING_COORDINATORS = null; } else {
      this.CATERING_COORDINATORS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MARKET_NAME = null; } else {
      this.MARKET_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.YEAR_BASE_CAFE = null; } else {
      this.YEAR_BASE_CAFE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MARKETING_LOCATION_DW_ID = null; } else {
      this.MARKETING_LOCATION_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DMA_NAME = null; } else {
      this.DMA_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LABOR_INVESTMENT_AMT = null; } else {
      this.LABOR_INVESTMENT_AMT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CATERING_RCSM = null; } else {
      this.CATERING_RCSM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CATERING_SR_RCSM = null; } else {
      this.CATERING_SR_RCSM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PANERA_2_0_STATUS = null; } else {
      this.PANERA_2_0_STATUS = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RPU_STATUS = null; } else {
      this.RPU_STATUS = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HUB_CLUSTER_NAME = null; } else {
      this.HUB_CLUSTER_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HUB_CLUSTER_CLASS = null; } else {
      this.HUB_CLUSTER_CLASS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ECOMMERCE_CAFE_TYPE_CATERING = null; } else {
      this.ECOMMERCE_CAFE_TYPE_CATERING = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ECOMMERCE_CAFE_TYPE = null; } else {
      this.ECOMMERCE_CAFE_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CATERING_ONLINE_DESIGNATION = null; } else {
      this.CATERING_ONLINE_DESIGNATION = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ECOMMERCE_CATERING_HUB_PARENT = null; } else {
      this.ECOMMERCE_CATERING_HUB_PARENT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CATERING_ONLINE_STATUS = null; } else {
      this.CATERING_ONLINE_STATUS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ECOMMERCE_KIOSKS_FLAG = null; } else {
      this.ECOMMERCE_KIOSKS_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ECOMMERCE_RETAIL_DELIVERY_FLAG = null; } else {
      this.ECOMMERCE_RETAIL_DELIVERY_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ECOMMERCE_RETAIL_DINE_IN_FLAG = null; } else {
      this.ECOMMERCE_RETAIL_DINE_IN_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ECOMMERCE_RETAIL_PICKUP_FLAG = null; } else {
      this.ECOMMERCE_RETAIL_PICKUP_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ECOMMERCE_LAUNCH_CATERING_2_0 = null; } else {
      this.ECOMMERCE_LAUNCH_CATERING_2_0 = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ECOMMERCE_LAUNCH_RPU = null; } else {
      this.ECOMMERCE_LAUNCH_RPU = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ECOMMERCE_LAUNCH_PANERA_2_0 = null; } else {
      this.ECOMMERCE_LAUNCH_PANERA_2_0 = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ECOMMERCE_LAUNCH_DELIVERY = null; } else {
      this.ECOMMERCE_LAUNCH_DELIVERY = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ECOMMERCE_LAUNCH_DINE_IN = null; } else {
      this.ECOMMERCE_LAUNCH_DINE_IN = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ECOMMERCE_LAUNCH_KIOSKS = null; } else {
      this.ECOMMERCE_LAUNCH_KIOSKS = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LAUNCH_2_0_PERIOD_NBR_IN_EPOCH = null; } else {
      this.LAUNCH_2_0_PERIOD_NBR_IN_EPOCH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LAUNCH_2_0_WEEK_NBR_IN_EPOCH = null; } else {
      this.LAUNCH_2_0_WEEK_NBR_IN_EPOCH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LAUNCH_DEL_PERIOD_NBR_IN_EPOCH = null; } else {
      this.LAUNCH_DEL_PERIOD_NBR_IN_EPOCH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LAUNCH_DEL_WEEK_NBR_IN_EPOCH = null; } else {
      this.LAUNCH_DEL_WEEK_NBR_IN_EPOCH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CAFE_GROUP_DW_ID = null; } else {
      this.CAFE_GROUP_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DISTRIBUTION_CTR_DW_ID = null; } else {
      this.DISTRIBUTION_CTR_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DISTRICT_DESC = null; } else {
      this.DISTRICT_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PRIMARY_MENU_GROUP = null; } else {
      this.PRIMARY_MENU_GROUP = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PRICING_TIER_GROUP = null; } else {
      this.PRICING_TIER_GROUP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ECOMMERCE_LAUNCH_OPS_INTEGRITY = null; } else {
      this.ECOMMERCE_LAUNCH_OPS_INTEGRITY = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CERTIFIED_TRAINING_CAFE = null; } else {
      this.CERTIFIED_TRAINING_CAFE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.COMMISSARY_DW_ID = null; } else {
      this.COMMISSARY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.COMMISSARY_NBR = null; } else {
      this.COMMISSARY_NBR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COMMISSARY_NAME = null; } else {
      this.COMMISSARY_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPENED_DT_PERIOD_NBR_IN_EPOCH = null; } else {
      this.OPENED_DT_PERIOD_NBR_IN_EPOCH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPENED_DT_WEEK_NBR_IN_EPOCH = null; } else {
      this.OPENED_DT_WEEK_NBR_IN_EPOCH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GL_STORE_NBR = null; } else {
      this.GL_STORE_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PAYROLL_PROCESSOR_BRANCH = null; } else {
      this.PAYROLL_PROCESSOR_BRANCH = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PAYROLL_PROCESSOR_DIVISION = null; } else {
      this.PAYROLL_PROCESSOR_DIVISION = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LOAD_DTTM = null; } else {
      this.LOAD_DTTM = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LOAD_BY = null; } else {
      this.LOAD_BY = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Z_CAFE_DW_ID = null; } else {
      this.Z_CAFE_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CAFE_NBR = null; } else {
      this.CAFE_NBR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CAFE_NAME = null; } else {
      this.CAFE_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPENED_DATE = null; } else {
      this.OPENED_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CLOSED_DATE = null; } else {
      this.CLOSED_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LOC_CURRENCY_DW_ID = null; } else {
      this.LOC_CURRENCY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POS_SYSTEM_TYPE = null; } else {
      this.POS_SYSTEM_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.POS_POLLING_FLAG = null; } else {
      this.POS_POLLING_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TIMEZONE = null; } else {
      this.TIMEZONE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CAFE_DRIVETHRU_FLAG = null; } else {
      this.CAFE_DRIVETHRU_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.POS_SYSTEM_UPGRADE_DATE = null; } else {
      this.POS_SYSTEM_UPGRADE_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TMX_CUTOVER_DATE = null; } else {
      this.TMX_CUTOVER_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POSTAL_CODE = null; } else {
      this.POSTAL_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TMX_INTEGRATION_DATE = null; } else {
      this.TMX_INTEGRATION_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TMX_FORECAST_DATE = null; } else {
      this.TMX_FORECAST_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CORPORATE_FLAG = null; } else {
      this.CORPORATE_FLAG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.RECIPE_TYPE = null; } else {
      this.RECIPE_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPEN_SUN_FLAG = null; } else {
      this.OPEN_SUN_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPEN_MON_FLAG = null; } else {
      this.OPEN_MON_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPEN_TUE_FLAG = null; } else {
      this.OPEN_TUE_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPEN_WED_FLAG = null; } else {
      this.OPEN_WED_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPEN_THUR_FLAG = null; } else {
      this.OPEN_THUR_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPEN_FRI_FLAG = null; } else {
      this.OPEN_FRI_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPEN_SAT_FLAG = null; } else {
      this.OPEN_SAT_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ACQUISITION_DATE = null; } else {
      this.ACQUISITION_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.COMP_OPENED_DATE = null; } else {
      this.COMP_OPENED_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CLOSED_YEAR = null; } else {
      this.CLOSED_YEAR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CAFE_SVS_NBR = null; } else {
      this.CAFE_SVS_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CITY = null; } else {
      this.CITY = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.STATE_CODE = null; } else {
      this.STATE_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ADDRESS = null; } else {
      this.ADDRESS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PRICE_TIER_CODE = null; } else {
      this.PRICE_TIER_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TAX_STATE_CODE = null; } else {
      this.TAX_STATE_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PHONE_NBR = null; } else {
      this.PHONE_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FAX_NUMBER = null; } else {
      this.FAX_NUMBER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BROADBAND_IP = null; } else {
      this.BROADBAND_IP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ROPE_IP = null; } else {
      this.ROPE_IP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ISP_TYPE = null; } else {
      this.ISP_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ISP_PROVIDER = null; } else {
      this.ISP_PROVIDER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FRANCHISE = null; } else {
      this.FRANCHISE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DISTRICT_NAME = null; } else {
      this.DISTRICT_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HARDWARE_SERVICE_PROVIDER = null; } else {
      this.HARDWARE_SERVICE_PROVIDER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PHONE_SERVICE_PROVIDER = null; } else {
      this.PHONE_SERVICE_PROVIDER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CAFE_STATUS = null; } else {
      this.CAFE_STATUS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CAFE_TYPE = null; } else {
      this.CAFE_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LOCATION_TYPE = null; } else {
      this.LOCATION_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SUPPORT_LEVEL = null; } else {
      this.SUPPORT_LEVEL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CAFE_EMAIL = null; } else {
      this.CAFE_EMAIL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DATABASE_TYPE = null; } else {
      this.DATABASE_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DATABASE_VERSION = null; } else {
      this.DATABASE_VERSION = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SYSTEM_COORDINATOR = null; } else {
      this.SYSTEM_COORDINATOR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DISTRICT_NUMBER = null; } else {
      this.DISTRICT_NUMBER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.REGION_NAME = null; } else {
      this.REGION_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.AREA_NAME = null; } else {
      this.AREA_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.POS_INSTALL_DATE = null; } else {
      this.POS_INSTALL_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POS_INSTALLER_NAME = null; } else {
      this.POS_INSTALLER_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CABLING_INSTALLER_NAME = null; } else {
      this.CABLING_INSTALLER_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CREDIT_MERCHANT_ID = null; } else {
      this.CREDIT_MERCHANT_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.NETWORK_LOCATION = null; } else {
      this.NETWORK_LOCATION = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VOIP_FLAG = null; } else {
      this.VOIP_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ELEARN_IP = null; } else {
      this.ELEARN_IP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SYSTEM_ATT_VOIP = null; } else {
      this.SYSTEM_ATT_VOIP = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CAFE_AMAZON_FLAG = null; } else {
      this.CAFE_AMAZON_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CUST_FACING_DISP_FLAG = null; } else {
      this.CUST_FACING_DISP_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TABLE_SERVICE = null; } else {
      this.TABLE_SERVICE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.KDS_SCHEMES = null; } else {
      this.KDS_SCHEMES = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EOU_STATUS_FLAG = null; } else {
      this.EOU_STATUS_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SYSTEM_TMX_CUTOVER = null; } else {
      this.SYSTEM_TMX_CUTOVER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.AREA_DESC = null; } else {
      this.AREA_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DISTRICT_MGRCELL = null; } else {
      this.DISTRICT_MGRCELL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DISTRICT_MGREMAIL = null; } else {
      this.DISTRICT_MGREMAIL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DISTRICT_MGRNAME = null; } else {
      this.DISTRICT_MGRNAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ORG_NAME = null; } else {
      this.ORG_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BOH_NETWORK_IP = null; } else {
      this.BOH_NETWORK_IP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PHONE_SUPPORT_PROVIDER = null; } else {
      this.PHONE_SUPPORT_PROVIDER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ADDRESS2 = null; } else {
      this.ADDRESS2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PHONE2 = null; } else {
      this.PHONE2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FTA_EMAILADDR = null; } else {
      this.FTA_EMAILADDR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ELEARNING_IP = null; } else {
      this.ELEARNING_IP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.NETWORK_LOCATION_SIDE = null; } else {
      this.NETWORK_LOCATION_SIDE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COMPANY_NAME = null; } else {
      this.COMPANY_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COMPANY_DESC = null; } else {
      this.COMPANY_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LOY_LAUNCH_DATE = null; } else {
      this.LOY_LAUNCH_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL1_NAME = null; } else {
      this.MAIN_LEVEL1_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL1_DESC = null; } else {
      this.MAIN_LEVEL1_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL1_MGR_NAME = null; } else {
      this.MAIN_LEVEL1_MGR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL2_NAME = null; } else {
      this.MAIN_LEVEL2_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL2_DESC = null; } else {
      this.MAIN_LEVEL2_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL2_MGR_NAME = null; } else {
      this.MAIN_LEVEL2_MGR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL3_NAME = null; } else {
      this.MAIN_LEVEL3_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL3_DESC = null; } else {
      this.MAIN_LEVEL3_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL3_MGR_NAME = null; } else {
      this.MAIN_LEVEL3_MGR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL4_NAME = null; } else {
      this.MAIN_LEVEL4_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL4_DESC = null; } else {
      this.MAIN_LEVEL4_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL4_MGR_NAME = null; } else {
      this.MAIN_LEVEL4_MGR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL5_NAME = null; } else {
      this.MAIN_LEVEL5_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL5_DESC = null; } else {
      this.MAIN_LEVEL5_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL5_MGR_NAME = null; } else {
      this.MAIN_LEVEL5_MGR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL6_NAME = null; } else {
      this.MAIN_LEVEL6_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL6_DESC = null; } else {
      this.MAIN_LEVEL6_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL6_MGR_NAME = null; } else {
      this.MAIN_LEVEL6_MGR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL7_NAME = null; } else {
      this.MAIN_LEVEL7_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL7_DESC = null; } else {
      this.MAIN_LEVEL7_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL7_MGR_NAME = null; } else {
      this.MAIN_LEVEL7_MGR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL8_NAME = null; } else {
      this.MAIN_LEVEL8_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL8_DESC = null; } else {
      this.MAIN_LEVEL8_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL8_MGR_NAME = null; } else {
      this.MAIN_LEVEL8_MGR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL9_NAME = null; } else {
      this.MAIN_LEVEL9_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL9_DESC = null; } else {
      this.MAIN_LEVEL9_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL9_MGR_NAME = null; } else {
      this.MAIN_LEVEL9_MGR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL10_NAME = null; } else {
      this.MAIN_LEVEL10_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL10_DESC = null; } else {
      this.MAIN_LEVEL10_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_LEVEL10_MGR_NAME = null; } else {
      this.MAIN_LEVEL10_MGR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FILE_DTTM = null; } else {
      this.FILE_DTTM = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.INSERT_DTTM = null; } else {
      this.INSERT_DTTM = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UPDATE_DTTM = null; } else {
      this.UPDATE_DTTM = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LOAD_DW_ID = null; } else {
      this.LOAD_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VERSION = null; } else {
      this.VERSION = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.COUNTRY_DW_ID = null; } else {
      this.COUNTRY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.COMPANY_ID = null; } else {
      this.COMPANY_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.COMPANY_DW_ID = null; } else {
      this.COMPANY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CAFE_MANAGER = null; } else {
      this.CAFE_MANAGER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CATERING_COORDINATORS = null; } else {
      this.CATERING_COORDINATORS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MARKET_NAME = null; } else {
      this.MARKET_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.YEAR_BASE_CAFE = null; } else {
      this.YEAR_BASE_CAFE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MARKETING_LOCATION_DW_ID = null; } else {
      this.MARKETING_LOCATION_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DMA_NAME = null; } else {
      this.DMA_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LABOR_INVESTMENT_AMT = null; } else {
      this.LABOR_INVESTMENT_AMT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CATERING_RCSM = null; } else {
      this.CATERING_RCSM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CATERING_SR_RCSM = null; } else {
      this.CATERING_SR_RCSM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PANERA_2_0_STATUS = null; } else {
      this.PANERA_2_0_STATUS = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RPU_STATUS = null; } else {
      this.RPU_STATUS = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HUB_CLUSTER_NAME = null; } else {
      this.HUB_CLUSTER_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HUB_CLUSTER_CLASS = null; } else {
      this.HUB_CLUSTER_CLASS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ECOMMERCE_CAFE_TYPE_CATERING = null; } else {
      this.ECOMMERCE_CAFE_TYPE_CATERING = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ECOMMERCE_CAFE_TYPE = null; } else {
      this.ECOMMERCE_CAFE_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CATERING_ONLINE_DESIGNATION = null; } else {
      this.CATERING_ONLINE_DESIGNATION = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ECOMMERCE_CATERING_HUB_PARENT = null; } else {
      this.ECOMMERCE_CATERING_HUB_PARENT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CATERING_ONLINE_STATUS = null; } else {
      this.CATERING_ONLINE_STATUS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ECOMMERCE_KIOSKS_FLAG = null; } else {
      this.ECOMMERCE_KIOSKS_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ECOMMERCE_RETAIL_DELIVERY_FLAG = null; } else {
      this.ECOMMERCE_RETAIL_DELIVERY_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ECOMMERCE_RETAIL_DINE_IN_FLAG = null; } else {
      this.ECOMMERCE_RETAIL_DINE_IN_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ECOMMERCE_RETAIL_PICKUP_FLAG = null; } else {
      this.ECOMMERCE_RETAIL_PICKUP_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ECOMMERCE_LAUNCH_CATERING_2_0 = null; } else {
      this.ECOMMERCE_LAUNCH_CATERING_2_0 = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ECOMMERCE_LAUNCH_RPU = null; } else {
      this.ECOMMERCE_LAUNCH_RPU = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ECOMMERCE_LAUNCH_PANERA_2_0 = null; } else {
      this.ECOMMERCE_LAUNCH_PANERA_2_0 = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ECOMMERCE_LAUNCH_DELIVERY = null; } else {
      this.ECOMMERCE_LAUNCH_DELIVERY = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ECOMMERCE_LAUNCH_DINE_IN = null; } else {
      this.ECOMMERCE_LAUNCH_DINE_IN = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ECOMMERCE_LAUNCH_KIOSKS = null; } else {
      this.ECOMMERCE_LAUNCH_KIOSKS = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LAUNCH_2_0_PERIOD_NBR_IN_EPOCH = null; } else {
      this.LAUNCH_2_0_PERIOD_NBR_IN_EPOCH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LAUNCH_2_0_WEEK_NBR_IN_EPOCH = null; } else {
      this.LAUNCH_2_0_WEEK_NBR_IN_EPOCH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LAUNCH_DEL_PERIOD_NBR_IN_EPOCH = null; } else {
      this.LAUNCH_DEL_PERIOD_NBR_IN_EPOCH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LAUNCH_DEL_WEEK_NBR_IN_EPOCH = null; } else {
      this.LAUNCH_DEL_WEEK_NBR_IN_EPOCH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CAFE_GROUP_DW_ID = null; } else {
      this.CAFE_GROUP_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DISTRIBUTION_CTR_DW_ID = null; } else {
      this.DISTRIBUTION_CTR_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DISTRICT_DESC = null; } else {
      this.DISTRICT_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PRIMARY_MENU_GROUP = null; } else {
      this.PRIMARY_MENU_GROUP = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PRICING_TIER_GROUP = null; } else {
      this.PRICING_TIER_GROUP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ECOMMERCE_LAUNCH_OPS_INTEGRITY = null; } else {
      this.ECOMMERCE_LAUNCH_OPS_INTEGRITY = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CERTIFIED_TRAINING_CAFE = null; } else {
      this.CERTIFIED_TRAINING_CAFE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.COMMISSARY_DW_ID = null; } else {
      this.COMMISSARY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.COMMISSARY_NBR = null; } else {
      this.COMMISSARY_NBR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COMMISSARY_NAME = null; } else {
      this.COMMISSARY_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPENED_DT_PERIOD_NBR_IN_EPOCH = null; } else {
      this.OPENED_DT_PERIOD_NBR_IN_EPOCH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPENED_DT_WEEK_NBR_IN_EPOCH = null; } else {
      this.OPENED_DT_WEEK_NBR_IN_EPOCH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GL_STORE_NBR = null; } else {
      this.GL_STORE_NBR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PAYROLL_PROCESSOR_BRANCH = null; } else {
      this.PAYROLL_PROCESSOR_BRANCH = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PAYROLL_PROCESSOR_DIVISION = null; } else {
      this.PAYROLL_PROCESSOR_DIVISION = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LOAD_DTTM = null; } else {
      this.LOAD_DTTM = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LOAD_BY = null; } else {
      this.LOAD_BY = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    dim_cafe o = (dim_cafe) super.clone();
    o.OPENED_DATE = (o.OPENED_DATE != null) ? (java.sql.Timestamp) o.OPENED_DATE.clone() : null;
    o.CLOSED_DATE = (o.CLOSED_DATE != null) ? (java.sql.Timestamp) o.CLOSED_DATE.clone() : null;
    o.POS_SYSTEM_UPGRADE_DATE = (o.POS_SYSTEM_UPGRADE_DATE != null) ? (java.sql.Timestamp) o.POS_SYSTEM_UPGRADE_DATE.clone() : null;
    o.TMX_CUTOVER_DATE = (o.TMX_CUTOVER_DATE != null) ? (java.sql.Timestamp) o.TMX_CUTOVER_DATE.clone() : null;
    o.TMX_INTEGRATION_DATE = (o.TMX_INTEGRATION_DATE != null) ? (java.sql.Timestamp) o.TMX_INTEGRATION_DATE.clone() : null;
    o.TMX_FORECAST_DATE = (o.TMX_FORECAST_DATE != null) ? (java.sql.Timestamp) o.TMX_FORECAST_DATE.clone() : null;
    o.ACQUISITION_DATE = (o.ACQUISITION_DATE != null) ? (java.sql.Timestamp) o.ACQUISITION_DATE.clone() : null;
    o.COMP_OPENED_DATE = (o.COMP_OPENED_DATE != null) ? (java.sql.Timestamp) o.COMP_OPENED_DATE.clone() : null;
    o.POS_INSTALL_DATE = (o.POS_INSTALL_DATE != null) ? (java.sql.Timestamp) o.POS_INSTALL_DATE.clone() : null;
    o.LOY_LAUNCH_DATE = (o.LOY_LAUNCH_DATE != null) ? (java.sql.Timestamp) o.LOY_LAUNCH_DATE.clone() : null;
    o.FILE_DTTM = (o.FILE_DTTM != null) ? (java.sql.Timestamp) o.FILE_DTTM.clone() : null;
    o.INSERT_DTTM = (o.INSERT_DTTM != null) ? (java.sql.Timestamp) o.INSERT_DTTM.clone() : null;
    o.UPDATE_DTTM = (o.UPDATE_DTTM != null) ? (java.sql.Timestamp) o.UPDATE_DTTM.clone() : null;
    o.ECOMMERCE_LAUNCH_CATERING_2_0 = (o.ECOMMERCE_LAUNCH_CATERING_2_0 != null) ? (java.sql.Timestamp) o.ECOMMERCE_LAUNCH_CATERING_2_0.clone() : null;
    o.ECOMMERCE_LAUNCH_RPU = (o.ECOMMERCE_LAUNCH_RPU != null) ? (java.sql.Timestamp) o.ECOMMERCE_LAUNCH_RPU.clone() : null;
    o.ECOMMERCE_LAUNCH_PANERA_2_0 = (o.ECOMMERCE_LAUNCH_PANERA_2_0 != null) ? (java.sql.Timestamp) o.ECOMMERCE_LAUNCH_PANERA_2_0.clone() : null;
    o.ECOMMERCE_LAUNCH_DELIVERY = (o.ECOMMERCE_LAUNCH_DELIVERY != null) ? (java.sql.Timestamp) o.ECOMMERCE_LAUNCH_DELIVERY.clone() : null;
    o.ECOMMERCE_LAUNCH_DINE_IN = (o.ECOMMERCE_LAUNCH_DINE_IN != null) ? (java.sql.Timestamp) o.ECOMMERCE_LAUNCH_DINE_IN.clone() : null;
    o.ECOMMERCE_LAUNCH_KIOSKS = (o.ECOMMERCE_LAUNCH_KIOSKS != null) ? (java.sql.Timestamp) o.ECOMMERCE_LAUNCH_KIOSKS.clone() : null;
    o.ECOMMERCE_LAUNCH_OPS_INTEGRITY = (o.ECOMMERCE_LAUNCH_OPS_INTEGRITY != null) ? (java.sql.Timestamp) o.ECOMMERCE_LAUNCH_OPS_INTEGRITY.clone() : null;
    o.LOAD_DTTM = (o.LOAD_DTTM != null) ? (java.sql.Timestamp) o.LOAD_DTTM.clone() : null;
    return o;
  }

  public void clone0(dim_cafe o) throws CloneNotSupportedException {
    o.OPENED_DATE = (o.OPENED_DATE != null) ? (java.sql.Timestamp) o.OPENED_DATE.clone() : null;
    o.CLOSED_DATE = (o.CLOSED_DATE != null) ? (java.sql.Timestamp) o.CLOSED_DATE.clone() : null;
    o.POS_SYSTEM_UPGRADE_DATE = (o.POS_SYSTEM_UPGRADE_DATE != null) ? (java.sql.Timestamp) o.POS_SYSTEM_UPGRADE_DATE.clone() : null;
    o.TMX_CUTOVER_DATE = (o.TMX_CUTOVER_DATE != null) ? (java.sql.Timestamp) o.TMX_CUTOVER_DATE.clone() : null;
    o.TMX_INTEGRATION_DATE = (o.TMX_INTEGRATION_DATE != null) ? (java.sql.Timestamp) o.TMX_INTEGRATION_DATE.clone() : null;
    o.TMX_FORECAST_DATE = (o.TMX_FORECAST_DATE != null) ? (java.sql.Timestamp) o.TMX_FORECAST_DATE.clone() : null;
    o.ACQUISITION_DATE = (o.ACQUISITION_DATE != null) ? (java.sql.Timestamp) o.ACQUISITION_DATE.clone() : null;
    o.COMP_OPENED_DATE = (o.COMP_OPENED_DATE != null) ? (java.sql.Timestamp) o.COMP_OPENED_DATE.clone() : null;
    o.POS_INSTALL_DATE = (o.POS_INSTALL_DATE != null) ? (java.sql.Timestamp) o.POS_INSTALL_DATE.clone() : null;
    o.LOY_LAUNCH_DATE = (o.LOY_LAUNCH_DATE != null) ? (java.sql.Timestamp) o.LOY_LAUNCH_DATE.clone() : null;
    o.FILE_DTTM = (o.FILE_DTTM != null) ? (java.sql.Timestamp) o.FILE_DTTM.clone() : null;
    o.INSERT_DTTM = (o.INSERT_DTTM != null) ? (java.sql.Timestamp) o.INSERT_DTTM.clone() : null;
    o.UPDATE_DTTM = (o.UPDATE_DTTM != null) ? (java.sql.Timestamp) o.UPDATE_DTTM.clone() : null;
    o.ECOMMERCE_LAUNCH_CATERING_2_0 = (o.ECOMMERCE_LAUNCH_CATERING_2_0 != null) ? (java.sql.Timestamp) o.ECOMMERCE_LAUNCH_CATERING_2_0.clone() : null;
    o.ECOMMERCE_LAUNCH_RPU = (o.ECOMMERCE_LAUNCH_RPU != null) ? (java.sql.Timestamp) o.ECOMMERCE_LAUNCH_RPU.clone() : null;
    o.ECOMMERCE_LAUNCH_PANERA_2_0 = (o.ECOMMERCE_LAUNCH_PANERA_2_0 != null) ? (java.sql.Timestamp) o.ECOMMERCE_LAUNCH_PANERA_2_0.clone() : null;
    o.ECOMMERCE_LAUNCH_DELIVERY = (o.ECOMMERCE_LAUNCH_DELIVERY != null) ? (java.sql.Timestamp) o.ECOMMERCE_LAUNCH_DELIVERY.clone() : null;
    o.ECOMMERCE_LAUNCH_DINE_IN = (o.ECOMMERCE_LAUNCH_DINE_IN != null) ? (java.sql.Timestamp) o.ECOMMERCE_LAUNCH_DINE_IN.clone() : null;
    o.ECOMMERCE_LAUNCH_KIOSKS = (o.ECOMMERCE_LAUNCH_KIOSKS != null) ? (java.sql.Timestamp) o.ECOMMERCE_LAUNCH_KIOSKS.clone() : null;
    o.ECOMMERCE_LAUNCH_OPS_INTEGRITY = (o.ECOMMERCE_LAUNCH_OPS_INTEGRITY != null) ? (java.sql.Timestamp) o.ECOMMERCE_LAUNCH_OPS_INTEGRITY.clone() : null;
    o.LOAD_DTTM = (o.LOAD_DTTM != null) ? (java.sql.Timestamp) o.LOAD_DTTM.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Z_CAFE_DW_ID", this.Z_CAFE_DW_ID);
    __sqoop$field_map.put("CAFE_NBR", this.CAFE_NBR);
    __sqoop$field_map.put("CAFE_NAME", this.CAFE_NAME);
    __sqoop$field_map.put("OPENED_DATE", this.OPENED_DATE);
    __sqoop$field_map.put("CLOSED_DATE", this.CLOSED_DATE);
    __sqoop$field_map.put("LOC_CURRENCY_DW_ID", this.LOC_CURRENCY_DW_ID);
    __sqoop$field_map.put("POS_SYSTEM_TYPE", this.POS_SYSTEM_TYPE);
    __sqoop$field_map.put("POS_POLLING_FLAG", this.POS_POLLING_FLAG);
    __sqoop$field_map.put("TIMEZONE", this.TIMEZONE);
    __sqoop$field_map.put("CAFE_DRIVETHRU_FLAG", this.CAFE_DRIVETHRU_FLAG);
    __sqoop$field_map.put("POS_SYSTEM_UPGRADE_DATE", this.POS_SYSTEM_UPGRADE_DATE);
    __sqoop$field_map.put("TMX_CUTOVER_DATE", this.TMX_CUTOVER_DATE);
    __sqoop$field_map.put("POSTAL_CODE", this.POSTAL_CODE);
    __sqoop$field_map.put("TMX_INTEGRATION_DATE", this.TMX_INTEGRATION_DATE);
    __sqoop$field_map.put("TMX_FORECAST_DATE", this.TMX_FORECAST_DATE);
    __sqoop$field_map.put("CORPORATE_FLAG", this.CORPORATE_FLAG);
    __sqoop$field_map.put("RECIPE_TYPE", this.RECIPE_TYPE);
    __sqoop$field_map.put("OPEN_SUN_FLAG", this.OPEN_SUN_FLAG);
    __sqoop$field_map.put("OPEN_MON_FLAG", this.OPEN_MON_FLAG);
    __sqoop$field_map.put("OPEN_TUE_FLAG", this.OPEN_TUE_FLAG);
    __sqoop$field_map.put("OPEN_WED_FLAG", this.OPEN_WED_FLAG);
    __sqoop$field_map.put("OPEN_THUR_FLAG", this.OPEN_THUR_FLAG);
    __sqoop$field_map.put("OPEN_FRI_FLAG", this.OPEN_FRI_FLAG);
    __sqoop$field_map.put("OPEN_SAT_FLAG", this.OPEN_SAT_FLAG);
    __sqoop$field_map.put("ACQUISITION_DATE", this.ACQUISITION_DATE);
    __sqoop$field_map.put("COMP_OPENED_DATE", this.COMP_OPENED_DATE);
    __sqoop$field_map.put("CLOSED_YEAR", this.CLOSED_YEAR);
    __sqoop$field_map.put("CAFE_SVS_NBR", this.CAFE_SVS_NBR);
    __sqoop$field_map.put("CITY", this.CITY);
    __sqoop$field_map.put("STATE_CODE", this.STATE_CODE);
    __sqoop$field_map.put("ADDRESS", this.ADDRESS);
    __sqoop$field_map.put("PRICE_TIER_CODE", this.PRICE_TIER_CODE);
    __sqoop$field_map.put("TAX_STATE_CODE", this.TAX_STATE_CODE);
    __sqoop$field_map.put("PHONE_NBR", this.PHONE_NBR);
    __sqoop$field_map.put("FAX_NUMBER", this.FAX_NUMBER);
    __sqoop$field_map.put("BROADBAND_IP", this.BROADBAND_IP);
    __sqoop$field_map.put("ROPE_IP", this.ROPE_IP);
    __sqoop$field_map.put("ISP_TYPE", this.ISP_TYPE);
    __sqoop$field_map.put("ISP_PROVIDER", this.ISP_PROVIDER);
    __sqoop$field_map.put("FRANCHISE", this.FRANCHISE);
    __sqoop$field_map.put("DISTRICT_NAME", this.DISTRICT_NAME);
    __sqoop$field_map.put("HARDWARE_SERVICE_PROVIDER", this.HARDWARE_SERVICE_PROVIDER);
    __sqoop$field_map.put("PHONE_SERVICE_PROVIDER", this.PHONE_SERVICE_PROVIDER);
    __sqoop$field_map.put("CAFE_STATUS", this.CAFE_STATUS);
    __sqoop$field_map.put("CAFE_TYPE", this.CAFE_TYPE);
    __sqoop$field_map.put("LOCATION_TYPE", this.LOCATION_TYPE);
    __sqoop$field_map.put("SUPPORT_LEVEL", this.SUPPORT_LEVEL);
    __sqoop$field_map.put("CAFE_EMAIL", this.CAFE_EMAIL);
    __sqoop$field_map.put("DATABASE_TYPE", this.DATABASE_TYPE);
    __sqoop$field_map.put("DATABASE_VERSION", this.DATABASE_VERSION);
    __sqoop$field_map.put("SYSTEM_COORDINATOR", this.SYSTEM_COORDINATOR);
    __sqoop$field_map.put("DISTRICT_NUMBER", this.DISTRICT_NUMBER);
    __sqoop$field_map.put("REGION_NAME", this.REGION_NAME);
    __sqoop$field_map.put("AREA_NAME", this.AREA_NAME);
    __sqoop$field_map.put("POS_INSTALL_DATE", this.POS_INSTALL_DATE);
    __sqoop$field_map.put("POS_INSTALLER_NAME", this.POS_INSTALLER_NAME);
    __sqoop$field_map.put("CABLING_INSTALLER_NAME", this.CABLING_INSTALLER_NAME);
    __sqoop$field_map.put("CREDIT_MERCHANT_ID", this.CREDIT_MERCHANT_ID);
    __sqoop$field_map.put("NETWORK_LOCATION", this.NETWORK_LOCATION);
    __sqoop$field_map.put("VOIP_FLAG", this.VOIP_FLAG);
    __sqoop$field_map.put("ELEARN_IP", this.ELEARN_IP);
    __sqoop$field_map.put("SYSTEM_ATT_VOIP", this.SYSTEM_ATT_VOIP);
    __sqoop$field_map.put("CAFE_AMAZON_FLAG", this.CAFE_AMAZON_FLAG);
    __sqoop$field_map.put("CUST_FACING_DISP_FLAG", this.CUST_FACING_DISP_FLAG);
    __sqoop$field_map.put("TABLE_SERVICE", this.TABLE_SERVICE);
    __sqoop$field_map.put("KDS_SCHEMES", this.KDS_SCHEMES);
    __sqoop$field_map.put("EOU_STATUS_FLAG", this.EOU_STATUS_FLAG);
    __sqoop$field_map.put("SYSTEM_TMX_CUTOVER", this.SYSTEM_TMX_CUTOVER);
    __sqoop$field_map.put("AREA_DESC", this.AREA_DESC);
    __sqoop$field_map.put("DISTRICT_MGRCELL", this.DISTRICT_MGRCELL);
    __sqoop$field_map.put("DISTRICT_MGREMAIL", this.DISTRICT_MGREMAIL);
    __sqoop$field_map.put("DISTRICT_MGRNAME", this.DISTRICT_MGRNAME);
    __sqoop$field_map.put("ORG_NAME", this.ORG_NAME);
    __sqoop$field_map.put("BOH_NETWORK_IP", this.BOH_NETWORK_IP);
    __sqoop$field_map.put("PHONE_SUPPORT_PROVIDER", this.PHONE_SUPPORT_PROVIDER);
    __sqoop$field_map.put("ADDRESS2", this.ADDRESS2);
    __sqoop$field_map.put("PHONE2", this.PHONE2);
    __sqoop$field_map.put("FTA_EMAILADDR", this.FTA_EMAILADDR);
    __sqoop$field_map.put("ELEARNING_IP", this.ELEARNING_IP);
    __sqoop$field_map.put("NETWORK_LOCATION_SIDE", this.NETWORK_LOCATION_SIDE);
    __sqoop$field_map.put("COMPANY_NAME", this.COMPANY_NAME);
    __sqoop$field_map.put("COMPANY_DESC", this.COMPANY_DESC);
    __sqoop$field_map.put("LOY_LAUNCH_DATE", this.LOY_LAUNCH_DATE);
    __sqoop$field_map.put("MAIN_LEVEL1_NAME", this.MAIN_LEVEL1_NAME);
    __sqoop$field_map.put("MAIN_LEVEL1_DESC", this.MAIN_LEVEL1_DESC);
    __sqoop$field_map.put("MAIN_LEVEL1_MGR_NAME", this.MAIN_LEVEL1_MGR_NAME);
    __sqoop$field_map.put("MAIN_LEVEL2_NAME", this.MAIN_LEVEL2_NAME);
    __sqoop$field_map.put("MAIN_LEVEL2_DESC", this.MAIN_LEVEL2_DESC);
    __sqoop$field_map.put("MAIN_LEVEL2_MGR_NAME", this.MAIN_LEVEL2_MGR_NAME);
    __sqoop$field_map.put("MAIN_LEVEL3_NAME", this.MAIN_LEVEL3_NAME);
    __sqoop$field_map.put("MAIN_LEVEL3_DESC", this.MAIN_LEVEL3_DESC);
    __sqoop$field_map.put("MAIN_LEVEL3_MGR_NAME", this.MAIN_LEVEL3_MGR_NAME);
    __sqoop$field_map.put("MAIN_LEVEL4_NAME", this.MAIN_LEVEL4_NAME);
    __sqoop$field_map.put("MAIN_LEVEL4_DESC", this.MAIN_LEVEL4_DESC);
    __sqoop$field_map.put("MAIN_LEVEL4_MGR_NAME", this.MAIN_LEVEL4_MGR_NAME);
    __sqoop$field_map.put("MAIN_LEVEL5_NAME", this.MAIN_LEVEL5_NAME);
    __sqoop$field_map.put("MAIN_LEVEL5_DESC", this.MAIN_LEVEL5_DESC);
    __sqoop$field_map.put("MAIN_LEVEL5_MGR_NAME", this.MAIN_LEVEL5_MGR_NAME);
    __sqoop$field_map.put("MAIN_LEVEL6_NAME", this.MAIN_LEVEL6_NAME);
    __sqoop$field_map.put("MAIN_LEVEL6_DESC", this.MAIN_LEVEL6_DESC);
    __sqoop$field_map.put("MAIN_LEVEL6_MGR_NAME", this.MAIN_LEVEL6_MGR_NAME);
    __sqoop$field_map.put("MAIN_LEVEL7_NAME", this.MAIN_LEVEL7_NAME);
    __sqoop$field_map.put("MAIN_LEVEL7_DESC", this.MAIN_LEVEL7_DESC);
    __sqoop$field_map.put("MAIN_LEVEL7_MGR_NAME", this.MAIN_LEVEL7_MGR_NAME);
    __sqoop$field_map.put("MAIN_LEVEL8_NAME", this.MAIN_LEVEL8_NAME);
    __sqoop$field_map.put("MAIN_LEVEL8_DESC", this.MAIN_LEVEL8_DESC);
    __sqoop$field_map.put("MAIN_LEVEL8_MGR_NAME", this.MAIN_LEVEL8_MGR_NAME);
    __sqoop$field_map.put("MAIN_LEVEL9_NAME", this.MAIN_LEVEL9_NAME);
    __sqoop$field_map.put("MAIN_LEVEL9_DESC", this.MAIN_LEVEL9_DESC);
    __sqoop$field_map.put("MAIN_LEVEL9_MGR_NAME", this.MAIN_LEVEL9_MGR_NAME);
    __sqoop$field_map.put("MAIN_LEVEL10_NAME", this.MAIN_LEVEL10_NAME);
    __sqoop$field_map.put("MAIN_LEVEL10_DESC", this.MAIN_LEVEL10_DESC);
    __sqoop$field_map.put("MAIN_LEVEL10_MGR_NAME", this.MAIN_LEVEL10_MGR_NAME);
    __sqoop$field_map.put("FILE_DTTM", this.FILE_DTTM);
    __sqoop$field_map.put("INSERT_DTTM", this.INSERT_DTTM);
    __sqoop$field_map.put("UPDATE_DTTM", this.UPDATE_DTTM);
    __sqoop$field_map.put("LOAD_DW_ID", this.LOAD_DW_ID);
    __sqoop$field_map.put("VERSION", this.VERSION);
    __sqoop$field_map.put("COUNTRY_DW_ID", this.COUNTRY_DW_ID);
    __sqoop$field_map.put("COMPANY_ID", this.COMPANY_ID);
    __sqoop$field_map.put("COMPANY_DW_ID", this.COMPANY_DW_ID);
    __sqoop$field_map.put("CAFE_MANAGER", this.CAFE_MANAGER);
    __sqoop$field_map.put("CATERING_COORDINATORS", this.CATERING_COORDINATORS);
    __sqoop$field_map.put("MARKET_NAME", this.MARKET_NAME);
    __sqoop$field_map.put("YEAR_BASE_CAFE", this.YEAR_BASE_CAFE);
    __sqoop$field_map.put("MARKETING_LOCATION_DW_ID", this.MARKETING_LOCATION_DW_ID);
    __sqoop$field_map.put("DMA_NAME", this.DMA_NAME);
    __sqoop$field_map.put("LABOR_INVESTMENT_AMT", this.LABOR_INVESTMENT_AMT);
    __sqoop$field_map.put("CATERING_RCSM", this.CATERING_RCSM);
    __sqoop$field_map.put("CATERING_SR_RCSM", this.CATERING_SR_RCSM);
    __sqoop$field_map.put("PANERA_2_0_STATUS", this.PANERA_2_0_STATUS);
    __sqoop$field_map.put("RPU_STATUS", this.RPU_STATUS);
    __sqoop$field_map.put("HUB_CLUSTER_NAME", this.HUB_CLUSTER_NAME);
    __sqoop$field_map.put("HUB_CLUSTER_CLASS", this.HUB_CLUSTER_CLASS);
    __sqoop$field_map.put("ECOMMERCE_CAFE_TYPE_CATERING", this.ECOMMERCE_CAFE_TYPE_CATERING);
    __sqoop$field_map.put("ECOMMERCE_CAFE_TYPE", this.ECOMMERCE_CAFE_TYPE);
    __sqoop$field_map.put("CATERING_ONLINE_DESIGNATION", this.CATERING_ONLINE_DESIGNATION);
    __sqoop$field_map.put("ECOMMERCE_CATERING_HUB_PARENT", this.ECOMMERCE_CATERING_HUB_PARENT);
    __sqoop$field_map.put("CATERING_ONLINE_STATUS", this.CATERING_ONLINE_STATUS);
    __sqoop$field_map.put("ECOMMERCE_KIOSKS_FLAG", this.ECOMMERCE_KIOSKS_FLAG);
    __sqoop$field_map.put("ECOMMERCE_RETAIL_DELIVERY_FLAG", this.ECOMMERCE_RETAIL_DELIVERY_FLAG);
    __sqoop$field_map.put("ECOMMERCE_RETAIL_DINE_IN_FLAG", this.ECOMMERCE_RETAIL_DINE_IN_FLAG);
    __sqoop$field_map.put("ECOMMERCE_RETAIL_PICKUP_FLAG", this.ECOMMERCE_RETAIL_PICKUP_FLAG);
    __sqoop$field_map.put("ECOMMERCE_LAUNCH_CATERING_2_0", this.ECOMMERCE_LAUNCH_CATERING_2_0);
    __sqoop$field_map.put("ECOMMERCE_LAUNCH_RPU", this.ECOMMERCE_LAUNCH_RPU);
    __sqoop$field_map.put("ECOMMERCE_LAUNCH_PANERA_2_0", this.ECOMMERCE_LAUNCH_PANERA_2_0);
    __sqoop$field_map.put("ECOMMERCE_LAUNCH_DELIVERY", this.ECOMMERCE_LAUNCH_DELIVERY);
    __sqoop$field_map.put("ECOMMERCE_LAUNCH_DINE_IN", this.ECOMMERCE_LAUNCH_DINE_IN);
    __sqoop$field_map.put("ECOMMERCE_LAUNCH_KIOSKS", this.ECOMMERCE_LAUNCH_KIOSKS);
    __sqoop$field_map.put("LAUNCH_2_0_PERIOD_NBR_IN_EPOCH", this.LAUNCH_2_0_PERIOD_NBR_IN_EPOCH);
    __sqoop$field_map.put("LAUNCH_2_0_WEEK_NBR_IN_EPOCH", this.LAUNCH_2_0_WEEK_NBR_IN_EPOCH);
    __sqoop$field_map.put("LAUNCH_DEL_PERIOD_NBR_IN_EPOCH", this.LAUNCH_DEL_PERIOD_NBR_IN_EPOCH);
    __sqoop$field_map.put("LAUNCH_DEL_WEEK_NBR_IN_EPOCH", this.LAUNCH_DEL_WEEK_NBR_IN_EPOCH);
    __sqoop$field_map.put("CAFE_GROUP_DW_ID", this.CAFE_GROUP_DW_ID);
    __sqoop$field_map.put("DISTRIBUTION_CTR_DW_ID", this.DISTRIBUTION_CTR_DW_ID);
    __sqoop$field_map.put("DISTRICT_DESC", this.DISTRICT_DESC);
    __sqoop$field_map.put("PRIMARY_MENU_GROUP", this.PRIMARY_MENU_GROUP);
    __sqoop$field_map.put("PRICING_TIER_GROUP", this.PRICING_TIER_GROUP);
    __sqoop$field_map.put("ECOMMERCE_LAUNCH_OPS_INTEGRITY", this.ECOMMERCE_LAUNCH_OPS_INTEGRITY);
    __sqoop$field_map.put("CERTIFIED_TRAINING_CAFE", this.CERTIFIED_TRAINING_CAFE);
    __sqoop$field_map.put("COMMISSARY_DW_ID", this.COMMISSARY_DW_ID);
    __sqoop$field_map.put("COMMISSARY_NBR", this.COMMISSARY_NBR);
    __sqoop$field_map.put("COMMISSARY_NAME", this.COMMISSARY_NAME);
    __sqoop$field_map.put("OPENED_DT_PERIOD_NBR_IN_EPOCH", this.OPENED_DT_PERIOD_NBR_IN_EPOCH);
    __sqoop$field_map.put("OPENED_DT_WEEK_NBR_IN_EPOCH", this.OPENED_DT_WEEK_NBR_IN_EPOCH);
    __sqoop$field_map.put("GL_STORE_NBR", this.GL_STORE_NBR);
    __sqoop$field_map.put("PAYROLL_PROCESSOR_BRANCH", this.PAYROLL_PROCESSOR_BRANCH);
    __sqoop$field_map.put("PAYROLL_PROCESSOR_DIVISION", this.PAYROLL_PROCESSOR_DIVISION);
    __sqoop$field_map.put("LOAD_DTTM", this.LOAD_DTTM);
    __sqoop$field_map.put("LOAD_BY", this.LOAD_BY);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Z_CAFE_DW_ID", this.Z_CAFE_DW_ID);
    __sqoop$field_map.put("CAFE_NBR", this.CAFE_NBR);
    __sqoop$field_map.put("CAFE_NAME", this.CAFE_NAME);
    __sqoop$field_map.put("OPENED_DATE", this.OPENED_DATE);
    __sqoop$field_map.put("CLOSED_DATE", this.CLOSED_DATE);
    __sqoop$field_map.put("LOC_CURRENCY_DW_ID", this.LOC_CURRENCY_DW_ID);
    __sqoop$field_map.put("POS_SYSTEM_TYPE", this.POS_SYSTEM_TYPE);
    __sqoop$field_map.put("POS_POLLING_FLAG", this.POS_POLLING_FLAG);
    __sqoop$field_map.put("TIMEZONE", this.TIMEZONE);
    __sqoop$field_map.put("CAFE_DRIVETHRU_FLAG", this.CAFE_DRIVETHRU_FLAG);
    __sqoop$field_map.put("POS_SYSTEM_UPGRADE_DATE", this.POS_SYSTEM_UPGRADE_DATE);
    __sqoop$field_map.put("TMX_CUTOVER_DATE", this.TMX_CUTOVER_DATE);
    __sqoop$field_map.put("POSTAL_CODE", this.POSTAL_CODE);
    __sqoop$field_map.put("TMX_INTEGRATION_DATE", this.TMX_INTEGRATION_DATE);
    __sqoop$field_map.put("TMX_FORECAST_DATE", this.TMX_FORECAST_DATE);
    __sqoop$field_map.put("CORPORATE_FLAG", this.CORPORATE_FLAG);
    __sqoop$field_map.put("RECIPE_TYPE", this.RECIPE_TYPE);
    __sqoop$field_map.put("OPEN_SUN_FLAG", this.OPEN_SUN_FLAG);
    __sqoop$field_map.put("OPEN_MON_FLAG", this.OPEN_MON_FLAG);
    __sqoop$field_map.put("OPEN_TUE_FLAG", this.OPEN_TUE_FLAG);
    __sqoop$field_map.put("OPEN_WED_FLAG", this.OPEN_WED_FLAG);
    __sqoop$field_map.put("OPEN_THUR_FLAG", this.OPEN_THUR_FLAG);
    __sqoop$field_map.put("OPEN_FRI_FLAG", this.OPEN_FRI_FLAG);
    __sqoop$field_map.put("OPEN_SAT_FLAG", this.OPEN_SAT_FLAG);
    __sqoop$field_map.put("ACQUISITION_DATE", this.ACQUISITION_DATE);
    __sqoop$field_map.put("COMP_OPENED_DATE", this.COMP_OPENED_DATE);
    __sqoop$field_map.put("CLOSED_YEAR", this.CLOSED_YEAR);
    __sqoop$field_map.put("CAFE_SVS_NBR", this.CAFE_SVS_NBR);
    __sqoop$field_map.put("CITY", this.CITY);
    __sqoop$field_map.put("STATE_CODE", this.STATE_CODE);
    __sqoop$field_map.put("ADDRESS", this.ADDRESS);
    __sqoop$field_map.put("PRICE_TIER_CODE", this.PRICE_TIER_CODE);
    __sqoop$field_map.put("TAX_STATE_CODE", this.TAX_STATE_CODE);
    __sqoop$field_map.put("PHONE_NBR", this.PHONE_NBR);
    __sqoop$field_map.put("FAX_NUMBER", this.FAX_NUMBER);
    __sqoop$field_map.put("BROADBAND_IP", this.BROADBAND_IP);
    __sqoop$field_map.put("ROPE_IP", this.ROPE_IP);
    __sqoop$field_map.put("ISP_TYPE", this.ISP_TYPE);
    __sqoop$field_map.put("ISP_PROVIDER", this.ISP_PROVIDER);
    __sqoop$field_map.put("FRANCHISE", this.FRANCHISE);
    __sqoop$field_map.put("DISTRICT_NAME", this.DISTRICT_NAME);
    __sqoop$field_map.put("HARDWARE_SERVICE_PROVIDER", this.HARDWARE_SERVICE_PROVIDER);
    __sqoop$field_map.put("PHONE_SERVICE_PROVIDER", this.PHONE_SERVICE_PROVIDER);
    __sqoop$field_map.put("CAFE_STATUS", this.CAFE_STATUS);
    __sqoop$field_map.put("CAFE_TYPE", this.CAFE_TYPE);
    __sqoop$field_map.put("LOCATION_TYPE", this.LOCATION_TYPE);
    __sqoop$field_map.put("SUPPORT_LEVEL", this.SUPPORT_LEVEL);
    __sqoop$field_map.put("CAFE_EMAIL", this.CAFE_EMAIL);
    __sqoop$field_map.put("DATABASE_TYPE", this.DATABASE_TYPE);
    __sqoop$field_map.put("DATABASE_VERSION", this.DATABASE_VERSION);
    __sqoop$field_map.put("SYSTEM_COORDINATOR", this.SYSTEM_COORDINATOR);
    __sqoop$field_map.put("DISTRICT_NUMBER", this.DISTRICT_NUMBER);
    __sqoop$field_map.put("REGION_NAME", this.REGION_NAME);
    __sqoop$field_map.put("AREA_NAME", this.AREA_NAME);
    __sqoop$field_map.put("POS_INSTALL_DATE", this.POS_INSTALL_DATE);
    __sqoop$field_map.put("POS_INSTALLER_NAME", this.POS_INSTALLER_NAME);
    __sqoop$field_map.put("CABLING_INSTALLER_NAME", this.CABLING_INSTALLER_NAME);
    __sqoop$field_map.put("CREDIT_MERCHANT_ID", this.CREDIT_MERCHANT_ID);
    __sqoop$field_map.put("NETWORK_LOCATION", this.NETWORK_LOCATION);
    __sqoop$field_map.put("VOIP_FLAG", this.VOIP_FLAG);
    __sqoop$field_map.put("ELEARN_IP", this.ELEARN_IP);
    __sqoop$field_map.put("SYSTEM_ATT_VOIP", this.SYSTEM_ATT_VOIP);
    __sqoop$field_map.put("CAFE_AMAZON_FLAG", this.CAFE_AMAZON_FLAG);
    __sqoop$field_map.put("CUST_FACING_DISP_FLAG", this.CUST_FACING_DISP_FLAG);
    __sqoop$field_map.put("TABLE_SERVICE", this.TABLE_SERVICE);
    __sqoop$field_map.put("KDS_SCHEMES", this.KDS_SCHEMES);
    __sqoop$field_map.put("EOU_STATUS_FLAG", this.EOU_STATUS_FLAG);
    __sqoop$field_map.put("SYSTEM_TMX_CUTOVER", this.SYSTEM_TMX_CUTOVER);
    __sqoop$field_map.put("AREA_DESC", this.AREA_DESC);
    __sqoop$field_map.put("DISTRICT_MGRCELL", this.DISTRICT_MGRCELL);
    __sqoop$field_map.put("DISTRICT_MGREMAIL", this.DISTRICT_MGREMAIL);
    __sqoop$field_map.put("DISTRICT_MGRNAME", this.DISTRICT_MGRNAME);
    __sqoop$field_map.put("ORG_NAME", this.ORG_NAME);
    __sqoop$field_map.put("BOH_NETWORK_IP", this.BOH_NETWORK_IP);
    __sqoop$field_map.put("PHONE_SUPPORT_PROVIDER", this.PHONE_SUPPORT_PROVIDER);
    __sqoop$field_map.put("ADDRESS2", this.ADDRESS2);
    __sqoop$field_map.put("PHONE2", this.PHONE2);
    __sqoop$field_map.put("FTA_EMAILADDR", this.FTA_EMAILADDR);
    __sqoop$field_map.put("ELEARNING_IP", this.ELEARNING_IP);
    __sqoop$field_map.put("NETWORK_LOCATION_SIDE", this.NETWORK_LOCATION_SIDE);
    __sqoop$field_map.put("COMPANY_NAME", this.COMPANY_NAME);
    __sqoop$field_map.put("COMPANY_DESC", this.COMPANY_DESC);
    __sqoop$field_map.put("LOY_LAUNCH_DATE", this.LOY_LAUNCH_DATE);
    __sqoop$field_map.put("MAIN_LEVEL1_NAME", this.MAIN_LEVEL1_NAME);
    __sqoop$field_map.put("MAIN_LEVEL1_DESC", this.MAIN_LEVEL1_DESC);
    __sqoop$field_map.put("MAIN_LEVEL1_MGR_NAME", this.MAIN_LEVEL1_MGR_NAME);
    __sqoop$field_map.put("MAIN_LEVEL2_NAME", this.MAIN_LEVEL2_NAME);
    __sqoop$field_map.put("MAIN_LEVEL2_DESC", this.MAIN_LEVEL2_DESC);
    __sqoop$field_map.put("MAIN_LEVEL2_MGR_NAME", this.MAIN_LEVEL2_MGR_NAME);
    __sqoop$field_map.put("MAIN_LEVEL3_NAME", this.MAIN_LEVEL3_NAME);
    __sqoop$field_map.put("MAIN_LEVEL3_DESC", this.MAIN_LEVEL3_DESC);
    __sqoop$field_map.put("MAIN_LEVEL3_MGR_NAME", this.MAIN_LEVEL3_MGR_NAME);
    __sqoop$field_map.put("MAIN_LEVEL4_NAME", this.MAIN_LEVEL4_NAME);
    __sqoop$field_map.put("MAIN_LEVEL4_DESC", this.MAIN_LEVEL4_DESC);
    __sqoop$field_map.put("MAIN_LEVEL4_MGR_NAME", this.MAIN_LEVEL4_MGR_NAME);
    __sqoop$field_map.put("MAIN_LEVEL5_NAME", this.MAIN_LEVEL5_NAME);
    __sqoop$field_map.put("MAIN_LEVEL5_DESC", this.MAIN_LEVEL5_DESC);
    __sqoop$field_map.put("MAIN_LEVEL5_MGR_NAME", this.MAIN_LEVEL5_MGR_NAME);
    __sqoop$field_map.put("MAIN_LEVEL6_NAME", this.MAIN_LEVEL6_NAME);
    __sqoop$field_map.put("MAIN_LEVEL6_DESC", this.MAIN_LEVEL6_DESC);
    __sqoop$field_map.put("MAIN_LEVEL6_MGR_NAME", this.MAIN_LEVEL6_MGR_NAME);
    __sqoop$field_map.put("MAIN_LEVEL7_NAME", this.MAIN_LEVEL7_NAME);
    __sqoop$field_map.put("MAIN_LEVEL7_DESC", this.MAIN_LEVEL7_DESC);
    __sqoop$field_map.put("MAIN_LEVEL7_MGR_NAME", this.MAIN_LEVEL7_MGR_NAME);
    __sqoop$field_map.put("MAIN_LEVEL8_NAME", this.MAIN_LEVEL8_NAME);
    __sqoop$field_map.put("MAIN_LEVEL8_DESC", this.MAIN_LEVEL8_DESC);
    __sqoop$field_map.put("MAIN_LEVEL8_MGR_NAME", this.MAIN_LEVEL8_MGR_NAME);
    __sqoop$field_map.put("MAIN_LEVEL9_NAME", this.MAIN_LEVEL9_NAME);
    __sqoop$field_map.put("MAIN_LEVEL9_DESC", this.MAIN_LEVEL9_DESC);
    __sqoop$field_map.put("MAIN_LEVEL9_MGR_NAME", this.MAIN_LEVEL9_MGR_NAME);
    __sqoop$field_map.put("MAIN_LEVEL10_NAME", this.MAIN_LEVEL10_NAME);
    __sqoop$field_map.put("MAIN_LEVEL10_DESC", this.MAIN_LEVEL10_DESC);
    __sqoop$field_map.put("MAIN_LEVEL10_MGR_NAME", this.MAIN_LEVEL10_MGR_NAME);
    __sqoop$field_map.put("FILE_DTTM", this.FILE_DTTM);
    __sqoop$field_map.put("INSERT_DTTM", this.INSERT_DTTM);
    __sqoop$field_map.put("UPDATE_DTTM", this.UPDATE_DTTM);
    __sqoop$field_map.put("LOAD_DW_ID", this.LOAD_DW_ID);
    __sqoop$field_map.put("VERSION", this.VERSION);
    __sqoop$field_map.put("COUNTRY_DW_ID", this.COUNTRY_DW_ID);
    __sqoop$field_map.put("COMPANY_ID", this.COMPANY_ID);
    __sqoop$field_map.put("COMPANY_DW_ID", this.COMPANY_DW_ID);
    __sqoop$field_map.put("CAFE_MANAGER", this.CAFE_MANAGER);
    __sqoop$field_map.put("CATERING_COORDINATORS", this.CATERING_COORDINATORS);
    __sqoop$field_map.put("MARKET_NAME", this.MARKET_NAME);
    __sqoop$field_map.put("YEAR_BASE_CAFE", this.YEAR_BASE_CAFE);
    __sqoop$field_map.put("MARKETING_LOCATION_DW_ID", this.MARKETING_LOCATION_DW_ID);
    __sqoop$field_map.put("DMA_NAME", this.DMA_NAME);
    __sqoop$field_map.put("LABOR_INVESTMENT_AMT", this.LABOR_INVESTMENT_AMT);
    __sqoop$field_map.put("CATERING_RCSM", this.CATERING_RCSM);
    __sqoop$field_map.put("CATERING_SR_RCSM", this.CATERING_SR_RCSM);
    __sqoop$field_map.put("PANERA_2_0_STATUS", this.PANERA_2_0_STATUS);
    __sqoop$field_map.put("RPU_STATUS", this.RPU_STATUS);
    __sqoop$field_map.put("HUB_CLUSTER_NAME", this.HUB_CLUSTER_NAME);
    __sqoop$field_map.put("HUB_CLUSTER_CLASS", this.HUB_CLUSTER_CLASS);
    __sqoop$field_map.put("ECOMMERCE_CAFE_TYPE_CATERING", this.ECOMMERCE_CAFE_TYPE_CATERING);
    __sqoop$field_map.put("ECOMMERCE_CAFE_TYPE", this.ECOMMERCE_CAFE_TYPE);
    __sqoop$field_map.put("CATERING_ONLINE_DESIGNATION", this.CATERING_ONLINE_DESIGNATION);
    __sqoop$field_map.put("ECOMMERCE_CATERING_HUB_PARENT", this.ECOMMERCE_CATERING_HUB_PARENT);
    __sqoop$field_map.put("CATERING_ONLINE_STATUS", this.CATERING_ONLINE_STATUS);
    __sqoop$field_map.put("ECOMMERCE_KIOSKS_FLAG", this.ECOMMERCE_KIOSKS_FLAG);
    __sqoop$field_map.put("ECOMMERCE_RETAIL_DELIVERY_FLAG", this.ECOMMERCE_RETAIL_DELIVERY_FLAG);
    __sqoop$field_map.put("ECOMMERCE_RETAIL_DINE_IN_FLAG", this.ECOMMERCE_RETAIL_DINE_IN_FLAG);
    __sqoop$field_map.put("ECOMMERCE_RETAIL_PICKUP_FLAG", this.ECOMMERCE_RETAIL_PICKUP_FLAG);
    __sqoop$field_map.put("ECOMMERCE_LAUNCH_CATERING_2_0", this.ECOMMERCE_LAUNCH_CATERING_2_0);
    __sqoop$field_map.put("ECOMMERCE_LAUNCH_RPU", this.ECOMMERCE_LAUNCH_RPU);
    __sqoop$field_map.put("ECOMMERCE_LAUNCH_PANERA_2_0", this.ECOMMERCE_LAUNCH_PANERA_2_0);
    __sqoop$field_map.put("ECOMMERCE_LAUNCH_DELIVERY", this.ECOMMERCE_LAUNCH_DELIVERY);
    __sqoop$field_map.put("ECOMMERCE_LAUNCH_DINE_IN", this.ECOMMERCE_LAUNCH_DINE_IN);
    __sqoop$field_map.put("ECOMMERCE_LAUNCH_KIOSKS", this.ECOMMERCE_LAUNCH_KIOSKS);
    __sqoop$field_map.put("LAUNCH_2_0_PERIOD_NBR_IN_EPOCH", this.LAUNCH_2_0_PERIOD_NBR_IN_EPOCH);
    __sqoop$field_map.put("LAUNCH_2_0_WEEK_NBR_IN_EPOCH", this.LAUNCH_2_0_WEEK_NBR_IN_EPOCH);
    __sqoop$field_map.put("LAUNCH_DEL_PERIOD_NBR_IN_EPOCH", this.LAUNCH_DEL_PERIOD_NBR_IN_EPOCH);
    __sqoop$field_map.put("LAUNCH_DEL_WEEK_NBR_IN_EPOCH", this.LAUNCH_DEL_WEEK_NBR_IN_EPOCH);
    __sqoop$field_map.put("CAFE_GROUP_DW_ID", this.CAFE_GROUP_DW_ID);
    __sqoop$field_map.put("DISTRIBUTION_CTR_DW_ID", this.DISTRIBUTION_CTR_DW_ID);
    __sqoop$field_map.put("DISTRICT_DESC", this.DISTRICT_DESC);
    __sqoop$field_map.put("PRIMARY_MENU_GROUP", this.PRIMARY_MENU_GROUP);
    __sqoop$field_map.put("PRICING_TIER_GROUP", this.PRICING_TIER_GROUP);
    __sqoop$field_map.put("ECOMMERCE_LAUNCH_OPS_INTEGRITY", this.ECOMMERCE_LAUNCH_OPS_INTEGRITY);
    __sqoop$field_map.put("CERTIFIED_TRAINING_CAFE", this.CERTIFIED_TRAINING_CAFE);
    __sqoop$field_map.put("COMMISSARY_DW_ID", this.COMMISSARY_DW_ID);
    __sqoop$field_map.put("COMMISSARY_NBR", this.COMMISSARY_NBR);
    __sqoop$field_map.put("COMMISSARY_NAME", this.COMMISSARY_NAME);
    __sqoop$field_map.put("OPENED_DT_PERIOD_NBR_IN_EPOCH", this.OPENED_DT_PERIOD_NBR_IN_EPOCH);
    __sqoop$field_map.put("OPENED_DT_WEEK_NBR_IN_EPOCH", this.OPENED_DT_WEEK_NBR_IN_EPOCH);
    __sqoop$field_map.put("GL_STORE_NBR", this.GL_STORE_NBR);
    __sqoop$field_map.put("PAYROLL_PROCESSOR_BRANCH", this.PAYROLL_PROCESSOR_BRANCH);
    __sqoop$field_map.put("PAYROLL_PROCESSOR_DIVISION", this.PAYROLL_PROCESSOR_DIVISION);
    __sqoop$field_map.put("LOAD_DTTM", this.LOAD_DTTM);
    __sqoop$field_map.put("LOAD_BY", this.LOAD_BY);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
