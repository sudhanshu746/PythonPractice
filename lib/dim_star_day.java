// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 29 17:01:29 GMT 2017
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

public class dim_star_day extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Z_DAY_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Z_DAY_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("DAY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DAY = (java.sql.Timestamp)value;
      }
    });
    setters.put("DAY_NBR_IN_EPOCH", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DAY_NBR_IN_EPOCH = (java.math.BigDecimal)value;
      }
    });
    setters.put("DAY_DW_ID_LY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DAY_DW_ID_LY = (java.math.BigDecimal)value;
      }
    });
    setters.put("DAY_LY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DAY_LY = (java.sql.Timestamp)value;
      }
    });
    setters.put("DAY_NBR_IN_EPOCH_LY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DAY_NBR_IN_EPOCH_LY = (java.math.BigDecimal)value;
      }
    });
    setters.put("DAY_IN_WEEK", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DAY_IN_WEEK = (java.math.BigDecimal)value;
      }
    });
    setters.put("DAY_IN_PERIOD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DAY_IN_PERIOD = (java.math.BigDecimal)value;
      }
    });
    setters.put("DAY_IN_QUARTER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DAY_IN_QUARTER = (java.math.BigDecimal)value;
      }
    });
    setters.put("DAY_IN_YEAR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DAY_IN_YEAR = (java.math.BigDecimal)value;
      }
    });
    setters.put("WEEK_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("WEEK_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_NAME = (String)value;
      }
    });
    setters.put("WEEK_IN_PERIOD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_IN_PERIOD = (java.math.BigDecimal)value;
      }
    });
    setters.put("WEEK_IN_QUARTER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_IN_QUARTER = (java.math.BigDecimal)value;
      }
    });
    setters.put("WEEK_IN_YEAR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_IN_YEAR = (java.math.BigDecimal)value;
      }
    });
    setters.put("WEEK_START_DATE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_START_DATE = (java.sql.Timestamp)value;
      }
    });
    setters.put("WEEK_END_DATE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_END_DATE = (java.sql.Timestamp)value;
      }
    });
    setters.put("WEEK_START_DAY_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_START_DAY_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("WEEK_END_DAY_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_END_DAY_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("WEEK_NBR_IN_EPOCH", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_NBR_IN_EPOCH = (java.math.BigDecimal)value;
      }
    });
    setters.put("WEEK_GL_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_GL_NAME = (String)value;
      }
    });
    setters.put("WEEK_GL_STATUS", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_GL_STATUS = (String)value;
      }
    });
    setters.put("WEEK_DW_ID_LY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_DW_ID_LY = (java.math.BigDecimal)value;
      }
    });
    setters.put("WEEK_START_DATE_LY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_START_DATE_LY = (java.sql.Timestamp)value;
      }
    });
    setters.put("WEEK_END_DATE_LY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_END_DATE_LY = (java.sql.Timestamp)value;
      }
    });
    setters.put("WEEK_START_DAY_DW_ID_LY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_START_DAY_DW_ID_LY = (java.math.BigDecimal)value;
      }
    });
    setters.put("WEEK_END_DAY_DW_ID_LY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_END_DAY_DW_ID_LY = (java.math.BigDecimal)value;
      }
    });
    setters.put("WEEK_NBR_IN_EPOCH_LY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_NBR_IN_EPOCH_LY = (java.math.BigDecimal)value;
      }
    });
    setters.put("PERIOD_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PERIOD_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("PERIOD_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PERIOD_NAME = (String)value;
      }
    });
    setters.put("PERIOD_IN_QUARTER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PERIOD_IN_QUARTER = (java.math.BigDecimal)value;
      }
    });
    setters.put("PERIOD_IN_YEAR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PERIOD_IN_YEAR = (java.math.BigDecimal)value;
      }
    });
    setters.put("PERIOD_START_DATE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PERIOD_START_DATE = (java.sql.Timestamp)value;
      }
    });
    setters.put("PERIOD_END_DATE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PERIOD_END_DATE = (java.sql.Timestamp)value;
      }
    });
    setters.put("PERIOD_START_DAY_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PERIOD_START_DAY_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("PERIOD_END_DAY_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PERIOD_END_DAY_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("PERIOD_NBR_IN_EPOCH", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PERIOD_NBR_IN_EPOCH = (java.math.BigDecimal)value;
      }
    });
    setters.put("PERIOD_GL_STATUS", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PERIOD_GL_STATUS = (String)value;
      }
    });
    setters.put("QUARTER_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QUARTER_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("QUARTER_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QUARTER_NAME = (String)value;
      }
    });
    setters.put("QUARTER_IN_YEAR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QUARTER_IN_YEAR = (java.math.BigDecimal)value;
      }
    });
    setters.put("QUARTER_START_DATE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QUARTER_START_DATE = (java.sql.Timestamp)value;
      }
    });
    setters.put("QUARTER_END_DATE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QUARTER_END_DATE = (java.sql.Timestamp)value;
      }
    });
    setters.put("QUARTER_START_DAY_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QUARTER_START_DAY_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("QUARTER_END_DAY_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QUARTER_END_DAY_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("QUARTER_NBR_IN_EPOCH", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QUARTER_NBR_IN_EPOCH = (java.math.BigDecimal)value;
      }
    });
    setters.put("QUARTER_GL_STATUS", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QUARTER_GL_STATUS = (String)value;
      }
    });
    setters.put("YEAR_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        YEAR_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("YEAR_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        YEAR_NBR = (java.math.BigDecimal)value;
      }
    });
    setters.put("YEAR_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        YEAR_CODE = (String)value;
      }
    });
    setters.put("YEAR_START_DATE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        YEAR_START_DATE = (java.sql.Timestamp)value;
      }
    });
    setters.put("YEAR_END_DATE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        YEAR_END_DATE = (java.sql.Timestamp)value;
      }
    });
    setters.put("YEAR_START_DAY_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        YEAR_START_DAY_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("YEAR_END_DAY_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        YEAR_END_DAY_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("YEAR_NBR_IN_EPOCH", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        YEAR_NBR_IN_EPOCH = (java.math.BigDecimal)value;
      }
    });
    setters.put("YEAR_GL_STATUS", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        YEAR_GL_STATUS = (String)value;
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
    setters.put("DAY_DW_ID_LY_CAL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DAY_DW_ID_LY_CAL = (java.math.BigDecimal)value;
      }
    });
    setters.put("DAY_LY_CAL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DAY_LY_CAL = (java.sql.Timestamp)value;
      }
    });
    setters.put("DAY_NBR_IN_EPOCH_LY_CAL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DAY_NBR_IN_EPOCH_LY_CAL = (java.math.BigDecimal)value;
      }
    });
    setters.put("WEEK_DW_ID_LY_CAL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_DW_ID_LY_CAL = (java.math.BigDecimal)value;
      }
    });
    setters.put("WEEK_START_DATE_LY_CAL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_START_DATE_LY_CAL = (java.sql.Timestamp)value;
      }
    });
    setters.put("WEEK_END_DATE_LY_CAL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_END_DATE_LY_CAL = (java.sql.Timestamp)value;
      }
    });
    setters.put("WEEK_START_DAY_DW_ID_LY_CAL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_START_DAY_DW_ID_LY_CAL = (java.math.BigDecimal)value;
      }
    });
    setters.put("WEEK_END_DAY_DW_ID_LY_CAL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_END_DAY_DW_ID_LY_CAL = (java.math.BigDecimal)value;
      }
    });
    setters.put("WEEK_NBR_IN_EPOCH_LY_CAL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_NBR_IN_EPOCH_LY_CAL = (java.math.BigDecimal)value;
      }
    });
    setters.put("DAY_DW_ID_2Y_CAL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DAY_DW_ID_2Y_CAL = (java.math.BigDecimal)value;
      }
    });
    setters.put("DAY_2Y_CAL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DAY_2Y_CAL = (java.sql.Timestamp)value;
      }
    });
    setters.put("DAY_NBR_IN_EPOCH_2Y_CAL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DAY_NBR_IN_EPOCH_2Y_CAL = (java.math.BigDecimal)value;
      }
    });
    setters.put("WEEK_DW_ID_2Y_CAL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_DW_ID_2Y_CAL = (java.math.BigDecimal)value;
      }
    });
    setters.put("WEEK_START_DATE_2Y_CAL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_START_DATE_2Y_CAL = (java.sql.Timestamp)value;
      }
    });
    setters.put("WEEK_END_DATE_2Y_CAL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_END_DATE_2Y_CAL = (java.sql.Timestamp)value;
      }
    });
    setters.put("WEEK_START_DAY_DW_ID_2Y_CAL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_START_DAY_DW_ID_2Y_CAL = (java.math.BigDecimal)value;
      }
    });
    setters.put("WEEK_END_DAY_DW_ID_2Y_CAL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_END_DAY_DW_ID_2Y_CAL = (java.math.BigDecimal)value;
      }
    });
    setters.put("WEEK_NBR_IN_EPOCH_2Y_CAL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEEK_NBR_IN_EPOCH_2Y_CAL = (java.math.BigDecimal)value;
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
  public dim_star_day() {
    init0();
  }
  private java.math.BigDecimal Z_DAY_DW_ID;
  public java.math.BigDecimal get_Z_DAY_DW_ID() {
    return Z_DAY_DW_ID;
  }
  public void set_Z_DAY_DW_ID(java.math.BigDecimal Z_DAY_DW_ID) {
    this.Z_DAY_DW_ID = Z_DAY_DW_ID;
  }
  public dim_star_day with_Z_DAY_DW_ID(java.math.BigDecimal Z_DAY_DW_ID) {
    this.Z_DAY_DW_ID = Z_DAY_DW_ID;
    return this;
  }
  private java.sql.Timestamp DAY;
  public java.sql.Timestamp get_DAY() {
    return DAY;
  }
  public void set_DAY(java.sql.Timestamp DAY) {
    this.DAY = DAY;
  }
  public dim_star_day with_DAY(java.sql.Timestamp DAY) {
    this.DAY = DAY;
    return this;
  }
  private java.math.BigDecimal DAY_NBR_IN_EPOCH;
  public java.math.BigDecimal get_DAY_NBR_IN_EPOCH() {
    return DAY_NBR_IN_EPOCH;
  }
  public void set_DAY_NBR_IN_EPOCH(java.math.BigDecimal DAY_NBR_IN_EPOCH) {
    this.DAY_NBR_IN_EPOCH = DAY_NBR_IN_EPOCH;
  }
  public dim_star_day with_DAY_NBR_IN_EPOCH(java.math.BigDecimal DAY_NBR_IN_EPOCH) {
    this.DAY_NBR_IN_EPOCH = DAY_NBR_IN_EPOCH;
    return this;
  }
  private java.math.BigDecimal DAY_DW_ID_LY;
  public java.math.BigDecimal get_DAY_DW_ID_LY() {
    return DAY_DW_ID_LY;
  }
  public void set_DAY_DW_ID_LY(java.math.BigDecimal DAY_DW_ID_LY) {
    this.DAY_DW_ID_LY = DAY_DW_ID_LY;
  }
  public dim_star_day with_DAY_DW_ID_LY(java.math.BigDecimal DAY_DW_ID_LY) {
    this.DAY_DW_ID_LY = DAY_DW_ID_LY;
    return this;
  }
  private java.sql.Timestamp DAY_LY;
  public java.sql.Timestamp get_DAY_LY() {
    return DAY_LY;
  }
  public void set_DAY_LY(java.sql.Timestamp DAY_LY) {
    this.DAY_LY = DAY_LY;
  }
  public dim_star_day with_DAY_LY(java.sql.Timestamp DAY_LY) {
    this.DAY_LY = DAY_LY;
    return this;
  }
  private java.math.BigDecimal DAY_NBR_IN_EPOCH_LY;
  public java.math.BigDecimal get_DAY_NBR_IN_EPOCH_LY() {
    return DAY_NBR_IN_EPOCH_LY;
  }
  public void set_DAY_NBR_IN_EPOCH_LY(java.math.BigDecimal DAY_NBR_IN_EPOCH_LY) {
    this.DAY_NBR_IN_EPOCH_LY = DAY_NBR_IN_EPOCH_LY;
  }
  public dim_star_day with_DAY_NBR_IN_EPOCH_LY(java.math.BigDecimal DAY_NBR_IN_EPOCH_LY) {
    this.DAY_NBR_IN_EPOCH_LY = DAY_NBR_IN_EPOCH_LY;
    return this;
  }
  private java.math.BigDecimal DAY_IN_WEEK;
  public java.math.BigDecimal get_DAY_IN_WEEK() {
    return DAY_IN_WEEK;
  }
  public void set_DAY_IN_WEEK(java.math.BigDecimal DAY_IN_WEEK) {
    this.DAY_IN_WEEK = DAY_IN_WEEK;
  }
  public dim_star_day with_DAY_IN_WEEK(java.math.BigDecimal DAY_IN_WEEK) {
    this.DAY_IN_WEEK = DAY_IN_WEEK;
    return this;
  }
  private java.math.BigDecimal DAY_IN_PERIOD;
  public java.math.BigDecimal get_DAY_IN_PERIOD() {
    return DAY_IN_PERIOD;
  }
  public void set_DAY_IN_PERIOD(java.math.BigDecimal DAY_IN_PERIOD) {
    this.DAY_IN_PERIOD = DAY_IN_PERIOD;
  }
  public dim_star_day with_DAY_IN_PERIOD(java.math.BigDecimal DAY_IN_PERIOD) {
    this.DAY_IN_PERIOD = DAY_IN_PERIOD;
    return this;
  }
  private java.math.BigDecimal DAY_IN_QUARTER;
  public java.math.BigDecimal get_DAY_IN_QUARTER() {
    return DAY_IN_QUARTER;
  }
  public void set_DAY_IN_QUARTER(java.math.BigDecimal DAY_IN_QUARTER) {
    this.DAY_IN_QUARTER = DAY_IN_QUARTER;
  }
  public dim_star_day with_DAY_IN_QUARTER(java.math.BigDecimal DAY_IN_QUARTER) {
    this.DAY_IN_QUARTER = DAY_IN_QUARTER;
    return this;
  }
  private java.math.BigDecimal DAY_IN_YEAR;
  public java.math.BigDecimal get_DAY_IN_YEAR() {
    return DAY_IN_YEAR;
  }
  public void set_DAY_IN_YEAR(java.math.BigDecimal DAY_IN_YEAR) {
    this.DAY_IN_YEAR = DAY_IN_YEAR;
  }
  public dim_star_day with_DAY_IN_YEAR(java.math.BigDecimal DAY_IN_YEAR) {
    this.DAY_IN_YEAR = DAY_IN_YEAR;
    return this;
  }
  private java.math.BigDecimal WEEK_DW_ID;
  public java.math.BigDecimal get_WEEK_DW_ID() {
    return WEEK_DW_ID;
  }
  public void set_WEEK_DW_ID(java.math.BigDecimal WEEK_DW_ID) {
    this.WEEK_DW_ID = WEEK_DW_ID;
  }
  public dim_star_day with_WEEK_DW_ID(java.math.BigDecimal WEEK_DW_ID) {
    this.WEEK_DW_ID = WEEK_DW_ID;
    return this;
  }
  private String WEEK_NAME;
  public String get_WEEK_NAME() {
    return WEEK_NAME;
  }
  public void set_WEEK_NAME(String WEEK_NAME) {
    this.WEEK_NAME = WEEK_NAME;
  }
  public dim_star_day with_WEEK_NAME(String WEEK_NAME) {
    this.WEEK_NAME = WEEK_NAME;
    return this;
  }
  private java.math.BigDecimal WEEK_IN_PERIOD;
  public java.math.BigDecimal get_WEEK_IN_PERIOD() {
    return WEEK_IN_PERIOD;
  }
  public void set_WEEK_IN_PERIOD(java.math.BigDecimal WEEK_IN_PERIOD) {
    this.WEEK_IN_PERIOD = WEEK_IN_PERIOD;
  }
  public dim_star_day with_WEEK_IN_PERIOD(java.math.BigDecimal WEEK_IN_PERIOD) {
    this.WEEK_IN_PERIOD = WEEK_IN_PERIOD;
    return this;
  }
  private java.math.BigDecimal WEEK_IN_QUARTER;
  public java.math.BigDecimal get_WEEK_IN_QUARTER() {
    return WEEK_IN_QUARTER;
  }
  public void set_WEEK_IN_QUARTER(java.math.BigDecimal WEEK_IN_QUARTER) {
    this.WEEK_IN_QUARTER = WEEK_IN_QUARTER;
  }
  public dim_star_day with_WEEK_IN_QUARTER(java.math.BigDecimal WEEK_IN_QUARTER) {
    this.WEEK_IN_QUARTER = WEEK_IN_QUARTER;
    return this;
  }
  private java.math.BigDecimal WEEK_IN_YEAR;
  public java.math.BigDecimal get_WEEK_IN_YEAR() {
    return WEEK_IN_YEAR;
  }
  public void set_WEEK_IN_YEAR(java.math.BigDecimal WEEK_IN_YEAR) {
    this.WEEK_IN_YEAR = WEEK_IN_YEAR;
  }
  public dim_star_day with_WEEK_IN_YEAR(java.math.BigDecimal WEEK_IN_YEAR) {
    this.WEEK_IN_YEAR = WEEK_IN_YEAR;
    return this;
  }
  private java.sql.Timestamp WEEK_START_DATE;
  public java.sql.Timestamp get_WEEK_START_DATE() {
    return WEEK_START_DATE;
  }
  public void set_WEEK_START_DATE(java.sql.Timestamp WEEK_START_DATE) {
    this.WEEK_START_DATE = WEEK_START_DATE;
  }
  public dim_star_day with_WEEK_START_DATE(java.sql.Timestamp WEEK_START_DATE) {
    this.WEEK_START_DATE = WEEK_START_DATE;
    return this;
  }
  private java.sql.Timestamp WEEK_END_DATE;
  public java.sql.Timestamp get_WEEK_END_DATE() {
    return WEEK_END_DATE;
  }
  public void set_WEEK_END_DATE(java.sql.Timestamp WEEK_END_DATE) {
    this.WEEK_END_DATE = WEEK_END_DATE;
  }
  public dim_star_day with_WEEK_END_DATE(java.sql.Timestamp WEEK_END_DATE) {
    this.WEEK_END_DATE = WEEK_END_DATE;
    return this;
  }
  private java.math.BigDecimal WEEK_START_DAY_DW_ID;
  public java.math.BigDecimal get_WEEK_START_DAY_DW_ID() {
    return WEEK_START_DAY_DW_ID;
  }
  public void set_WEEK_START_DAY_DW_ID(java.math.BigDecimal WEEK_START_DAY_DW_ID) {
    this.WEEK_START_DAY_DW_ID = WEEK_START_DAY_DW_ID;
  }
  public dim_star_day with_WEEK_START_DAY_DW_ID(java.math.BigDecimal WEEK_START_DAY_DW_ID) {
    this.WEEK_START_DAY_DW_ID = WEEK_START_DAY_DW_ID;
    return this;
  }
  private java.math.BigDecimal WEEK_END_DAY_DW_ID;
  public java.math.BigDecimal get_WEEK_END_DAY_DW_ID() {
    return WEEK_END_DAY_DW_ID;
  }
  public void set_WEEK_END_DAY_DW_ID(java.math.BigDecimal WEEK_END_DAY_DW_ID) {
    this.WEEK_END_DAY_DW_ID = WEEK_END_DAY_DW_ID;
  }
  public dim_star_day with_WEEK_END_DAY_DW_ID(java.math.BigDecimal WEEK_END_DAY_DW_ID) {
    this.WEEK_END_DAY_DW_ID = WEEK_END_DAY_DW_ID;
    return this;
  }
  private java.math.BigDecimal WEEK_NBR_IN_EPOCH;
  public java.math.BigDecimal get_WEEK_NBR_IN_EPOCH() {
    return WEEK_NBR_IN_EPOCH;
  }
  public void set_WEEK_NBR_IN_EPOCH(java.math.BigDecimal WEEK_NBR_IN_EPOCH) {
    this.WEEK_NBR_IN_EPOCH = WEEK_NBR_IN_EPOCH;
  }
  public dim_star_day with_WEEK_NBR_IN_EPOCH(java.math.BigDecimal WEEK_NBR_IN_EPOCH) {
    this.WEEK_NBR_IN_EPOCH = WEEK_NBR_IN_EPOCH;
    return this;
  }
  private String WEEK_GL_NAME;
  public String get_WEEK_GL_NAME() {
    return WEEK_GL_NAME;
  }
  public void set_WEEK_GL_NAME(String WEEK_GL_NAME) {
    this.WEEK_GL_NAME = WEEK_GL_NAME;
  }
  public dim_star_day with_WEEK_GL_NAME(String WEEK_GL_NAME) {
    this.WEEK_GL_NAME = WEEK_GL_NAME;
    return this;
  }
  private String WEEK_GL_STATUS;
  public String get_WEEK_GL_STATUS() {
    return WEEK_GL_STATUS;
  }
  public void set_WEEK_GL_STATUS(String WEEK_GL_STATUS) {
    this.WEEK_GL_STATUS = WEEK_GL_STATUS;
  }
  public dim_star_day with_WEEK_GL_STATUS(String WEEK_GL_STATUS) {
    this.WEEK_GL_STATUS = WEEK_GL_STATUS;
    return this;
  }
  private java.math.BigDecimal WEEK_DW_ID_LY;
  public java.math.BigDecimal get_WEEK_DW_ID_LY() {
    return WEEK_DW_ID_LY;
  }
  public void set_WEEK_DW_ID_LY(java.math.BigDecimal WEEK_DW_ID_LY) {
    this.WEEK_DW_ID_LY = WEEK_DW_ID_LY;
  }
  public dim_star_day with_WEEK_DW_ID_LY(java.math.BigDecimal WEEK_DW_ID_LY) {
    this.WEEK_DW_ID_LY = WEEK_DW_ID_LY;
    return this;
  }
  private java.sql.Timestamp WEEK_START_DATE_LY;
  public java.sql.Timestamp get_WEEK_START_DATE_LY() {
    return WEEK_START_DATE_LY;
  }
  public void set_WEEK_START_DATE_LY(java.sql.Timestamp WEEK_START_DATE_LY) {
    this.WEEK_START_DATE_LY = WEEK_START_DATE_LY;
  }
  public dim_star_day with_WEEK_START_DATE_LY(java.sql.Timestamp WEEK_START_DATE_LY) {
    this.WEEK_START_DATE_LY = WEEK_START_DATE_LY;
    return this;
  }
  private java.sql.Timestamp WEEK_END_DATE_LY;
  public java.sql.Timestamp get_WEEK_END_DATE_LY() {
    return WEEK_END_DATE_LY;
  }
  public void set_WEEK_END_DATE_LY(java.sql.Timestamp WEEK_END_DATE_LY) {
    this.WEEK_END_DATE_LY = WEEK_END_DATE_LY;
  }
  public dim_star_day with_WEEK_END_DATE_LY(java.sql.Timestamp WEEK_END_DATE_LY) {
    this.WEEK_END_DATE_LY = WEEK_END_DATE_LY;
    return this;
  }
  private java.math.BigDecimal WEEK_START_DAY_DW_ID_LY;
  public java.math.BigDecimal get_WEEK_START_DAY_DW_ID_LY() {
    return WEEK_START_DAY_DW_ID_LY;
  }
  public void set_WEEK_START_DAY_DW_ID_LY(java.math.BigDecimal WEEK_START_DAY_DW_ID_LY) {
    this.WEEK_START_DAY_DW_ID_LY = WEEK_START_DAY_DW_ID_LY;
  }
  public dim_star_day with_WEEK_START_DAY_DW_ID_LY(java.math.BigDecimal WEEK_START_DAY_DW_ID_LY) {
    this.WEEK_START_DAY_DW_ID_LY = WEEK_START_DAY_DW_ID_LY;
    return this;
  }
  private java.math.BigDecimal WEEK_END_DAY_DW_ID_LY;
  public java.math.BigDecimal get_WEEK_END_DAY_DW_ID_LY() {
    return WEEK_END_DAY_DW_ID_LY;
  }
  public void set_WEEK_END_DAY_DW_ID_LY(java.math.BigDecimal WEEK_END_DAY_DW_ID_LY) {
    this.WEEK_END_DAY_DW_ID_LY = WEEK_END_DAY_DW_ID_LY;
  }
  public dim_star_day with_WEEK_END_DAY_DW_ID_LY(java.math.BigDecimal WEEK_END_DAY_DW_ID_LY) {
    this.WEEK_END_DAY_DW_ID_LY = WEEK_END_DAY_DW_ID_LY;
    return this;
  }
  private java.math.BigDecimal WEEK_NBR_IN_EPOCH_LY;
  public java.math.BigDecimal get_WEEK_NBR_IN_EPOCH_LY() {
    return WEEK_NBR_IN_EPOCH_LY;
  }
  public void set_WEEK_NBR_IN_EPOCH_LY(java.math.BigDecimal WEEK_NBR_IN_EPOCH_LY) {
    this.WEEK_NBR_IN_EPOCH_LY = WEEK_NBR_IN_EPOCH_LY;
  }
  public dim_star_day with_WEEK_NBR_IN_EPOCH_LY(java.math.BigDecimal WEEK_NBR_IN_EPOCH_LY) {
    this.WEEK_NBR_IN_EPOCH_LY = WEEK_NBR_IN_EPOCH_LY;
    return this;
  }
  private java.math.BigDecimal PERIOD_DW_ID;
  public java.math.BigDecimal get_PERIOD_DW_ID() {
    return PERIOD_DW_ID;
  }
  public void set_PERIOD_DW_ID(java.math.BigDecimal PERIOD_DW_ID) {
    this.PERIOD_DW_ID = PERIOD_DW_ID;
  }
  public dim_star_day with_PERIOD_DW_ID(java.math.BigDecimal PERIOD_DW_ID) {
    this.PERIOD_DW_ID = PERIOD_DW_ID;
    return this;
  }
  private String PERIOD_NAME;
  public String get_PERIOD_NAME() {
    return PERIOD_NAME;
  }
  public void set_PERIOD_NAME(String PERIOD_NAME) {
    this.PERIOD_NAME = PERIOD_NAME;
  }
  public dim_star_day with_PERIOD_NAME(String PERIOD_NAME) {
    this.PERIOD_NAME = PERIOD_NAME;
    return this;
  }
  private java.math.BigDecimal PERIOD_IN_QUARTER;
  public java.math.BigDecimal get_PERIOD_IN_QUARTER() {
    return PERIOD_IN_QUARTER;
  }
  public void set_PERIOD_IN_QUARTER(java.math.BigDecimal PERIOD_IN_QUARTER) {
    this.PERIOD_IN_QUARTER = PERIOD_IN_QUARTER;
  }
  public dim_star_day with_PERIOD_IN_QUARTER(java.math.BigDecimal PERIOD_IN_QUARTER) {
    this.PERIOD_IN_QUARTER = PERIOD_IN_QUARTER;
    return this;
  }
  private java.math.BigDecimal PERIOD_IN_YEAR;
  public java.math.BigDecimal get_PERIOD_IN_YEAR() {
    return PERIOD_IN_YEAR;
  }
  public void set_PERIOD_IN_YEAR(java.math.BigDecimal PERIOD_IN_YEAR) {
    this.PERIOD_IN_YEAR = PERIOD_IN_YEAR;
  }
  public dim_star_day with_PERIOD_IN_YEAR(java.math.BigDecimal PERIOD_IN_YEAR) {
    this.PERIOD_IN_YEAR = PERIOD_IN_YEAR;
    return this;
  }
  private java.sql.Timestamp PERIOD_START_DATE;
  public java.sql.Timestamp get_PERIOD_START_DATE() {
    return PERIOD_START_DATE;
  }
  public void set_PERIOD_START_DATE(java.sql.Timestamp PERIOD_START_DATE) {
    this.PERIOD_START_DATE = PERIOD_START_DATE;
  }
  public dim_star_day with_PERIOD_START_DATE(java.sql.Timestamp PERIOD_START_DATE) {
    this.PERIOD_START_DATE = PERIOD_START_DATE;
    return this;
  }
  private java.sql.Timestamp PERIOD_END_DATE;
  public java.sql.Timestamp get_PERIOD_END_DATE() {
    return PERIOD_END_DATE;
  }
  public void set_PERIOD_END_DATE(java.sql.Timestamp PERIOD_END_DATE) {
    this.PERIOD_END_DATE = PERIOD_END_DATE;
  }
  public dim_star_day with_PERIOD_END_DATE(java.sql.Timestamp PERIOD_END_DATE) {
    this.PERIOD_END_DATE = PERIOD_END_DATE;
    return this;
  }
  private java.math.BigDecimal PERIOD_START_DAY_DW_ID;
  public java.math.BigDecimal get_PERIOD_START_DAY_DW_ID() {
    return PERIOD_START_DAY_DW_ID;
  }
  public void set_PERIOD_START_DAY_DW_ID(java.math.BigDecimal PERIOD_START_DAY_DW_ID) {
    this.PERIOD_START_DAY_DW_ID = PERIOD_START_DAY_DW_ID;
  }
  public dim_star_day with_PERIOD_START_DAY_DW_ID(java.math.BigDecimal PERIOD_START_DAY_DW_ID) {
    this.PERIOD_START_DAY_DW_ID = PERIOD_START_DAY_DW_ID;
    return this;
  }
  private java.math.BigDecimal PERIOD_END_DAY_DW_ID;
  public java.math.BigDecimal get_PERIOD_END_DAY_DW_ID() {
    return PERIOD_END_DAY_DW_ID;
  }
  public void set_PERIOD_END_DAY_DW_ID(java.math.BigDecimal PERIOD_END_DAY_DW_ID) {
    this.PERIOD_END_DAY_DW_ID = PERIOD_END_DAY_DW_ID;
  }
  public dim_star_day with_PERIOD_END_DAY_DW_ID(java.math.BigDecimal PERIOD_END_DAY_DW_ID) {
    this.PERIOD_END_DAY_DW_ID = PERIOD_END_DAY_DW_ID;
    return this;
  }
  private java.math.BigDecimal PERIOD_NBR_IN_EPOCH;
  public java.math.BigDecimal get_PERIOD_NBR_IN_EPOCH() {
    return PERIOD_NBR_IN_EPOCH;
  }
  public void set_PERIOD_NBR_IN_EPOCH(java.math.BigDecimal PERIOD_NBR_IN_EPOCH) {
    this.PERIOD_NBR_IN_EPOCH = PERIOD_NBR_IN_EPOCH;
  }
  public dim_star_day with_PERIOD_NBR_IN_EPOCH(java.math.BigDecimal PERIOD_NBR_IN_EPOCH) {
    this.PERIOD_NBR_IN_EPOCH = PERIOD_NBR_IN_EPOCH;
    return this;
  }
  private String PERIOD_GL_STATUS;
  public String get_PERIOD_GL_STATUS() {
    return PERIOD_GL_STATUS;
  }
  public void set_PERIOD_GL_STATUS(String PERIOD_GL_STATUS) {
    this.PERIOD_GL_STATUS = PERIOD_GL_STATUS;
  }
  public dim_star_day with_PERIOD_GL_STATUS(String PERIOD_GL_STATUS) {
    this.PERIOD_GL_STATUS = PERIOD_GL_STATUS;
    return this;
  }
  private java.math.BigDecimal QUARTER_DW_ID;
  public java.math.BigDecimal get_QUARTER_DW_ID() {
    return QUARTER_DW_ID;
  }
  public void set_QUARTER_DW_ID(java.math.BigDecimal QUARTER_DW_ID) {
    this.QUARTER_DW_ID = QUARTER_DW_ID;
  }
  public dim_star_day with_QUARTER_DW_ID(java.math.BigDecimal QUARTER_DW_ID) {
    this.QUARTER_DW_ID = QUARTER_DW_ID;
    return this;
  }
  private String QUARTER_NAME;
  public String get_QUARTER_NAME() {
    return QUARTER_NAME;
  }
  public void set_QUARTER_NAME(String QUARTER_NAME) {
    this.QUARTER_NAME = QUARTER_NAME;
  }
  public dim_star_day with_QUARTER_NAME(String QUARTER_NAME) {
    this.QUARTER_NAME = QUARTER_NAME;
    return this;
  }
  private java.math.BigDecimal QUARTER_IN_YEAR;
  public java.math.BigDecimal get_QUARTER_IN_YEAR() {
    return QUARTER_IN_YEAR;
  }
  public void set_QUARTER_IN_YEAR(java.math.BigDecimal QUARTER_IN_YEAR) {
    this.QUARTER_IN_YEAR = QUARTER_IN_YEAR;
  }
  public dim_star_day with_QUARTER_IN_YEAR(java.math.BigDecimal QUARTER_IN_YEAR) {
    this.QUARTER_IN_YEAR = QUARTER_IN_YEAR;
    return this;
  }
  private java.sql.Timestamp QUARTER_START_DATE;
  public java.sql.Timestamp get_QUARTER_START_DATE() {
    return QUARTER_START_DATE;
  }
  public void set_QUARTER_START_DATE(java.sql.Timestamp QUARTER_START_DATE) {
    this.QUARTER_START_DATE = QUARTER_START_DATE;
  }
  public dim_star_day with_QUARTER_START_DATE(java.sql.Timestamp QUARTER_START_DATE) {
    this.QUARTER_START_DATE = QUARTER_START_DATE;
    return this;
  }
  private java.sql.Timestamp QUARTER_END_DATE;
  public java.sql.Timestamp get_QUARTER_END_DATE() {
    return QUARTER_END_DATE;
  }
  public void set_QUARTER_END_DATE(java.sql.Timestamp QUARTER_END_DATE) {
    this.QUARTER_END_DATE = QUARTER_END_DATE;
  }
  public dim_star_day with_QUARTER_END_DATE(java.sql.Timestamp QUARTER_END_DATE) {
    this.QUARTER_END_DATE = QUARTER_END_DATE;
    return this;
  }
  private java.math.BigDecimal QUARTER_START_DAY_DW_ID;
  public java.math.BigDecimal get_QUARTER_START_DAY_DW_ID() {
    return QUARTER_START_DAY_DW_ID;
  }
  public void set_QUARTER_START_DAY_DW_ID(java.math.BigDecimal QUARTER_START_DAY_DW_ID) {
    this.QUARTER_START_DAY_DW_ID = QUARTER_START_DAY_DW_ID;
  }
  public dim_star_day with_QUARTER_START_DAY_DW_ID(java.math.BigDecimal QUARTER_START_DAY_DW_ID) {
    this.QUARTER_START_DAY_DW_ID = QUARTER_START_DAY_DW_ID;
    return this;
  }
  private java.math.BigDecimal QUARTER_END_DAY_DW_ID;
  public java.math.BigDecimal get_QUARTER_END_DAY_DW_ID() {
    return QUARTER_END_DAY_DW_ID;
  }
  public void set_QUARTER_END_DAY_DW_ID(java.math.BigDecimal QUARTER_END_DAY_DW_ID) {
    this.QUARTER_END_DAY_DW_ID = QUARTER_END_DAY_DW_ID;
  }
  public dim_star_day with_QUARTER_END_DAY_DW_ID(java.math.BigDecimal QUARTER_END_DAY_DW_ID) {
    this.QUARTER_END_DAY_DW_ID = QUARTER_END_DAY_DW_ID;
    return this;
  }
  private java.math.BigDecimal QUARTER_NBR_IN_EPOCH;
  public java.math.BigDecimal get_QUARTER_NBR_IN_EPOCH() {
    return QUARTER_NBR_IN_EPOCH;
  }
  public void set_QUARTER_NBR_IN_EPOCH(java.math.BigDecimal QUARTER_NBR_IN_EPOCH) {
    this.QUARTER_NBR_IN_EPOCH = QUARTER_NBR_IN_EPOCH;
  }
  public dim_star_day with_QUARTER_NBR_IN_EPOCH(java.math.BigDecimal QUARTER_NBR_IN_EPOCH) {
    this.QUARTER_NBR_IN_EPOCH = QUARTER_NBR_IN_EPOCH;
    return this;
  }
  private String QUARTER_GL_STATUS;
  public String get_QUARTER_GL_STATUS() {
    return QUARTER_GL_STATUS;
  }
  public void set_QUARTER_GL_STATUS(String QUARTER_GL_STATUS) {
    this.QUARTER_GL_STATUS = QUARTER_GL_STATUS;
  }
  public dim_star_day with_QUARTER_GL_STATUS(String QUARTER_GL_STATUS) {
    this.QUARTER_GL_STATUS = QUARTER_GL_STATUS;
    return this;
  }
  private java.math.BigDecimal YEAR_DW_ID;
  public java.math.BigDecimal get_YEAR_DW_ID() {
    return YEAR_DW_ID;
  }
  public void set_YEAR_DW_ID(java.math.BigDecimal YEAR_DW_ID) {
    this.YEAR_DW_ID = YEAR_DW_ID;
  }
  public dim_star_day with_YEAR_DW_ID(java.math.BigDecimal YEAR_DW_ID) {
    this.YEAR_DW_ID = YEAR_DW_ID;
    return this;
  }
  private java.math.BigDecimal YEAR_NBR;
  public java.math.BigDecimal get_YEAR_NBR() {
    return YEAR_NBR;
  }
  public void set_YEAR_NBR(java.math.BigDecimal YEAR_NBR) {
    this.YEAR_NBR = YEAR_NBR;
  }
  public dim_star_day with_YEAR_NBR(java.math.BigDecimal YEAR_NBR) {
    this.YEAR_NBR = YEAR_NBR;
    return this;
  }
  private String YEAR_CODE;
  public String get_YEAR_CODE() {
    return YEAR_CODE;
  }
  public void set_YEAR_CODE(String YEAR_CODE) {
    this.YEAR_CODE = YEAR_CODE;
  }
  public dim_star_day with_YEAR_CODE(String YEAR_CODE) {
    this.YEAR_CODE = YEAR_CODE;
    return this;
  }
  private java.sql.Timestamp YEAR_START_DATE;
  public java.sql.Timestamp get_YEAR_START_DATE() {
    return YEAR_START_DATE;
  }
  public void set_YEAR_START_DATE(java.sql.Timestamp YEAR_START_DATE) {
    this.YEAR_START_DATE = YEAR_START_DATE;
  }
  public dim_star_day with_YEAR_START_DATE(java.sql.Timestamp YEAR_START_DATE) {
    this.YEAR_START_DATE = YEAR_START_DATE;
    return this;
  }
  private java.sql.Timestamp YEAR_END_DATE;
  public java.sql.Timestamp get_YEAR_END_DATE() {
    return YEAR_END_DATE;
  }
  public void set_YEAR_END_DATE(java.sql.Timestamp YEAR_END_DATE) {
    this.YEAR_END_DATE = YEAR_END_DATE;
  }
  public dim_star_day with_YEAR_END_DATE(java.sql.Timestamp YEAR_END_DATE) {
    this.YEAR_END_DATE = YEAR_END_DATE;
    return this;
  }
  private java.math.BigDecimal YEAR_START_DAY_DW_ID;
  public java.math.BigDecimal get_YEAR_START_DAY_DW_ID() {
    return YEAR_START_DAY_DW_ID;
  }
  public void set_YEAR_START_DAY_DW_ID(java.math.BigDecimal YEAR_START_DAY_DW_ID) {
    this.YEAR_START_DAY_DW_ID = YEAR_START_DAY_DW_ID;
  }
  public dim_star_day with_YEAR_START_DAY_DW_ID(java.math.BigDecimal YEAR_START_DAY_DW_ID) {
    this.YEAR_START_DAY_DW_ID = YEAR_START_DAY_DW_ID;
    return this;
  }
  private java.math.BigDecimal YEAR_END_DAY_DW_ID;
  public java.math.BigDecimal get_YEAR_END_DAY_DW_ID() {
    return YEAR_END_DAY_DW_ID;
  }
  public void set_YEAR_END_DAY_DW_ID(java.math.BigDecimal YEAR_END_DAY_DW_ID) {
    this.YEAR_END_DAY_DW_ID = YEAR_END_DAY_DW_ID;
  }
  public dim_star_day with_YEAR_END_DAY_DW_ID(java.math.BigDecimal YEAR_END_DAY_DW_ID) {
    this.YEAR_END_DAY_DW_ID = YEAR_END_DAY_DW_ID;
    return this;
  }
  private java.math.BigDecimal YEAR_NBR_IN_EPOCH;
  public java.math.BigDecimal get_YEAR_NBR_IN_EPOCH() {
    return YEAR_NBR_IN_EPOCH;
  }
  public void set_YEAR_NBR_IN_EPOCH(java.math.BigDecimal YEAR_NBR_IN_EPOCH) {
    this.YEAR_NBR_IN_EPOCH = YEAR_NBR_IN_EPOCH;
  }
  public dim_star_day with_YEAR_NBR_IN_EPOCH(java.math.BigDecimal YEAR_NBR_IN_EPOCH) {
    this.YEAR_NBR_IN_EPOCH = YEAR_NBR_IN_EPOCH;
    return this;
  }
  private String YEAR_GL_STATUS;
  public String get_YEAR_GL_STATUS() {
    return YEAR_GL_STATUS;
  }
  public void set_YEAR_GL_STATUS(String YEAR_GL_STATUS) {
    this.YEAR_GL_STATUS = YEAR_GL_STATUS;
  }
  public dim_star_day with_YEAR_GL_STATUS(String YEAR_GL_STATUS) {
    this.YEAR_GL_STATUS = YEAR_GL_STATUS;
    return this;
  }
  private java.sql.Timestamp FILE_DTTM;
  public java.sql.Timestamp get_FILE_DTTM() {
    return FILE_DTTM;
  }
  public void set_FILE_DTTM(java.sql.Timestamp FILE_DTTM) {
    this.FILE_DTTM = FILE_DTTM;
  }
  public dim_star_day with_FILE_DTTM(java.sql.Timestamp FILE_DTTM) {
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
  public dim_star_day with_INSERT_DTTM(java.sql.Timestamp INSERT_DTTM) {
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
  public dim_star_day with_UPDATE_DTTM(java.sql.Timestamp UPDATE_DTTM) {
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
  public dim_star_day with_LOAD_DW_ID(java.math.BigDecimal LOAD_DW_ID) {
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
  public dim_star_day with_VERSION(java.math.BigDecimal VERSION) {
    this.VERSION = VERSION;
    return this;
  }
  private java.math.BigDecimal DAY_DW_ID_LY_CAL;
  public java.math.BigDecimal get_DAY_DW_ID_LY_CAL() {
    return DAY_DW_ID_LY_CAL;
  }
  public void set_DAY_DW_ID_LY_CAL(java.math.BigDecimal DAY_DW_ID_LY_CAL) {
    this.DAY_DW_ID_LY_CAL = DAY_DW_ID_LY_CAL;
  }
  public dim_star_day with_DAY_DW_ID_LY_CAL(java.math.BigDecimal DAY_DW_ID_LY_CAL) {
    this.DAY_DW_ID_LY_CAL = DAY_DW_ID_LY_CAL;
    return this;
  }
  private java.sql.Timestamp DAY_LY_CAL;
  public java.sql.Timestamp get_DAY_LY_CAL() {
    return DAY_LY_CAL;
  }
  public void set_DAY_LY_CAL(java.sql.Timestamp DAY_LY_CAL) {
    this.DAY_LY_CAL = DAY_LY_CAL;
  }
  public dim_star_day with_DAY_LY_CAL(java.sql.Timestamp DAY_LY_CAL) {
    this.DAY_LY_CAL = DAY_LY_CAL;
    return this;
  }
  private java.math.BigDecimal DAY_NBR_IN_EPOCH_LY_CAL;
  public java.math.BigDecimal get_DAY_NBR_IN_EPOCH_LY_CAL() {
    return DAY_NBR_IN_EPOCH_LY_CAL;
  }
  public void set_DAY_NBR_IN_EPOCH_LY_CAL(java.math.BigDecimal DAY_NBR_IN_EPOCH_LY_CAL) {
    this.DAY_NBR_IN_EPOCH_LY_CAL = DAY_NBR_IN_EPOCH_LY_CAL;
  }
  public dim_star_day with_DAY_NBR_IN_EPOCH_LY_CAL(java.math.BigDecimal DAY_NBR_IN_EPOCH_LY_CAL) {
    this.DAY_NBR_IN_EPOCH_LY_CAL = DAY_NBR_IN_EPOCH_LY_CAL;
    return this;
  }
  private java.math.BigDecimal WEEK_DW_ID_LY_CAL;
  public java.math.BigDecimal get_WEEK_DW_ID_LY_CAL() {
    return WEEK_DW_ID_LY_CAL;
  }
  public void set_WEEK_DW_ID_LY_CAL(java.math.BigDecimal WEEK_DW_ID_LY_CAL) {
    this.WEEK_DW_ID_LY_CAL = WEEK_DW_ID_LY_CAL;
  }
  public dim_star_day with_WEEK_DW_ID_LY_CAL(java.math.BigDecimal WEEK_DW_ID_LY_CAL) {
    this.WEEK_DW_ID_LY_CAL = WEEK_DW_ID_LY_CAL;
    return this;
  }
  private java.sql.Timestamp WEEK_START_DATE_LY_CAL;
  public java.sql.Timestamp get_WEEK_START_DATE_LY_CAL() {
    return WEEK_START_DATE_LY_CAL;
  }
  public void set_WEEK_START_DATE_LY_CAL(java.sql.Timestamp WEEK_START_DATE_LY_CAL) {
    this.WEEK_START_DATE_LY_CAL = WEEK_START_DATE_LY_CAL;
  }
  public dim_star_day with_WEEK_START_DATE_LY_CAL(java.sql.Timestamp WEEK_START_DATE_LY_CAL) {
    this.WEEK_START_DATE_LY_CAL = WEEK_START_DATE_LY_CAL;
    return this;
  }
  private java.sql.Timestamp WEEK_END_DATE_LY_CAL;
  public java.sql.Timestamp get_WEEK_END_DATE_LY_CAL() {
    return WEEK_END_DATE_LY_CAL;
  }
  public void set_WEEK_END_DATE_LY_CAL(java.sql.Timestamp WEEK_END_DATE_LY_CAL) {
    this.WEEK_END_DATE_LY_CAL = WEEK_END_DATE_LY_CAL;
  }
  public dim_star_day with_WEEK_END_DATE_LY_CAL(java.sql.Timestamp WEEK_END_DATE_LY_CAL) {
    this.WEEK_END_DATE_LY_CAL = WEEK_END_DATE_LY_CAL;
    return this;
  }
  private java.math.BigDecimal WEEK_START_DAY_DW_ID_LY_CAL;
  public java.math.BigDecimal get_WEEK_START_DAY_DW_ID_LY_CAL() {
    return WEEK_START_DAY_DW_ID_LY_CAL;
  }
  public void set_WEEK_START_DAY_DW_ID_LY_CAL(java.math.BigDecimal WEEK_START_DAY_DW_ID_LY_CAL) {
    this.WEEK_START_DAY_DW_ID_LY_CAL = WEEK_START_DAY_DW_ID_LY_CAL;
  }
  public dim_star_day with_WEEK_START_DAY_DW_ID_LY_CAL(java.math.BigDecimal WEEK_START_DAY_DW_ID_LY_CAL) {
    this.WEEK_START_DAY_DW_ID_LY_CAL = WEEK_START_DAY_DW_ID_LY_CAL;
    return this;
  }
  private java.math.BigDecimal WEEK_END_DAY_DW_ID_LY_CAL;
  public java.math.BigDecimal get_WEEK_END_DAY_DW_ID_LY_CAL() {
    return WEEK_END_DAY_DW_ID_LY_CAL;
  }
  public void set_WEEK_END_DAY_DW_ID_LY_CAL(java.math.BigDecimal WEEK_END_DAY_DW_ID_LY_CAL) {
    this.WEEK_END_DAY_DW_ID_LY_CAL = WEEK_END_DAY_DW_ID_LY_CAL;
  }
  public dim_star_day with_WEEK_END_DAY_DW_ID_LY_CAL(java.math.BigDecimal WEEK_END_DAY_DW_ID_LY_CAL) {
    this.WEEK_END_DAY_DW_ID_LY_CAL = WEEK_END_DAY_DW_ID_LY_CAL;
    return this;
  }
  private java.math.BigDecimal WEEK_NBR_IN_EPOCH_LY_CAL;
  public java.math.BigDecimal get_WEEK_NBR_IN_EPOCH_LY_CAL() {
    return WEEK_NBR_IN_EPOCH_LY_CAL;
  }
  public void set_WEEK_NBR_IN_EPOCH_LY_CAL(java.math.BigDecimal WEEK_NBR_IN_EPOCH_LY_CAL) {
    this.WEEK_NBR_IN_EPOCH_LY_CAL = WEEK_NBR_IN_EPOCH_LY_CAL;
  }
  public dim_star_day with_WEEK_NBR_IN_EPOCH_LY_CAL(java.math.BigDecimal WEEK_NBR_IN_EPOCH_LY_CAL) {
    this.WEEK_NBR_IN_EPOCH_LY_CAL = WEEK_NBR_IN_EPOCH_LY_CAL;
    return this;
  }
  private java.math.BigDecimal DAY_DW_ID_2Y_CAL;
  public java.math.BigDecimal get_DAY_DW_ID_2Y_CAL() {
    return DAY_DW_ID_2Y_CAL;
  }
  public void set_DAY_DW_ID_2Y_CAL(java.math.BigDecimal DAY_DW_ID_2Y_CAL) {
    this.DAY_DW_ID_2Y_CAL = DAY_DW_ID_2Y_CAL;
  }
  public dim_star_day with_DAY_DW_ID_2Y_CAL(java.math.BigDecimal DAY_DW_ID_2Y_CAL) {
    this.DAY_DW_ID_2Y_CAL = DAY_DW_ID_2Y_CAL;
    return this;
  }
  private java.sql.Timestamp DAY_2Y_CAL;
  public java.sql.Timestamp get_DAY_2Y_CAL() {
    return DAY_2Y_CAL;
  }
  public void set_DAY_2Y_CAL(java.sql.Timestamp DAY_2Y_CAL) {
    this.DAY_2Y_CAL = DAY_2Y_CAL;
  }
  public dim_star_day with_DAY_2Y_CAL(java.sql.Timestamp DAY_2Y_CAL) {
    this.DAY_2Y_CAL = DAY_2Y_CAL;
    return this;
  }
  private java.math.BigDecimal DAY_NBR_IN_EPOCH_2Y_CAL;
  public java.math.BigDecimal get_DAY_NBR_IN_EPOCH_2Y_CAL() {
    return DAY_NBR_IN_EPOCH_2Y_CAL;
  }
  public void set_DAY_NBR_IN_EPOCH_2Y_CAL(java.math.BigDecimal DAY_NBR_IN_EPOCH_2Y_CAL) {
    this.DAY_NBR_IN_EPOCH_2Y_CAL = DAY_NBR_IN_EPOCH_2Y_CAL;
  }
  public dim_star_day with_DAY_NBR_IN_EPOCH_2Y_CAL(java.math.BigDecimal DAY_NBR_IN_EPOCH_2Y_CAL) {
    this.DAY_NBR_IN_EPOCH_2Y_CAL = DAY_NBR_IN_EPOCH_2Y_CAL;
    return this;
  }
  private java.math.BigDecimal WEEK_DW_ID_2Y_CAL;
  public java.math.BigDecimal get_WEEK_DW_ID_2Y_CAL() {
    return WEEK_DW_ID_2Y_CAL;
  }
  public void set_WEEK_DW_ID_2Y_CAL(java.math.BigDecimal WEEK_DW_ID_2Y_CAL) {
    this.WEEK_DW_ID_2Y_CAL = WEEK_DW_ID_2Y_CAL;
  }
  public dim_star_day with_WEEK_DW_ID_2Y_CAL(java.math.BigDecimal WEEK_DW_ID_2Y_CAL) {
    this.WEEK_DW_ID_2Y_CAL = WEEK_DW_ID_2Y_CAL;
    return this;
  }
  private java.sql.Timestamp WEEK_START_DATE_2Y_CAL;
  public java.sql.Timestamp get_WEEK_START_DATE_2Y_CAL() {
    return WEEK_START_DATE_2Y_CAL;
  }
  public void set_WEEK_START_DATE_2Y_CAL(java.sql.Timestamp WEEK_START_DATE_2Y_CAL) {
    this.WEEK_START_DATE_2Y_CAL = WEEK_START_DATE_2Y_CAL;
  }
  public dim_star_day with_WEEK_START_DATE_2Y_CAL(java.sql.Timestamp WEEK_START_DATE_2Y_CAL) {
    this.WEEK_START_DATE_2Y_CAL = WEEK_START_DATE_2Y_CAL;
    return this;
  }
  private java.sql.Timestamp WEEK_END_DATE_2Y_CAL;
  public java.sql.Timestamp get_WEEK_END_DATE_2Y_CAL() {
    return WEEK_END_DATE_2Y_CAL;
  }
  public void set_WEEK_END_DATE_2Y_CAL(java.sql.Timestamp WEEK_END_DATE_2Y_CAL) {
    this.WEEK_END_DATE_2Y_CAL = WEEK_END_DATE_2Y_CAL;
  }
  public dim_star_day with_WEEK_END_DATE_2Y_CAL(java.sql.Timestamp WEEK_END_DATE_2Y_CAL) {
    this.WEEK_END_DATE_2Y_CAL = WEEK_END_DATE_2Y_CAL;
    return this;
  }
  private java.math.BigDecimal WEEK_START_DAY_DW_ID_2Y_CAL;
  public java.math.BigDecimal get_WEEK_START_DAY_DW_ID_2Y_CAL() {
    return WEEK_START_DAY_DW_ID_2Y_CAL;
  }
  public void set_WEEK_START_DAY_DW_ID_2Y_CAL(java.math.BigDecimal WEEK_START_DAY_DW_ID_2Y_CAL) {
    this.WEEK_START_DAY_DW_ID_2Y_CAL = WEEK_START_DAY_DW_ID_2Y_CAL;
  }
  public dim_star_day with_WEEK_START_DAY_DW_ID_2Y_CAL(java.math.BigDecimal WEEK_START_DAY_DW_ID_2Y_CAL) {
    this.WEEK_START_DAY_DW_ID_2Y_CAL = WEEK_START_DAY_DW_ID_2Y_CAL;
    return this;
  }
  private java.math.BigDecimal WEEK_END_DAY_DW_ID_2Y_CAL;
  public java.math.BigDecimal get_WEEK_END_DAY_DW_ID_2Y_CAL() {
    return WEEK_END_DAY_DW_ID_2Y_CAL;
  }
  public void set_WEEK_END_DAY_DW_ID_2Y_CAL(java.math.BigDecimal WEEK_END_DAY_DW_ID_2Y_CAL) {
    this.WEEK_END_DAY_DW_ID_2Y_CAL = WEEK_END_DAY_DW_ID_2Y_CAL;
  }
  public dim_star_day with_WEEK_END_DAY_DW_ID_2Y_CAL(java.math.BigDecimal WEEK_END_DAY_DW_ID_2Y_CAL) {
    this.WEEK_END_DAY_DW_ID_2Y_CAL = WEEK_END_DAY_DW_ID_2Y_CAL;
    return this;
  }
  private java.math.BigDecimal WEEK_NBR_IN_EPOCH_2Y_CAL;
  public java.math.BigDecimal get_WEEK_NBR_IN_EPOCH_2Y_CAL() {
    return WEEK_NBR_IN_EPOCH_2Y_CAL;
  }
  public void set_WEEK_NBR_IN_EPOCH_2Y_CAL(java.math.BigDecimal WEEK_NBR_IN_EPOCH_2Y_CAL) {
    this.WEEK_NBR_IN_EPOCH_2Y_CAL = WEEK_NBR_IN_EPOCH_2Y_CAL;
  }
  public dim_star_day with_WEEK_NBR_IN_EPOCH_2Y_CAL(java.math.BigDecimal WEEK_NBR_IN_EPOCH_2Y_CAL) {
    this.WEEK_NBR_IN_EPOCH_2Y_CAL = WEEK_NBR_IN_EPOCH_2Y_CAL;
    return this;
  }
  private java.sql.Timestamp LOAD_DTTM;
  public java.sql.Timestamp get_LOAD_DTTM() {
    return LOAD_DTTM;
  }
  public void set_LOAD_DTTM(java.sql.Timestamp LOAD_DTTM) {
    this.LOAD_DTTM = LOAD_DTTM;
  }
  public dim_star_day with_LOAD_DTTM(java.sql.Timestamp LOAD_DTTM) {
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
  public dim_star_day with_LOAD_BY(String LOAD_BY) {
    this.LOAD_BY = LOAD_BY;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_star_day)) {
      return false;
    }
    dim_star_day that = (dim_star_day) o;
    boolean equal = true;
    equal = equal && (this.Z_DAY_DW_ID == null ? that.Z_DAY_DW_ID == null : this.Z_DAY_DW_ID.equals(that.Z_DAY_DW_ID));
    equal = equal && (this.DAY == null ? that.DAY == null : this.DAY.equals(that.DAY));
    equal = equal && (this.DAY_NBR_IN_EPOCH == null ? that.DAY_NBR_IN_EPOCH == null : this.DAY_NBR_IN_EPOCH.equals(that.DAY_NBR_IN_EPOCH));
    equal = equal && (this.DAY_DW_ID_LY == null ? that.DAY_DW_ID_LY == null : this.DAY_DW_ID_LY.equals(that.DAY_DW_ID_LY));
    equal = equal && (this.DAY_LY == null ? that.DAY_LY == null : this.DAY_LY.equals(that.DAY_LY));
    equal = equal && (this.DAY_NBR_IN_EPOCH_LY == null ? that.DAY_NBR_IN_EPOCH_LY == null : this.DAY_NBR_IN_EPOCH_LY.equals(that.DAY_NBR_IN_EPOCH_LY));
    equal = equal && (this.DAY_IN_WEEK == null ? that.DAY_IN_WEEK == null : this.DAY_IN_WEEK.equals(that.DAY_IN_WEEK));
    equal = equal && (this.DAY_IN_PERIOD == null ? that.DAY_IN_PERIOD == null : this.DAY_IN_PERIOD.equals(that.DAY_IN_PERIOD));
    equal = equal && (this.DAY_IN_QUARTER == null ? that.DAY_IN_QUARTER == null : this.DAY_IN_QUARTER.equals(that.DAY_IN_QUARTER));
    equal = equal && (this.DAY_IN_YEAR == null ? that.DAY_IN_YEAR == null : this.DAY_IN_YEAR.equals(that.DAY_IN_YEAR));
    equal = equal && (this.WEEK_DW_ID == null ? that.WEEK_DW_ID == null : this.WEEK_DW_ID.equals(that.WEEK_DW_ID));
    equal = equal && (this.WEEK_NAME == null ? that.WEEK_NAME == null : this.WEEK_NAME.equals(that.WEEK_NAME));
    equal = equal && (this.WEEK_IN_PERIOD == null ? that.WEEK_IN_PERIOD == null : this.WEEK_IN_PERIOD.equals(that.WEEK_IN_PERIOD));
    equal = equal && (this.WEEK_IN_QUARTER == null ? that.WEEK_IN_QUARTER == null : this.WEEK_IN_QUARTER.equals(that.WEEK_IN_QUARTER));
    equal = equal && (this.WEEK_IN_YEAR == null ? that.WEEK_IN_YEAR == null : this.WEEK_IN_YEAR.equals(that.WEEK_IN_YEAR));
    equal = equal && (this.WEEK_START_DATE == null ? that.WEEK_START_DATE == null : this.WEEK_START_DATE.equals(that.WEEK_START_DATE));
    equal = equal && (this.WEEK_END_DATE == null ? that.WEEK_END_DATE == null : this.WEEK_END_DATE.equals(that.WEEK_END_DATE));
    equal = equal && (this.WEEK_START_DAY_DW_ID == null ? that.WEEK_START_DAY_DW_ID == null : this.WEEK_START_DAY_DW_ID.equals(that.WEEK_START_DAY_DW_ID));
    equal = equal && (this.WEEK_END_DAY_DW_ID == null ? that.WEEK_END_DAY_DW_ID == null : this.WEEK_END_DAY_DW_ID.equals(that.WEEK_END_DAY_DW_ID));
    equal = equal && (this.WEEK_NBR_IN_EPOCH == null ? that.WEEK_NBR_IN_EPOCH == null : this.WEEK_NBR_IN_EPOCH.equals(that.WEEK_NBR_IN_EPOCH));
    equal = equal && (this.WEEK_GL_NAME == null ? that.WEEK_GL_NAME == null : this.WEEK_GL_NAME.equals(that.WEEK_GL_NAME));
    equal = equal && (this.WEEK_GL_STATUS == null ? that.WEEK_GL_STATUS == null : this.WEEK_GL_STATUS.equals(that.WEEK_GL_STATUS));
    equal = equal && (this.WEEK_DW_ID_LY == null ? that.WEEK_DW_ID_LY == null : this.WEEK_DW_ID_LY.equals(that.WEEK_DW_ID_LY));
    equal = equal && (this.WEEK_START_DATE_LY == null ? that.WEEK_START_DATE_LY == null : this.WEEK_START_DATE_LY.equals(that.WEEK_START_DATE_LY));
    equal = equal && (this.WEEK_END_DATE_LY == null ? that.WEEK_END_DATE_LY == null : this.WEEK_END_DATE_LY.equals(that.WEEK_END_DATE_LY));
    equal = equal && (this.WEEK_START_DAY_DW_ID_LY == null ? that.WEEK_START_DAY_DW_ID_LY == null : this.WEEK_START_DAY_DW_ID_LY.equals(that.WEEK_START_DAY_DW_ID_LY));
    equal = equal && (this.WEEK_END_DAY_DW_ID_LY == null ? that.WEEK_END_DAY_DW_ID_LY == null : this.WEEK_END_DAY_DW_ID_LY.equals(that.WEEK_END_DAY_DW_ID_LY));
    equal = equal && (this.WEEK_NBR_IN_EPOCH_LY == null ? that.WEEK_NBR_IN_EPOCH_LY == null : this.WEEK_NBR_IN_EPOCH_LY.equals(that.WEEK_NBR_IN_EPOCH_LY));
    equal = equal && (this.PERIOD_DW_ID == null ? that.PERIOD_DW_ID == null : this.PERIOD_DW_ID.equals(that.PERIOD_DW_ID));
    equal = equal && (this.PERIOD_NAME == null ? that.PERIOD_NAME == null : this.PERIOD_NAME.equals(that.PERIOD_NAME));
    equal = equal && (this.PERIOD_IN_QUARTER == null ? that.PERIOD_IN_QUARTER == null : this.PERIOD_IN_QUARTER.equals(that.PERIOD_IN_QUARTER));
    equal = equal && (this.PERIOD_IN_YEAR == null ? that.PERIOD_IN_YEAR == null : this.PERIOD_IN_YEAR.equals(that.PERIOD_IN_YEAR));
    equal = equal && (this.PERIOD_START_DATE == null ? that.PERIOD_START_DATE == null : this.PERIOD_START_DATE.equals(that.PERIOD_START_DATE));
    equal = equal && (this.PERIOD_END_DATE == null ? that.PERIOD_END_DATE == null : this.PERIOD_END_DATE.equals(that.PERIOD_END_DATE));
    equal = equal && (this.PERIOD_START_DAY_DW_ID == null ? that.PERIOD_START_DAY_DW_ID == null : this.PERIOD_START_DAY_DW_ID.equals(that.PERIOD_START_DAY_DW_ID));
    equal = equal && (this.PERIOD_END_DAY_DW_ID == null ? that.PERIOD_END_DAY_DW_ID == null : this.PERIOD_END_DAY_DW_ID.equals(that.PERIOD_END_DAY_DW_ID));
    equal = equal && (this.PERIOD_NBR_IN_EPOCH == null ? that.PERIOD_NBR_IN_EPOCH == null : this.PERIOD_NBR_IN_EPOCH.equals(that.PERIOD_NBR_IN_EPOCH));
    equal = equal && (this.PERIOD_GL_STATUS == null ? that.PERIOD_GL_STATUS == null : this.PERIOD_GL_STATUS.equals(that.PERIOD_GL_STATUS));
    equal = equal && (this.QUARTER_DW_ID == null ? that.QUARTER_DW_ID == null : this.QUARTER_DW_ID.equals(that.QUARTER_DW_ID));
    equal = equal && (this.QUARTER_NAME == null ? that.QUARTER_NAME == null : this.QUARTER_NAME.equals(that.QUARTER_NAME));
    equal = equal && (this.QUARTER_IN_YEAR == null ? that.QUARTER_IN_YEAR == null : this.QUARTER_IN_YEAR.equals(that.QUARTER_IN_YEAR));
    equal = equal && (this.QUARTER_START_DATE == null ? that.QUARTER_START_DATE == null : this.QUARTER_START_DATE.equals(that.QUARTER_START_DATE));
    equal = equal && (this.QUARTER_END_DATE == null ? that.QUARTER_END_DATE == null : this.QUARTER_END_DATE.equals(that.QUARTER_END_DATE));
    equal = equal && (this.QUARTER_START_DAY_DW_ID == null ? that.QUARTER_START_DAY_DW_ID == null : this.QUARTER_START_DAY_DW_ID.equals(that.QUARTER_START_DAY_DW_ID));
    equal = equal && (this.QUARTER_END_DAY_DW_ID == null ? that.QUARTER_END_DAY_DW_ID == null : this.QUARTER_END_DAY_DW_ID.equals(that.QUARTER_END_DAY_DW_ID));
    equal = equal && (this.QUARTER_NBR_IN_EPOCH == null ? that.QUARTER_NBR_IN_EPOCH == null : this.QUARTER_NBR_IN_EPOCH.equals(that.QUARTER_NBR_IN_EPOCH));
    equal = equal && (this.QUARTER_GL_STATUS == null ? that.QUARTER_GL_STATUS == null : this.QUARTER_GL_STATUS.equals(that.QUARTER_GL_STATUS));
    equal = equal && (this.YEAR_DW_ID == null ? that.YEAR_DW_ID == null : this.YEAR_DW_ID.equals(that.YEAR_DW_ID));
    equal = equal && (this.YEAR_NBR == null ? that.YEAR_NBR == null : this.YEAR_NBR.equals(that.YEAR_NBR));
    equal = equal && (this.YEAR_CODE == null ? that.YEAR_CODE == null : this.YEAR_CODE.equals(that.YEAR_CODE));
    equal = equal && (this.YEAR_START_DATE == null ? that.YEAR_START_DATE == null : this.YEAR_START_DATE.equals(that.YEAR_START_DATE));
    equal = equal && (this.YEAR_END_DATE == null ? that.YEAR_END_DATE == null : this.YEAR_END_DATE.equals(that.YEAR_END_DATE));
    equal = equal && (this.YEAR_START_DAY_DW_ID == null ? that.YEAR_START_DAY_DW_ID == null : this.YEAR_START_DAY_DW_ID.equals(that.YEAR_START_DAY_DW_ID));
    equal = equal && (this.YEAR_END_DAY_DW_ID == null ? that.YEAR_END_DAY_DW_ID == null : this.YEAR_END_DAY_DW_ID.equals(that.YEAR_END_DAY_DW_ID));
    equal = equal && (this.YEAR_NBR_IN_EPOCH == null ? that.YEAR_NBR_IN_EPOCH == null : this.YEAR_NBR_IN_EPOCH.equals(that.YEAR_NBR_IN_EPOCH));
    equal = equal && (this.YEAR_GL_STATUS == null ? that.YEAR_GL_STATUS == null : this.YEAR_GL_STATUS.equals(that.YEAR_GL_STATUS));
    equal = equal && (this.FILE_DTTM == null ? that.FILE_DTTM == null : this.FILE_DTTM.equals(that.FILE_DTTM));
    equal = equal && (this.INSERT_DTTM == null ? that.INSERT_DTTM == null : this.INSERT_DTTM.equals(that.INSERT_DTTM));
    equal = equal && (this.UPDATE_DTTM == null ? that.UPDATE_DTTM == null : this.UPDATE_DTTM.equals(that.UPDATE_DTTM));
    equal = equal && (this.LOAD_DW_ID == null ? that.LOAD_DW_ID == null : this.LOAD_DW_ID.equals(that.LOAD_DW_ID));
    equal = equal && (this.VERSION == null ? that.VERSION == null : this.VERSION.equals(that.VERSION));
    equal = equal && (this.DAY_DW_ID_LY_CAL == null ? that.DAY_DW_ID_LY_CAL == null : this.DAY_DW_ID_LY_CAL.equals(that.DAY_DW_ID_LY_CAL));
    equal = equal && (this.DAY_LY_CAL == null ? that.DAY_LY_CAL == null : this.DAY_LY_CAL.equals(that.DAY_LY_CAL));
    equal = equal && (this.DAY_NBR_IN_EPOCH_LY_CAL == null ? that.DAY_NBR_IN_EPOCH_LY_CAL == null : this.DAY_NBR_IN_EPOCH_LY_CAL.equals(that.DAY_NBR_IN_EPOCH_LY_CAL));
    equal = equal && (this.WEEK_DW_ID_LY_CAL == null ? that.WEEK_DW_ID_LY_CAL == null : this.WEEK_DW_ID_LY_CAL.equals(that.WEEK_DW_ID_LY_CAL));
    equal = equal && (this.WEEK_START_DATE_LY_CAL == null ? that.WEEK_START_DATE_LY_CAL == null : this.WEEK_START_DATE_LY_CAL.equals(that.WEEK_START_DATE_LY_CAL));
    equal = equal && (this.WEEK_END_DATE_LY_CAL == null ? that.WEEK_END_DATE_LY_CAL == null : this.WEEK_END_DATE_LY_CAL.equals(that.WEEK_END_DATE_LY_CAL));
    equal = equal && (this.WEEK_START_DAY_DW_ID_LY_CAL == null ? that.WEEK_START_DAY_DW_ID_LY_CAL == null : this.WEEK_START_DAY_DW_ID_LY_CAL.equals(that.WEEK_START_DAY_DW_ID_LY_CAL));
    equal = equal && (this.WEEK_END_DAY_DW_ID_LY_CAL == null ? that.WEEK_END_DAY_DW_ID_LY_CAL == null : this.WEEK_END_DAY_DW_ID_LY_CAL.equals(that.WEEK_END_DAY_DW_ID_LY_CAL));
    equal = equal && (this.WEEK_NBR_IN_EPOCH_LY_CAL == null ? that.WEEK_NBR_IN_EPOCH_LY_CAL == null : this.WEEK_NBR_IN_EPOCH_LY_CAL.equals(that.WEEK_NBR_IN_EPOCH_LY_CAL));
    equal = equal && (this.DAY_DW_ID_2Y_CAL == null ? that.DAY_DW_ID_2Y_CAL == null : this.DAY_DW_ID_2Y_CAL.equals(that.DAY_DW_ID_2Y_CAL));
    equal = equal && (this.DAY_2Y_CAL == null ? that.DAY_2Y_CAL == null : this.DAY_2Y_CAL.equals(that.DAY_2Y_CAL));
    equal = equal && (this.DAY_NBR_IN_EPOCH_2Y_CAL == null ? that.DAY_NBR_IN_EPOCH_2Y_CAL == null : this.DAY_NBR_IN_EPOCH_2Y_CAL.equals(that.DAY_NBR_IN_EPOCH_2Y_CAL));
    equal = equal && (this.WEEK_DW_ID_2Y_CAL == null ? that.WEEK_DW_ID_2Y_CAL == null : this.WEEK_DW_ID_2Y_CAL.equals(that.WEEK_DW_ID_2Y_CAL));
    equal = equal && (this.WEEK_START_DATE_2Y_CAL == null ? that.WEEK_START_DATE_2Y_CAL == null : this.WEEK_START_DATE_2Y_CAL.equals(that.WEEK_START_DATE_2Y_CAL));
    equal = equal && (this.WEEK_END_DATE_2Y_CAL == null ? that.WEEK_END_DATE_2Y_CAL == null : this.WEEK_END_DATE_2Y_CAL.equals(that.WEEK_END_DATE_2Y_CAL));
    equal = equal && (this.WEEK_START_DAY_DW_ID_2Y_CAL == null ? that.WEEK_START_DAY_DW_ID_2Y_CAL == null : this.WEEK_START_DAY_DW_ID_2Y_CAL.equals(that.WEEK_START_DAY_DW_ID_2Y_CAL));
    equal = equal && (this.WEEK_END_DAY_DW_ID_2Y_CAL == null ? that.WEEK_END_DAY_DW_ID_2Y_CAL == null : this.WEEK_END_DAY_DW_ID_2Y_CAL.equals(that.WEEK_END_DAY_DW_ID_2Y_CAL));
    equal = equal && (this.WEEK_NBR_IN_EPOCH_2Y_CAL == null ? that.WEEK_NBR_IN_EPOCH_2Y_CAL == null : this.WEEK_NBR_IN_EPOCH_2Y_CAL.equals(that.WEEK_NBR_IN_EPOCH_2Y_CAL));
    equal = equal && (this.LOAD_DTTM == null ? that.LOAD_DTTM == null : this.LOAD_DTTM.equals(that.LOAD_DTTM));
    equal = equal && (this.LOAD_BY == null ? that.LOAD_BY == null : this.LOAD_BY.equals(that.LOAD_BY));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_star_day)) {
      return false;
    }
    dim_star_day that = (dim_star_day) o;
    boolean equal = true;
    equal = equal && (this.Z_DAY_DW_ID == null ? that.Z_DAY_DW_ID == null : this.Z_DAY_DW_ID.equals(that.Z_DAY_DW_ID));
    equal = equal && (this.DAY == null ? that.DAY == null : this.DAY.equals(that.DAY));
    equal = equal && (this.DAY_NBR_IN_EPOCH == null ? that.DAY_NBR_IN_EPOCH == null : this.DAY_NBR_IN_EPOCH.equals(that.DAY_NBR_IN_EPOCH));
    equal = equal && (this.DAY_DW_ID_LY == null ? that.DAY_DW_ID_LY == null : this.DAY_DW_ID_LY.equals(that.DAY_DW_ID_LY));
    equal = equal && (this.DAY_LY == null ? that.DAY_LY == null : this.DAY_LY.equals(that.DAY_LY));
    equal = equal && (this.DAY_NBR_IN_EPOCH_LY == null ? that.DAY_NBR_IN_EPOCH_LY == null : this.DAY_NBR_IN_EPOCH_LY.equals(that.DAY_NBR_IN_EPOCH_LY));
    equal = equal && (this.DAY_IN_WEEK == null ? that.DAY_IN_WEEK == null : this.DAY_IN_WEEK.equals(that.DAY_IN_WEEK));
    equal = equal && (this.DAY_IN_PERIOD == null ? that.DAY_IN_PERIOD == null : this.DAY_IN_PERIOD.equals(that.DAY_IN_PERIOD));
    equal = equal && (this.DAY_IN_QUARTER == null ? that.DAY_IN_QUARTER == null : this.DAY_IN_QUARTER.equals(that.DAY_IN_QUARTER));
    equal = equal && (this.DAY_IN_YEAR == null ? that.DAY_IN_YEAR == null : this.DAY_IN_YEAR.equals(that.DAY_IN_YEAR));
    equal = equal && (this.WEEK_DW_ID == null ? that.WEEK_DW_ID == null : this.WEEK_DW_ID.equals(that.WEEK_DW_ID));
    equal = equal && (this.WEEK_NAME == null ? that.WEEK_NAME == null : this.WEEK_NAME.equals(that.WEEK_NAME));
    equal = equal && (this.WEEK_IN_PERIOD == null ? that.WEEK_IN_PERIOD == null : this.WEEK_IN_PERIOD.equals(that.WEEK_IN_PERIOD));
    equal = equal && (this.WEEK_IN_QUARTER == null ? that.WEEK_IN_QUARTER == null : this.WEEK_IN_QUARTER.equals(that.WEEK_IN_QUARTER));
    equal = equal && (this.WEEK_IN_YEAR == null ? that.WEEK_IN_YEAR == null : this.WEEK_IN_YEAR.equals(that.WEEK_IN_YEAR));
    equal = equal && (this.WEEK_START_DATE == null ? that.WEEK_START_DATE == null : this.WEEK_START_DATE.equals(that.WEEK_START_DATE));
    equal = equal && (this.WEEK_END_DATE == null ? that.WEEK_END_DATE == null : this.WEEK_END_DATE.equals(that.WEEK_END_DATE));
    equal = equal && (this.WEEK_START_DAY_DW_ID == null ? that.WEEK_START_DAY_DW_ID == null : this.WEEK_START_DAY_DW_ID.equals(that.WEEK_START_DAY_DW_ID));
    equal = equal && (this.WEEK_END_DAY_DW_ID == null ? that.WEEK_END_DAY_DW_ID == null : this.WEEK_END_DAY_DW_ID.equals(that.WEEK_END_DAY_DW_ID));
    equal = equal && (this.WEEK_NBR_IN_EPOCH == null ? that.WEEK_NBR_IN_EPOCH == null : this.WEEK_NBR_IN_EPOCH.equals(that.WEEK_NBR_IN_EPOCH));
    equal = equal && (this.WEEK_GL_NAME == null ? that.WEEK_GL_NAME == null : this.WEEK_GL_NAME.equals(that.WEEK_GL_NAME));
    equal = equal && (this.WEEK_GL_STATUS == null ? that.WEEK_GL_STATUS == null : this.WEEK_GL_STATUS.equals(that.WEEK_GL_STATUS));
    equal = equal && (this.WEEK_DW_ID_LY == null ? that.WEEK_DW_ID_LY == null : this.WEEK_DW_ID_LY.equals(that.WEEK_DW_ID_LY));
    equal = equal && (this.WEEK_START_DATE_LY == null ? that.WEEK_START_DATE_LY == null : this.WEEK_START_DATE_LY.equals(that.WEEK_START_DATE_LY));
    equal = equal && (this.WEEK_END_DATE_LY == null ? that.WEEK_END_DATE_LY == null : this.WEEK_END_DATE_LY.equals(that.WEEK_END_DATE_LY));
    equal = equal && (this.WEEK_START_DAY_DW_ID_LY == null ? that.WEEK_START_DAY_DW_ID_LY == null : this.WEEK_START_DAY_DW_ID_LY.equals(that.WEEK_START_DAY_DW_ID_LY));
    equal = equal && (this.WEEK_END_DAY_DW_ID_LY == null ? that.WEEK_END_DAY_DW_ID_LY == null : this.WEEK_END_DAY_DW_ID_LY.equals(that.WEEK_END_DAY_DW_ID_LY));
    equal = equal && (this.WEEK_NBR_IN_EPOCH_LY == null ? that.WEEK_NBR_IN_EPOCH_LY == null : this.WEEK_NBR_IN_EPOCH_LY.equals(that.WEEK_NBR_IN_EPOCH_LY));
    equal = equal && (this.PERIOD_DW_ID == null ? that.PERIOD_DW_ID == null : this.PERIOD_DW_ID.equals(that.PERIOD_DW_ID));
    equal = equal && (this.PERIOD_NAME == null ? that.PERIOD_NAME == null : this.PERIOD_NAME.equals(that.PERIOD_NAME));
    equal = equal && (this.PERIOD_IN_QUARTER == null ? that.PERIOD_IN_QUARTER == null : this.PERIOD_IN_QUARTER.equals(that.PERIOD_IN_QUARTER));
    equal = equal && (this.PERIOD_IN_YEAR == null ? that.PERIOD_IN_YEAR == null : this.PERIOD_IN_YEAR.equals(that.PERIOD_IN_YEAR));
    equal = equal && (this.PERIOD_START_DATE == null ? that.PERIOD_START_DATE == null : this.PERIOD_START_DATE.equals(that.PERIOD_START_DATE));
    equal = equal && (this.PERIOD_END_DATE == null ? that.PERIOD_END_DATE == null : this.PERIOD_END_DATE.equals(that.PERIOD_END_DATE));
    equal = equal && (this.PERIOD_START_DAY_DW_ID == null ? that.PERIOD_START_DAY_DW_ID == null : this.PERIOD_START_DAY_DW_ID.equals(that.PERIOD_START_DAY_DW_ID));
    equal = equal && (this.PERIOD_END_DAY_DW_ID == null ? that.PERIOD_END_DAY_DW_ID == null : this.PERIOD_END_DAY_DW_ID.equals(that.PERIOD_END_DAY_DW_ID));
    equal = equal && (this.PERIOD_NBR_IN_EPOCH == null ? that.PERIOD_NBR_IN_EPOCH == null : this.PERIOD_NBR_IN_EPOCH.equals(that.PERIOD_NBR_IN_EPOCH));
    equal = equal && (this.PERIOD_GL_STATUS == null ? that.PERIOD_GL_STATUS == null : this.PERIOD_GL_STATUS.equals(that.PERIOD_GL_STATUS));
    equal = equal && (this.QUARTER_DW_ID == null ? that.QUARTER_DW_ID == null : this.QUARTER_DW_ID.equals(that.QUARTER_DW_ID));
    equal = equal && (this.QUARTER_NAME == null ? that.QUARTER_NAME == null : this.QUARTER_NAME.equals(that.QUARTER_NAME));
    equal = equal && (this.QUARTER_IN_YEAR == null ? that.QUARTER_IN_YEAR == null : this.QUARTER_IN_YEAR.equals(that.QUARTER_IN_YEAR));
    equal = equal && (this.QUARTER_START_DATE == null ? that.QUARTER_START_DATE == null : this.QUARTER_START_DATE.equals(that.QUARTER_START_DATE));
    equal = equal && (this.QUARTER_END_DATE == null ? that.QUARTER_END_DATE == null : this.QUARTER_END_DATE.equals(that.QUARTER_END_DATE));
    equal = equal && (this.QUARTER_START_DAY_DW_ID == null ? that.QUARTER_START_DAY_DW_ID == null : this.QUARTER_START_DAY_DW_ID.equals(that.QUARTER_START_DAY_DW_ID));
    equal = equal && (this.QUARTER_END_DAY_DW_ID == null ? that.QUARTER_END_DAY_DW_ID == null : this.QUARTER_END_DAY_DW_ID.equals(that.QUARTER_END_DAY_DW_ID));
    equal = equal && (this.QUARTER_NBR_IN_EPOCH == null ? that.QUARTER_NBR_IN_EPOCH == null : this.QUARTER_NBR_IN_EPOCH.equals(that.QUARTER_NBR_IN_EPOCH));
    equal = equal && (this.QUARTER_GL_STATUS == null ? that.QUARTER_GL_STATUS == null : this.QUARTER_GL_STATUS.equals(that.QUARTER_GL_STATUS));
    equal = equal && (this.YEAR_DW_ID == null ? that.YEAR_DW_ID == null : this.YEAR_DW_ID.equals(that.YEAR_DW_ID));
    equal = equal && (this.YEAR_NBR == null ? that.YEAR_NBR == null : this.YEAR_NBR.equals(that.YEAR_NBR));
    equal = equal && (this.YEAR_CODE == null ? that.YEAR_CODE == null : this.YEAR_CODE.equals(that.YEAR_CODE));
    equal = equal && (this.YEAR_START_DATE == null ? that.YEAR_START_DATE == null : this.YEAR_START_DATE.equals(that.YEAR_START_DATE));
    equal = equal && (this.YEAR_END_DATE == null ? that.YEAR_END_DATE == null : this.YEAR_END_DATE.equals(that.YEAR_END_DATE));
    equal = equal && (this.YEAR_START_DAY_DW_ID == null ? that.YEAR_START_DAY_DW_ID == null : this.YEAR_START_DAY_DW_ID.equals(that.YEAR_START_DAY_DW_ID));
    equal = equal && (this.YEAR_END_DAY_DW_ID == null ? that.YEAR_END_DAY_DW_ID == null : this.YEAR_END_DAY_DW_ID.equals(that.YEAR_END_DAY_DW_ID));
    equal = equal && (this.YEAR_NBR_IN_EPOCH == null ? that.YEAR_NBR_IN_EPOCH == null : this.YEAR_NBR_IN_EPOCH.equals(that.YEAR_NBR_IN_EPOCH));
    equal = equal && (this.YEAR_GL_STATUS == null ? that.YEAR_GL_STATUS == null : this.YEAR_GL_STATUS.equals(that.YEAR_GL_STATUS));
    equal = equal && (this.FILE_DTTM == null ? that.FILE_DTTM == null : this.FILE_DTTM.equals(that.FILE_DTTM));
    equal = equal && (this.INSERT_DTTM == null ? that.INSERT_DTTM == null : this.INSERT_DTTM.equals(that.INSERT_DTTM));
    equal = equal && (this.UPDATE_DTTM == null ? that.UPDATE_DTTM == null : this.UPDATE_DTTM.equals(that.UPDATE_DTTM));
    equal = equal && (this.LOAD_DW_ID == null ? that.LOAD_DW_ID == null : this.LOAD_DW_ID.equals(that.LOAD_DW_ID));
    equal = equal && (this.VERSION == null ? that.VERSION == null : this.VERSION.equals(that.VERSION));
    equal = equal && (this.DAY_DW_ID_LY_CAL == null ? that.DAY_DW_ID_LY_CAL == null : this.DAY_DW_ID_LY_CAL.equals(that.DAY_DW_ID_LY_CAL));
    equal = equal && (this.DAY_LY_CAL == null ? that.DAY_LY_CAL == null : this.DAY_LY_CAL.equals(that.DAY_LY_CAL));
    equal = equal && (this.DAY_NBR_IN_EPOCH_LY_CAL == null ? that.DAY_NBR_IN_EPOCH_LY_CAL == null : this.DAY_NBR_IN_EPOCH_LY_CAL.equals(that.DAY_NBR_IN_EPOCH_LY_CAL));
    equal = equal && (this.WEEK_DW_ID_LY_CAL == null ? that.WEEK_DW_ID_LY_CAL == null : this.WEEK_DW_ID_LY_CAL.equals(that.WEEK_DW_ID_LY_CAL));
    equal = equal && (this.WEEK_START_DATE_LY_CAL == null ? that.WEEK_START_DATE_LY_CAL == null : this.WEEK_START_DATE_LY_CAL.equals(that.WEEK_START_DATE_LY_CAL));
    equal = equal && (this.WEEK_END_DATE_LY_CAL == null ? that.WEEK_END_DATE_LY_CAL == null : this.WEEK_END_DATE_LY_CAL.equals(that.WEEK_END_DATE_LY_CAL));
    equal = equal && (this.WEEK_START_DAY_DW_ID_LY_CAL == null ? that.WEEK_START_DAY_DW_ID_LY_CAL == null : this.WEEK_START_DAY_DW_ID_LY_CAL.equals(that.WEEK_START_DAY_DW_ID_LY_CAL));
    equal = equal && (this.WEEK_END_DAY_DW_ID_LY_CAL == null ? that.WEEK_END_DAY_DW_ID_LY_CAL == null : this.WEEK_END_DAY_DW_ID_LY_CAL.equals(that.WEEK_END_DAY_DW_ID_LY_CAL));
    equal = equal && (this.WEEK_NBR_IN_EPOCH_LY_CAL == null ? that.WEEK_NBR_IN_EPOCH_LY_CAL == null : this.WEEK_NBR_IN_EPOCH_LY_CAL.equals(that.WEEK_NBR_IN_EPOCH_LY_CAL));
    equal = equal && (this.DAY_DW_ID_2Y_CAL == null ? that.DAY_DW_ID_2Y_CAL == null : this.DAY_DW_ID_2Y_CAL.equals(that.DAY_DW_ID_2Y_CAL));
    equal = equal && (this.DAY_2Y_CAL == null ? that.DAY_2Y_CAL == null : this.DAY_2Y_CAL.equals(that.DAY_2Y_CAL));
    equal = equal && (this.DAY_NBR_IN_EPOCH_2Y_CAL == null ? that.DAY_NBR_IN_EPOCH_2Y_CAL == null : this.DAY_NBR_IN_EPOCH_2Y_CAL.equals(that.DAY_NBR_IN_EPOCH_2Y_CAL));
    equal = equal && (this.WEEK_DW_ID_2Y_CAL == null ? that.WEEK_DW_ID_2Y_CAL == null : this.WEEK_DW_ID_2Y_CAL.equals(that.WEEK_DW_ID_2Y_CAL));
    equal = equal && (this.WEEK_START_DATE_2Y_CAL == null ? that.WEEK_START_DATE_2Y_CAL == null : this.WEEK_START_DATE_2Y_CAL.equals(that.WEEK_START_DATE_2Y_CAL));
    equal = equal && (this.WEEK_END_DATE_2Y_CAL == null ? that.WEEK_END_DATE_2Y_CAL == null : this.WEEK_END_DATE_2Y_CAL.equals(that.WEEK_END_DATE_2Y_CAL));
    equal = equal && (this.WEEK_START_DAY_DW_ID_2Y_CAL == null ? that.WEEK_START_DAY_DW_ID_2Y_CAL == null : this.WEEK_START_DAY_DW_ID_2Y_CAL.equals(that.WEEK_START_DAY_DW_ID_2Y_CAL));
    equal = equal && (this.WEEK_END_DAY_DW_ID_2Y_CAL == null ? that.WEEK_END_DAY_DW_ID_2Y_CAL == null : this.WEEK_END_DAY_DW_ID_2Y_CAL.equals(that.WEEK_END_DAY_DW_ID_2Y_CAL));
    equal = equal && (this.WEEK_NBR_IN_EPOCH_2Y_CAL == null ? that.WEEK_NBR_IN_EPOCH_2Y_CAL == null : this.WEEK_NBR_IN_EPOCH_2Y_CAL.equals(that.WEEK_NBR_IN_EPOCH_2Y_CAL));
    equal = equal && (this.LOAD_DTTM == null ? that.LOAD_DTTM == null : this.LOAD_DTTM.equals(that.LOAD_DTTM));
    equal = equal && (this.LOAD_BY == null ? that.LOAD_BY == null : this.LOAD_BY.equals(that.LOAD_BY));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Z_DAY_DW_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.DAY = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.DAY_NBR_IN_EPOCH = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.DAY_DW_ID_LY = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.DAY_LY = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.DAY_NBR_IN_EPOCH_LY = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.DAY_IN_WEEK = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.DAY_IN_PERIOD = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.DAY_IN_QUARTER = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.DAY_IN_YEAR = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.WEEK_DW_ID = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.WEEK_NAME = JdbcWritableBridge.readString(12, __dbResults);
    this.WEEK_IN_PERIOD = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.WEEK_IN_QUARTER = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.WEEK_IN_YEAR = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.WEEK_START_DATE = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.WEEK_END_DATE = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.WEEK_START_DAY_DW_ID = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.WEEK_END_DAY_DW_ID = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.WEEK_NBR_IN_EPOCH = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.WEEK_GL_NAME = JdbcWritableBridge.readString(21, __dbResults);
    this.WEEK_GL_STATUS = JdbcWritableBridge.readString(22, __dbResults);
    this.WEEK_DW_ID_LY = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.WEEK_START_DATE_LY = JdbcWritableBridge.readTimestamp(24, __dbResults);
    this.WEEK_END_DATE_LY = JdbcWritableBridge.readTimestamp(25, __dbResults);
    this.WEEK_START_DAY_DW_ID_LY = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.WEEK_END_DAY_DW_ID_LY = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.WEEK_NBR_IN_EPOCH_LY = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.PERIOD_DW_ID = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.PERIOD_NAME = JdbcWritableBridge.readString(30, __dbResults);
    this.PERIOD_IN_QUARTER = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.PERIOD_IN_YEAR = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.PERIOD_START_DATE = JdbcWritableBridge.readTimestamp(33, __dbResults);
    this.PERIOD_END_DATE = JdbcWritableBridge.readTimestamp(34, __dbResults);
    this.PERIOD_START_DAY_DW_ID = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.PERIOD_END_DAY_DW_ID = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.PERIOD_NBR_IN_EPOCH = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.PERIOD_GL_STATUS = JdbcWritableBridge.readString(38, __dbResults);
    this.QUARTER_DW_ID = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.QUARTER_NAME = JdbcWritableBridge.readString(40, __dbResults);
    this.QUARTER_IN_YEAR = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.QUARTER_START_DATE = JdbcWritableBridge.readTimestamp(42, __dbResults);
    this.QUARTER_END_DATE = JdbcWritableBridge.readTimestamp(43, __dbResults);
    this.QUARTER_START_DAY_DW_ID = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.QUARTER_END_DAY_DW_ID = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.QUARTER_NBR_IN_EPOCH = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.QUARTER_GL_STATUS = JdbcWritableBridge.readString(47, __dbResults);
    this.YEAR_DW_ID = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.YEAR_NBR = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.YEAR_CODE = JdbcWritableBridge.readString(50, __dbResults);
    this.YEAR_START_DATE = JdbcWritableBridge.readTimestamp(51, __dbResults);
    this.YEAR_END_DATE = JdbcWritableBridge.readTimestamp(52, __dbResults);
    this.YEAR_START_DAY_DW_ID = JdbcWritableBridge.readBigDecimal(53, __dbResults);
    this.YEAR_END_DAY_DW_ID = JdbcWritableBridge.readBigDecimal(54, __dbResults);
    this.YEAR_NBR_IN_EPOCH = JdbcWritableBridge.readBigDecimal(55, __dbResults);
    this.YEAR_GL_STATUS = JdbcWritableBridge.readString(56, __dbResults);
    this.FILE_DTTM = JdbcWritableBridge.readTimestamp(57, __dbResults);
    this.INSERT_DTTM = JdbcWritableBridge.readTimestamp(58, __dbResults);
    this.UPDATE_DTTM = JdbcWritableBridge.readTimestamp(59, __dbResults);
    this.LOAD_DW_ID = JdbcWritableBridge.readBigDecimal(60, __dbResults);
    this.VERSION = JdbcWritableBridge.readBigDecimal(61, __dbResults);
    this.DAY_DW_ID_LY_CAL = JdbcWritableBridge.readBigDecimal(62, __dbResults);
    this.DAY_LY_CAL = JdbcWritableBridge.readTimestamp(63, __dbResults);
    this.DAY_NBR_IN_EPOCH_LY_CAL = JdbcWritableBridge.readBigDecimal(64, __dbResults);
    this.WEEK_DW_ID_LY_CAL = JdbcWritableBridge.readBigDecimal(65, __dbResults);
    this.WEEK_START_DATE_LY_CAL = JdbcWritableBridge.readTimestamp(66, __dbResults);
    this.WEEK_END_DATE_LY_CAL = JdbcWritableBridge.readTimestamp(67, __dbResults);
    this.WEEK_START_DAY_DW_ID_LY_CAL = JdbcWritableBridge.readBigDecimal(68, __dbResults);
    this.WEEK_END_DAY_DW_ID_LY_CAL = JdbcWritableBridge.readBigDecimal(69, __dbResults);
    this.WEEK_NBR_IN_EPOCH_LY_CAL = JdbcWritableBridge.readBigDecimal(70, __dbResults);
    this.DAY_DW_ID_2Y_CAL = JdbcWritableBridge.readBigDecimal(71, __dbResults);
    this.DAY_2Y_CAL = JdbcWritableBridge.readTimestamp(72, __dbResults);
    this.DAY_NBR_IN_EPOCH_2Y_CAL = JdbcWritableBridge.readBigDecimal(73, __dbResults);
    this.WEEK_DW_ID_2Y_CAL = JdbcWritableBridge.readBigDecimal(74, __dbResults);
    this.WEEK_START_DATE_2Y_CAL = JdbcWritableBridge.readTimestamp(75, __dbResults);
    this.WEEK_END_DATE_2Y_CAL = JdbcWritableBridge.readTimestamp(76, __dbResults);
    this.WEEK_START_DAY_DW_ID_2Y_CAL = JdbcWritableBridge.readBigDecimal(77, __dbResults);
    this.WEEK_END_DAY_DW_ID_2Y_CAL = JdbcWritableBridge.readBigDecimal(78, __dbResults);
    this.WEEK_NBR_IN_EPOCH_2Y_CAL = JdbcWritableBridge.readBigDecimal(79, __dbResults);
    this.LOAD_DTTM = JdbcWritableBridge.readTimestamp(80, __dbResults);
    this.LOAD_BY = JdbcWritableBridge.readString(81, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Z_DAY_DW_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.DAY = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.DAY_NBR_IN_EPOCH = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.DAY_DW_ID_LY = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.DAY_LY = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.DAY_NBR_IN_EPOCH_LY = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.DAY_IN_WEEK = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.DAY_IN_PERIOD = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.DAY_IN_QUARTER = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.DAY_IN_YEAR = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.WEEK_DW_ID = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.WEEK_NAME = JdbcWritableBridge.readString(12, __dbResults);
    this.WEEK_IN_PERIOD = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.WEEK_IN_QUARTER = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.WEEK_IN_YEAR = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.WEEK_START_DATE = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.WEEK_END_DATE = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.WEEK_START_DAY_DW_ID = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.WEEK_END_DAY_DW_ID = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.WEEK_NBR_IN_EPOCH = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.WEEK_GL_NAME = JdbcWritableBridge.readString(21, __dbResults);
    this.WEEK_GL_STATUS = JdbcWritableBridge.readString(22, __dbResults);
    this.WEEK_DW_ID_LY = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.WEEK_START_DATE_LY = JdbcWritableBridge.readTimestamp(24, __dbResults);
    this.WEEK_END_DATE_LY = JdbcWritableBridge.readTimestamp(25, __dbResults);
    this.WEEK_START_DAY_DW_ID_LY = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.WEEK_END_DAY_DW_ID_LY = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.WEEK_NBR_IN_EPOCH_LY = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.PERIOD_DW_ID = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.PERIOD_NAME = JdbcWritableBridge.readString(30, __dbResults);
    this.PERIOD_IN_QUARTER = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.PERIOD_IN_YEAR = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.PERIOD_START_DATE = JdbcWritableBridge.readTimestamp(33, __dbResults);
    this.PERIOD_END_DATE = JdbcWritableBridge.readTimestamp(34, __dbResults);
    this.PERIOD_START_DAY_DW_ID = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.PERIOD_END_DAY_DW_ID = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.PERIOD_NBR_IN_EPOCH = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.PERIOD_GL_STATUS = JdbcWritableBridge.readString(38, __dbResults);
    this.QUARTER_DW_ID = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.QUARTER_NAME = JdbcWritableBridge.readString(40, __dbResults);
    this.QUARTER_IN_YEAR = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.QUARTER_START_DATE = JdbcWritableBridge.readTimestamp(42, __dbResults);
    this.QUARTER_END_DATE = JdbcWritableBridge.readTimestamp(43, __dbResults);
    this.QUARTER_START_DAY_DW_ID = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.QUARTER_END_DAY_DW_ID = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.QUARTER_NBR_IN_EPOCH = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.QUARTER_GL_STATUS = JdbcWritableBridge.readString(47, __dbResults);
    this.YEAR_DW_ID = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.YEAR_NBR = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.YEAR_CODE = JdbcWritableBridge.readString(50, __dbResults);
    this.YEAR_START_DATE = JdbcWritableBridge.readTimestamp(51, __dbResults);
    this.YEAR_END_DATE = JdbcWritableBridge.readTimestamp(52, __dbResults);
    this.YEAR_START_DAY_DW_ID = JdbcWritableBridge.readBigDecimal(53, __dbResults);
    this.YEAR_END_DAY_DW_ID = JdbcWritableBridge.readBigDecimal(54, __dbResults);
    this.YEAR_NBR_IN_EPOCH = JdbcWritableBridge.readBigDecimal(55, __dbResults);
    this.YEAR_GL_STATUS = JdbcWritableBridge.readString(56, __dbResults);
    this.FILE_DTTM = JdbcWritableBridge.readTimestamp(57, __dbResults);
    this.INSERT_DTTM = JdbcWritableBridge.readTimestamp(58, __dbResults);
    this.UPDATE_DTTM = JdbcWritableBridge.readTimestamp(59, __dbResults);
    this.LOAD_DW_ID = JdbcWritableBridge.readBigDecimal(60, __dbResults);
    this.VERSION = JdbcWritableBridge.readBigDecimal(61, __dbResults);
    this.DAY_DW_ID_LY_CAL = JdbcWritableBridge.readBigDecimal(62, __dbResults);
    this.DAY_LY_CAL = JdbcWritableBridge.readTimestamp(63, __dbResults);
    this.DAY_NBR_IN_EPOCH_LY_CAL = JdbcWritableBridge.readBigDecimal(64, __dbResults);
    this.WEEK_DW_ID_LY_CAL = JdbcWritableBridge.readBigDecimal(65, __dbResults);
    this.WEEK_START_DATE_LY_CAL = JdbcWritableBridge.readTimestamp(66, __dbResults);
    this.WEEK_END_DATE_LY_CAL = JdbcWritableBridge.readTimestamp(67, __dbResults);
    this.WEEK_START_DAY_DW_ID_LY_CAL = JdbcWritableBridge.readBigDecimal(68, __dbResults);
    this.WEEK_END_DAY_DW_ID_LY_CAL = JdbcWritableBridge.readBigDecimal(69, __dbResults);
    this.WEEK_NBR_IN_EPOCH_LY_CAL = JdbcWritableBridge.readBigDecimal(70, __dbResults);
    this.DAY_DW_ID_2Y_CAL = JdbcWritableBridge.readBigDecimal(71, __dbResults);
    this.DAY_2Y_CAL = JdbcWritableBridge.readTimestamp(72, __dbResults);
    this.DAY_NBR_IN_EPOCH_2Y_CAL = JdbcWritableBridge.readBigDecimal(73, __dbResults);
    this.WEEK_DW_ID_2Y_CAL = JdbcWritableBridge.readBigDecimal(74, __dbResults);
    this.WEEK_START_DATE_2Y_CAL = JdbcWritableBridge.readTimestamp(75, __dbResults);
    this.WEEK_END_DATE_2Y_CAL = JdbcWritableBridge.readTimestamp(76, __dbResults);
    this.WEEK_START_DAY_DW_ID_2Y_CAL = JdbcWritableBridge.readBigDecimal(77, __dbResults);
    this.WEEK_END_DAY_DW_ID_2Y_CAL = JdbcWritableBridge.readBigDecimal(78, __dbResults);
    this.WEEK_NBR_IN_EPOCH_2Y_CAL = JdbcWritableBridge.readBigDecimal(79, __dbResults);
    this.LOAD_DTTM = JdbcWritableBridge.readTimestamp(80, __dbResults);
    this.LOAD_BY = JdbcWritableBridge.readString(81, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(Z_DAY_DW_ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(DAY, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAY_NBR_IN_EPOCH, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAY_DW_ID_LY, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(DAY_LY, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAY_NBR_IN_EPOCH_LY, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAY_IN_WEEK, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAY_IN_PERIOD, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAY_IN_QUARTER, 9 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAY_IN_YEAR, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_DW_ID, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(WEEK_NAME, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_IN_PERIOD, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_IN_QUARTER, 14 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_IN_YEAR, 15 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(WEEK_START_DATE, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(WEEK_END_DATE, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_START_DAY_DW_ID, 18 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_END_DAY_DW_ID, 19 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_NBR_IN_EPOCH, 20 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(WEEK_GL_NAME, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(WEEK_GL_STATUS, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_DW_ID_LY, 23 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(WEEK_START_DATE_LY, 24 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(WEEK_END_DATE_LY, 25 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_START_DAY_DW_ID_LY, 26 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_END_DAY_DW_ID_LY, 27 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_NBR_IN_EPOCH_LY, 28 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PERIOD_DW_ID, 29 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(PERIOD_NAME, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PERIOD_IN_QUARTER, 31 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PERIOD_IN_YEAR, 32 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(PERIOD_START_DATE, 33 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(PERIOD_END_DATE, 34 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PERIOD_START_DAY_DW_ID, 35 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PERIOD_END_DAY_DW_ID, 36 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PERIOD_NBR_IN_EPOCH, 37 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(PERIOD_GL_STATUS, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(QUARTER_DW_ID, 39 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(QUARTER_NAME, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(QUARTER_IN_YEAR, 41 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(QUARTER_START_DATE, 42 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(QUARTER_END_DATE, 43 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(QUARTER_START_DAY_DW_ID, 44 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(QUARTER_END_DAY_DW_ID, 45 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(QUARTER_NBR_IN_EPOCH, 46 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(QUARTER_GL_STATUS, 47 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(YEAR_DW_ID, 48 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(YEAR_NBR, 49 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(YEAR_CODE, 50 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(YEAR_START_DATE, 51 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(YEAR_END_DATE, 52 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(YEAR_START_DAY_DW_ID, 53 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(YEAR_END_DAY_DW_ID, 54 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(YEAR_NBR_IN_EPOCH, 55 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(YEAR_GL_STATUS, 56 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FILE_DTTM, 57 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(INSERT_DTTM, 58 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATE_DTTM, 59 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOAD_DW_ID, 60 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VERSION, 61 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAY_DW_ID_LY_CAL, 62 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(DAY_LY_CAL, 63 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAY_NBR_IN_EPOCH_LY_CAL, 64 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_DW_ID_LY_CAL, 65 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(WEEK_START_DATE_LY_CAL, 66 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(WEEK_END_DATE_LY_CAL, 67 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_START_DAY_DW_ID_LY_CAL, 68 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_END_DAY_DW_ID_LY_CAL, 69 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_NBR_IN_EPOCH_LY_CAL, 70 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAY_DW_ID_2Y_CAL, 71 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(DAY_2Y_CAL, 72 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAY_NBR_IN_EPOCH_2Y_CAL, 73 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_DW_ID_2Y_CAL, 74 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(WEEK_START_DATE_2Y_CAL, 75 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(WEEK_END_DATE_2Y_CAL, 76 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_START_DAY_DW_ID_2Y_CAL, 77 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_END_DAY_DW_ID_2Y_CAL, 78 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_NBR_IN_EPOCH_2Y_CAL, 79 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOAD_DTTM, 80 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_BY, 81 + __off, 12, __dbStmt);
    return 81;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(Z_DAY_DW_ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(DAY, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAY_NBR_IN_EPOCH, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAY_DW_ID_LY, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(DAY_LY, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAY_NBR_IN_EPOCH_LY, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAY_IN_WEEK, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAY_IN_PERIOD, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAY_IN_QUARTER, 9 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAY_IN_YEAR, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_DW_ID, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(WEEK_NAME, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_IN_PERIOD, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_IN_QUARTER, 14 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_IN_YEAR, 15 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(WEEK_START_DATE, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(WEEK_END_DATE, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_START_DAY_DW_ID, 18 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_END_DAY_DW_ID, 19 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_NBR_IN_EPOCH, 20 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(WEEK_GL_NAME, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(WEEK_GL_STATUS, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_DW_ID_LY, 23 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(WEEK_START_DATE_LY, 24 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(WEEK_END_DATE_LY, 25 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_START_DAY_DW_ID_LY, 26 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_END_DAY_DW_ID_LY, 27 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_NBR_IN_EPOCH_LY, 28 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PERIOD_DW_ID, 29 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(PERIOD_NAME, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PERIOD_IN_QUARTER, 31 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PERIOD_IN_YEAR, 32 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(PERIOD_START_DATE, 33 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(PERIOD_END_DATE, 34 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PERIOD_START_DAY_DW_ID, 35 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PERIOD_END_DAY_DW_ID, 36 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PERIOD_NBR_IN_EPOCH, 37 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(PERIOD_GL_STATUS, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(QUARTER_DW_ID, 39 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(QUARTER_NAME, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(QUARTER_IN_YEAR, 41 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(QUARTER_START_DATE, 42 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(QUARTER_END_DATE, 43 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(QUARTER_START_DAY_DW_ID, 44 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(QUARTER_END_DAY_DW_ID, 45 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(QUARTER_NBR_IN_EPOCH, 46 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(QUARTER_GL_STATUS, 47 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(YEAR_DW_ID, 48 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(YEAR_NBR, 49 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(YEAR_CODE, 50 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(YEAR_START_DATE, 51 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(YEAR_END_DATE, 52 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(YEAR_START_DAY_DW_ID, 53 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(YEAR_END_DAY_DW_ID, 54 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(YEAR_NBR_IN_EPOCH, 55 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(YEAR_GL_STATUS, 56 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FILE_DTTM, 57 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(INSERT_DTTM, 58 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATE_DTTM, 59 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOAD_DW_ID, 60 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VERSION, 61 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAY_DW_ID_LY_CAL, 62 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(DAY_LY_CAL, 63 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAY_NBR_IN_EPOCH_LY_CAL, 64 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_DW_ID_LY_CAL, 65 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(WEEK_START_DATE_LY_CAL, 66 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(WEEK_END_DATE_LY_CAL, 67 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_START_DAY_DW_ID_LY_CAL, 68 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_END_DAY_DW_ID_LY_CAL, 69 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_NBR_IN_EPOCH_LY_CAL, 70 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAY_DW_ID_2Y_CAL, 71 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(DAY_2Y_CAL, 72 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAY_NBR_IN_EPOCH_2Y_CAL, 73 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_DW_ID_2Y_CAL, 74 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(WEEK_START_DATE_2Y_CAL, 75 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(WEEK_END_DATE_2Y_CAL, 76 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_START_DAY_DW_ID_2Y_CAL, 77 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_END_DAY_DW_ID_2Y_CAL, 78 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEK_NBR_IN_EPOCH_2Y_CAL, 79 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOAD_DTTM, 80 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_BY, 81 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.Z_DAY_DW_ID = null;
    } else {
    this.Z_DAY_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DAY = null;
    } else {
    this.DAY = new Timestamp(__dataIn.readLong());
    this.DAY.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DAY_NBR_IN_EPOCH = null;
    } else {
    this.DAY_NBR_IN_EPOCH = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DAY_DW_ID_LY = null;
    } else {
    this.DAY_DW_ID_LY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DAY_LY = null;
    } else {
    this.DAY_LY = new Timestamp(__dataIn.readLong());
    this.DAY_LY.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DAY_NBR_IN_EPOCH_LY = null;
    } else {
    this.DAY_NBR_IN_EPOCH_LY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DAY_IN_WEEK = null;
    } else {
    this.DAY_IN_WEEK = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DAY_IN_PERIOD = null;
    } else {
    this.DAY_IN_PERIOD = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DAY_IN_QUARTER = null;
    } else {
    this.DAY_IN_QUARTER = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DAY_IN_YEAR = null;
    } else {
    this.DAY_IN_YEAR = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_DW_ID = null;
    } else {
    this.WEEK_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_NAME = null;
    } else {
    this.WEEK_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_IN_PERIOD = null;
    } else {
    this.WEEK_IN_PERIOD = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_IN_QUARTER = null;
    } else {
    this.WEEK_IN_QUARTER = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_IN_YEAR = null;
    } else {
    this.WEEK_IN_YEAR = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_START_DATE = null;
    } else {
    this.WEEK_START_DATE = new Timestamp(__dataIn.readLong());
    this.WEEK_START_DATE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_END_DATE = null;
    } else {
    this.WEEK_END_DATE = new Timestamp(__dataIn.readLong());
    this.WEEK_END_DATE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_START_DAY_DW_ID = null;
    } else {
    this.WEEK_START_DAY_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_END_DAY_DW_ID = null;
    } else {
    this.WEEK_END_DAY_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_NBR_IN_EPOCH = null;
    } else {
    this.WEEK_NBR_IN_EPOCH = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_GL_NAME = null;
    } else {
    this.WEEK_GL_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_GL_STATUS = null;
    } else {
    this.WEEK_GL_STATUS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_DW_ID_LY = null;
    } else {
    this.WEEK_DW_ID_LY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_START_DATE_LY = null;
    } else {
    this.WEEK_START_DATE_LY = new Timestamp(__dataIn.readLong());
    this.WEEK_START_DATE_LY.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_END_DATE_LY = null;
    } else {
    this.WEEK_END_DATE_LY = new Timestamp(__dataIn.readLong());
    this.WEEK_END_DATE_LY.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_START_DAY_DW_ID_LY = null;
    } else {
    this.WEEK_START_DAY_DW_ID_LY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_END_DAY_DW_ID_LY = null;
    } else {
    this.WEEK_END_DAY_DW_ID_LY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_NBR_IN_EPOCH_LY = null;
    } else {
    this.WEEK_NBR_IN_EPOCH_LY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PERIOD_DW_ID = null;
    } else {
    this.PERIOD_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PERIOD_NAME = null;
    } else {
    this.PERIOD_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PERIOD_IN_QUARTER = null;
    } else {
    this.PERIOD_IN_QUARTER = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PERIOD_IN_YEAR = null;
    } else {
    this.PERIOD_IN_YEAR = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PERIOD_START_DATE = null;
    } else {
    this.PERIOD_START_DATE = new Timestamp(__dataIn.readLong());
    this.PERIOD_START_DATE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.PERIOD_END_DATE = null;
    } else {
    this.PERIOD_END_DATE = new Timestamp(__dataIn.readLong());
    this.PERIOD_END_DATE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.PERIOD_START_DAY_DW_ID = null;
    } else {
    this.PERIOD_START_DAY_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PERIOD_END_DAY_DW_ID = null;
    } else {
    this.PERIOD_END_DAY_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PERIOD_NBR_IN_EPOCH = null;
    } else {
    this.PERIOD_NBR_IN_EPOCH = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PERIOD_GL_STATUS = null;
    } else {
    this.PERIOD_GL_STATUS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.QUARTER_DW_ID = null;
    } else {
    this.QUARTER_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.QUARTER_NAME = null;
    } else {
    this.QUARTER_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.QUARTER_IN_YEAR = null;
    } else {
    this.QUARTER_IN_YEAR = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.QUARTER_START_DATE = null;
    } else {
    this.QUARTER_START_DATE = new Timestamp(__dataIn.readLong());
    this.QUARTER_START_DATE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.QUARTER_END_DATE = null;
    } else {
    this.QUARTER_END_DATE = new Timestamp(__dataIn.readLong());
    this.QUARTER_END_DATE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.QUARTER_START_DAY_DW_ID = null;
    } else {
    this.QUARTER_START_DAY_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.QUARTER_END_DAY_DW_ID = null;
    } else {
    this.QUARTER_END_DAY_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.QUARTER_NBR_IN_EPOCH = null;
    } else {
    this.QUARTER_NBR_IN_EPOCH = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.QUARTER_GL_STATUS = null;
    } else {
    this.QUARTER_GL_STATUS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.YEAR_DW_ID = null;
    } else {
    this.YEAR_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.YEAR_NBR = null;
    } else {
    this.YEAR_NBR = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.YEAR_CODE = null;
    } else {
    this.YEAR_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.YEAR_START_DATE = null;
    } else {
    this.YEAR_START_DATE = new Timestamp(__dataIn.readLong());
    this.YEAR_START_DATE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.YEAR_END_DATE = null;
    } else {
    this.YEAR_END_DATE = new Timestamp(__dataIn.readLong());
    this.YEAR_END_DATE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.YEAR_START_DAY_DW_ID = null;
    } else {
    this.YEAR_START_DAY_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.YEAR_END_DAY_DW_ID = null;
    } else {
    this.YEAR_END_DAY_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.YEAR_NBR_IN_EPOCH = null;
    } else {
    this.YEAR_NBR_IN_EPOCH = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.YEAR_GL_STATUS = null;
    } else {
    this.YEAR_GL_STATUS = Text.readString(__dataIn);
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
        this.DAY_DW_ID_LY_CAL = null;
    } else {
    this.DAY_DW_ID_LY_CAL = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DAY_LY_CAL = null;
    } else {
    this.DAY_LY_CAL = new Timestamp(__dataIn.readLong());
    this.DAY_LY_CAL.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DAY_NBR_IN_EPOCH_LY_CAL = null;
    } else {
    this.DAY_NBR_IN_EPOCH_LY_CAL = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_DW_ID_LY_CAL = null;
    } else {
    this.WEEK_DW_ID_LY_CAL = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_START_DATE_LY_CAL = null;
    } else {
    this.WEEK_START_DATE_LY_CAL = new Timestamp(__dataIn.readLong());
    this.WEEK_START_DATE_LY_CAL.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_END_DATE_LY_CAL = null;
    } else {
    this.WEEK_END_DATE_LY_CAL = new Timestamp(__dataIn.readLong());
    this.WEEK_END_DATE_LY_CAL.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_START_DAY_DW_ID_LY_CAL = null;
    } else {
    this.WEEK_START_DAY_DW_ID_LY_CAL = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_END_DAY_DW_ID_LY_CAL = null;
    } else {
    this.WEEK_END_DAY_DW_ID_LY_CAL = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_NBR_IN_EPOCH_LY_CAL = null;
    } else {
    this.WEEK_NBR_IN_EPOCH_LY_CAL = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DAY_DW_ID_2Y_CAL = null;
    } else {
    this.DAY_DW_ID_2Y_CAL = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DAY_2Y_CAL = null;
    } else {
    this.DAY_2Y_CAL = new Timestamp(__dataIn.readLong());
    this.DAY_2Y_CAL.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DAY_NBR_IN_EPOCH_2Y_CAL = null;
    } else {
    this.DAY_NBR_IN_EPOCH_2Y_CAL = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_DW_ID_2Y_CAL = null;
    } else {
    this.WEEK_DW_ID_2Y_CAL = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_START_DATE_2Y_CAL = null;
    } else {
    this.WEEK_START_DATE_2Y_CAL = new Timestamp(__dataIn.readLong());
    this.WEEK_START_DATE_2Y_CAL.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_END_DATE_2Y_CAL = null;
    } else {
    this.WEEK_END_DATE_2Y_CAL = new Timestamp(__dataIn.readLong());
    this.WEEK_END_DATE_2Y_CAL.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_START_DAY_DW_ID_2Y_CAL = null;
    } else {
    this.WEEK_START_DAY_DW_ID_2Y_CAL = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_END_DAY_DW_ID_2Y_CAL = null;
    } else {
    this.WEEK_END_DAY_DW_ID_2Y_CAL = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEK_NBR_IN_EPOCH_2Y_CAL = null;
    } else {
    this.WEEK_NBR_IN_EPOCH_2Y_CAL = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.Z_DAY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Z_DAY_DW_ID, __dataOut);
    }
    if (null == this.DAY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DAY.getTime());
    __dataOut.writeInt(this.DAY.getNanos());
    }
    if (null == this.DAY_NBR_IN_EPOCH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAY_NBR_IN_EPOCH, __dataOut);
    }
    if (null == this.DAY_DW_ID_LY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAY_DW_ID_LY, __dataOut);
    }
    if (null == this.DAY_LY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DAY_LY.getTime());
    __dataOut.writeInt(this.DAY_LY.getNanos());
    }
    if (null == this.DAY_NBR_IN_EPOCH_LY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAY_NBR_IN_EPOCH_LY, __dataOut);
    }
    if (null == this.DAY_IN_WEEK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAY_IN_WEEK, __dataOut);
    }
    if (null == this.DAY_IN_PERIOD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAY_IN_PERIOD, __dataOut);
    }
    if (null == this.DAY_IN_QUARTER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAY_IN_QUARTER, __dataOut);
    }
    if (null == this.DAY_IN_YEAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAY_IN_YEAR, __dataOut);
    }
    if (null == this.WEEK_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_DW_ID, __dataOut);
    }
    if (null == this.WEEK_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WEEK_NAME);
    }
    if (null == this.WEEK_IN_PERIOD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_IN_PERIOD, __dataOut);
    }
    if (null == this.WEEK_IN_QUARTER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_IN_QUARTER, __dataOut);
    }
    if (null == this.WEEK_IN_YEAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_IN_YEAR, __dataOut);
    }
    if (null == this.WEEK_START_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.WEEK_START_DATE.getTime());
    __dataOut.writeInt(this.WEEK_START_DATE.getNanos());
    }
    if (null == this.WEEK_END_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.WEEK_END_DATE.getTime());
    __dataOut.writeInt(this.WEEK_END_DATE.getNanos());
    }
    if (null == this.WEEK_START_DAY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_START_DAY_DW_ID, __dataOut);
    }
    if (null == this.WEEK_END_DAY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_END_DAY_DW_ID, __dataOut);
    }
    if (null == this.WEEK_NBR_IN_EPOCH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_NBR_IN_EPOCH, __dataOut);
    }
    if (null == this.WEEK_GL_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WEEK_GL_NAME);
    }
    if (null == this.WEEK_GL_STATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WEEK_GL_STATUS);
    }
    if (null == this.WEEK_DW_ID_LY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_DW_ID_LY, __dataOut);
    }
    if (null == this.WEEK_START_DATE_LY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.WEEK_START_DATE_LY.getTime());
    __dataOut.writeInt(this.WEEK_START_DATE_LY.getNanos());
    }
    if (null == this.WEEK_END_DATE_LY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.WEEK_END_DATE_LY.getTime());
    __dataOut.writeInt(this.WEEK_END_DATE_LY.getNanos());
    }
    if (null == this.WEEK_START_DAY_DW_ID_LY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_START_DAY_DW_ID_LY, __dataOut);
    }
    if (null == this.WEEK_END_DAY_DW_ID_LY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_END_DAY_DW_ID_LY, __dataOut);
    }
    if (null == this.WEEK_NBR_IN_EPOCH_LY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_NBR_IN_EPOCH_LY, __dataOut);
    }
    if (null == this.PERIOD_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PERIOD_DW_ID, __dataOut);
    }
    if (null == this.PERIOD_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PERIOD_NAME);
    }
    if (null == this.PERIOD_IN_QUARTER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PERIOD_IN_QUARTER, __dataOut);
    }
    if (null == this.PERIOD_IN_YEAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PERIOD_IN_YEAR, __dataOut);
    }
    if (null == this.PERIOD_START_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.PERIOD_START_DATE.getTime());
    __dataOut.writeInt(this.PERIOD_START_DATE.getNanos());
    }
    if (null == this.PERIOD_END_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.PERIOD_END_DATE.getTime());
    __dataOut.writeInt(this.PERIOD_END_DATE.getNanos());
    }
    if (null == this.PERIOD_START_DAY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PERIOD_START_DAY_DW_ID, __dataOut);
    }
    if (null == this.PERIOD_END_DAY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PERIOD_END_DAY_DW_ID, __dataOut);
    }
    if (null == this.PERIOD_NBR_IN_EPOCH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PERIOD_NBR_IN_EPOCH, __dataOut);
    }
    if (null == this.PERIOD_GL_STATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PERIOD_GL_STATUS);
    }
    if (null == this.QUARTER_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.QUARTER_DW_ID, __dataOut);
    }
    if (null == this.QUARTER_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, QUARTER_NAME);
    }
    if (null == this.QUARTER_IN_YEAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.QUARTER_IN_YEAR, __dataOut);
    }
    if (null == this.QUARTER_START_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.QUARTER_START_DATE.getTime());
    __dataOut.writeInt(this.QUARTER_START_DATE.getNanos());
    }
    if (null == this.QUARTER_END_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.QUARTER_END_DATE.getTime());
    __dataOut.writeInt(this.QUARTER_END_DATE.getNanos());
    }
    if (null == this.QUARTER_START_DAY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.QUARTER_START_DAY_DW_ID, __dataOut);
    }
    if (null == this.QUARTER_END_DAY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.QUARTER_END_DAY_DW_ID, __dataOut);
    }
    if (null == this.QUARTER_NBR_IN_EPOCH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.QUARTER_NBR_IN_EPOCH, __dataOut);
    }
    if (null == this.QUARTER_GL_STATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, QUARTER_GL_STATUS);
    }
    if (null == this.YEAR_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.YEAR_DW_ID, __dataOut);
    }
    if (null == this.YEAR_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.YEAR_NBR, __dataOut);
    }
    if (null == this.YEAR_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, YEAR_CODE);
    }
    if (null == this.YEAR_START_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.YEAR_START_DATE.getTime());
    __dataOut.writeInt(this.YEAR_START_DATE.getNanos());
    }
    if (null == this.YEAR_END_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.YEAR_END_DATE.getTime());
    __dataOut.writeInt(this.YEAR_END_DATE.getNanos());
    }
    if (null == this.YEAR_START_DAY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.YEAR_START_DAY_DW_ID, __dataOut);
    }
    if (null == this.YEAR_END_DAY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.YEAR_END_DAY_DW_ID, __dataOut);
    }
    if (null == this.YEAR_NBR_IN_EPOCH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.YEAR_NBR_IN_EPOCH, __dataOut);
    }
    if (null == this.YEAR_GL_STATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, YEAR_GL_STATUS);
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
    if (null == this.DAY_DW_ID_LY_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAY_DW_ID_LY_CAL, __dataOut);
    }
    if (null == this.DAY_LY_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DAY_LY_CAL.getTime());
    __dataOut.writeInt(this.DAY_LY_CAL.getNanos());
    }
    if (null == this.DAY_NBR_IN_EPOCH_LY_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAY_NBR_IN_EPOCH_LY_CAL, __dataOut);
    }
    if (null == this.WEEK_DW_ID_LY_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_DW_ID_LY_CAL, __dataOut);
    }
    if (null == this.WEEK_START_DATE_LY_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.WEEK_START_DATE_LY_CAL.getTime());
    __dataOut.writeInt(this.WEEK_START_DATE_LY_CAL.getNanos());
    }
    if (null == this.WEEK_END_DATE_LY_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.WEEK_END_DATE_LY_CAL.getTime());
    __dataOut.writeInt(this.WEEK_END_DATE_LY_CAL.getNanos());
    }
    if (null == this.WEEK_START_DAY_DW_ID_LY_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_START_DAY_DW_ID_LY_CAL, __dataOut);
    }
    if (null == this.WEEK_END_DAY_DW_ID_LY_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_END_DAY_DW_ID_LY_CAL, __dataOut);
    }
    if (null == this.WEEK_NBR_IN_EPOCH_LY_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_NBR_IN_EPOCH_LY_CAL, __dataOut);
    }
    if (null == this.DAY_DW_ID_2Y_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAY_DW_ID_2Y_CAL, __dataOut);
    }
    if (null == this.DAY_2Y_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DAY_2Y_CAL.getTime());
    __dataOut.writeInt(this.DAY_2Y_CAL.getNanos());
    }
    if (null == this.DAY_NBR_IN_EPOCH_2Y_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAY_NBR_IN_EPOCH_2Y_CAL, __dataOut);
    }
    if (null == this.WEEK_DW_ID_2Y_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_DW_ID_2Y_CAL, __dataOut);
    }
    if (null == this.WEEK_START_DATE_2Y_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.WEEK_START_DATE_2Y_CAL.getTime());
    __dataOut.writeInt(this.WEEK_START_DATE_2Y_CAL.getNanos());
    }
    if (null == this.WEEK_END_DATE_2Y_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.WEEK_END_DATE_2Y_CAL.getTime());
    __dataOut.writeInt(this.WEEK_END_DATE_2Y_CAL.getNanos());
    }
    if (null == this.WEEK_START_DAY_DW_ID_2Y_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_START_DAY_DW_ID_2Y_CAL, __dataOut);
    }
    if (null == this.WEEK_END_DAY_DW_ID_2Y_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_END_DAY_DW_ID_2Y_CAL, __dataOut);
    }
    if (null == this.WEEK_NBR_IN_EPOCH_2Y_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_NBR_IN_EPOCH_2Y_CAL, __dataOut);
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
    if (null == this.Z_DAY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Z_DAY_DW_ID, __dataOut);
    }
    if (null == this.DAY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DAY.getTime());
    __dataOut.writeInt(this.DAY.getNanos());
    }
    if (null == this.DAY_NBR_IN_EPOCH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAY_NBR_IN_EPOCH, __dataOut);
    }
    if (null == this.DAY_DW_ID_LY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAY_DW_ID_LY, __dataOut);
    }
    if (null == this.DAY_LY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DAY_LY.getTime());
    __dataOut.writeInt(this.DAY_LY.getNanos());
    }
    if (null == this.DAY_NBR_IN_EPOCH_LY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAY_NBR_IN_EPOCH_LY, __dataOut);
    }
    if (null == this.DAY_IN_WEEK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAY_IN_WEEK, __dataOut);
    }
    if (null == this.DAY_IN_PERIOD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAY_IN_PERIOD, __dataOut);
    }
    if (null == this.DAY_IN_QUARTER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAY_IN_QUARTER, __dataOut);
    }
    if (null == this.DAY_IN_YEAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAY_IN_YEAR, __dataOut);
    }
    if (null == this.WEEK_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_DW_ID, __dataOut);
    }
    if (null == this.WEEK_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WEEK_NAME);
    }
    if (null == this.WEEK_IN_PERIOD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_IN_PERIOD, __dataOut);
    }
    if (null == this.WEEK_IN_QUARTER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_IN_QUARTER, __dataOut);
    }
    if (null == this.WEEK_IN_YEAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_IN_YEAR, __dataOut);
    }
    if (null == this.WEEK_START_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.WEEK_START_DATE.getTime());
    __dataOut.writeInt(this.WEEK_START_DATE.getNanos());
    }
    if (null == this.WEEK_END_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.WEEK_END_DATE.getTime());
    __dataOut.writeInt(this.WEEK_END_DATE.getNanos());
    }
    if (null == this.WEEK_START_DAY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_START_DAY_DW_ID, __dataOut);
    }
    if (null == this.WEEK_END_DAY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_END_DAY_DW_ID, __dataOut);
    }
    if (null == this.WEEK_NBR_IN_EPOCH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_NBR_IN_EPOCH, __dataOut);
    }
    if (null == this.WEEK_GL_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WEEK_GL_NAME);
    }
    if (null == this.WEEK_GL_STATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WEEK_GL_STATUS);
    }
    if (null == this.WEEK_DW_ID_LY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_DW_ID_LY, __dataOut);
    }
    if (null == this.WEEK_START_DATE_LY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.WEEK_START_DATE_LY.getTime());
    __dataOut.writeInt(this.WEEK_START_DATE_LY.getNanos());
    }
    if (null == this.WEEK_END_DATE_LY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.WEEK_END_DATE_LY.getTime());
    __dataOut.writeInt(this.WEEK_END_DATE_LY.getNanos());
    }
    if (null == this.WEEK_START_DAY_DW_ID_LY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_START_DAY_DW_ID_LY, __dataOut);
    }
    if (null == this.WEEK_END_DAY_DW_ID_LY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_END_DAY_DW_ID_LY, __dataOut);
    }
    if (null == this.WEEK_NBR_IN_EPOCH_LY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_NBR_IN_EPOCH_LY, __dataOut);
    }
    if (null == this.PERIOD_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PERIOD_DW_ID, __dataOut);
    }
    if (null == this.PERIOD_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PERIOD_NAME);
    }
    if (null == this.PERIOD_IN_QUARTER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PERIOD_IN_QUARTER, __dataOut);
    }
    if (null == this.PERIOD_IN_YEAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PERIOD_IN_YEAR, __dataOut);
    }
    if (null == this.PERIOD_START_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.PERIOD_START_DATE.getTime());
    __dataOut.writeInt(this.PERIOD_START_DATE.getNanos());
    }
    if (null == this.PERIOD_END_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.PERIOD_END_DATE.getTime());
    __dataOut.writeInt(this.PERIOD_END_DATE.getNanos());
    }
    if (null == this.PERIOD_START_DAY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PERIOD_START_DAY_DW_ID, __dataOut);
    }
    if (null == this.PERIOD_END_DAY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PERIOD_END_DAY_DW_ID, __dataOut);
    }
    if (null == this.PERIOD_NBR_IN_EPOCH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PERIOD_NBR_IN_EPOCH, __dataOut);
    }
    if (null == this.PERIOD_GL_STATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PERIOD_GL_STATUS);
    }
    if (null == this.QUARTER_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.QUARTER_DW_ID, __dataOut);
    }
    if (null == this.QUARTER_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, QUARTER_NAME);
    }
    if (null == this.QUARTER_IN_YEAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.QUARTER_IN_YEAR, __dataOut);
    }
    if (null == this.QUARTER_START_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.QUARTER_START_DATE.getTime());
    __dataOut.writeInt(this.QUARTER_START_DATE.getNanos());
    }
    if (null == this.QUARTER_END_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.QUARTER_END_DATE.getTime());
    __dataOut.writeInt(this.QUARTER_END_DATE.getNanos());
    }
    if (null == this.QUARTER_START_DAY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.QUARTER_START_DAY_DW_ID, __dataOut);
    }
    if (null == this.QUARTER_END_DAY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.QUARTER_END_DAY_DW_ID, __dataOut);
    }
    if (null == this.QUARTER_NBR_IN_EPOCH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.QUARTER_NBR_IN_EPOCH, __dataOut);
    }
    if (null == this.QUARTER_GL_STATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, QUARTER_GL_STATUS);
    }
    if (null == this.YEAR_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.YEAR_DW_ID, __dataOut);
    }
    if (null == this.YEAR_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.YEAR_NBR, __dataOut);
    }
    if (null == this.YEAR_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, YEAR_CODE);
    }
    if (null == this.YEAR_START_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.YEAR_START_DATE.getTime());
    __dataOut.writeInt(this.YEAR_START_DATE.getNanos());
    }
    if (null == this.YEAR_END_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.YEAR_END_DATE.getTime());
    __dataOut.writeInt(this.YEAR_END_DATE.getNanos());
    }
    if (null == this.YEAR_START_DAY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.YEAR_START_DAY_DW_ID, __dataOut);
    }
    if (null == this.YEAR_END_DAY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.YEAR_END_DAY_DW_ID, __dataOut);
    }
    if (null == this.YEAR_NBR_IN_EPOCH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.YEAR_NBR_IN_EPOCH, __dataOut);
    }
    if (null == this.YEAR_GL_STATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, YEAR_GL_STATUS);
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
    if (null == this.DAY_DW_ID_LY_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAY_DW_ID_LY_CAL, __dataOut);
    }
    if (null == this.DAY_LY_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DAY_LY_CAL.getTime());
    __dataOut.writeInt(this.DAY_LY_CAL.getNanos());
    }
    if (null == this.DAY_NBR_IN_EPOCH_LY_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAY_NBR_IN_EPOCH_LY_CAL, __dataOut);
    }
    if (null == this.WEEK_DW_ID_LY_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_DW_ID_LY_CAL, __dataOut);
    }
    if (null == this.WEEK_START_DATE_LY_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.WEEK_START_DATE_LY_CAL.getTime());
    __dataOut.writeInt(this.WEEK_START_DATE_LY_CAL.getNanos());
    }
    if (null == this.WEEK_END_DATE_LY_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.WEEK_END_DATE_LY_CAL.getTime());
    __dataOut.writeInt(this.WEEK_END_DATE_LY_CAL.getNanos());
    }
    if (null == this.WEEK_START_DAY_DW_ID_LY_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_START_DAY_DW_ID_LY_CAL, __dataOut);
    }
    if (null == this.WEEK_END_DAY_DW_ID_LY_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_END_DAY_DW_ID_LY_CAL, __dataOut);
    }
    if (null == this.WEEK_NBR_IN_EPOCH_LY_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_NBR_IN_EPOCH_LY_CAL, __dataOut);
    }
    if (null == this.DAY_DW_ID_2Y_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAY_DW_ID_2Y_CAL, __dataOut);
    }
    if (null == this.DAY_2Y_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DAY_2Y_CAL.getTime());
    __dataOut.writeInt(this.DAY_2Y_CAL.getNanos());
    }
    if (null == this.DAY_NBR_IN_EPOCH_2Y_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAY_NBR_IN_EPOCH_2Y_CAL, __dataOut);
    }
    if (null == this.WEEK_DW_ID_2Y_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_DW_ID_2Y_CAL, __dataOut);
    }
    if (null == this.WEEK_START_DATE_2Y_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.WEEK_START_DATE_2Y_CAL.getTime());
    __dataOut.writeInt(this.WEEK_START_DATE_2Y_CAL.getNanos());
    }
    if (null == this.WEEK_END_DATE_2Y_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.WEEK_END_DATE_2Y_CAL.getTime());
    __dataOut.writeInt(this.WEEK_END_DATE_2Y_CAL.getNanos());
    }
    if (null == this.WEEK_START_DAY_DW_ID_2Y_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_START_DAY_DW_ID_2Y_CAL, __dataOut);
    }
    if (null == this.WEEK_END_DAY_DW_ID_2Y_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_END_DAY_DW_ID_2Y_CAL, __dataOut);
    }
    if (null == this.WEEK_NBR_IN_EPOCH_2Y_CAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEK_NBR_IN_EPOCH_2Y_CAL, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(Z_DAY_DW_ID==null?"\\N":Z_DAY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY==null?"\\N":"" + DAY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_NBR_IN_EPOCH==null?"\\N":DAY_NBR_IN_EPOCH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_DW_ID_LY==null?"\\N":DAY_DW_ID_LY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_LY==null?"\\N":"" + DAY_LY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_NBR_IN_EPOCH_LY==null?"\\N":DAY_NBR_IN_EPOCH_LY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_IN_WEEK==null?"\\N":DAY_IN_WEEK.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_IN_PERIOD==null?"\\N":DAY_IN_PERIOD.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_IN_QUARTER==null?"\\N":DAY_IN_QUARTER.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_IN_YEAR==null?"\\N":DAY_IN_YEAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_DW_ID==null?"\\N":WEEK_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_NAME==null?"\\N":WEEK_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_IN_PERIOD==null?"\\N":WEEK_IN_PERIOD.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_IN_QUARTER==null?"\\N":WEEK_IN_QUARTER.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_IN_YEAR==null?"\\N":WEEK_IN_YEAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_START_DATE==null?"\\N":"" + WEEK_START_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_END_DATE==null?"\\N":"" + WEEK_END_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_START_DAY_DW_ID==null?"\\N":WEEK_START_DAY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_END_DAY_DW_ID==null?"\\N":WEEK_END_DAY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_NBR_IN_EPOCH==null?"\\N":WEEK_NBR_IN_EPOCH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_GL_NAME==null?"\\N":WEEK_GL_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_GL_STATUS==null?"\\N":WEEK_GL_STATUS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_DW_ID_LY==null?"\\N":WEEK_DW_ID_LY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_START_DATE_LY==null?"\\N":"" + WEEK_START_DATE_LY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_END_DATE_LY==null?"\\N":"" + WEEK_END_DATE_LY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_START_DAY_DW_ID_LY==null?"\\N":WEEK_START_DAY_DW_ID_LY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_END_DAY_DW_ID_LY==null?"\\N":WEEK_END_DAY_DW_ID_LY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_NBR_IN_EPOCH_LY==null?"\\N":WEEK_NBR_IN_EPOCH_LY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PERIOD_DW_ID==null?"\\N":PERIOD_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PERIOD_NAME==null?"\\N":PERIOD_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PERIOD_IN_QUARTER==null?"\\N":PERIOD_IN_QUARTER.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PERIOD_IN_YEAR==null?"\\N":PERIOD_IN_YEAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PERIOD_START_DATE==null?"\\N":"" + PERIOD_START_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PERIOD_END_DATE==null?"\\N":"" + PERIOD_END_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PERIOD_START_DAY_DW_ID==null?"\\N":PERIOD_START_DAY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PERIOD_END_DAY_DW_ID==null?"\\N":PERIOD_END_DAY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PERIOD_NBR_IN_EPOCH==null?"\\N":PERIOD_NBR_IN_EPOCH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PERIOD_GL_STATUS==null?"\\N":PERIOD_GL_STATUS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(QUARTER_DW_ID==null?"\\N":QUARTER_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(QUARTER_NAME==null?"\\N":QUARTER_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(QUARTER_IN_YEAR==null?"\\N":QUARTER_IN_YEAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(QUARTER_START_DATE==null?"\\N":"" + QUARTER_START_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(QUARTER_END_DATE==null?"\\N":"" + QUARTER_END_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(QUARTER_START_DAY_DW_ID==null?"\\N":QUARTER_START_DAY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(QUARTER_END_DAY_DW_ID==null?"\\N":QUARTER_END_DAY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(QUARTER_NBR_IN_EPOCH==null?"\\N":QUARTER_NBR_IN_EPOCH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(QUARTER_GL_STATUS==null?"\\N":QUARTER_GL_STATUS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YEAR_DW_ID==null?"\\N":YEAR_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YEAR_NBR==null?"\\N":YEAR_NBR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YEAR_CODE==null?"\\N":YEAR_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YEAR_START_DATE==null?"\\N":"" + YEAR_START_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YEAR_END_DATE==null?"\\N":"" + YEAR_END_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YEAR_START_DAY_DW_ID==null?"\\N":YEAR_START_DAY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YEAR_END_DAY_DW_ID==null?"\\N":YEAR_END_DAY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YEAR_NBR_IN_EPOCH==null?"\\N":YEAR_NBR_IN_EPOCH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YEAR_GL_STATUS==null?"\\N":YEAR_GL_STATUS, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_DW_ID_LY_CAL==null?"\\N":DAY_DW_ID_LY_CAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_LY_CAL==null?"\\N":"" + DAY_LY_CAL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_NBR_IN_EPOCH_LY_CAL==null?"\\N":DAY_NBR_IN_EPOCH_LY_CAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_DW_ID_LY_CAL==null?"\\N":WEEK_DW_ID_LY_CAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_START_DATE_LY_CAL==null?"\\N":"" + WEEK_START_DATE_LY_CAL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_END_DATE_LY_CAL==null?"\\N":"" + WEEK_END_DATE_LY_CAL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_START_DAY_DW_ID_LY_CAL==null?"\\N":WEEK_START_DAY_DW_ID_LY_CAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_END_DAY_DW_ID_LY_CAL==null?"\\N":WEEK_END_DAY_DW_ID_LY_CAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_NBR_IN_EPOCH_LY_CAL==null?"\\N":WEEK_NBR_IN_EPOCH_LY_CAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_DW_ID_2Y_CAL==null?"\\N":DAY_DW_ID_2Y_CAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_2Y_CAL==null?"\\N":"" + DAY_2Y_CAL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_NBR_IN_EPOCH_2Y_CAL==null?"\\N":DAY_NBR_IN_EPOCH_2Y_CAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_DW_ID_2Y_CAL==null?"\\N":WEEK_DW_ID_2Y_CAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_START_DATE_2Y_CAL==null?"\\N":"" + WEEK_START_DATE_2Y_CAL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_END_DATE_2Y_CAL==null?"\\N":"" + WEEK_END_DATE_2Y_CAL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_START_DAY_DW_ID_2Y_CAL==null?"\\N":WEEK_START_DAY_DW_ID_2Y_CAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_END_DAY_DW_ID_2Y_CAL==null?"\\N":WEEK_END_DAY_DW_ID_2Y_CAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_NBR_IN_EPOCH_2Y_CAL==null?"\\N":WEEK_NBR_IN_EPOCH_2Y_CAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOAD_DTTM==null?"\\N":"" + LOAD_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOAD_BY==null?"\\N":LOAD_BY, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(Z_DAY_DW_ID==null?"\\N":Z_DAY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY==null?"\\N":"" + DAY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_NBR_IN_EPOCH==null?"\\N":DAY_NBR_IN_EPOCH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_DW_ID_LY==null?"\\N":DAY_DW_ID_LY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_LY==null?"\\N":"" + DAY_LY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_NBR_IN_EPOCH_LY==null?"\\N":DAY_NBR_IN_EPOCH_LY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_IN_WEEK==null?"\\N":DAY_IN_WEEK.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_IN_PERIOD==null?"\\N":DAY_IN_PERIOD.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_IN_QUARTER==null?"\\N":DAY_IN_QUARTER.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_IN_YEAR==null?"\\N":DAY_IN_YEAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_DW_ID==null?"\\N":WEEK_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_NAME==null?"\\N":WEEK_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_IN_PERIOD==null?"\\N":WEEK_IN_PERIOD.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_IN_QUARTER==null?"\\N":WEEK_IN_QUARTER.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_IN_YEAR==null?"\\N":WEEK_IN_YEAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_START_DATE==null?"\\N":"" + WEEK_START_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_END_DATE==null?"\\N":"" + WEEK_END_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_START_DAY_DW_ID==null?"\\N":WEEK_START_DAY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_END_DAY_DW_ID==null?"\\N":WEEK_END_DAY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_NBR_IN_EPOCH==null?"\\N":WEEK_NBR_IN_EPOCH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_GL_NAME==null?"\\N":WEEK_GL_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_GL_STATUS==null?"\\N":WEEK_GL_STATUS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_DW_ID_LY==null?"\\N":WEEK_DW_ID_LY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_START_DATE_LY==null?"\\N":"" + WEEK_START_DATE_LY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_END_DATE_LY==null?"\\N":"" + WEEK_END_DATE_LY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_START_DAY_DW_ID_LY==null?"\\N":WEEK_START_DAY_DW_ID_LY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_END_DAY_DW_ID_LY==null?"\\N":WEEK_END_DAY_DW_ID_LY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_NBR_IN_EPOCH_LY==null?"\\N":WEEK_NBR_IN_EPOCH_LY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PERIOD_DW_ID==null?"\\N":PERIOD_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PERIOD_NAME==null?"\\N":PERIOD_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PERIOD_IN_QUARTER==null?"\\N":PERIOD_IN_QUARTER.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PERIOD_IN_YEAR==null?"\\N":PERIOD_IN_YEAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PERIOD_START_DATE==null?"\\N":"" + PERIOD_START_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PERIOD_END_DATE==null?"\\N":"" + PERIOD_END_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PERIOD_START_DAY_DW_ID==null?"\\N":PERIOD_START_DAY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PERIOD_END_DAY_DW_ID==null?"\\N":PERIOD_END_DAY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PERIOD_NBR_IN_EPOCH==null?"\\N":PERIOD_NBR_IN_EPOCH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PERIOD_GL_STATUS==null?"\\N":PERIOD_GL_STATUS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(QUARTER_DW_ID==null?"\\N":QUARTER_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(QUARTER_NAME==null?"\\N":QUARTER_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(QUARTER_IN_YEAR==null?"\\N":QUARTER_IN_YEAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(QUARTER_START_DATE==null?"\\N":"" + QUARTER_START_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(QUARTER_END_DATE==null?"\\N":"" + QUARTER_END_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(QUARTER_START_DAY_DW_ID==null?"\\N":QUARTER_START_DAY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(QUARTER_END_DAY_DW_ID==null?"\\N":QUARTER_END_DAY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(QUARTER_NBR_IN_EPOCH==null?"\\N":QUARTER_NBR_IN_EPOCH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(QUARTER_GL_STATUS==null?"\\N":QUARTER_GL_STATUS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YEAR_DW_ID==null?"\\N":YEAR_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YEAR_NBR==null?"\\N":YEAR_NBR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YEAR_CODE==null?"\\N":YEAR_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YEAR_START_DATE==null?"\\N":"" + YEAR_START_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YEAR_END_DATE==null?"\\N":"" + YEAR_END_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YEAR_START_DAY_DW_ID==null?"\\N":YEAR_START_DAY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YEAR_END_DAY_DW_ID==null?"\\N":YEAR_END_DAY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YEAR_NBR_IN_EPOCH==null?"\\N":YEAR_NBR_IN_EPOCH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YEAR_GL_STATUS==null?"\\N":YEAR_GL_STATUS, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_DW_ID_LY_CAL==null?"\\N":DAY_DW_ID_LY_CAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_LY_CAL==null?"\\N":"" + DAY_LY_CAL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_NBR_IN_EPOCH_LY_CAL==null?"\\N":DAY_NBR_IN_EPOCH_LY_CAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_DW_ID_LY_CAL==null?"\\N":WEEK_DW_ID_LY_CAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_START_DATE_LY_CAL==null?"\\N":"" + WEEK_START_DATE_LY_CAL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_END_DATE_LY_CAL==null?"\\N":"" + WEEK_END_DATE_LY_CAL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_START_DAY_DW_ID_LY_CAL==null?"\\N":WEEK_START_DAY_DW_ID_LY_CAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_END_DAY_DW_ID_LY_CAL==null?"\\N":WEEK_END_DAY_DW_ID_LY_CAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_NBR_IN_EPOCH_LY_CAL==null?"\\N":WEEK_NBR_IN_EPOCH_LY_CAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_DW_ID_2Y_CAL==null?"\\N":DAY_DW_ID_2Y_CAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_2Y_CAL==null?"\\N":"" + DAY_2Y_CAL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAY_NBR_IN_EPOCH_2Y_CAL==null?"\\N":DAY_NBR_IN_EPOCH_2Y_CAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_DW_ID_2Y_CAL==null?"\\N":WEEK_DW_ID_2Y_CAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_START_DATE_2Y_CAL==null?"\\N":"" + WEEK_START_DATE_2Y_CAL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_END_DATE_2Y_CAL==null?"\\N":"" + WEEK_END_DATE_2Y_CAL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_START_DAY_DW_ID_2Y_CAL==null?"\\N":WEEK_START_DAY_DW_ID_2Y_CAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_END_DAY_DW_ID_2Y_CAL==null?"\\N":WEEK_END_DAY_DW_ID_2Y_CAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEK_NBR_IN_EPOCH_2Y_CAL==null?"\\N":WEEK_NBR_IN_EPOCH_2Y_CAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOAD_DTTM==null?"\\N":"" + LOAD_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOAD_BY==null?"\\N":LOAD_BY, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Z_DAY_DW_ID = null; } else {
      this.Z_DAY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY = null; } else {
      this.DAY = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_NBR_IN_EPOCH = null; } else {
      this.DAY_NBR_IN_EPOCH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_DW_ID_LY = null; } else {
      this.DAY_DW_ID_LY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_LY = null; } else {
      this.DAY_LY = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_NBR_IN_EPOCH_LY = null; } else {
      this.DAY_NBR_IN_EPOCH_LY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_IN_WEEK = null; } else {
      this.DAY_IN_WEEK = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_IN_PERIOD = null; } else {
      this.DAY_IN_PERIOD = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_IN_QUARTER = null; } else {
      this.DAY_IN_QUARTER = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_IN_YEAR = null; } else {
      this.DAY_IN_YEAR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_DW_ID = null; } else {
      this.WEEK_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WEEK_NAME = null; } else {
      this.WEEK_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_IN_PERIOD = null; } else {
      this.WEEK_IN_PERIOD = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_IN_QUARTER = null; } else {
      this.WEEK_IN_QUARTER = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_IN_YEAR = null; } else {
      this.WEEK_IN_YEAR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_START_DATE = null; } else {
      this.WEEK_START_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_END_DATE = null; } else {
      this.WEEK_END_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_START_DAY_DW_ID = null; } else {
      this.WEEK_START_DAY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_END_DAY_DW_ID = null; } else {
      this.WEEK_END_DAY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_NBR_IN_EPOCH = null; } else {
      this.WEEK_NBR_IN_EPOCH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WEEK_GL_NAME = null; } else {
      this.WEEK_GL_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WEEK_GL_STATUS = null; } else {
      this.WEEK_GL_STATUS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_DW_ID_LY = null; } else {
      this.WEEK_DW_ID_LY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_START_DATE_LY = null; } else {
      this.WEEK_START_DATE_LY = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_END_DATE_LY = null; } else {
      this.WEEK_END_DATE_LY = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_START_DAY_DW_ID_LY = null; } else {
      this.WEEK_START_DAY_DW_ID_LY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_END_DAY_DW_ID_LY = null; } else {
      this.WEEK_END_DAY_DW_ID_LY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_NBR_IN_EPOCH_LY = null; } else {
      this.WEEK_NBR_IN_EPOCH_LY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PERIOD_DW_ID = null; } else {
      this.PERIOD_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PERIOD_NAME = null; } else {
      this.PERIOD_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PERIOD_IN_QUARTER = null; } else {
      this.PERIOD_IN_QUARTER = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PERIOD_IN_YEAR = null; } else {
      this.PERIOD_IN_YEAR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PERIOD_START_DATE = null; } else {
      this.PERIOD_START_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PERIOD_END_DATE = null; } else {
      this.PERIOD_END_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PERIOD_START_DAY_DW_ID = null; } else {
      this.PERIOD_START_DAY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PERIOD_END_DAY_DW_ID = null; } else {
      this.PERIOD_END_DAY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PERIOD_NBR_IN_EPOCH = null; } else {
      this.PERIOD_NBR_IN_EPOCH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PERIOD_GL_STATUS = null; } else {
      this.PERIOD_GL_STATUS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.QUARTER_DW_ID = null; } else {
      this.QUARTER_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.QUARTER_NAME = null; } else {
      this.QUARTER_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.QUARTER_IN_YEAR = null; } else {
      this.QUARTER_IN_YEAR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.QUARTER_START_DATE = null; } else {
      this.QUARTER_START_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.QUARTER_END_DATE = null; } else {
      this.QUARTER_END_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.QUARTER_START_DAY_DW_ID = null; } else {
      this.QUARTER_START_DAY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.QUARTER_END_DAY_DW_ID = null; } else {
      this.QUARTER_END_DAY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.QUARTER_NBR_IN_EPOCH = null; } else {
      this.QUARTER_NBR_IN_EPOCH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.QUARTER_GL_STATUS = null; } else {
      this.QUARTER_GL_STATUS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.YEAR_DW_ID = null; } else {
      this.YEAR_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.YEAR_NBR = null; } else {
      this.YEAR_NBR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.YEAR_CODE = null; } else {
      this.YEAR_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.YEAR_START_DATE = null; } else {
      this.YEAR_START_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.YEAR_END_DATE = null; } else {
      this.YEAR_END_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.YEAR_START_DAY_DW_ID = null; } else {
      this.YEAR_START_DAY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.YEAR_END_DAY_DW_ID = null; } else {
      this.YEAR_END_DAY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.YEAR_NBR_IN_EPOCH = null; } else {
      this.YEAR_NBR_IN_EPOCH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.YEAR_GL_STATUS = null; } else {
      this.YEAR_GL_STATUS = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_DW_ID_LY_CAL = null; } else {
      this.DAY_DW_ID_LY_CAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_LY_CAL = null; } else {
      this.DAY_LY_CAL = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_NBR_IN_EPOCH_LY_CAL = null; } else {
      this.DAY_NBR_IN_EPOCH_LY_CAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_DW_ID_LY_CAL = null; } else {
      this.WEEK_DW_ID_LY_CAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_START_DATE_LY_CAL = null; } else {
      this.WEEK_START_DATE_LY_CAL = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_END_DATE_LY_CAL = null; } else {
      this.WEEK_END_DATE_LY_CAL = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_START_DAY_DW_ID_LY_CAL = null; } else {
      this.WEEK_START_DAY_DW_ID_LY_CAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_END_DAY_DW_ID_LY_CAL = null; } else {
      this.WEEK_END_DAY_DW_ID_LY_CAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_NBR_IN_EPOCH_LY_CAL = null; } else {
      this.WEEK_NBR_IN_EPOCH_LY_CAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_DW_ID_2Y_CAL = null; } else {
      this.DAY_DW_ID_2Y_CAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_2Y_CAL = null; } else {
      this.DAY_2Y_CAL = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_NBR_IN_EPOCH_2Y_CAL = null; } else {
      this.DAY_NBR_IN_EPOCH_2Y_CAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_DW_ID_2Y_CAL = null; } else {
      this.WEEK_DW_ID_2Y_CAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_START_DATE_2Y_CAL = null; } else {
      this.WEEK_START_DATE_2Y_CAL = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_END_DATE_2Y_CAL = null; } else {
      this.WEEK_END_DATE_2Y_CAL = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_START_DAY_DW_ID_2Y_CAL = null; } else {
      this.WEEK_START_DAY_DW_ID_2Y_CAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_END_DAY_DW_ID_2Y_CAL = null; } else {
      this.WEEK_END_DAY_DW_ID_2Y_CAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_NBR_IN_EPOCH_2Y_CAL = null; } else {
      this.WEEK_NBR_IN_EPOCH_2Y_CAL = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Z_DAY_DW_ID = null; } else {
      this.Z_DAY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY = null; } else {
      this.DAY = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_NBR_IN_EPOCH = null; } else {
      this.DAY_NBR_IN_EPOCH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_DW_ID_LY = null; } else {
      this.DAY_DW_ID_LY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_LY = null; } else {
      this.DAY_LY = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_NBR_IN_EPOCH_LY = null; } else {
      this.DAY_NBR_IN_EPOCH_LY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_IN_WEEK = null; } else {
      this.DAY_IN_WEEK = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_IN_PERIOD = null; } else {
      this.DAY_IN_PERIOD = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_IN_QUARTER = null; } else {
      this.DAY_IN_QUARTER = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_IN_YEAR = null; } else {
      this.DAY_IN_YEAR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_DW_ID = null; } else {
      this.WEEK_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WEEK_NAME = null; } else {
      this.WEEK_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_IN_PERIOD = null; } else {
      this.WEEK_IN_PERIOD = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_IN_QUARTER = null; } else {
      this.WEEK_IN_QUARTER = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_IN_YEAR = null; } else {
      this.WEEK_IN_YEAR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_START_DATE = null; } else {
      this.WEEK_START_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_END_DATE = null; } else {
      this.WEEK_END_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_START_DAY_DW_ID = null; } else {
      this.WEEK_START_DAY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_END_DAY_DW_ID = null; } else {
      this.WEEK_END_DAY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_NBR_IN_EPOCH = null; } else {
      this.WEEK_NBR_IN_EPOCH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WEEK_GL_NAME = null; } else {
      this.WEEK_GL_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WEEK_GL_STATUS = null; } else {
      this.WEEK_GL_STATUS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_DW_ID_LY = null; } else {
      this.WEEK_DW_ID_LY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_START_DATE_LY = null; } else {
      this.WEEK_START_DATE_LY = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_END_DATE_LY = null; } else {
      this.WEEK_END_DATE_LY = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_START_DAY_DW_ID_LY = null; } else {
      this.WEEK_START_DAY_DW_ID_LY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_END_DAY_DW_ID_LY = null; } else {
      this.WEEK_END_DAY_DW_ID_LY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_NBR_IN_EPOCH_LY = null; } else {
      this.WEEK_NBR_IN_EPOCH_LY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PERIOD_DW_ID = null; } else {
      this.PERIOD_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PERIOD_NAME = null; } else {
      this.PERIOD_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PERIOD_IN_QUARTER = null; } else {
      this.PERIOD_IN_QUARTER = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PERIOD_IN_YEAR = null; } else {
      this.PERIOD_IN_YEAR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PERIOD_START_DATE = null; } else {
      this.PERIOD_START_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PERIOD_END_DATE = null; } else {
      this.PERIOD_END_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PERIOD_START_DAY_DW_ID = null; } else {
      this.PERIOD_START_DAY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PERIOD_END_DAY_DW_ID = null; } else {
      this.PERIOD_END_DAY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PERIOD_NBR_IN_EPOCH = null; } else {
      this.PERIOD_NBR_IN_EPOCH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PERIOD_GL_STATUS = null; } else {
      this.PERIOD_GL_STATUS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.QUARTER_DW_ID = null; } else {
      this.QUARTER_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.QUARTER_NAME = null; } else {
      this.QUARTER_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.QUARTER_IN_YEAR = null; } else {
      this.QUARTER_IN_YEAR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.QUARTER_START_DATE = null; } else {
      this.QUARTER_START_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.QUARTER_END_DATE = null; } else {
      this.QUARTER_END_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.QUARTER_START_DAY_DW_ID = null; } else {
      this.QUARTER_START_DAY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.QUARTER_END_DAY_DW_ID = null; } else {
      this.QUARTER_END_DAY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.QUARTER_NBR_IN_EPOCH = null; } else {
      this.QUARTER_NBR_IN_EPOCH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.QUARTER_GL_STATUS = null; } else {
      this.QUARTER_GL_STATUS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.YEAR_DW_ID = null; } else {
      this.YEAR_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.YEAR_NBR = null; } else {
      this.YEAR_NBR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.YEAR_CODE = null; } else {
      this.YEAR_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.YEAR_START_DATE = null; } else {
      this.YEAR_START_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.YEAR_END_DATE = null; } else {
      this.YEAR_END_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.YEAR_START_DAY_DW_ID = null; } else {
      this.YEAR_START_DAY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.YEAR_END_DAY_DW_ID = null; } else {
      this.YEAR_END_DAY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.YEAR_NBR_IN_EPOCH = null; } else {
      this.YEAR_NBR_IN_EPOCH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.YEAR_GL_STATUS = null; } else {
      this.YEAR_GL_STATUS = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_DW_ID_LY_CAL = null; } else {
      this.DAY_DW_ID_LY_CAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_LY_CAL = null; } else {
      this.DAY_LY_CAL = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_NBR_IN_EPOCH_LY_CAL = null; } else {
      this.DAY_NBR_IN_EPOCH_LY_CAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_DW_ID_LY_CAL = null; } else {
      this.WEEK_DW_ID_LY_CAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_START_DATE_LY_CAL = null; } else {
      this.WEEK_START_DATE_LY_CAL = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_END_DATE_LY_CAL = null; } else {
      this.WEEK_END_DATE_LY_CAL = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_START_DAY_DW_ID_LY_CAL = null; } else {
      this.WEEK_START_DAY_DW_ID_LY_CAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_END_DAY_DW_ID_LY_CAL = null; } else {
      this.WEEK_END_DAY_DW_ID_LY_CAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_NBR_IN_EPOCH_LY_CAL = null; } else {
      this.WEEK_NBR_IN_EPOCH_LY_CAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_DW_ID_2Y_CAL = null; } else {
      this.DAY_DW_ID_2Y_CAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_2Y_CAL = null; } else {
      this.DAY_2Y_CAL = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAY_NBR_IN_EPOCH_2Y_CAL = null; } else {
      this.DAY_NBR_IN_EPOCH_2Y_CAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_DW_ID_2Y_CAL = null; } else {
      this.WEEK_DW_ID_2Y_CAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_START_DATE_2Y_CAL = null; } else {
      this.WEEK_START_DATE_2Y_CAL = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_END_DATE_2Y_CAL = null; } else {
      this.WEEK_END_DATE_2Y_CAL = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_START_DAY_DW_ID_2Y_CAL = null; } else {
      this.WEEK_START_DAY_DW_ID_2Y_CAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_END_DAY_DW_ID_2Y_CAL = null; } else {
      this.WEEK_END_DAY_DW_ID_2Y_CAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEEK_NBR_IN_EPOCH_2Y_CAL = null; } else {
      this.WEEK_NBR_IN_EPOCH_2Y_CAL = new java.math.BigDecimal(__cur_str);
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
    dim_star_day o = (dim_star_day) super.clone();
    o.DAY = (o.DAY != null) ? (java.sql.Timestamp) o.DAY.clone() : null;
    o.DAY_LY = (o.DAY_LY != null) ? (java.sql.Timestamp) o.DAY_LY.clone() : null;
    o.WEEK_START_DATE = (o.WEEK_START_DATE != null) ? (java.sql.Timestamp) o.WEEK_START_DATE.clone() : null;
    o.WEEK_END_DATE = (o.WEEK_END_DATE != null) ? (java.sql.Timestamp) o.WEEK_END_DATE.clone() : null;
    o.WEEK_START_DATE_LY = (o.WEEK_START_DATE_LY != null) ? (java.sql.Timestamp) o.WEEK_START_DATE_LY.clone() : null;
    o.WEEK_END_DATE_LY = (o.WEEK_END_DATE_LY != null) ? (java.sql.Timestamp) o.WEEK_END_DATE_LY.clone() : null;
    o.PERIOD_START_DATE = (o.PERIOD_START_DATE != null) ? (java.sql.Timestamp) o.PERIOD_START_DATE.clone() : null;
    o.PERIOD_END_DATE = (o.PERIOD_END_DATE != null) ? (java.sql.Timestamp) o.PERIOD_END_DATE.clone() : null;
    o.QUARTER_START_DATE = (o.QUARTER_START_DATE != null) ? (java.sql.Timestamp) o.QUARTER_START_DATE.clone() : null;
    o.QUARTER_END_DATE = (o.QUARTER_END_DATE != null) ? (java.sql.Timestamp) o.QUARTER_END_DATE.clone() : null;
    o.YEAR_START_DATE = (o.YEAR_START_DATE != null) ? (java.sql.Timestamp) o.YEAR_START_DATE.clone() : null;
    o.YEAR_END_DATE = (o.YEAR_END_DATE != null) ? (java.sql.Timestamp) o.YEAR_END_DATE.clone() : null;
    o.FILE_DTTM = (o.FILE_DTTM != null) ? (java.sql.Timestamp) o.FILE_DTTM.clone() : null;
    o.INSERT_DTTM = (o.INSERT_DTTM != null) ? (java.sql.Timestamp) o.INSERT_DTTM.clone() : null;
    o.UPDATE_DTTM = (o.UPDATE_DTTM != null) ? (java.sql.Timestamp) o.UPDATE_DTTM.clone() : null;
    o.DAY_LY_CAL = (o.DAY_LY_CAL != null) ? (java.sql.Timestamp) o.DAY_LY_CAL.clone() : null;
    o.WEEK_START_DATE_LY_CAL = (o.WEEK_START_DATE_LY_CAL != null) ? (java.sql.Timestamp) o.WEEK_START_DATE_LY_CAL.clone() : null;
    o.WEEK_END_DATE_LY_CAL = (o.WEEK_END_DATE_LY_CAL != null) ? (java.sql.Timestamp) o.WEEK_END_DATE_LY_CAL.clone() : null;
    o.DAY_2Y_CAL = (o.DAY_2Y_CAL != null) ? (java.sql.Timestamp) o.DAY_2Y_CAL.clone() : null;
    o.WEEK_START_DATE_2Y_CAL = (o.WEEK_START_DATE_2Y_CAL != null) ? (java.sql.Timestamp) o.WEEK_START_DATE_2Y_CAL.clone() : null;
    o.WEEK_END_DATE_2Y_CAL = (o.WEEK_END_DATE_2Y_CAL != null) ? (java.sql.Timestamp) o.WEEK_END_DATE_2Y_CAL.clone() : null;
    o.LOAD_DTTM = (o.LOAD_DTTM != null) ? (java.sql.Timestamp) o.LOAD_DTTM.clone() : null;
    return o;
  }

  public void clone0(dim_star_day o) throws CloneNotSupportedException {
    o.DAY = (o.DAY != null) ? (java.sql.Timestamp) o.DAY.clone() : null;
    o.DAY_LY = (o.DAY_LY != null) ? (java.sql.Timestamp) o.DAY_LY.clone() : null;
    o.WEEK_START_DATE = (o.WEEK_START_DATE != null) ? (java.sql.Timestamp) o.WEEK_START_DATE.clone() : null;
    o.WEEK_END_DATE = (o.WEEK_END_DATE != null) ? (java.sql.Timestamp) o.WEEK_END_DATE.clone() : null;
    o.WEEK_START_DATE_LY = (o.WEEK_START_DATE_LY != null) ? (java.sql.Timestamp) o.WEEK_START_DATE_LY.clone() : null;
    o.WEEK_END_DATE_LY = (o.WEEK_END_DATE_LY != null) ? (java.sql.Timestamp) o.WEEK_END_DATE_LY.clone() : null;
    o.PERIOD_START_DATE = (o.PERIOD_START_DATE != null) ? (java.sql.Timestamp) o.PERIOD_START_DATE.clone() : null;
    o.PERIOD_END_DATE = (o.PERIOD_END_DATE != null) ? (java.sql.Timestamp) o.PERIOD_END_DATE.clone() : null;
    o.QUARTER_START_DATE = (o.QUARTER_START_DATE != null) ? (java.sql.Timestamp) o.QUARTER_START_DATE.clone() : null;
    o.QUARTER_END_DATE = (o.QUARTER_END_DATE != null) ? (java.sql.Timestamp) o.QUARTER_END_DATE.clone() : null;
    o.YEAR_START_DATE = (o.YEAR_START_DATE != null) ? (java.sql.Timestamp) o.YEAR_START_DATE.clone() : null;
    o.YEAR_END_DATE = (o.YEAR_END_DATE != null) ? (java.sql.Timestamp) o.YEAR_END_DATE.clone() : null;
    o.FILE_DTTM = (o.FILE_DTTM != null) ? (java.sql.Timestamp) o.FILE_DTTM.clone() : null;
    o.INSERT_DTTM = (o.INSERT_DTTM != null) ? (java.sql.Timestamp) o.INSERT_DTTM.clone() : null;
    o.UPDATE_DTTM = (o.UPDATE_DTTM != null) ? (java.sql.Timestamp) o.UPDATE_DTTM.clone() : null;
    o.DAY_LY_CAL = (o.DAY_LY_CAL != null) ? (java.sql.Timestamp) o.DAY_LY_CAL.clone() : null;
    o.WEEK_START_DATE_LY_CAL = (o.WEEK_START_DATE_LY_CAL != null) ? (java.sql.Timestamp) o.WEEK_START_DATE_LY_CAL.clone() : null;
    o.WEEK_END_DATE_LY_CAL = (o.WEEK_END_DATE_LY_CAL != null) ? (java.sql.Timestamp) o.WEEK_END_DATE_LY_CAL.clone() : null;
    o.DAY_2Y_CAL = (o.DAY_2Y_CAL != null) ? (java.sql.Timestamp) o.DAY_2Y_CAL.clone() : null;
    o.WEEK_START_DATE_2Y_CAL = (o.WEEK_START_DATE_2Y_CAL != null) ? (java.sql.Timestamp) o.WEEK_START_DATE_2Y_CAL.clone() : null;
    o.WEEK_END_DATE_2Y_CAL = (o.WEEK_END_DATE_2Y_CAL != null) ? (java.sql.Timestamp) o.WEEK_END_DATE_2Y_CAL.clone() : null;
    o.LOAD_DTTM = (o.LOAD_DTTM != null) ? (java.sql.Timestamp) o.LOAD_DTTM.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Z_DAY_DW_ID", this.Z_DAY_DW_ID);
    __sqoop$field_map.put("DAY", this.DAY);
    __sqoop$field_map.put("DAY_NBR_IN_EPOCH", this.DAY_NBR_IN_EPOCH);
    __sqoop$field_map.put("DAY_DW_ID_LY", this.DAY_DW_ID_LY);
    __sqoop$field_map.put("DAY_LY", this.DAY_LY);
    __sqoop$field_map.put("DAY_NBR_IN_EPOCH_LY", this.DAY_NBR_IN_EPOCH_LY);
    __sqoop$field_map.put("DAY_IN_WEEK", this.DAY_IN_WEEK);
    __sqoop$field_map.put("DAY_IN_PERIOD", this.DAY_IN_PERIOD);
    __sqoop$field_map.put("DAY_IN_QUARTER", this.DAY_IN_QUARTER);
    __sqoop$field_map.put("DAY_IN_YEAR", this.DAY_IN_YEAR);
    __sqoop$field_map.put("WEEK_DW_ID", this.WEEK_DW_ID);
    __sqoop$field_map.put("WEEK_NAME", this.WEEK_NAME);
    __sqoop$field_map.put("WEEK_IN_PERIOD", this.WEEK_IN_PERIOD);
    __sqoop$field_map.put("WEEK_IN_QUARTER", this.WEEK_IN_QUARTER);
    __sqoop$field_map.put("WEEK_IN_YEAR", this.WEEK_IN_YEAR);
    __sqoop$field_map.put("WEEK_START_DATE", this.WEEK_START_DATE);
    __sqoop$field_map.put("WEEK_END_DATE", this.WEEK_END_DATE);
    __sqoop$field_map.put("WEEK_START_DAY_DW_ID", this.WEEK_START_DAY_DW_ID);
    __sqoop$field_map.put("WEEK_END_DAY_DW_ID", this.WEEK_END_DAY_DW_ID);
    __sqoop$field_map.put("WEEK_NBR_IN_EPOCH", this.WEEK_NBR_IN_EPOCH);
    __sqoop$field_map.put("WEEK_GL_NAME", this.WEEK_GL_NAME);
    __sqoop$field_map.put("WEEK_GL_STATUS", this.WEEK_GL_STATUS);
    __sqoop$field_map.put("WEEK_DW_ID_LY", this.WEEK_DW_ID_LY);
    __sqoop$field_map.put("WEEK_START_DATE_LY", this.WEEK_START_DATE_LY);
    __sqoop$field_map.put("WEEK_END_DATE_LY", this.WEEK_END_DATE_LY);
    __sqoop$field_map.put("WEEK_START_DAY_DW_ID_LY", this.WEEK_START_DAY_DW_ID_LY);
    __sqoop$field_map.put("WEEK_END_DAY_DW_ID_LY", this.WEEK_END_DAY_DW_ID_LY);
    __sqoop$field_map.put("WEEK_NBR_IN_EPOCH_LY", this.WEEK_NBR_IN_EPOCH_LY);
    __sqoop$field_map.put("PERIOD_DW_ID", this.PERIOD_DW_ID);
    __sqoop$field_map.put("PERIOD_NAME", this.PERIOD_NAME);
    __sqoop$field_map.put("PERIOD_IN_QUARTER", this.PERIOD_IN_QUARTER);
    __sqoop$field_map.put("PERIOD_IN_YEAR", this.PERIOD_IN_YEAR);
    __sqoop$field_map.put("PERIOD_START_DATE", this.PERIOD_START_DATE);
    __sqoop$field_map.put("PERIOD_END_DATE", this.PERIOD_END_DATE);
    __sqoop$field_map.put("PERIOD_START_DAY_DW_ID", this.PERIOD_START_DAY_DW_ID);
    __sqoop$field_map.put("PERIOD_END_DAY_DW_ID", this.PERIOD_END_DAY_DW_ID);
    __sqoop$field_map.put("PERIOD_NBR_IN_EPOCH", this.PERIOD_NBR_IN_EPOCH);
    __sqoop$field_map.put("PERIOD_GL_STATUS", this.PERIOD_GL_STATUS);
    __sqoop$field_map.put("QUARTER_DW_ID", this.QUARTER_DW_ID);
    __sqoop$field_map.put("QUARTER_NAME", this.QUARTER_NAME);
    __sqoop$field_map.put("QUARTER_IN_YEAR", this.QUARTER_IN_YEAR);
    __sqoop$field_map.put("QUARTER_START_DATE", this.QUARTER_START_DATE);
    __sqoop$field_map.put("QUARTER_END_DATE", this.QUARTER_END_DATE);
    __sqoop$field_map.put("QUARTER_START_DAY_DW_ID", this.QUARTER_START_DAY_DW_ID);
    __sqoop$field_map.put("QUARTER_END_DAY_DW_ID", this.QUARTER_END_DAY_DW_ID);
    __sqoop$field_map.put("QUARTER_NBR_IN_EPOCH", this.QUARTER_NBR_IN_EPOCH);
    __sqoop$field_map.put("QUARTER_GL_STATUS", this.QUARTER_GL_STATUS);
    __sqoop$field_map.put("YEAR_DW_ID", this.YEAR_DW_ID);
    __sqoop$field_map.put("YEAR_NBR", this.YEAR_NBR);
    __sqoop$field_map.put("YEAR_CODE", this.YEAR_CODE);
    __sqoop$field_map.put("YEAR_START_DATE", this.YEAR_START_DATE);
    __sqoop$field_map.put("YEAR_END_DATE", this.YEAR_END_DATE);
    __sqoop$field_map.put("YEAR_START_DAY_DW_ID", this.YEAR_START_DAY_DW_ID);
    __sqoop$field_map.put("YEAR_END_DAY_DW_ID", this.YEAR_END_DAY_DW_ID);
    __sqoop$field_map.put("YEAR_NBR_IN_EPOCH", this.YEAR_NBR_IN_EPOCH);
    __sqoop$field_map.put("YEAR_GL_STATUS", this.YEAR_GL_STATUS);
    __sqoop$field_map.put("FILE_DTTM", this.FILE_DTTM);
    __sqoop$field_map.put("INSERT_DTTM", this.INSERT_DTTM);
    __sqoop$field_map.put("UPDATE_DTTM", this.UPDATE_DTTM);
    __sqoop$field_map.put("LOAD_DW_ID", this.LOAD_DW_ID);
    __sqoop$field_map.put("VERSION", this.VERSION);
    __sqoop$field_map.put("DAY_DW_ID_LY_CAL", this.DAY_DW_ID_LY_CAL);
    __sqoop$field_map.put("DAY_LY_CAL", this.DAY_LY_CAL);
    __sqoop$field_map.put("DAY_NBR_IN_EPOCH_LY_CAL", this.DAY_NBR_IN_EPOCH_LY_CAL);
    __sqoop$field_map.put("WEEK_DW_ID_LY_CAL", this.WEEK_DW_ID_LY_CAL);
    __sqoop$field_map.put("WEEK_START_DATE_LY_CAL", this.WEEK_START_DATE_LY_CAL);
    __sqoop$field_map.put("WEEK_END_DATE_LY_CAL", this.WEEK_END_DATE_LY_CAL);
    __sqoop$field_map.put("WEEK_START_DAY_DW_ID_LY_CAL", this.WEEK_START_DAY_DW_ID_LY_CAL);
    __sqoop$field_map.put("WEEK_END_DAY_DW_ID_LY_CAL", this.WEEK_END_DAY_DW_ID_LY_CAL);
    __sqoop$field_map.put("WEEK_NBR_IN_EPOCH_LY_CAL", this.WEEK_NBR_IN_EPOCH_LY_CAL);
    __sqoop$field_map.put("DAY_DW_ID_2Y_CAL", this.DAY_DW_ID_2Y_CAL);
    __sqoop$field_map.put("DAY_2Y_CAL", this.DAY_2Y_CAL);
    __sqoop$field_map.put("DAY_NBR_IN_EPOCH_2Y_CAL", this.DAY_NBR_IN_EPOCH_2Y_CAL);
    __sqoop$field_map.put("WEEK_DW_ID_2Y_CAL", this.WEEK_DW_ID_2Y_CAL);
    __sqoop$field_map.put("WEEK_START_DATE_2Y_CAL", this.WEEK_START_DATE_2Y_CAL);
    __sqoop$field_map.put("WEEK_END_DATE_2Y_CAL", this.WEEK_END_DATE_2Y_CAL);
    __sqoop$field_map.put("WEEK_START_DAY_DW_ID_2Y_CAL", this.WEEK_START_DAY_DW_ID_2Y_CAL);
    __sqoop$field_map.put("WEEK_END_DAY_DW_ID_2Y_CAL", this.WEEK_END_DAY_DW_ID_2Y_CAL);
    __sqoop$field_map.put("WEEK_NBR_IN_EPOCH_2Y_CAL", this.WEEK_NBR_IN_EPOCH_2Y_CAL);
    __sqoop$field_map.put("LOAD_DTTM", this.LOAD_DTTM);
    __sqoop$field_map.put("LOAD_BY", this.LOAD_BY);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Z_DAY_DW_ID", this.Z_DAY_DW_ID);
    __sqoop$field_map.put("DAY", this.DAY);
    __sqoop$field_map.put("DAY_NBR_IN_EPOCH", this.DAY_NBR_IN_EPOCH);
    __sqoop$field_map.put("DAY_DW_ID_LY", this.DAY_DW_ID_LY);
    __sqoop$field_map.put("DAY_LY", this.DAY_LY);
    __sqoop$field_map.put("DAY_NBR_IN_EPOCH_LY", this.DAY_NBR_IN_EPOCH_LY);
    __sqoop$field_map.put("DAY_IN_WEEK", this.DAY_IN_WEEK);
    __sqoop$field_map.put("DAY_IN_PERIOD", this.DAY_IN_PERIOD);
    __sqoop$field_map.put("DAY_IN_QUARTER", this.DAY_IN_QUARTER);
    __sqoop$field_map.put("DAY_IN_YEAR", this.DAY_IN_YEAR);
    __sqoop$field_map.put("WEEK_DW_ID", this.WEEK_DW_ID);
    __sqoop$field_map.put("WEEK_NAME", this.WEEK_NAME);
    __sqoop$field_map.put("WEEK_IN_PERIOD", this.WEEK_IN_PERIOD);
    __sqoop$field_map.put("WEEK_IN_QUARTER", this.WEEK_IN_QUARTER);
    __sqoop$field_map.put("WEEK_IN_YEAR", this.WEEK_IN_YEAR);
    __sqoop$field_map.put("WEEK_START_DATE", this.WEEK_START_DATE);
    __sqoop$field_map.put("WEEK_END_DATE", this.WEEK_END_DATE);
    __sqoop$field_map.put("WEEK_START_DAY_DW_ID", this.WEEK_START_DAY_DW_ID);
    __sqoop$field_map.put("WEEK_END_DAY_DW_ID", this.WEEK_END_DAY_DW_ID);
    __sqoop$field_map.put("WEEK_NBR_IN_EPOCH", this.WEEK_NBR_IN_EPOCH);
    __sqoop$field_map.put("WEEK_GL_NAME", this.WEEK_GL_NAME);
    __sqoop$field_map.put("WEEK_GL_STATUS", this.WEEK_GL_STATUS);
    __sqoop$field_map.put("WEEK_DW_ID_LY", this.WEEK_DW_ID_LY);
    __sqoop$field_map.put("WEEK_START_DATE_LY", this.WEEK_START_DATE_LY);
    __sqoop$field_map.put("WEEK_END_DATE_LY", this.WEEK_END_DATE_LY);
    __sqoop$field_map.put("WEEK_START_DAY_DW_ID_LY", this.WEEK_START_DAY_DW_ID_LY);
    __sqoop$field_map.put("WEEK_END_DAY_DW_ID_LY", this.WEEK_END_DAY_DW_ID_LY);
    __sqoop$field_map.put("WEEK_NBR_IN_EPOCH_LY", this.WEEK_NBR_IN_EPOCH_LY);
    __sqoop$field_map.put("PERIOD_DW_ID", this.PERIOD_DW_ID);
    __sqoop$field_map.put("PERIOD_NAME", this.PERIOD_NAME);
    __sqoop$field_map.put("PERIOD_IN_QUARTER", this.PERIOD_IN_QUARTER);
    __sqoop$field_map.put("PERIOD_IN_YEAR", this.PERIOD_IN_YEAR);
    __sqoop$field_map.put("PERIOD_START_DATE", this.PERIOD_START_DATE);
    __sqoop$field_map.put("PERIOD_END_DATE", this.PERIOD_END_DATE);
    __sqoop$field_map.put("PERIOD_START_DAY_DW_ID", this.PERIOD_START_DAY_DW_ID);
    __sqoop$field_map.put("PERIOD_END_DAY_DW_ID", this.PERIOD_END_DAY_DW_ID);
    __sqoop$field_map.put("PERIOD_NBR_IN_EPOCH", this.PERIOD_NBR_IN_EPOCH);
    __sqoop$field_map.put("PERIOD_GL_STATUS", this.PERIOD_GL_STATUS);
    __sqoop$field_map.put("QUARTER_DW_ID", this.QUARTER_DW_ID);
    __sqoop$field_map.put("QUARTER_NAME", this.QUARTER_NAME);
    __sqoop$field_map.put("QUARTER_IN_YEAR", this.QUARTER_IN_YEAR);
    __sqoop$field_map.put("QUARTER_START_DATE", this.QUARTER_START_DATE);
    __sqoop$field_map.put("QUARTER_END_DATE", this.QUARTER_END_DATE);
    __sqoop$field_map.put("QUARTER_START_DAY_DW_ID", this.QUARTER_START_DAY_DW_ID);
    __sqoop$field_map.put("QUARTER_END_DAY_DW_ID", this.QUARTER_END_DAY_DW_ID);
    __sqoop$field_map.put("QUARTER_NBR_IN_EPOCH", this.QUARTER_NBR_IN_EPOCH);
    __sqoop$field_map.put("QUARTER_GL_STATUS", this.QUARTER_GL_STATUS);
    __sqoop$field_map.put("YEAR_DW_ID", this.YEAR_DW_ID);
    __sqoop$field_map.put("YEAR_NBR", this.YEAR_NBR);
    __sqoop$field_map.put("YEAR_CODE", this.YEAR_CODE);
    __sqoop$field_map.put("YEAR_START_DATE", this.YEAR_START_DATE);
    __sqoop$field_map.put("YEAR_END_DATE", this.YEAR_END_DATE);
    __sqoop$field_map.put("YEAR_START_DAY_DW_ID", this.YEAR_START_DAY_DW_ID);
    __sqoop$field_map.put("YEAR_END_DAY_DW_ID", this.YEAR_END_DAY_DW_ID);
    __sqoop$field_map.put("YEAR_NBR_IN_EPOCH", this.YEAR_NBR_IN_EPOCH);
    __sqoop$field_map.put("YEAR_GL_STATUS", this.YEAR_GL_STATUS);
    __sqoop$field_map.put("FILE_DTTM", this.FILE_DTTM);
    __sqoop$field_map.put("INSERT_DTTM", this.INSERT_DTTM);
    __sqoop$field_map.put("UPDATE_DTTM", this.UPDATE_DTTM);
    __sqoop$field_map.put("LOAD_DW_ID", this.LOAD_DW_ID);
    __sqoop$field_map.put("VERSION", this.VERSION);
    __sqoop$field_map.put("DAY_DW_ID_LY_CAL", this.DAY_DW_ID_LY_CAL);
    __sqoop$field_map.put("DAY_LY_CAL", this.DAY_LY_CAL);
    __sqoop$field_map.put("DAY_NBR_IN_EPOCH_LY_CAL", this.DAY_NBR_IN_EPOCH_LY_CAL);
    __sqoop$field_map.put("WEEK_DW_ID_LY_CAL", this.WEEK_DW_ID_LY_CAL);
    __sqoop$field_map.put("WEEK_START_DATE_LY_CAL", this.WEEK_START_DATE_LY_CAL);
    __sqoop$field_map.put("WEEK_END_DATE_LY_CAL", this.WEEK_END_DATE_LY_CAL);
    __sqoop$field_map.put("WEEK_START_DAY_DW_ID_LY_CAL", this.WEEK_START_DAY_DW_ID_LY_CAL);
    __sqoop$field_map.put("WEEK_END_DAY_DW_ID_LY_CAL", this.WEEK_END_DAY_DW_ID_LY_CAL);
    __sqoop$field_map.put("WEEK_NBR_IN_EPOCH_LY_CAL", this.WEEK_NBR_IN_EPOCH_LY_CAL);
    __sqoop$field_map.put("DAY_DW_ID_2Y_CAL", this.DAY_DW_ID_2Y_CAL);
    __sqoop$field_map.put("DAY_2Y_CAL", this.DAY_2Y_CAL);
    __sqoop$field_map.put("DAY_NBR_IN_EPOCH_2Y_CAL", this.DAY_NBR_IN_EPOCH_2Y_CAL);
    __sqoop$field_map.put("WEEK_DW_ID_2Y_CAL", this.WEEK_DW_ID_2Y_CAL);
    __sqoop$field_map.put("WEEK_START_DATE_2Y_CAL", this.WEEK_START_DATE_2Y_CAL);
    __sqoop$field_map.put("WEEK_END_DATE_2Y_CAL", this.WEEK_END_DATE_2Y_CAL);
    __sqoop$field_map.put("WEEK_START_DAY_DW_ID_2Y_CAL", this.WEEK_START_DAY_DW_ID_2Y_CAL);
    __sqoop$field_map.put("WEEK_END_DAY_DW_ID_2Y_CAL", this.WEEK_END_DAY_DW_ID_2Y_CAL);
    __sqoop$field_map.put("WEEK_NBR_IN_EPOCH_2Y_CAL", this.WEEK_NBR_IN_EPOCH_2Y_CAL);
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
