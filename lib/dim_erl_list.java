// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 28 14:13:10 GMT 2017
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

public class dim_erl_list extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("SEND_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SEND_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("SEND_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SEND_NAME = (String)value;
      }
    });
    setters.put("EMAIL_SUBJECT_LINE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EMAIL_SUBJECT_LINE = (String)value;
      }
    });
    setters.put("FROM_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FROM_NAME = (String)value;
      }
    });
    setters.put("FROM_EMAIL_ADDRESS", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FROM_EMAIL_ADDRESS = (String)value;
      }
    });
    setters.put("VENDOR_CLIENT_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        VENDOR_CLIENT_ID = (java.math.BigDecimal)value;
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
    setters.put("JOB_STATUS_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        JOB_STATUS_DESC = (String)value;
      }
    });
    setters.put("SCHEDULED_SEND_DTTM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SCHEDULED_SEND_DTTM = (java.sql.Timestamp)value;
      }
    });
    setters.put("ACTUAL_SEND_DTTM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ACTUAL_SEND_DTTM = (java.sql.Timestamp)value;
      }
    });
    setters.put("LOAD_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LOAD_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("FILE_DTTM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FILE_DTTM = (java.sql.Timestamp)value;
      }
    });
    setters.put("VERSION", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        VERSION = (java.math.BigDecimal)value;
      }
    });
    setters.put("VENDOR_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        VENDOR_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("Z_ERL_LIST_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Z_ERL_LIST_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("ACTUAL_SEND_DAY_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ACTUAL_SEND_DAY_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("ERL_BU_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ERL_BU_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("CAMPAIGN_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CAMPAIGN_CODE = (String)value;
      }
    });
    setters.put("CAMPAIGN_TYPE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CAMPAIGN_TYPE = (String)value;
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
  public dim_erl_list() {
    init0();
  }
  private java.math.BigDecimal SEND_ID;
  public java.math.BigDecimal get_SEND_ID() {
    return SEND_ID;
  }
  public void set_SEND_ID(java.math.BigDecimal SEND_ID) {
    this.SEND_ID = SEND_ID;
  }
  public dim_erl_list with_SEND_ID(java.math.BigDecimal SEND_ID) {
    this.SEND_ID = SEND_ID;
    return this;
  }
  private String SEND_NAME;
  public String get_SEND_NAME() {
    return SEND_NAME;
  }
  public void set_SEND_NAME(String SEND_NAME) {
    this.SEND_NAME = SEND_NAME;
  }
  public dim_erl_list with_SEND_NAME(String SEND_NAME) {
    this.SEND_NAME = SEND_NAME;
    return this;
  }
  private String EMAIL_SUBJECT_LINE;
  public String get_EMAIL_SUBJECT_LINE() {
    return EMAIL_SUBJECT_LINE;
  }
  public void set_EMAIL_SUBJECT_LINE(String EMAIL_SUBJECT_LINE) {
    this.EMAIL_SUBJECT_LINE = EMAIL_SUBJECT_LINE;
  }
  public dim_erl_list with_EMAIL_SUBJECT_LINE(String EMAIL_SUBJECT_LINE) {
    this.EMAIL_SUBJECT_LINE = EMAIL_SUBJECT_LINE;
    return this;
  }
  private String FROM_NAME;
  public String get_FROM_NAME() {
    return FROM_NAME;
  }
  public void set_FROM_NAME(String FROM_NAME) {
    this.FROM_NAME = FROM_NAME;
  }
  public dim_erl_list with_FROM_NAME(String FROM_NAME) {
    this.FROM_NAME = FROM_NAME;
    return this;
  }
  private String FROM_EMAIL_ADDRESS;
  public String get_FROM_EMAIL_ADDRESS() {
    return FROM_EMAIL_ADDRESS;
  }
  public void set_FROM_EMAIL_ADDRESS(String FROM_EMAIL_ADDRESS) {
    this.FROM_EMAIL_ADDRESS = FROM_EMAIL_ADDRESS;
  }
  public dim_erl_list with_FROM_EMAIL_ADDRESS(String FROM_EMAIL_ADDRESS) {
    this.FROM_EMAIL_ADDRESS = FROM_EMAIL_ADDRESS;
    return this;
  }
  private java.math.BigDecimal VENDOR_CLIENT_ID;
  public java.math.BigDecimal get_VENDOR_CLIENT_ID() {
    return VENDOR_CLIENT_ID;
  }
  public void set_VENDOR_CLIENT_ID(java.math.BigDecimal VENDOR_CLIENT_ID) {
    this.VENDOR_CLIENT_ID = VENDOR_CLIENT_ID;
  }
  public dim_erl_list with_VENDOR_CLIENT_ID(java.math.BigDecimal VENDOR_CLIENT_ID) {
    this.VENDOR_CLIENT_ID = VENDOR_CLIENT_ID;
    return this;
  }
  private java.sql.Timestamp INSERT_DTTM;
  public java.sql.Timestamp get_INSERT_DTTM() {
    return INSERT_DTTM;
  }
  public void set_INSERT_DTTM(java.sql.Timestamp INSERT_DTTM) {
    this.INSERT_DTTM = INSERT_DTTM;
  }
  public dim_erl_list with_INSERT_DTTM(java.sql.Timestamp INSERT_DTTM) {
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
  public dim_erl_list with_UPDATE_DTTM(java.sql.Timestamp UPDATE_DTTM) {
    this.UPDATE_DTTM = UPDATE_DTTM;
    return this;
  }
  private String JOB_STATUS_DESC;
  public String get_JOB_STATUS_DESC() {
    return JOB_STATUS_DESC;
  }
  public void set_JOB_STATUS_DESC(String JOB_STATUS_DESC) {
    this.JOB_STATUS_DESC = JOB_STATUS_DESC;
  }
  public dim_erl_list with_JOB_STATUS_DESC(String JOB_STATUS_DESC) {
    this.JOB_STATUS_DESC = JOB_STATUS_DESC;
    return this;
  }
  private java.sql.Timestamp SCHEDULED_SEND_DTTM;
  public java.sql.Timestamp get_SCHEDULED_SEND_DTTM() {
    return SCHEDULED_SEND_DTTM;
  }
  public void set_SCHEDULED_SEND_DTTM(java.sql.Timestamp SCHEDULED_SEND_DTTM) {
    this.SCHEDULED_SEND_DTTM = SCHEDULED_SEND_DTTM;
  }
  public dim_erl_list with_SCHEDULED_SEND_DTTM(java.sql.Timestamp SCHEDULED_SEND_DTTM) {
    this.SCHEDULED_SEND_DTTM = SCHEDULED_SEND_DTTM;
    return this;
  }
  private java.sql.Timestamp ACTUAL_SEND_DTTM;
  public java.sql.Timestamp get_ACTUAL_SEND_DTTM() {
    return ACTUAL_SEND_DTTM;
  }
  public void set_ACTUAL_SEND_DTTM(java.sql.Timestamp ACTUAL_SEND_DTTM) {
    this.ACTUAL_SEND_DTTM = ACTUAL_SEND_DTTM;
  }
  public dim_erl_list with_ACTUAL_SEND_DTTM(java.sql.Timestamp ACTUAL_SEND_DTTM) {
    this.ACTUAL_SEND_DTTM = ACTUAL_SEND_DTTM;
    return this;
  }
  private java.math.BigDecimal LOAD_DW_ID;
  public java.math.BigDecimal get_LOAD_DW_ID() {
    return LOAD_DW_ID;
  }
  public void set_LOAD_DW_ID(java.math.BigDecimal LOAD_DW_ID) {
    this.LOAD_DW_ID = LOAD_DW_ID;
  }
  public dim_erl_list with_LOAD_DW_ID(java.math.BigDecimal LOAD_DW_ID) {
    this.LOAD_DW_ID = LOAD_DW_ID;
    return this;
  }
  private java.sql.Timestamp FILE_DTTM;
  public java.sql.Timestamp get_FILE_DTTM() {
    return FILE_DTTM;
  }
  public void set_FILE_DTTM(java.sql.Timestamp FILE_DTTM) {
    this.FILE_DTTM = FILE_DTTM;
  }
  public dim_erl_list with_FILE_DTTM(java.sql.Timestamp FILE_DTTM) {
    this.FILE_DTTM = FILE_DTTM;
    return this;
  }
  private java.math.BigDecimal VERSION;
  public java.math.BigDecimal get_VERSION() {
    return VERSION;
  }
  public void set_VERSION(java.math.BigDecimal VERSION) {
    this.VERSION = VERSION;
  }
  public dim_erl_list with_VERSION(java.math.BigDecimal VERSION) {
    this.VERSION = VERSION;
    return this;
  }
  private java.math.BigDecimal VENDOR_DW_ID;
  public java.math.BigDecimal get_VENDOR_DW_ID() {
    return VENDOR_DW_ID;
  }
  public void set_VENDOR_DW_ID(java.math.BigDecimal VENDOR_DW_ID) {
    this.VENDOR_DW_ID = VENDOR_DW_ID;
  }
  public dim_erl_list with_VENDOR_DW_ID(java.math.BigDecimal VENDOR_DW_ID) {
    this.VENDOR_DW_ID = VENDOR_DW_ID;
    return this;
  }
  private java.math.BigDecimal Z_ERL_LIST_DW_ID;
  public java.math.BigDecimal get_Z_ERL_LIST_DW_ID() {
    return Z_ERL_LIST_DW_ID;
  }
  public void set_Z_ERL_LIST_DW_ID(java.math.BigDecimal Z_ERL_LIST_DW_ID) {
    this.Z_ERL_LIST_DW_ID = Z_ERL_LIST_DW_ID;
  }
  public dim_erl_list with_Z_ERL_LIST_DW_ID(java.math.BigDecimal Z_ERL_LIST_DW_ID) {
    this.Z_ERL_LIST_DW_ID = Z_ERL_LIST_DW_ID;
    return this;
  }
  private java.math.BigDecimal ACTUAL_SEND_DAY_DW_ID;
  public java.math.BigDecimal get_ACTUAL_SEND_DAY_DW_ID() {
    return ACTUAL_SEND_DAY_DW_ID;
  }
  public void set_ACTUAL_SEND_DAY_DW_ID(java.math.BigDecimal ACTUAL_SEND_DAY_DW_ID) {
    this.ACTUAL_SEND_DAY_DW_ID = ACTUAL_SEND_DAY_DW_ID;
  }
  public dim_erl_list with_ACTUAL_SEND_DAY_DW_ID(java.math.BigDecimal ACTUAL_SEND_DAY_DW_ID) {
    this.ACTUAL_SEND_DAY_DW_ID = ACTUAL_SEND_DAY_DW_ID;
    return this;
  }
  private java.math.BigDecimal ERL_BU_DW_ID;
  public java.math.BigDecimal get_ERL_BU_DW_ID() {
    return ERL_BU_DW_ID;
  }
  public void set_ERL_BU_DW_ID(java.math.BigDecimal ERL_BU_DW_ID) {
    this.ERL_BU_DW_ID = ERL_BU_DW_ID;
  }
  public dim_erl_list with_ERL_BU_DW_ID(java.math.BigDecimal ERL_BU_DW_ID) {
    this.ERL_BU_DW_ID = ERL_BU_DW_ID;
    return this;
  }
  private String CAMPAIGN_CODE;
  public String get_CAMPAIGN_CODE() {
    return CAMPAIGN_CODE;
  }
  public void set_CAMPAIGN_CODE(String CAMPAIGN_CODE) {
    this.CAMPAIGN_CODE = CAMPAIGN_CODE;
  }
  public dim_erl_list with_CAMPAIGN_CODE(String CAMPAIGN_CODE) {
    this.CAMPAIGN_CODE = CAMPAIGN_CODE;
    return this;
  }
  private String CAMPAIGN_TYPE;
  public String get_CAMPAIGN_TYPE() {
    return CAMPAIGN_TYPE;
  }
  public void set_CAMPAIGN_TYPE(String CAMPAIGN_TYPE) {
    this.CAMPAIGN_TYPE = CAMPAIGN_TYPE;
  }
  public dim_erl_list with_CAMPAIGN_TYPE(String CAMPAIGN_TYPE) {
    this.CAMPAIGN_TYPE = CAMPAIGN_TYPE;
    return this;
  }
  private java.sql.Timestamp LOAD_DTTM;
  public java.sql.Timestamp get_LOAD_DTTM() {
    return LOAD_DTTM;
  }
  public void set_LOAD_DTTM(java.sql.Timestamp LOAD_DTTM) {
    this.LOAD_DTTM = LOAD_DTTM;
  }
  public dim_erl_list with_LOAD_DTTM(java.sql.Timestamp LOAD_DTTM) {
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
  public dim_erl_list with_LOAD_BY(String LOAD_BY) {
    this.LOAD_BY = LOAD_BY;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_erl_list)) {
      return false;
    }
    dim_erl_list that = (dim_erl_list) o;
    boolean equal = true;
    equal = equal && (this.SEND_ID == null ? that.SEND_ID == null : this.SEND_ID.equals(that.SEND_ID));
    equal = equal && (this.SEND_NAME == null ? that.SEND_NAME == null : this.SEND_NAME.equals(that.SEND_NAME));
    equal = equal && (this.EMAIL_SUBJECT_LINE == null ? that.EMAIL_SUBJECT_LINE == null : this.EMAIL_SUBJECT_LINE.equals(that.EMAIL_SUBJECT_LINE));
    equal = equal && (this.FROM_NAME == null ? that.FROM_NAME == null : this.FROM_NAME.equals(that.FROM_NAME));
    equal = equal && (this.FROM_EMAIL_ADDRESS == null ? that.FROM_EMAIL_ADDRESS == null : this.FROM_EMAIL_ADDRESS.equals(that.FROM_EMAIL_ADDRESS));
    equal = equal && (this.VENDOR_CLIENT_ID == null ? that.VENDOR_CLIENT_ID == null : this.VENDOR_CLIENT_ID.equals(that.VENDOR_CLIENT_ID));
    equal = equal && (this.INSERT_DTTM == null ? that.INSERT_DTTM == null : this.INSERT_DTTM.equals(that.INSERT_DTTM));
    equal = equal && (this.UPDATE_DTTM == null ? that.UPDATE_DTTM == null : this.UPDATE_DTTM.equals(that.UPDATE_DTTM));
    equal = equal && (this.JOB_STATUS_DESC == null ? that.JOB_STATUS_DESC == null : this.JOB_STATUS_DESC.equals(that.JOB_STATUS_DESC));
    equal = equal && (this.SCHEDULED_SEND_DTTM == null ? that.SCHEDULED_SEND_DTTM == null : this.SCHEDULED_SEND_DTTM.equals(that.SCHEDULED_SEND_DTTM));
    equal = equal && (this.ACTUAL_SEND_DTTM == null ? that.ACTUAL_SEND_DTTM == null : this.ACTUAL_SEND_DTTM.equals(that.ACTUAL_SEND_DTTM));
    equal = equal && (this.LOAD_DW_ID == null ? that.LOAD_DW_ID == null : this.LOAD_DW_ID.equals(that.LOAD_DW_ID));
    equal = equal && (this.FILE_DTTM == null ? that.FILE_DTTM == null : this.FILE_DTTM.equals(that.FILE_DTTM));
    equal = equal && (this.VERSION == null ? that.VERSION == null : this.VERSION.equals(that.VERSION));
    equal = equal && (this.VENDOR_DW_ID == null ? that.VENDOR_DW_ID == null : this.VENDOR_DW_ID.equals(that.VENDOR_DW_ID));
    equal = equal && (this.Z_ERL_LIST_DW_ID == null ? that.Z_ERL_LIST_DW_ID == null : this.Z_ERL_LIST_DW_ID.equals(that.Z_ERL_LIST_DW_ID));
    equal = equal && (this.ACTUAL_SEND_DAY_DW_ID == null ? that.ACTUAL_SEND_DAY_DW_ID == null : this.ACTUAL_SEND_DAY_DW_ID.equals(that.ACTUAL_SEND_DAY_DW_ID));
    equal = equal && (this.ERL_BU_DW_ID == null ? that.ERL_BU_DW_ID == null : this.ERL_BU_DW_ID.equals(that.ERL_BU_DW_ID));
    equal = equal && (this.CAMPAIGN_CODE == null ? that.CAMPAIGN_CODE == null : this.CAMPAIGN_CODE.equals(that.CAMPAIGN_CODE));
    equal = equal && (this.CAMPAIGN_TYPE == null ? that.CAMPAIGN_TYPE == null : this.CAMPAIGN_TYPE.equals(that.CAMPAIGN_TYPE));
    equal = equal && (this.LOAD_DTTM == null ? that.LOAD_DTTM == null : this.LOAD_DTTM.equals(that.LOAD_DTTM));
    equal = equal && (this.LOAD_BY == null ? that.LOAD_BY == null : this.LOAD_BY.equals(that.LOAD_BY));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_erl_list)) {
      return false;
    }
    dim_erl_list that = (dim_erl_list) o;
    boolean equal = true;
    equal = equal && (this.SEND_ID == null ? that.SEND_ID == null : this.SEND_ID.equals(that.SEND_ID));
    equal = equal && (this.SEND_NAME == null ? that.SEND_NAME == null : this.SEND_NAME.equals(that.SEND_NAME));
    equal = equal && (this.EMAIL_SUBJECT_LINE == null ? that.EMAIL_SUBJECT_LINE == null : this.EMAIL_SUBJECT_LINE.equals(that.EMAIL_SUBJECT_LINE));
    equal = equal && (this.FROM_NAME == null ? that.FROM_NAME == null : this.FROM_NAME.equals(that.FROM_NAME));
    equal = equal && (this.FROM_EMAIL_ADDRESS == null ? that.FROM_EMAIL_ADDRESS == null : this.FROM_EMAIL_ADDRESS.equals(that.FROM_EMAIL_ADDRESS));
    equal = equal && (this.VENDOR_CLIENT_ID == null ? that.VENDOR_CLIENT_ID == null : this.VENDOR_CLIENT_ID.equals(that.VENDOR_CLIENT_ID));
    equal = equal && (this.INSERT_DTTM == null ? that.INSERT_DTTM == null : this.INSERT_DTTM.equals(that.INSERT_DTTM));
    equal = equal && (this.UPDATE_DTTM == null ? that.UPDATE_DTTM == null : this.UPDATE_DTTM.equals(that.UPDATE_DTTM));
    equal = equal && (this.JOB_STATUS_DESC == null ? that.JOB_STATUS_DESC == null : this.JOB_STATUS_DESC.equals(that.JOB_STATUS_DESC));
    equal = equal && (this.SCHEDULED_SEND_DTTM == null ? that.SCHEDULED_SEND_DTTM == null : this.SCHEDULED_SEND_DTTM.equals(that.SCHEDULED_SEND_DTTM));
    equal = equal && (this.ACTUAL_SEND_DTTM == null ? that.ACTUAL_SEND_DTTM == null : this.ACTUAL_SEND_DTTM.equals(that.ACTUAL_SEND_DTTM));
    equal = equal && (this.LOAD_DW_ID == null ? that.LOAD_DW_ID == null : this.LOAD_DW_ID.equals(that.LOAD_DW_ID));
    equal = equal && (this.FILE_DTTM == null ? that.FILE_DTTM == null : this.FILE_DTTM.equals(that.FILE_DTTM));
    equal = equal && (this.VERSION == null ? that.VERSION == null : this.VERSION.equals(that.VERSION));
    equal = equal && (this.VENDOR_DW_ID == null ? that.VENDOR_DW_ID == null : this.VENDOR_DW_ID.equals(that.VENDOR_DW_ID));
    equal = equal && (this.Z_ERL_LIST_DW_ID == null ? that.Z_ERL_LIST_DW_ID == null : this.Z_ERL_LIST_DW_ID.equals(that.Z_ERL_LIST_DW_ID));
    equal = equal && (this.ACTUAL_SEND_DAY_DW_ID == null ? that.ACTUAL_SEND_DAY_DW_ID == null : this.ACTUAL_SEND_DAY_DW_ID.equals(that.ACTUAL_SEND_DAY_DW_ID));
    equal = equal && (this.ERL_BU_DW_ID == null ? that.ERL_BU_DW_ID == null : this.ERL_BU_DW_ID.equals(that.ERL_BU_DW_ID));
    equal = equal && (this.CAMPAIGN_CODE == null ? that.CAMPAIGN_CODE == null : this.CAMPAIGN_CODE.equals(that.CAMPAIGN_CODE));
    equal = equal && (this.CAMPAIGN_TYPE == null ? that.CAMPAIGN_TYPE == null : this.CAMPAIGN_TYPE.equals(that.CAMPAIGN_TYPE));
    equal = equal && (this.LOAD_DTTM == null ? that.LOAD_DTTM == null : this.LOAD_DTTM.equals(that.LOAD_DTTM));
    equal = equal && (this.LOAD_BY == null ? that.LOAD_BY == null : this.LOAD_BY.equals(that.LOAD_BY));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.SEND_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.SEND_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.EMAIL_SUBJECT_LINE = JdbcWritableBridge.readString(3, __dbResults);
    this.FROM_NAME = JdbcWritableBridge.readString(4, __dbResults);
    this.FROM_EMAIL_ADDRESS = JdbcWritableBridge.readString(5, __dbResults);
    this.VENDOR_CLIENT_ID = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.INSERT_DTTM = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.UPDATE_DTTM = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.JOB_STATUS_DESC = JdbcWritableBridge.readString(9, __dbResults);
    this.SCHEDULED_SEND_DTTM = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.ACTUAL_SEND_DTTM = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.LOAD_DW_ID = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.FILE_DTTM = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.VERSION = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.VENDOR_DW_ID = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.Z_ERL_LIST_DW_ID = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.ACTUAL_SEND_DAY_DW_ID = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.ERL_BU_DW_ID = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.CAMPAIGN_CODE = JdbcWritableBridge.readString(19, __dbResults);
    this.CAMPAIGN_TYPE = JdbcWritableBridge.readString(20, __dbResults);
    this.LOAD_DTTM = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.LOAD_BY = JdbcWritableBridge.readString(22, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.SEND_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.SEND_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.EMAIL_SUBJECT_LINE = JdbcWritableBridge.readString(3, __dbResults);
    this.FROM_NAME = JdbcWritableBridge.readString(4, __dbResults);
    this.FROM_EMAIL_ADDRESS = JdbcWritableBridge.readString(5, __dbResults);
    this.VENDOR_CLIENT_ID = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.INSERT_DTTM = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.UPDATE_DTTM = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.JOB_STATUS_DESC = JdbcWritableBridge.readString(9, __dbResults);
    this.SCHEDULED_SEND_DTTM = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.ACTUAL_SEND_DTTM = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.LOAD_DW_ID = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.FILE_DTTM = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.VERSION = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.VENDOR_DW_ID = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.Z_ERL_LIST_DW_ID = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.ACTUAL_SEND_DAY_DW_ID = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.ERL_BU_DW_ID = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.CAMPAIGN_CODE = JdbcWritableBridge.readString(19, __dbResults);
    this.CAMPAIGN_TYPE = JdbcWritableBridge.readString(20, __dbResults);
    this.LOAD_DTTM = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.LOAD_BY = JdbcWritableBridge.readString(22, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(SEND_ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(SEND_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EMAIL_SUBJECT_LINE, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FROM_NAME, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FROM_EMAIL_ADDRESS, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VENDOR_CLIENT_ID, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(INSERT_DTTM, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATE_DTTM, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(JOB_STATUS_DESC, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(SCHEDULED_SEND_DTTM, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ACTUAL_SEND_DTTM, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOAD_DW_ID, 12 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FILE_DTTM, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VERSION, 14 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VENDOR_DW_ID, 15 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Z_ERL_LIST_DW_ID, 16 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ACTUAL_SEND_DAY_DW_ID, 17 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ERL_BU_DW_ID, 18 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(CAMPAIGN_CODE, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CAMPAIGN_TYPE, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOAD_DTTM, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_BY, 22 + __off, 12, __dbStmt);
    return 22;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(SEND_ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(SEND_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EMAIL_SUBJECT_LINE, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FROM_NAME, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FROM_EMAIL_ADDRESS, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VENDOR_CLIENT_ID, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(INSERT_DTTM, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATE_DTTM, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(JOB_STATUS_DESC, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(SCHEDULED_SEND_DTTM, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ACTUAL_SEND_DTTM, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOAD_DW_ID, 12 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FILE_DTTM, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VERSION, 14 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VENDOR_DW_ID, 15 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Z_ERL_LIST_DW_ID, 16 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ACTUAL_SEND_DAY_DW_ID, 17 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ERL_BU_DW_ID, 18 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(CAMPAIGN_CODE, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CAMPAIGN_TYPE, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOAD_DTTM, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_BY, 22 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.SEND_ID = null;
    } else {
    this.SEND_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SEND_NAME = null;
    } else {
    this.SEND_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EMAIL_SUBJECT_LINE = null;
    } else {
    this.EMAIL_SUBJECT_LINE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FROM_NAME = null;
    } else {
    this.FROM_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FROM_EMAIL_ADDRESS = null;
    } else {
    this.FROM_EMAIL_ADDRESS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VENDOR_CLIENT_ID = null;
    } else {
    this.VENDOR_CLIENT_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.JOB_STATUS_DESC = null;
    } else {
    this.JOB_STATUS_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SCHEDULED_SEND_DTTM = null;
    } else {
    this.SCHEDULED_SEND_DTTM = new Timestamp(__dataIn.readLong());
    this.SCHEDULED_SEND_DTTM.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ACTUAL_SEND_DTTM = null;
    } else {
    this.ACTUAL_SEND_DTTM = new Timestamp(__dataIn.readLong());
    this.ACTUAL_SEND_DTTM.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.LOAD_DW_ID = null;
    } else {
    this.LOAD_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FILE_DTTM = null;
    } else {
    this.FILE_DTTM = new Timestamp(__dataIn.readLong());
    this.FILE_DTTM.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.VERSION = null;
    } else {
    this.VERSION = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VENDOR_DW_ID = null;
    } else {
    this.VENDOR_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Z_ERL_LIST_DW_ID = null;
    } else {
    this.Z_ERL_LIST_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ACTUAL_SEND_DAY_DW_ID = null;
    } else {
    this.ACTUAL_SEND_DAY_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ERL_BU_DW_ID = null;
    } else {
    this.ERL_BU_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CAMPAIGN_CODE = null;
    } else {
    this.CAMPAIGN_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CAMPAIGN_TYPE = null;
    } else {
    this.CAMPAIGN_TYPE = Text.readString(__dataIn);
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
    if (null == this.SEND_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SEND_ID, __dataOut);
    }
    if (null == this.SEND_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SEND_NAME);
    }
    if (null == this.EMAIL_SUBJECT_LINE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EMAIL_SUBJECT_LINE);
    }
    if (null == this.FROM_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FROM_NAME);
    }
    if (null == this.FROM_EMAIL_ADDRESS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FROM_EMAIL_ADDRESS);
    }
    if (null == this.VENDOR_CLIENT_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VENDOR_CLIENT_ID, __dataOut);
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
    if (null == this.JOB_STATUS_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, JOB_STATUS_DESC);
    }
    if (null == this.SCHEDULED_SEND_DTTM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.SCHEDULED_SEND_DTTM.getTime());
    __dataOut.writeInt(this.SCHEDULED_SEND_DTTM.getNanos());
    }
    if (null == this.ACTUAL_SEND_DTTM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ACTUAL_SEND_DTTM.getTime());
    __dataOut.writeInt(this.ACTUAL_SEND_DTTM.getNanos());
    }
    if (null == this.LOAD_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOAD_DW_ID, __dataOut);
    }
    if (null == this.FILE_DTTM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FILE_DTTM.getTime());
    __dataOut.writeInt(this.FILE_DTTM.getNanos());
    }
    if (null == this.VERSION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VERSION, __dataOut);
    }
    if (null == this.VENDOR_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VENDOR_DW_ID, __dataOut);
    }
    if (null == this.Z_ERL_LIST_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Z_ERL_LIST_DW_ID, __dataOut);
    }
    if (null == this.ACTUAL_SEND_DAY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ACTUAL_SEND_DAY_DW_ID, __dataOut);
    }
    if (null == this.ERL_BU_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ERL_BU_DW_ID, __dataOut);
    }
    if (null == this.CAMPAIGN_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CAMPAIGN_CODE);
    }
    if (null == this.CAMPAIGN_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CAMPAIGN_TYPE);
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
    if (null == this.SEND_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SEND_ID, __dataOut);
    }
    if (null == this.SEND_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SEND_NAME);
    }
    if (null == this.EMAIL_SUBJECT_LINE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EMAIL_SUBJECT_LINE);
    }
    if (null == this.FROM_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FROM_NAME);
    }
    if (null == this.FROM_EMAIL_ADDRESS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FROM_EMAIL_ADDRESS);
    }
    if (null == this.VENDOR_CLIENT_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VENDOR_CLIENT_ID, __dataOut);
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
    if (null == this.JOB_STATUS_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, JOB_STATUS_DESC);
    }
    if (null == this.SCHEDULED_SEND_DTTM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.SCHEDULED_SEND_DTTM.getTime());
    __dataOut.writeInt(this.SCHEDULED_SEND_DTTM.getNanos());
    }
    if (null == this.ACTUAL_SEND_DTTM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ACTUAL_SEND_DTTM.getTime());
    __dataOut.writeInt(this.ACTUAL_SEND_DTTM.getNanos());
    }
    if (null == this.LOAD_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOAD_DW_ID, __dataOut);
    }
    if (null == this.FILE_DTTM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FILE_DTTM.getTime());
    __dataOut.writeInt(this.FILE_DTTM.getNanos());
    }
    if (null == this.VERSION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VERSION, __dataOut);
    }
    if (null == this.VENDOR_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VENDOR_DW_ID, __dataOut);
    }
    if (null == this.Z_ERL_LIST_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Z_ERL_LIST_DW_ID, __dataOut);
    }
    if (null == this.ACTUAL_SEND_DAY_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ACTUAL_SEND_DAY_DW_ID, __dataOut);
    }
    if (null == this.ERL_BU_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ERL_BU_DW_ID, __dataOut);
    }
    if (null == this.CAMPAIGN_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CAMPAIGN_CODE);
    }
    if (null == this.CAMPAIGN_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CAMPAIGN_TYPE);
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
    __sb.append(FieldFormatter.escapeAndEnclose(SEND_ID==null?"\\N":SEND_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SEND_NAME==null?"\\N":SEND_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EMAIL_SUBJECT_LINE==null?"\\N":EMAIL_SUBJECT_LINE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FROM_NAME==null?"\\N":FROM_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FROM_EMAIL_ADDRESS==null?"\\N":FROM_EMAIL_ADDRESS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VENDOR_CLIENT_ID==null?"\\N":VENDOR_CLIENT_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INSERT_DTTM==null?"\\N":"" + INSERT_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UPDATE_DTTM==null?"\\N":"" + UPDATE_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(JOB_STATUS_DESC==null?"\\N":JOB_STATUS_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SCHEDULED_SEND_DTTM==null?"\\N":"" + SCHEDULED_SEND_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACTUAL_SEND_DTTM==null?"\\N":"" + ACTUAL_SEND_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOAD_DW_ID==null?"\\N":LOAD_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FILE_DTTM==null?"\\N":"" + FILE_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERSION==null?"\\N":VERSION.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VENDOR_DW_ID==null?"\\N":VENDOR_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Z_ERL_LIST_DW_ID==null?"\\N":Z_ERL_LIST_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACTUAL_SEND_DAY_DW_ID==null?"\\N":ACTUAL_SEND_DAY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ERL_BU_DW_ID==null?"\\N":ERL_BU_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAMPAIGN_CODE==null?"\\N":CAMPAIGN_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAMPAIGN_TYPE==null?"\\N":CAMPAIGN_TYPE, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(SEND_ID==null?"\\N":SEND_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SEND_NAME==null?"\\N":SEND_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EMAIL_SUBJECT_LINE==null?"\\N":EMAIL_SUBJECT_LINE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FROM_NAME==null?"\\N":FROM_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FROM_EMAIL_ADDRESS==null?"\\N":FROM_EMAIL_ADDRESS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VENDOR_CLIENT_ID==null?"\\N":VENDOR_CLIENT_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INSERT_DTTM==null?"\\N":"" + INSERT_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UPDATE_DTTM==null?"\\N":"" + UPDATE_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(JOB_STATUS_DESC==null?"\\N":JOB_STATUS_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SCHEDULED_SEND_DTTM==null?"\\N":"" + SCHEDULED_SEND_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACTUAL_SEND_DTTM==null?"\\N":"" + ACTUAL_SEND_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOAD_DW_ID==null?"\\N":LOAD_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FILE_DTTM==null?"\\N":"" + FILE_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERSION==null?"\\N":VERSION.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VENDOR_DW_ID==null?"\\N":VENDOR_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Z_ERL_LIST_DW_ID==null?"\\N":Z_ERL_LIST_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACTUAL_SEND_DAY_DW_ID==null?"\\N":ACTUAL_SEND_DAY_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ERL_BU_DW_ID==null?"\\N":ERL_BU_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAMPAIGN_CODE==null?"\\N":CAMPAIGN_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAMPAIGN_TYPE==null?"\\N":CAMPAIGN_TYPE, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SEND_ID = null; } else {
      this.SEND_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SEND_NAME = null; } else {
      this.SEND_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EMAIL_SUBJECT_LINE = null; } else {
      this.EMAIL_SUBJECT_LINE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FROM_NAME = null; } else {
      this.FROM_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FROM_EMAIL_ADDRESS = null; } else {
      this.FROM_EMAIL_ADDRESS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VENDOR_CLIENT_ID = null; } else {
      this.VENDOR_CLIENT_ID = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.JOB_STATUS_DESC = null; } else {
      this.JOB_STATUS_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SCHEDULED_SEND_DTTM = null; } else {
      this.SCHEDULED_SEND_DTTM = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ACTUAL_SEND_DTTM = null; } else {
      this.ACTUAL_SEND_DTTM = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LOAD_DW_ID = null; } else {
      this.LOAD_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FILE_DTTM = null; } else {
      this.FILE_DTTM = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VERSION = null; } else {
      this.VERSION = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VENDOR_DW_ID = null; } else {
      this.VENDOR_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Z_ERL_LIST_DW_ID = null; } else {
      this.Z_ERL_LIST_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ACTUAL_SEND_DAY_DW_ID = null; } else {
      this.ACTUAL_SEND_DAY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ERL_BU_DW_ID = null; } else {
      this.ERL_BU_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CAMPAIGN_CODE = null; } else {
      this.CAMPAIGN_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CAMPAIGN_TYPE = null; } else {
      this.CAMPAIGN_TYPE = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SEND_ID = null; } else {
      this.SEND_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SEND_NAME = null; } else {
      this.SEND_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EMAIL_SUBJECT_LINE = null; } else {
      this.EMAIL_SUBJECT_LINE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FROM_NAME = null; } else {
      this.FROM_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FROM_EMAIL_ADDRESS = null; } else {
      this.FROM_EMAIL_ADDRESS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VENDOR_CLIENT_ID = null; } else {
      this.VENDOR_CLIENT_ID = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.JOB_STATUS_DESC = null; } else {
      this.JOB_STATUS_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SCHEDULED_SEND_DTTM = null; } else {
      this.SCHEDULED_SEND_DTTM = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ACTUAL_SEND_DTTM = null; } else {
      this.ACTUAL_SEND_DTTM = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LOAD_DW_ID = null; } else {
      this.LOAD_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FILE_DTTM = null; } else {
      this.FILE_DTTM = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VERSION = null; } else {
      this.VERSION = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VENDOR_DW_ID = null; } else {
      this.VENDOR_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Z_ERL_LIST_DW_ID = null; } else {
      this.Z_ERL_LIST_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ACTUAL_SEND_DAY_DW_ID = null; } else {
      this.ACTUAL_SEND_DAY_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ERL_BU_DW_ID = null; } else {
      this.ERL_BU_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CAMPAIGN_CODE = null; } else {
      this.CAMPAIGN_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CAMPAIGN_TYPE = null; } else {
      this.CAMPAIGN_TYPE = __cur_str;
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
    dim_erl_list o = (dim_erl_list) super.clone();
    o.INSERT_DTTM = (o.INSERT_DTTM != null) ? (java.sql.Timestamp) o.INSERT_DTTM.clone() : null;
    o.UPDATE_DTTM = (o.UPDATE_DTTM != null) ? (java.sql.Timestamp) o.UPDATE_DTTM.clone() : null;
    o.SCHEDULED_SEND_DTTM = (o.SCHEDULED_SEND_DTTM != null) ? (java.sql.Timestamp) o.SCHEDULED_SEND_DTTM.clone() : null;
    o.ACTUAL_SEND_DTTM = (o.ACTUAL_SEND_DTTM != null) ? (java.sql.Timestamp) o.ACTUAL_SEND_DTTM.clone() : null;
    o.FILE_DTTM = (o.FILE_DTTM != null) ? (java.sql.Timestamp) o.FILE_DTTM.clone() : null;
    o.LOAD_DTTM = (o.LOAD_DTTM != null) ? (java.sql.Timestamp) o.LOAD_DTTM.clone() : null;
    return o;
  }

  public void clone0(dim_erl_list o) throws CloneNotSupportedException {
    o.INSERT_DTTM = (o.INSERT_DTTM != null) ? (java.sql.Timestamp) o.INSERT_DTTM.clone() : null;
    o.UPDATE_DTTM = (o.UPDATE_DTTM != null) ? (java.sql.Timestamp) o.UPDATE_DTTM.clone() : null;
    o.SCHEDULED_SEND_DTTM = (o.SCHEDULED_SEND_DTTM != null) ? (java.sql.Timestamp) o.SCHEDULED_SEND_DTTM.clone() : null;
    o.ACTUAL_SEND_DTTM = (o.ACTUAL_SEND_DTTM != null) ? (java.sql.Timestamp) o.ACTUAL_SEND_DTTM.clone() : null;
    o.FILE_DTTM = (o.FILE_DTTM != null) ? (java.sql.Timestamp) o.FILE_DTTM.clone() : null;
    o.LOAD_DTTM = (o.LOAD_DTTM != null) ? (java.sql.Timestamp) o.LOAD_DTTM.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("SEND_ID", this.SEND_ID);
    __sqoop$field_map.put("SEND_NAME", this.SEND_NAME);
    __sqoop$field_map.put("EMAIL_SUBJECT_LINE", this.EMAIL_SUBJECT_LINE);
    __sqoop$field_map.put("FROM_NAME", this.FROM_NAME);
    __sqoop$field_map.put("FROM_EMAIL_ADDRESS", this.FROM_EMAIL_ADDRESS);
    __sqoop$field_map.put("VENDOR_CLIENT_ID", this.VENDOR_CLIENT_ID);
    __sqoop$field_map.put("INSERT_DTTM", this.INSERT_DTTM);
    __sqoop$field_map.put("UPDATE_DTTM", this.UPDATE_DTTM);
    __sqoop$field_map.put("JOB_STATUS_DESC", this.JOB_STATUS_DESC);
    __sqoop$field_map.put("SCHEDULED_SEND_DTTM", this.SCHEDULED_SEND_DTTM);
    __sqoop$field_map.put("ACTUAL_SEND_DTTM", this.ACTUAL_SEND_DTTM);
    __sqoop$field_map.put("LOAD_DW_ID", this.LOAD_DW_ID);
    __sqoop$field_map.put("FILE_DTTM", this.FILE_DTTM);
    __sqoop$field_map.put("VERSION", this.VERSION);
    __sqoop$field_map.put("VENDOR_DW_ID", this.VENDOR_DW_ID);
    __sqoop$field_map.put("Z_ERL_LIST_DW_ID", this.Z_ERL_LIST_DW_ID);
    __sqoop$field_map.put("ACTUAL_SEND_DAY_DW_ID", this.ACTUAL_SEND_DAY_DW_ID);
    __sqoop$field_map.put("ERL_BU_DW_ID", this.ERL_BU_DW_ID);
    __sqoop$field_map.put("CAMPAIGN_CODE", this.CAMPAIGN_CODE);
    __sqoop$field_map.put("CAMPAIGN_TYPE", this.CAMPAIGN_TYPE);
    __sqoop$field_map.put("LOAD_DTTM", this.LOAD_DTTM);
    __sqoop$field_map.put("LOAD_BY", this.LOAD_BY);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("SEND_ID", this.SEND_ID);
    __sqoop$field_map.put("SEND_NAME", this.SEND_NAME);
    __sqoop$field_map.put("EMAIL_SUBJECT_LINE", this.EMAIL_SUBJECT_LINE);
    __sqoop$field_map.put("FROM_NAME", this.FROM_NAME);
    __sqoop$field_map.put("FROM_EMAIL_ADDRESS", this.FROM_EMAIL_ADDRESS);
    __sqoop$field_map.put("VENDOR_CLIENT_ID", this.VENDOR_CLIENT_ID);
    __sqoop$field_map.put("INSERT_DTTM", this.INSERT_DTTM);
    __sqoop$field_map.put("UPDATE_DTTM", this.UPDATE_DTTM);
    __sqoop$field_map.put("JOB_STATUS_DESC", this.JOB_STATUS_DESC);
    __sqoop$field_map.put("SCHEDULED_SEND_DTTM", this.SCHEDULED_SEND_DTTM);
    __sqoop$field_map.put("ACTUAL_SEND_DTTM", this.ACTUAL_SEND_DTTM);
    __sqoop$field_map.put("LOAD_DW_ID", this.LOAD_DW_ID);
    __sqoop$field_map.put("FILE_DTTM", this.FILE_DTTM);
    __sqoop$field_map.put("VERSION", this.VERSION);
    __sqoop$field_map.put("VENDOR_DW_ID", this.VENDOR_DW_ID);
    __sqoop$field_map.put("Z_ERL_LIST_DW_ID", this.Z_ERL_LIST_DW_ID);
    __sqoop$field_map.put("ACTUAL_SEND_DAY_DW_ID", this.ACTUAL_SEND_DAY_DW_ID);
    __sqoop$field_map.put("ERL_BU_DW_ID", this.ERL_BU_DW_ID);
    __sqoop$field_map.put("CAMPAIGN_CODE", this.CAMPAIGN_CODE);
    __sqoop$field_map.put("CAMPAIGN_TYPE", this.CAMPAIGN_TYPE);
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
