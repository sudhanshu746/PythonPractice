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

public class dim_std_loy_line_item extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Z_STD_LOY_LINE_ITEM_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Z_STD_LOY_LINE_ITEM_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("WALLET_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WALLET_CODE = (java.math.BigDecimal)value;
      }
    });
    setters.put("VEND_PROV_DISC_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        VEND_PROV_DISC_CODE = (String)value;
      }
    });
    setters.put("WALLET_EXPIRATION_DATE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WALLET_EXPIRATION_DATE = (java.sql.Timestamp)value;
      }
    });
    setters.put("STD_LINE_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        STD_LINE_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("WALLET_TYPE_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WALLET_TYPE_DW_ID = (java.math.BigDecimal)value;
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
    setters.put("VEND_PROV_WALLET_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        VEND_PROV_WALLET_DESC = (String)value;
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
  public dim_std_loy_line_item() {
    init0();
  }
  private java.math.BigDecimal Z_STD_LOY_LINE_ITEM_DW_ID;
  public java.math.BigDecimal get_Z_STD_LOY_LINE_ITEM_DW_ID() {
    return Z_STD_LOY_LINE_ITEM_DW_ID;
  }
  public void set_Z_STD_LOY_LINE_ITEM_DW_ID(java.math.BigDecimal Z_STD_LOY_LINE_ITEM_DW_ID) {
    this.Z_STD_LOY_LINE_ITEM_DW_ID = Z_STD_LOY_LINE_ITEM_DW_ID;
  }
  public dim_std_loy_line_item with_Z_STD_LOY_LINE_ITEM_DW_ID(java.math.BigDecimal Z_STD_LOY_LINE_ITEM_DW_ID) {
    this.Z_STD_LOY_LINE_ITEM_DW_ID = Z_STD_LOY_LINE_ITEM_DW_ID;
    return this;
  }
  private java.math.BigDecimal WALLET_CODE;
  public java.math.BigDecimal get_WALLET_CODE() {
    return WALLET_CODE;
  }
  public void set_WALLET_CODE(java.math.BigDecimal WALLET_CODE) {
    this.WALLET_CODE = WALLET_CODE;
  }
  public dim_std_loy_line_item with_WALLET_CODE(java.math.BigDecimal WALLET_CODE) {
    this.WALLET_CODE = WALLET_CODE;
    return this;
  }
  private String VEND_PROV_DISC_CODE;
  public String get_VEND_PROV_DISC_CODE() {
    return VEND_PROV_DISC_CODE;
  }
  public void set_VEND_PROV_DISC_CODE(String VEND_PROV_DISC_CODE) {
    this.VEND_PROV_DISC_CODE = VEND_PROV_DISC_CODE;
  }
  public dim_std_loy_line_item with_VEND_PROV_DISC_CODE(String VEND_PROV_DISC_CODE) {
    this.VEND_PROV_DISC_CODE = VEND_PROV_DISC_CODE;
    return this;
  }
  private java.sql.Timestamp WALLET_EXPIRATION_DATE;
  public java.sql.Timestamp get_WALLET_EXPIRATION_DATE() {
    return WALLET_EXPIRATION_DATE;
  }
  public void set_WALLET_EXPIRATION_DATE(java.sql.Timestamp WALLET_EXPIRATION_DATE) {
    this.WALLET_EXPIRATION_DATE = WALLET_EXPIRATION_DATE;
  }
  public dim_std_loy_line_item with_WALLET_EXPIRATION_DATE(java.sql.Timestamp WALLET_EXPIRATION_DATE) {
    this.WALLET_EXPIRATION_DATE = WALLET_EXPIRATION_DATE;
    return this;
  }
  private java.math.BigDecimal STD_LINE_DW_ID;
  public java.math.BigDecimal get_STD_LINE_DW_ID() {
    return STD_LINE_DW_ID;
  }
  public void set_STD_LINE_DW_ID(java.math.BigDecimal STD_LINE_DW_ID) {
    this.STD_LINE_DW_ID = STD_LINE_DW_ID;
  }
  public dim_std_loy_line_item with_STD_LINE_DW_ID(java.math.BigDecimal STD_LINE_DW_ID) {
    this.STD_LINE_DW_ID = STD_LINE_DW_ID;
    return this;
  }
  private java.math.BigDecimal WALLET_TYPE_DW_ID;
  public java.math.BigDecimal get_WALLET_TYPE_DW_ID() {
    return WALLET_TYPE_DW_ID;
  }
  public void set_WALLET_TYPE_DW_ID(java.math.BigDecimal WALLET_TYPE_DW_ID) {
    this.WALLET_TYPE_DW_ID = WALLET_TYPE_DW_ID;
  }
  public dim_std_loy_line_item with_WALLET_TYPE_DW_ID(java.math.BigDecimal WALLET_TYPE_DW_ID) {
    this.WALLET_TYPE_DW_ID = WALLET_TYPE_DW_ID;
    return this;
  }
  private java.sql.Timestamp INSERT_DTTM;
  public java.sql.Timestamp get_INSERT_DTTM() {
    return INSERT_DTTM;
  }
  public void set_INSERT_DTTM(java.sql.Timestamp INSERT_DTTM) {
    this.INSERT_DTTM = INSERT_DTTM;
  }
  public dim_std_loy_line_item with_INSERT_DTTM(java.sql.Timestamp INSERT_DTTM) {
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
  public dim_std_loy_line_item with_UPDATE_DTTM(java.sql.Timestamp UPDATE_DTTM) {
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
  public dim_std_loy_line_item with_LOAD_DW_ID(java.math.BigDecimal LOAD_DW_ID) {
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
  public dim_std_loy_line_item with_VERSION(java.math.BigDecimal VERSION) {
    this.VERSION = VERSION;
    return this;
  }
  private String VEND_PROV_WALLET_DESC;
  public String get_VEND_PROV_WALLET_DESC() {
    return VEND_PROV_WALLET_DESC;
  }
  public void set_VEND_PROV_WALLET_DESC(String VEND_PROV_WALLET_DESC) {
    this.VEND_PROV_WALLET_DESC = VEND_PROV_WALLET_DESC;
  }
  public dim_std_loy_line_item with_VEND_PROV_WALLET_DESC(String VEND_PROV_WALLET_DESC) {
    this.VEND_PROV_WALLET_DESC = VEND_PROV_WALLET_DESC;
    return this;
  }
  private java.sql.Timestamp LOAD_DTTM;
  public java.sql.Timestamp get_LOAD_DTTM() {
    return LOAD_DTTM;
  }
  public void set_LOAD_DTTM(java.sql.Timestamp LOAD_DTTM) {
    this.LOAD_DTTM = LOAD_DTTM;
  }
  public dim_std_loy_line_item with_LOAD_DTTM(java.sql.Timestamp LOAD_DTTM) {
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
  public dim_std_loy_line_item with_LOAD_BY(String LOAD_BY) {
    this.LOAD_BY = LOAD_BY;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_std_loy_line_item)) {
      return false;
    }
    dim_std_loy_line_item that = (dim_std_loy_line_item) o;
    boolean equal = true;
    equal = equal && (this.Z_STD_LOY_LINE_ITEM_DW_ID == null ? that.Z_STD_LOY_LINE_ITEM_DW_ID == null : this.Z_STD_LOY_LINE_ITEM_DW_ID.equals(that.Z_STD_LOY_LINE_ITEM_DW_ID));
    equal = equal && (this.WALLET_CODE == null ? that.WALLET_CODE == null : this.WALLET_CODE.equals(that.WALLET_CODE));
    equal = equal && (this.VEND_PROV_DISC_CODE == null ? that.VEND_PROV_DISC_CODE == null : this.VEND_PROV_DISC_CODE.equals(that.VEND_PROV_DISC_CODE));
    equal = equal && (this.WALLET_EXPIRATION_DATE == null ? that.WALLET_EXPIRATION_DATE == null : this.WALLET_EXPIRATION_DATE.equals(that.WALLET_EXPIRATION_DATE));
    equal = equal && (this.STD_LINE_DW_ID == null ? that.STD_LINE_DW_ID == null : this.STD_LINE_DW_ID.equals(that.STD_LINE_DW_ID));
    equal = equal && (this.WALLET_TYPE_DW_ID == null ? that.WALLET_TYPE_DW_ID == null : this.WALLET_TYPE_DW_ID.equals(that.WALLET_TYPE_DW_ID));
    equal = equal && (this.INSERT_DTTM == null ? that.INSERT_DTTM == null : this.INSERT_DTTM.equals(that.INSERT_DTTM));
    equal = equal && (this.UPDATE_DTTM == null ? that.UPDATE_DTTM == null : this.UPDATE_DTTM.equals(that.UPDATE_DTTM));
    equal = equal && (this.LOAD_DW_ID == null ? that.LOAD_DW_ID == null : this.LOAD_DW_ID.equals(that.LOAD_DW_ID));
    equal = equal && (this.VERSION == null ? that.VERSION == null : this.VERSION.equals(that.VERSION));
    equal = equal && (this.VEND_PROV_WALLET_DESC == null ? that.VEND_PROV_WALLET_DESC == null : this.VEND_PROV_WALLET_DESC.equals(that.VEND_PROV_WALLET_DESC));
    equal = equal && (this.LOAD_DTTM == null ? that.LOAD_DTTM == null : this.LOAD_DTTM.equals(that.LOAD_DTTM));
    equal = equal && (this.LOAD_BY == null ? that.LOAD_BY == null : this.LOAD_BY.equals(that.LOAD_BY));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_std_loy_line_item)) {
      return false;
    }
    dim_std_loy_line_item that = (dim_std_loy_line_item) o;
    boolean equal = true;
    equal = equal && (this.Z_STD_LOY_LINE_ITEM_DW_ID == null ? that.Z_STD_LOY_LINE_ITEM_DW_ID == null : this.Z_STD_LOY_LINE_ITEM_DW_ID.equals(that.Z_STD_LOY_LINE_ITEM_DW_ID));
    equal = equal && (this.WALLET_CODE == null ? that.WALLET_CODE == null : this.WALLET_CODE.equals(that.WALLET_CODE));
    equal = equal && (this.VEND_PROV_DISC_CODE == null ? that.VEND_PROV_DISC_CODE == null : this.VEND_PROV_DISC_CODE.equals(that.VEND_PROV_DISC_CODE));
    equal = equal && (this.WALLET_EXPIRATION_DATE == null ? that.WALLET_EXPIRATION_DATE == null : this.WALLET_EXPIRATION_DATE.equals(that.WALLET_EXPIRATION_DATE));
    equal = equal && (this.STD_LINE_DW_ID == null ? that.STD_LINE_DW_ID == null : this.STD_LINE_DW_ID.equals(that.STD_LINE_DW_ID));
    equal = equal && (this.WALLET_TYPE_DW_ID == null ? that.WALLET_TYPE_DW_ID == null : this.WALLET_TYPE_DW_ID.equals(that.WALLET_TYPE_DW_ID));
    equal = equal && (this.INSERT_DTTM == null ? that.INSERT_DTTM == null : this.INSERT_DTTM.equals(that.INSERT_DTTM));
    equal = equal && (this.UPDATE_DTTM == null ? that.UPDATE_DTTM == null : this.UPDATE_DTTM.equals(that.UPDATE_DTTM));
    equal = equal && (this.LOAD_DW_ID == null ? that.LOAD_DW_ID == null : this.LOAD_DW_ID.equals(that.LOAD_DW_ID));
    equal = equal && (this.VERSION == null ? that.VERSION == null : this.VERSION.equals(that.VERSION));
    equal = equal && (this.VEND_PROV_WALLET_DESC == null ? that.VEND_PROV_WALLET_DESC == null : this.VEND_PROV_WALLET_DESC.equals(that.VEND_PROV_WALLET_DESC));
    equal = equal && (this.LOAD_DTTM == null ? that.LOAD_DTTM == null : this.LOAD_DTTM.equals(that.LOAD_DTTM));
    equal = equal && (this.LOAD_BY == null ? that.LOAD_BY == null : this.LOAD_BY.equals(that.LOAD_BY));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Z_STD_LOY_LINE_ITEM_DW_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.WALLET_CODE = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.VEND_PROV_DISC_CODE = JdbcWritableBridge.readString(3, __dbResults);
    this.WALLET_EXPIRATION_DATE = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.STD_LINE_DW_ID = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.WALLET_TYPE_DW_ID = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.INSERT_DTTM = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.UPDATE_DTTM = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.LOAD_DW_ID = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.VERSION = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.VEND_PROV_WALLET_DESC = JdbcWritableBridge.readString(11, __dbResults);
    this.LOAD_DTTM = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.LOAD_BY = JdbcWritableBridge.readString(13, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Z_STD_LOY_LINE_ITEM_DW_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.WALLET_CODE = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.VEND_PROV_DISC_CODE = JdbcWritableBridge.readString(3, __dbResults);
    this.WALLET_EXPIRATION_DATE = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.STD_LINE_DW_ID = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.WALLET_TYPE_DW_ID = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.INSERT_DTTM = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.UPDATE_DTTM = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.LOAD_DW_ID = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.VERSION = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.VEND_PROV_WALLET_DESC = JdbcWritableBridge.readString(11, __dbResults);
    this.LOAD_DTTM = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.LOAD_BY = JdbcWritableBridge.readString(13, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(Z_STD_LOY_LINE_ITEM_DW_ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WALLET_CODE, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(VEND_PROV_DISC_CODE, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(WALLET_EXPIRATION_DATE, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(STD_LINE_DW_ID, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WALLET_TYPE_DW_ID, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(INSERT_DTTM, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATE_DTTM, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOAD_DW_ID, 9 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VERSION, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(VEND_PROV_WALLET_DESC, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOAD_DTTM, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_BY, 13 + __off, 12, __dbStmt);
    return 13;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(Z_STD_LOY_LINE_ITEM_DW_ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WALLET_CODE, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(VEND_PROV_DISC_CODE, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(WALLET_EXPIRATION_DATE, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(STD_LINE_DW_ID, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WALLET_TYPE_DW_ID, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(INSERT_DTTM, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATE_DTTM, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOAD_DW_ID, 9 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VERSION, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(VEND_PROV_WALLET_DESC, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOAD_DTTM, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_BY, 13 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.Z_STD_LOY_LINE_ITEM_DW_ID = null;
    } else {
    this.Z_STD_LOY_LINE_ITEM_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WALLET_CODE = null;
    } else {
    this.WALLET_CODE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VEND_PROV_DISC_CODE = null;
    } else {
    this.VEND_PROV_DISC_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WALLET_EXPIRATION_DATE = null;
    } else {
    this.WALLET_EXPIRATION_DATE = new Timestamp(__dataIn.readLong());
    this.WALLET_EXPIRATION_DATE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.STD_LINE_DW_ID = null;
    } else {
    this.STD_LINE_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WALLET_TYPE_DW_ID = null;
    } else {
    this.WALLET_TYPE_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.VEND_PROV_WALLET_DESC = null;
    } else {
    this.VEND_PROV_WALLET_DESC = Text.readString(__dataIn);
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
    if (null == this.Z_STD_LOY_LINE_ITEM_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Z_STD_LOY_LINE_ITEM_DW_ID, __dataOut);
    }
    if (null == this.WALLET_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WALLET_CODE, __dataOut);
    }
    if (null == this.VEND_PROV_DISC_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VEND_PROV_DISC_CODE);
    }
    if (null == this.WALLET_EXPIRATION_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.WALLET_EXPIRATION_DATE.getTime());
    __dataOut.writeInt(this.WALLET_EXPIRATION_DATE.getNanos());
    }
    if (null == this.STD_LINE_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.STD_LINE_DW_ID, __dataOut);
    }
    if (null == this.WALLET_TYPE_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WALLET_TYPE_DW_ID, __dataOut);
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
    if (null == this.VEND_PROV_WALLET_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VEND_PROV_WALLET_DESC);
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
    if (null == this.Z_STD_LOY_LINE_ITEM_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Z_STD_LOY_LINE_ITEM_DW_ID, __dataOut);
    }
    if (null == this.WALLET_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WALLET_CODE, __dataOut);
    }
    if (null == this.VEND_PROV_DISC_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VEND_PROV_DISC_CODE);
    }
    if (null == this.WALLET_EXPIRATION_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.WALLET_EXPIRATION_DATE.getTime());
    __dataOut.writeInt(this.WALLET_EXPIRATION_DATE.getNanos());
    }
    if (null == this.STD_LINE_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.STD_LINE_DW_ID, __dataOut);
    }
    if (null == this.WALLET_TYPE_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WALLET_TYPE_DW_ID, __dataOut);
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
    if (null == this.VEND_PROV_WALLET_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VEND_PROV_WALLET_DESC);
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
    __sb.append(FieldFormatter.escapeAndEnclose(Z_STD_LOY_LINE_ITEM_DW_ID==null?"\\N":Z_STD_LOY_LINE_ITEM_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WALLET_CODE==null?"\\N":WALLET_CODE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VEND_PROV_DISC_CODE==null?"\\N":VEND_PROV_DISC_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WALLET_EXPIRATION_DATE==null?"\\N":"" + WALLET_EXPIRATION_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STD_LINE_DW_ID==null?"\\N":STD_LINE_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WALLET_TYPE_DW_ID==null?"\\N":WALLET_TYPE_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INSERT_DTTM==null?"\\N":"" + INSERT_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UPDATE_DTTM==null?"\\N":"" + UPDATE_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOAD_DW_ID==null?"\\N":LOAD_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERSION==null?"\\N":VERSION.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VEND_PROV_WALLET_DESC==null?"\\N":VEND_PROV_WALLET_DESC, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(Z_STD_LOY_LINE_ITEM_DW_ID==null?"\\N":Z_STD_LOY_LINE_ITEM_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WALLET_CODE==null?"\\N":WALLET_CODE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VEND_PROV_DISC_CODE==null?"\\N":VEND_PROV_DISC_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WALLET_EXPIRATION_DATE==null?"\\N":"" + WALLET_EXPIRATION_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STD_LINE_DW_ID==null?"\\N":STD_LINE_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WALLET_TYPE_DW_ID==null?"\\N":WALLET_TYPE_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INSERT_DTTM==null?"\\N":"" + INSERT_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UPDATE_DTTM==null?"\\N":"" + UPDATE_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOAD_DW_ID==null?"\\N":LOAD_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERSION==null?"\\N":VERSION.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VEND_PROV_WALLET_DESC==null?"\\N":VEND_PROV_WALLET_DESC, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Z_STD_LOY_LINE_ITEM_DW_ID = null; } else {
      this.Z_STD_LOY_LINE_ITEM_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WALLET_CODE = null; } else {
      this.WALLET_CODE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.VEND_PROV_DISC_CODE = null; } else {
      this.VEND_PROV_DISC_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WALLET_EXPIRATION_DATE = null; } else {
      this.WALLET_EXPIRATION_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.STD_LINE_DW_ID = null; } else {
      this.STD_LINE_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WALLET_TYPE_DW_ID = null; } else {
      this.WALLET_TYPE_DW_ID = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.VEND_PROV_WALLET_DESC = null; } else {
      this.VEND_PROV_WALLET_DESC = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Z_STD_LOY_LINE_ITEM_DW_ID = null; } else {
      this.Z_STD_LOY_LINE_ITEM_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WALLET_CODE = null; } else {
      this.WALLET_CODE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.VEND_PROV_DISC_CODE = null; } else {
      this.VEND_PROV_DISC_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WALLET_EXPIRATION_DATE = null; } else {
      this.WALLET_EXPIRATION_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.STD_LINE_DW_ID = null; } else {
      this.STD_LINE_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WALLET_TYPE_DW_ID = null; } else {
      this.WALLET_TYPE_DW_ID = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.VEND_PROV_WALLET_DESC = null; } else {
      this.VEND_PROV_WALLET_DESC = __cur_str;
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
    dim_std_loy_line_item o = (dim_std_loy_line_item) super.clone();
    o.WALLET_EXPIRATION_DATE = (o.WALLET_EXPIRATION_DATE != null) ? (java.sql.Timestamp) o.WALLET_EXPIRATION_DATE.clone() : null;
    o.INSERT_DTTM = (o.INSERT_DTTM != null) ? (java.sql.Timestamp) o.INSERT_DTTM.clone() : null;
    o.UPDATE_DTTM = (o.UPDATE_DTTM != null) ? (java.sql.Timestamp) o.UPDATE_DTTM.clone() : null;
    o.LOAD_DTTM = (o.LOAD_DTTM != null) ? (java.sql.Timestamp) o.LOAD_DTTM.clone() : null;
    return o;
  }

  public void clone0(dim_std_loy_line_item o) throws CloneNotSupportedException {
    o.WALLET_EXPIRATION_DATE = (o.WALLET_EXPIRATION_DATE != null) ? (java.sql.Timestamp) o.WALLET_EXPIRATION_DATE.clone() : null;
    o.INSERT_DTTM = (o.INSERT_DTTM != null) ? (java.sql.Timestamp) o.INSERT_DTTM.clone() : null;
    o.UPDATE_DTTM = (o.UPDATE_DTTM != null) ? (java.sql.Timestamp) o.UPDATE_DTTM.clone() : null;
    o.LOAD_DTTM = (o.LOAD_DTTM != null) ? (java.sql.Timestamp) o.LOAD_DTTM.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Z_STD_LOY_LINE_ITEM_DW_ID", this.Z_STD_LOY_LINE_ITEM_DW_ID);
    __sqoop$field_map.put("WALLET_CODE", this.WALLET_CODE);
    __sqoop$field_map.put("VEND_PROV_DISC_CODE", this.VEND_PROV_DISC_CODE);
    __sqoop$field_map.put("WALLET_EXPIRATION_DATE", this.WALLET_EXPIRATION_DATE);
    __sqoop$field_map.put("STD_LINE_DW_ID", this.STD_LINE_DW_ID);
    __sqoop$field_map.put("WALLET_TYPE_DW_ID", this.WALLET_TYPE_DW_ID);
    __sqoop$field_map.put("INSERT_DTTM", this.INSERT_DTTM);
    __sqoop$field_map.put("UPDATE_DTTM", this.UPDATE_DTTM);
    __sqoop$field_map.put("LOAD_DW_ID", this.LOAD_DW_ID);
    __sqoop$field_map.put("VERSION", this.VERSION);
    __sqoop$field_map.put("VEND_PROV_WALLET_DESC", this.VEND_PROV_WALLET_DESC);
    __sqoop$field_map.put("LOAD_DTTM", this.LOAD_DTTM);
    __sqoop$field_map.put("LOAD_BY", this.LOAD_BY);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Z_STD_LOY_LINE_ITEM_DW_ID", this.Z_STD_LOY_LINE_ITEM_DW_ID);
    __sqoop$field_map.put("WALLET_CODE", this.WALLET_CODE);
    __sqoop$field_map.put("VEND_PROV_DISC_CODE", this.VEND_PROV_DISC_CODE);
    __sqoop$field_map.put("WALLET_EXPIRATION_DATE", this.WALLET_EXPIRATION_DATE);
    __sqoop$field_map.put("STD_LINE_DW_ID", this.STD_LINE_DW_ID);
    __sqoop$field_map.put("WALLET_TYPE_DW_ID", this.WALLET_TYPE_DW_ID);
    __sqoop$field_map.put("INSERT_DTTM", this.INSERT_DTTM);
    __sqoop$field_map.put("UPDATE_DTTM", this.UPDATE_DTTM);
    __sqoop$field_map.put("LOAD_DW_ID", this.LOAD_DW_ID);
    __sqoop$field_map.put("VERSION", this.VERSION);
    __sqoop$field_map.put("VEND_PROV_WALLET_DESC", this.VEND_PROV_WALLET_DESC);
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
