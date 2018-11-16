// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 29 17:02:16 GMT 2017
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

public class erl_subscribe_status extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("CURR_SUBSCRIBE_STATUS_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CURR_SUBSCRIBE_STATUS_FLAG = (String)value;
      }
    });
    setters.put("EMAIL_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EMAIL_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("ERL_BU_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ERL_BU_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("ERL_STATUS_HIST_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ERL_STATUS_HIST_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("FILE_DTTM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FILE_DTTM = (java.sql.Timestamp)value;
      }
    });
    setters.put("HUB_CUST_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HUB_CUST_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("INSERT_DTTM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        INSERT_DTTM = (java.sql.Timestamp)value;
      }
    });
    setters.put("LOAD_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LOAD_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("NEW_SUBSCRIBE_STATUS_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NEW_SUBSCRIBE_STATUS_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("OLD_SUBSCRIBE_STATUS_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        OLD_SUBSCRIBE_STATUS_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("STATUS_DTTM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        STATUS_DTTM = (java.sql.Timestamp)value;
      }
    });
    setters.put("UPDATE_DTTM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        UPDATE_DTTM = (java.sql.Timestamp)value;
      }
    });
    setters.put("VERSION", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        VERSION = (java.math.BigDecimal)value;
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
  public erl_subscribe_status() {
    init0();
  }
  private String CURR_SUBSCRIBE_STATUS_FLAG;
  public String get_CURR_SUBSCRIBE_STATUS_FLAG() {
    return CURR_SUBSCRIBE_STATUS_FLAG;
  }
  public void set_CURR_SUBSCRIBE_STATUS_FLAG(String CURR_SUBSCRIBE_STATUS_FLAG) {
    this.CURR_SUBSCRIBE_STATUS_FLAG = CURR_SUBSCRIBE_STATUS_FLAG;
  }
  public erl_subscribe_status with_CURR_SUBSCRIBE_STATUS_FLAG(String CURR_SUBSCRIBE_STATUS_FLAG) {
    this.CURR_SUBSCRIBE_STATUS_FLAG = CURR_SUBSCRIBE_STATUS_FLAG;
    return this;
  }
  private java.math.BigDecimal EMAIL_DW_ID;
  public java.math.BigDecimal get_EMAIL_DW_ID() {
    return EMAIL_DW_ID;
  }
  public void set_EMAIL_DW_ID(java.math.BigDecimal EMAIL_DW_ID) {
    this.EMAIL_DW_ID = EMAIL_DW_ID;
  }
  public erl_subscribe_status with_EMAIL_DW_ID(java.math.BigDecimal EMAIL_DW_ID) {
    this.EMAIL_DW_ID = EMAIL_DW_ID;
    return this;
  }
  private java.math.BigDecimal ERL_BU_DW_ID;
  public java.math.BigDecimal get_ERL_BU_DW_ID() {
    return ERL_BU_DW_ID;
  }
  public void set_ERL_BU_DW_ID(java.math.BigDecimal ERL_BU_DW_ID) {
    this.ERL_BU_DW_ID = ERL_BU_DW_ID;
  }
  public erl_subscribe_status with_ERL_BU_DW_ID(java.math.BigDecimal ERL_BU_DW_ID) {
    this.ERL_BU_DW_ID = ERL_BU_DW_ID;
    return this;
  }
  private java.math.BigDecimal ERL_STATUS_HIST_DW_ID;
  public java.math.BigDecimal get_ERL_STATUS_HIST_DW_ID() {
    return ERL_STATUS_HIST_DW_ID;
  }
  public void set_ERL_STATUS_HIST_DW_ID(java.math.BigDecimal ERL_STATUS_HIST_DW_ID) {
    this.ERL_STATUS_HIST_DW_ID = ERL_STATUS_HIST_DW_ID;
  }
  public erl_subscribe_status with_ERL_STATUS_HIST_DW_ID(java.math.BigDecimal ERL_STATUS_HIST_DW_ID) {
    this.ERL_STATUS_HIST_DW_ID = ERL_STATUS_HIST_DW_ID;
    return this;
  }
  private java.sql.Timestamp FILE_DTTM;
  public java.sql.Timestamp get_FILE_DTTM() {
    return FILE_DTTM;
  }
  public void set_FILE_DTTM(java.sql.Timestamp FILE_DTTM) {
    this.FILE_DTTM = FILE_DTTM;
  }
  public erl_subscribe_status with_FILE_DTTM(java.sql.Timestamp FILE_DTTM) {
    this.FILE_DTTM = FILE_DTTM;
    return this;
  }
  private java.math.BigDecimal HUB_CUST_ID;
  public java.math.BigDecimal get_HUB_CUST_ID() {
    return HUB_CUST_ID;
  }
  public void set_HUB_CUST_ID(java.math.BigDecimal HUB_CUST_ID) {
    this.HUB_CUST_ID = HUB_CUST_ID;
  }
  public erl_subscribe_status with_HUB_CUST_ID(java.math.BigDecimal HUB_CUST_ID) {
    this.HUB_CUST_ID = HUB_CUST_ID;
    return this;
  }
  private java.sql.Timestamp INSERT_DTTM;
  public java.sql.Timestamp get_INSERT_DTTM() {
    return INSERT_DTTM;
  }
  public void set_INSERT_DTTM(java.sql.Timestamp INSERT_DTTM) {
    this.INSERT_DTTM = INSERT_DTTM;
  }
  public erl_subscribe_status with_INSERT_DTTM(java.sql.Timestamp INSERT_DTTM) {
    this.INSERT_DTTM = INSERT_DTTM;
    return this;
  }
  private java.math.BigDecimal LOAD_DW_ID;
  public java.math.BigDecimal get_LOAD_DW_ID() {
    return LOAD_DW_ID;
  }
  public void set_LOAD_DW_ID(java.math.BigDecimal LOAD_DW_ID) {
    this.LOAD_DW_ID = LOAD_DW_ID;
  }
  public erl_subscribe_status with_LOAD_DW_ID(java.math.BigDecimal LOAD_DW_ID) {
    this.LOAD_DW_ID = LOAD_DW_ID;
    return this;
  }
  private java.math.BigDecimal NEW_SUBSCRIBE_STATUS_DW_ID;
  public java.math.BigDecimal get_NEW_SUBSCRIBE_STATUS_DW_ID() {
    return NEW_SUBSCRIBE_STATUS_DW_ID;
  }
  public void set_NEW_SUBSCRIBE_STATUS_DW_ID(java.math.BigDecimal NEW_SUBSCRIBE_STATUS_DW_ID) {
    this.NEW_SUBSCRIBE_STATUS_DW_ID = NEW_SUBSCRIBE_STATUS_DW_ID;
  }
  public erl_subscribe_status with_NEW_SUBSCRIBE_STATUS_DW_ID(java.math.BigDecimal NEW_SUBSCRIBE_STATUS_DW_ID) {
    this.NEW_SUBSCRIBE_STATUS_DW_ID = NEW_SUBSCRIBE_STATUS_DW_ID;
    return this;
  }
  private java.math.BigDecimal OLD_SUBSCRIBE_STATUS_DW_ID;
  public java.math.BigDecimal get_OLD_SUBSCRIBE_STATUS_DW_ID() {
    return OLD_SUBSCRIBE_STATUS_DW_ID;
  }
  public void set_OLD_SUBSCRIBE_STATUS_DW_ID(java.math.BigDecimal OLD_SUBSCRIBE_STATUS_DW_ID) {
    this.OLD_SUBSCRIBE_STATUS_DW_ID = OLD_SUBSCRIBE_STATUS_DW_ID;
  }
  public erl_subscribe_status with_OLD_SUBSCRIBE_STATUS_DW_ID(java.math.BigDecimal OLD_SUBSCRIBE_STATUS_DW_ID) {
    this.OLD_SUBSCRIBE_STATUS_DW_ID = OLD_SUBSCRIBE_STATUS_DW_ID;
    return this;
  }
  private java.sql.Timestamp STATUS_DTTM;
  public java.sql.Timestamp get_STATUS_DTTM() {
    return STATUS_DTTM;
  }
  public void set_STATUS_DTTM(java.sql.Timestamp STATUS_DTTM) {
    this.STATUS_DTTM = STATUS_DTTM;
  }
  public erl_subscribe_status with_STATUS_DTTM(java.sql.Timestamp STATUS_DTTM) {
    this.STATUS_DTTM = STATUS_DTTM;
    return this;
  }
  private java.sql.Timestamp UPDATE_DTTM;
  public java.sql.Timestamp get_UPDATE_DTTM() {
    return UPDATE_DTTM;
  }
  public void set_UPDATE_DTTM(java.sql.Timestamp UPDATE_DTTM) {
    this.UPDATE_DTTM = UPDATE_DTTM;
  }
  public erl_subscribe_status with_UPDATE_DTTM(java.sql.Timestamp UPDATE_DTTM) {
    this.UPDATE_DTTM = UPDATE_DTTM;
    return this;
  }
  private java.math.BigDecimal VERSION;
  public java.math.BigDecimal get_VERSION() {
    return VERSION;
  }
  public void set_VERSION(java.math.BigDecimal VERSION) {
    this.VERSION = VERSION;
  }
  public erl_subscribe_status with_VERSION(java.math.BigDecimal VERSION) {
    this.VERSION = VERSION;
    return this;
  }
  private java.sql.Timestamp LOAD_DTTM;
  public java.sql.Timestamp get_LOAD_DTTM() {
    return LOAD_DTTM;
  }
  public void set_LOAD_DTTM(java.sql.Timestamp LOAD_DTTM) {
    this.LOAD_DTTM = LOAD_DTTM;
  }
  public erl_subscribe_status with_LOAD_DTTM(java.sql.Timestamp LOAD_DTTM) {
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
  public erl_subscribe_status with_LOAD_BY(String LOAD_BY) {
    this.LOAD_BY = LOAD_BY;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof erl_subscribe_status)) {
      return false;
    }
    erl_subscribe_status that = (erl_subscribe_status) o;
    boolean equal = true;
    equal = equal && (this.CURR_SUBSCRIBE_STATUS_FLAG == null ? that.CURR_SUBSCRIBE_STATUS_FLAG == null : this.CURR_SUBSCRIBE_STATUS_FLAG.equals(that.CURR_SUBSCRIBE_STATUS_FLAG));
    equal = equal && (this.EMAIL_DW_ID == null ? that.EMAIL_DW_ID == null : this.EMAIL_DW_ID.equals(that.EMAIL_DW_ID));
    equal = equal && (this.ERL_BU_DW_ID == null ? that.ERL_BU_DW_ID == null : this.ERL_BU_DW_ID.equals(that.ERL_BU_DW_ID));
    equal = equal && (this.ERL_STATUS_HIST_DW_ID == null ? that.ERL_STATUS_HIST_DW_ID == null : this.ERL_STATUS_HIST_DW_ID.equals(that.ERL_STATUS_HIST_DW_ID));
    equal = equal && (this.FILE_DTTM == null ? that.FILE_DTTM == null : this.FILE_DTTM.equals(that.FILE_DTTM));
    equal = equal && (this.HUB_CUST_ID == null ? that.HUB_CUST_ID == null : this.HUB_CUST_ID.equals(that.HUB_CUST_ID));
    equal = equal && (this.INSERT_DTTM == null ? that.INSERT_DTTM == null : this.INSERT_DTTM.equals(that.INSERT_DTTM));
    equal = equal && (this.LOAD_DW_ID == null ? that.LOAD_DW_ID == null : this.LOAD_DW_ID.equals(that.LOAD_DW_ID));
    equal = equal && (this.NEW_SUBSCRIBE_STATUS_DW_ID == null ? that.NEW_SUBSCRIBE_STATUS_DW_ID == null : this.NEW_SUBSCRIBE_STATUS_DW_ID.equals(that.NEW_SUBSCRIBE_STATUS_DW_ID));
    equal = equal && (this.OLD_SUBSCRIBE_STATUS_DW_ID == null ? that.OLD_SUBSCRIBE_STATUS_DW_ID == null : this.OLD_SUBSCRIBE_STATUS_DW_ID.equals(that.OLD_SUBSCRIBE_STATUS_DW_ID));
    equal = equal && (this.STATUS_DTTM == null ? that.STATUS_DTTM == null : this.STATUS_DTTM.equals(that.STATUS_DTTM));
    equal = equal && (this.UPDATE_DTTM == null ? that.UPDATE_DTTM == null : this.UPDATE_DTTM.equals(that.UPDATE_DTTM));
    equal = equal && (this.VERSION == null ? that.VERSION == null : this.VERSION.equals(that.VERSION));
    equal = equal && (this.LOAD_DTTM == null ? that.LOAD_DTTM == null : this.LOAD_DTTM.equals(that.LOAD_DTTM));
    equal = equal && (this.LOAD_BY == null ? that.LOAD_BY == null : this.LOAD_BY.equals(that.LOAD_BY));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof erl_subscribe_status)) {
      return false;
    }
    erl_subscribe_status that = (erl_subscribe_status) o;
    boolean equal = true;
    equal = equal && (this.CURR_SUBSCRIBE_STATUS_FLAG == null ? that.CURR_SUBSCRIBE_STATUS_FLAG == null : this.CURR_SUBSCRIBE_STATUS_FLAG.equals(that.CURR_SUBSCRIBE_STATUS_FLAG));
    equal = equal && (this.EMAIL_DW_ID == null ? that.EMAIL_DW_ID == null : this.EMAIL_DW_ID.equals(that.EMAIL_DW_ID));
    equal = equal && (this.ERL_BU_DW_ID == null ? that.ERL_BU_DW_ID == null : this.ERL_BU_DW_ID.equals(that.ERL_BU_DW_ID));
    equal = equal && (this.ERL_STATUS_HIST_DW_ID == null ? that.ERL_STATUS_HIST_DW_ID == null : this.ERL_STATUS_HIST_DW_ID.equals(that.ERL_STATUS_HIST_DW_ID));
    equal = equal && (this.FILE_DTTM == null ? that.FILE_DTTM == null : this.FILE_DTTM.equals(that.FILE_DTTM));
    equal = equal && (this.HUB_CUST_ID == null ? that.HUB_CUST_ID == null : this.HUB_CUST_ID.equals(that.HUB_CUST_ID));
    equal = equal && (this.INSERT_DTTM == null ? that.INSERT_DTTM == null : this.INSERT_DTTM.equals(that.INSERT_DTTM));
    equal = equal && (this.LOAD_DW_ID == null ? that.LOAD_DW_ID == null : this.LOAD_DW_ID.equals(that.LOAD_DW_ID));
    equal = equal && (this.NEW_SUBSCRIBE_STATUS_DW_ID == null ? that.NEW_SUBSCRIBE_STATUS_DW_ID == null : this.NEW_SUBSCRIBE_STATUS_DW_ID.equals(that.NEW_SUBSCRIBE_STATUS_DW_ID));
    equal = equal && (this.OLD_SUBSCRIBE_STATUS_DW_ID == null ? that.OLD_SUBSCRIBE_STATUS_DW_ID == null : this.OLD_SUBSCRIBE_STATUS_DW_ID.equals(that.OLD_SUBSCRIBE_STATUS_DW_ID));
    equal = equal && (this.STATUS_DTTM == null ? that.STATUS_DTTM == null : this.STATUS_DTTM.equals(that.STATUS_DTTM));
    equal = equal && (this.UPDATE_DTTM == null ? that.UPDATE_DTTM == null : this.UPDATE_DTTM.equals(that.UPDATE_DTTM));
    equal = equal && (this.VERSION == null ? that.VERSION == null : this.VERSION.equals(that.VERSION));
    equal = equal && (this.LOAD_DTTM == null ? that.LOAD_DTTM == null : this.LOAD_DTTM.equals(that.LOAD_DTTM));
    equal = equal && (this.LOAD_BY == null ? that.LOAD_BY == null : this.LOAD_BY.equals(that.LOAD_BY));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CURR_SUBSCRIBE_STATUS_FLAG = JdbcWritableBridge.readString(1, __dbResults);
    this.EMAIL_DW_ID = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.ERL_BU_DW_ID = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.ERL_STATUS_HIST_DW_ID = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.FILE_DTTM = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.HUB_CUST_ID = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.INSERT_DTTM = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.LOAD_DW_ID = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.NEW_SUBSCRIBE_STATUS_DW_ID = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.OLD_SUBSCRIBE_STATUS_DW_ID = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.STATUS_DTTM = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.UPDATE_DTTM = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.VERSION = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.LOAD_DTTM = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.LOAD_BY = JdbcWritableBridge.readString(15, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CURR_SUBSCRIBE_STATUS_FLAG = JdbcWritableBridge.readString(1, __dbResults);
    this.EMAIL_DW_ID = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.ERL_BU_DW_ID = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.ERL_STATUS_HIST_DW_ID = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.FILE_DTTM = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.HUB_CUST_ID = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.INSERT_DTTM = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.LOAD_DW_ID = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.NEW_SUBSCRIBE_STATUS_DW_ID = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.OLD_SUBSCRIBE_STATUS_DW_ID = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.STATUS_DTTM = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.UPDATE_DTTM = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.VERSION = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.LOAD_DTTM = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.LOAD_BY = JdbcWritableBridge.readString(15, __dbResults);
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
    JdbcWritableBridge.writeString(CURR_SUBSCRIBE_STATUS_FLAG, 1 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(EMAIL_DW_ID, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ERL_BU_DW_ID, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ERL_STATUS_HIST_DW_ID, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FILE_DTTM, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HUB_CUST_ID, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(INSERT_DTTM, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOAD_DW_ID, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_SUBSCRIBE_STATUS_DW_ID, 9 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(OLD_SUBSCRIBE_STATUS_DW_ID, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(STATUS_DTTM, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATE_DTTM, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VERSION, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOAD_DTTM, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_BY, 15 + __off, 12, __dbStmt);
    return 15;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CURR_SUBSCRIBE_STATUS_FLAG, 1 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(EMAIL_DW_ID, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ERL_BU_DW_ID, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ERL_STATUS_HIST_DW_ID, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FILE_DTTM, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HUB_CUST_ID, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(INSERT_DTTM, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOAD_DW_ID, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_SUBSCRIBE_STATUS_DW_ID, 9 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(OLD_SUBSCRIBE_STATUS_DW_ID, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(STATUS_DTTM, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATE_DTTM, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VERSION, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOAD_DTTM, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_BY, 15 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.CURR_SUBSCRIBE_STATUS_FLAG = null;
    } else {
    this.CURR_SUBSCRIBE_STATUS_FLAG = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EMAIL_DW_ID = null;
    } else {
    this.EMAIL_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ERL_BU_DW_ID = null;
    } else {
    this.ERL_BU_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ERL_STATUS_HIST_DW_ID = null;
    } else {
    this.ERL_STATUS_HIST_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FILE_DTTM = null;
    } else {
    this.FILE_DTTM = new Timestamp(__dataIn.readLong());
    this.FILE_DTTM.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.HUB_CUST_ID = null;
    } else {
    this.HUB_CUST_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INSERT_DTTM = null;
    } else {
    this.INSERT_DTTM = new Timestamp(__dataIn.readLong());
    this.INSERT_DTTM.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.LOAD_DW_ID = null;
    } else {
    this.LOAD_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NEW_SUBSCRIBE_STATUS_DW_ID = null;
    } else {
    this.NEW_SUBSCRIBE_STATUS_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OLD_SUBSCRIBE_STATUS_DW_ID = null;
    } else {
    this.OLD_SUBSCRIBE_STATUS_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.STATUS_DTTM = null;
    } else {
    this.STATUS_DTTM = new Timestamp(__dataIn.readLong());
    this.STATUS_DTTM.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.UPDATE_DTTM = null;
    } else {
    this.UPDATE_DTTM = new Timestamp(__dataIn.readLong());
    this.UPDATE_DTTM.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.VERSION = null;
    } else {
    this.VERSION = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.CURR_SUBSCRIBE_STATUS_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CURR_SUBSCRIBE_STATUS_FLAG);
    }
    if (null == this.EMAIL_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.EMAIL_DW_ID, __dataOut);
    }
    if (null == this.ERL_BU_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ERL_BU_DW_ID, __dataOut);
    }
    if (null == this.ERL_STATUS_HIST_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ERL_STATUS_HIST_DW_ID, __dataOut);
    }
    if (null == this.FILE_DTTM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FILE_DTTM.getTime());
    __dataOut.writeInt(this.FILE_DTTM.getNanos());
    }
    if (null == this.HUB_CUST_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HUB_CUST_ID, __dataOut);
    }
    if (null == this.INSERT_DTTM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.INSERT_DTTM.getTime());
    __dataOut.writeInt(this.INSERT_DTTM.getNanos());
    }
    if (null == this.LOAD_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOAD_DW_ID, __dataOut);
    }
    if (null == this.NEW_SUBSCRIBE_STATUS_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_SUBSCRIBE_STATUS_DW_ID, __dataOut);
    }
    if (null == this.OLD_SUBSCRIBE_STATUS_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OLD_SUBSCRIBE_STATUS_DW_ID, __dataOut);
    }
    if (null == this.STATUS_DTTM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.STATUS_DTTM.getTime());
    __dataOut.writeInt(this.STATUS_DTTM.getNanos());
    }
    if (null == this.UPDATE_DTTM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.UPDATE_DTTM.getTime());
    __dataOut.writeInt(this.UPDATE_DTTM.getNanos());
    }
    if (null == this.VERSION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VERSION, __dataOut);
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
    if (null == this.CURR_SUBSCRIBE_STATUS_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CURR_SUBSCRIBE_STATUS_FLAG);
    }
    if (null == this.EMAIL_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.EMAIL_DW_ID, __dataOut);
    }
    if (null == this.ERL_BU_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ERL_BU_DW_ID, __dataOut);
    }
    if (null == this.ERL_STATUS_HIST_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ERL_STATUS_HIST_DW_ID, __dataOut);
    }
    if (null == this.FILE_DTTM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FILE_DTTM.getTime());
    __dataOut.writeInt(this.FILE_DTTM.getNanos());
    }
    if (null == this.HUB_CUST_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HUB_CUST_ID, __dataOut);
    }
    if (null == this.INSERT_DTTM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.INSERT_DTTM.getTime());
    __dataOut.writeInt(this.INSERT_DTTM.getNanos());
    }
    if (null == this.LOAD_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOAD_DW_ID, __dataOut);
    }
    if (null == this.NEW_SUBSCRIBE_STATUS_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_SUBSCRIBE_STATUS_DW_ID, __dataOut);
    }
    if (null == this.OLD_SUBSCRIBE_STATUS_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OLD_SUBSCRIBE_STATUS_DW_ID, __dataOut);
    }
    if (null == this.STATUS_DTTM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.STATUS_DTTM.getTime());
    __dataOut.writeInt(this.STATUS_DTTM.getNanos());
    }
    if (null == this.UPDATE_DTTM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.UPDATE_DTTM.getTime());
    __dataOut.writeInt(this.UPDATE_DTTM.getNanos());
    }
    if (null == this.VERSION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VERSION, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(CURR_SUBSCRIBE_STATUS_FLAG==null?"\\N":CURR_SUBSCRIBE_STATUS_FLAG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EMAIL_DW_ID==null?"\\N":EMAIL_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ERL_BU_DW_ID==null?"\\N":ERL_BU_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ERL_STATUS_HIST_DW_ID==null?"\\N":ERL_STATUS_HIST_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FILE_DTTM==null?"\\N":"" + FILE_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HUB_CUST_ID==null?"\\N":HUB_CUST_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INSERT_DTTM==null?"\\N":"" + INSERT_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOAD_DW_ID==null?"\\N":LOAD_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_SUBSCRIBE_STATUS_DW_ID==null?"\\N":NEW_SUBSCRIBE_STATUS_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OLD_SUBSCRIBE_STATUS_DW_ID==null?"\\N":OLD_SUBSCRIBE_STATUS_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STATUS_DTTM==null?"\\N":"" + STATUS_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UPDATE_DTTM==null?"\\N":"" + UPDATE_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERSION==null?"\\N":VERSION.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(CURR_SUBSCRIBE_STATUS_FLAG==null?"\\N":CURR_SUBSCRIBE_STATUS_FLAG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EMAIL_DW_ID==null?"\\N":EMAIL_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ERL_BU_DW_ID==null?"\\N":ERL_BU_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ERL_STATUS_HIST_DW_ID==null?"\\N":ERL_STATUS_HIST_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FILE_DTTM==null?"\\N":"" + FILE_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HUB_CUST_ID==null?"\\N":HUB_CUST_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INSERT_DTTM==null?"\\N":"" + INSERT_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOAD_DW_ID==null?"\\N":LOAD_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_SUBSCRIBE_STATUS_DW_ID==null?"\\N":NEW_SUBSCRIBE_STATUS_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OLD_SUBSCRIBE_STATUS_DW_ID==null?"\\N":OLD_SUBSCRIBE_STATUS_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STATUS_DTTM==null?"\\N":"" + STATUS_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UPDATE_DTTM==null?"\\N":"" + UPDATE_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERSION==null?"\\N":VERSION.toPlainString(), delimiters));
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
    if (__cur_str.equals("null")) { this.CURR_SUBSCRIBE_STATUS_FLAG = null; } else {
      this.CURR_SUBSCRIBE_STATUS_FLAG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EMAIL_DW_ID = null; } else {
      this.EMAIL_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ERL_BU_DW_ID = null; } else {
      this.ERL_BU_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ERL_STATUS_HIST_DW_ID = null; } else {
      this.ERL_STATUS_HIST_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FILE_DTTM = null; } else {
      this.FILE_DTTM = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HUB_CUST_ID = null; } else {
      this.HUB_CUST_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.INSERT_DTTM = null; } else {
      this.INSERT_DTTM = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LOAD_DW_ID = null; } else {
      this.LOAD_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NEW_SUBSCRIBE_STATUS_DW_ID = null; } else {
      this.NEW_SUBSCRIBE_STATUS_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OLD_SUBSCRIBE_STATUS_DW_ID = null; } else {
      this.OLD_SUBSCRIBE_STATUS_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.STATUS_DTTM = null; } else {
      this.STATUS_DTTM = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UPDATE_DTTM = null; } else {
      this.UPDATE_DTTM = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VERSION = null; } else {
      this.VERSION = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.CURR_SUBSCRIBE_STATUS_FLAG = null; } else {
      this.CURR_SUBSCRIBE_STATUS_FLAG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EMAIL_DW_ID = null; } else {
      this.EMAIL_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ERL_BU_DW_ID = null; } else {
      this.ERL_BU_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ERL_STATUS_HIST_DW_ID = null; } else {
      this.ERL_STATUS_HIST_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FILE_DTTM = null; } else {
      this.FILE_DTTM = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HUB_CUST_ID = null; } else {
      this.HUB_CUST_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.INSERT_DTTM = null; } else {
      this.INSERT_DTTM = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LOAD_DW_ID = null; } else {
      this.LOAD_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NEW_SUBSCRIBE_STATUS_DW_ID = null; } else {
      this.NEW_SUBSCRIBE_STATUS_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OLD_SUBSCRIBE_STATUS_DW_ID = null; } else {
      this.OLD_SUBSCRIBE_STATUS_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.STATUS_DTTM = null; } else {
      this.STATUS_DTTM = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UPDATE_DTTM = null; } else {
      this.UPDATE_DTTM = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VERSION = null; } else {
      this.VERSION = new java.math.BigDecimal(__cur_str);
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
    erl_subscribe_status o = (erl_subscribe_status) super.clone();
    o.FILE_DTTM = (o.FILE_DTTM != null) ? (java.sql.Timestamp) o.FILE_DTTM.clone() : null;
    o.INSERT_DTTM = (o.INSERT_DTTM != null) ? (java.sql.Timestamp) o.INSERT_DTTM.clone() : null;
    o.STATUS_DTTM = (o.STATUS_DTTM != null) ? (java.sql.Timestamp) o.STATUS_DTTM.clone() : null;
    o.UPDATE_DTTM = (o.UPDATE_DTTM != null) ? (java.sql.Timestamp) o.UPDATE_DTTM.clone() : null;
    o.LOAD_DTTM = (o.LOAD_DTTM != null) ? (java.sql.Timestamp) o.LOAD_DTTM.clone() : null;
    return o;
  }

  public void clone0(erl_subscribe_status o) throws CloneNotSupportedException {
    o.FILE_DTTM = (o.FILE_DTTM != null) ? (java.sql.Timestamp) o.FILE_DTTM.clone() : null;
    o.INSERT_DTTM = (o.INSERT_DTTM != null) ? (java.sql.Timestamp) o.INSERT_DTTM.clone() : null;
    o.STATUS_DTTM = (o.STATUS_DTTM != null) ? (java.sql.Timestamp) o.STATUS_DTTM.clone() : null;
    o.UPDATE_DTTM = (o.UPDATE_DTTM != null) ? (java.sql.Timestamp) o.UPDATE_DTTM.clone() : null;
    o.LOAD_DTTM = (o.LOAD_DTTM != null) ? (java.sql.Timestamp) o.LOAD_DTTM.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("CURR_SUBSCRIBE_STATUS_FLAG", this.CURR_SUBSCRIBE_STATUS_FLAG);
    __sqoop$field_map.put("EMAIL_DW_ID", this.EMAIL_DW_ID);
    __sqoop$field_map.put("ERL_BU_DW_ID", this.ERL_BU_DW_ID);
    __sqoop$field_map.put("ERL_STATUS_HIST_DW_ID", this.ERL_STATUS_HIST_DW_ID);
    __sqoop$field_map.put("FILE_DTTM", this.FILE_DTTM);
    __sqoop$field_map.put("HUB_CUST_ID", this.HUB_CUST_ID);
    __sqoop$field_map.put("INSERT_DTTM", this.INSERT_DTTM);
    __sqoop$field_map.put("LOAD_DW_ID", this.LOAD_DW_ID);
    __sqoop$field_map.put("NEW_SUBSCRIBE_STATUS_DW_ID", this.NEW_SUBSCRIBE_STATUS_DW_ID);
    __sqoop$field_map.put("OLD_SUBSCRIBE_STATUS_DW_ID", this.OLD_SUBSCRIBE_STATUS_DW_ID);
    __sqoop$field_map.put("STATUS_DTTM", this.STATUS_DTTM);
    __sqoop$field_map.put("UPDATE_DTTM", this.UPDATE_DTTM);
    __sqoop$field_map.put("VERSION", this.VERSION);
    __sqoop$field_map.put("LOAD_DTTM", this.LOAD_DTTM);
    __sqoop$field_map.put("LOAD_BY", this.LOAD_BY);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CURR_SUBSCRIBE_STATUS_FLAG", this.CURR_SUBSCRIBE_STATUS_FLAG);
    __sqoop$field_map.put("EMAIL_DW_ID", this.EMAIL_DW_ID);
    __sqoop$field_map.put("ERL_BU_DW_ID", this.ERL_BU_DW_ID);
    __sqoop$field_map.put("ERL_STATUS_HIST_DW_ID", this.ERL_STATUS_HIST_DW_ID);
    __sqoop$field_map.put("FILE_DTTM", this.FILE_DTTM);
    __sqoop$field_map.put("HUB_CUST_ID", this.HUB_CUST_ID);
    __sqoop$field_map.put("INSERT_DTTM", this.INSERT_DTTM);
    __sqoop$field_map.put("LOAD_DW_ID", this.LOAD_DW_ID);
    __sqoop$field_map.put("NEW_SUBSCRIBE_STATUS_DW_ID", this.NEW_SUBSCRIBE_STATUS_DW_ID);
    __sqoop$field_map.put("OLD_SUBSCRIBE_STATUS_DW_ID", this.OLD_SUBSCRIBE_STATUS_DW_ID);
    __sqoop$field_map.put("STATUS_DTTM", this.STATUS_DTTM);
    __sqoop$field_map.put("UPDATE_DTTM", this.UPDATE_DTTM);
    __sqoop$field_map.put("VERSION", this.VERSION);
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
