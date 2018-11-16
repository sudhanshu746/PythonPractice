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

public class dim_std_line_item extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Z_STD_LINE_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Z_STD_LINE_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("LINE_ITEM_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LINE_ITEM_CODE = (java.math.BigDecimal)value;
      }
    });
    setters.put("LINE_ITEM_TYPE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LINE_ITEM_TYPE = (String)value;
      }
    });
    setters.put("SHORT_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SHORT_DESC = (String)value;
      }
    });
    setters.put("LONG_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LONG_DESC = (String)value;
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
    setters.put("PRODUCT_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PRODUCT_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("IS_MY_PANERA_DISCOUNT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        IS_MY_PANERA_DISCOUNT = (java.math.BigDecimal)value;
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
  public dim_std_line_item() {
    init0();
  }
  private java.math.BigDecimal Z_STD_LINE_DW_ID;
  public java.math.BigDecimal get_Z_STD_LINE_DW_ID() {
    return Z_STD_LINE_DW_ID;
  }
  public void set_Z_STD_LINE_DW_ID(java.math.BigDecimal Z_STD_LINE_DW_ID) {
    this.Z_STD_LINE_DW_ID = Z_STD_LINE_DW_ID;
  }
  public dim_std_line_item with_Z_STD_LINE_DW_ID(java.math.BigDecimal Z_STD_LINE_DW_ID) {
    this.Z_STD_LINE_DW_ID = Z_STD_LINE_DW_ID;
    return this;
  }
  private java.math.BigDecimal LINE_ITEM_CODE;
  public java.math.BigDecimal get_LINE_ITEM_CODE() {
    return LINE_ITEM_CODE;
  }
  public void set_LINE_ITEM_CODE(java.math.BigDecimal LINE_ITEM_CODE) {
    this.LINE_ITEM_CODE = LINE_ITEM_CODE;
  }
  public dim_std_line_item with_LINE_ITEM_CODE(java.math.BigDecimal LINE_ITEM_CODE) {
    this.LINE_ITEM_CODE = LINE_ITEM_CODE;
    return this;
  }
  private String LINE_ITEM_TYPE;
  public String get_LINE_ITEM_TYPE() {
    return LINE_ITEM_TYPE;
  }
  public void set_LINE_ITEM_TYPE(String LINE_ITEM_TYPE) {
    this.LINE_ITEM_TYPE = LINE_ITEM_TYPE;
  }
  public dim_std_line_item with_LINE_ITEM_TYPE(String LINE_ITEM_TYPE) {
    this.LINE_ITEM_TYPE = LINE_ITEM_TYPE;
    return this;
  }
  private String SHORT_DESC;
  public String get_SHORT_DESC() {
    return SHORT_DESC;
  }
  public void set_SHORT_DESC(String SHORT_DESC) {
    this.SHORT_DESC = SHORT_DESC;
  }
  public dim_std_line_item with_SHORT_DESC(String SHORT_DESC) {
    this.SHORT_DESC = SHORT_DESC;
    return this;
  }
  private String LONG_DESC;
  public String get_LONG_DESC() {
    return LONG_DESC;
  }
  public void set_LONG_DESC(String LONG_DESC) {
    this.LONG_DESC = LONG_DESC;
  }
  public dim_std_line_item with_LONG_DESC(String LONG_DESC) {
    this.LONG_DESC = LONG_DESC;
    return this;
  }
  private java.sql.Timestamp FILE_DTTM;
  public java.sql.Timestamp get_FILE_DTTM() {
    return FILE_DTTM;
  }
  public void set_FILE_DTTM(java.sql.Timestamp FILE_DTTM) {
    this.FILE_DTTM = FILE_DTTM;
  }
  public dim_std_line_item with_FILE_DTTM(java.sql.Timestamp FILE_DTTM) {
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
  public dim_std_line_item with_INSERT_DTTM(java.sql.Timestamp INSERT_DTTM) {
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
  public dim_std_line_item with_UPDATE_DTTM(java.sql.Timestamp UPDATE_DTTM) {
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
  public dim_std_line_item with_LOAD_DW_ID(java.math.BigDecimal LOAD_DW_ID) {
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
  public dim_std_line_item with_VERSION(java.math.BigDecimal VERSION) {
    this.VERSION = VERSION;
    return this;
  }
  private java.math.BigDecimal PRODUCT_DW_ID;
  public java.math.BigDecimal get_PRODUCT_DW_ID() {
    return PRODUCT_DW_ID;
  }
  public void set_PRODUCT_DW_ID(java.math.BigDecimal PRODUCT_DW_ID) {
    this.PRODUCT_DW_ID = PRODUCT_DW_ID;
  }
  public dim_std_line_item with_PRODUCT_DW_ID(java.math.BigDecimal PRODUCT_DW_ID) {
    this.PRODUCT_DW_ID = PRODUCT_DW_ID;
    return this;
  }
  private java.math.BigDecimal IS_MY_PANERA_DISCOUNT;
  public java.math.BigDecimal get_IS_MY_PANERA_DISCOUNT() {
    return IS_MY_PANERA_DISCOUNT;
  }
  public void set_IS_MY_PANERA_DISCOUNT(java.math.BigDecimal IS_MY_PANERA_DISCOUNT) {
    this.IS_MY_PANERA_DISCOUNT = IS_MY_PANERA_DISCOUNT;
  }
  public dim_std_line_item with_IS_MY_PANERA_DISCOUNT(java.math.BigDecimal IS_MY_PANERA_DISCOUNT) {
    this.IS_MY_PANERA_DISCOUNT = IS_MY_PANERA_DISCOUNT;
    return this;
  }
  private java.sql.Timestamp LOAD_DTTM;
  public java.sql.Timestamp get_LOAD_DTTM() {
    return LOAD_DTTM;
  }
  public void set_LOAD_DTTM(java.sql.Timestamp LOAD_DTTM) {
    this.LOAD_DTTM = LOAD_DTTM;
  }
  public dim_std_line_item with_LOAD_DTTM(java.sql.Timestamp LOAD_DTTM) {
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
  public dim_std_line_item with_LOAD_BY(String LOAD_BY) {
    this.LOAD_BY = LOAD_BY;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_std_line_item)) {
      return false;
    }
    dim_std_line_item that = (dim_std_line_item) o;
    boolean equal = true;
    equal = equal && (this.Z_STD_LINE_DW_ID == null ? that.Z_STD_LINE_DW_ID == null : this.Z_STD_LINE_DW_ID.equals(that.Z_STD_LINE_DW_ID));
    equal = equal && (this.LINE_ITEM_CODE == null ? that.LINE_ITEM_CODE == null : this.LINE_ITEM_CODE.equals(that.LINE_ITEM_CODE));
    equal = equal && (this.LINE_ITEM_TYPE == null ? that.LINE_ITEM_TYPE == null : this.LINE_ITEM_TYPE.equals(that.LINE_ITEM_TYPE));
    equal = equal && (this.SHORT_DESC == null ? that.SHORT_DESC == null : this.SHORT_DESC.equals(that.SHORT_DESC));
    equal = equal && (this.LONG_DESC == null ? that.LONG_DESC == null : this.LONG_DESC.equals(that.LONG_DESC));
    equal = equal && (this.FILE_DTTM == null ? that.FILE_DTTM == null : this.FILE_DTTM.equals(that.FILE_DTTM));
    equal = equal && (this.INSERT_DTTM == null ? that.INSERT_DTTM == null : this.INSERT_DTTM.equals(that.INSERT_DTTM));
    equal = equal && (this.UPDATE_DTTM == null ? that.UPDATE_DTTM == null : this.UPDATE_DTTM.equals(that.UPDATE_DTTM));
    equal = equal && (this.LOAD_DW_ID == null ? that.LOAD_DW_ID == null : this.LOAD_DW_ID.equals(that.LOAD_DW_ID));
    equal = equal && (this.VERSION == null ? that.VERSION == null : this.VERSION.equals(that.VERSION));
    equal = equal && (this.PRODUCT_DW_ID == null ? that.PRODUCT_DW_ID == null : this.PRODUCT_DW_ID.equals(that.PRODUCT_DW_ID));
    equal = equal && (this.IS_MY_PANERA_DISCOUNT == null ? that.IS_MY_PANERA_DISCOUNT == null : this.IS_MY_PANERA_DISCOUNT.equals(that.IS_MY_PANERA_DISCOUNT));
    equal = equal && (this.LOAD_DTTM == null ? that.LOAD_DTTM == null : this.LOAD_DTTM.equals(that.LOAD_DTTM));
    equal = equal && (this.LOAD_BY == null ? that.LOAD_BY == null : this.LOAD_BY.equals(that.LOAD_BY));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_std_line_item)) {
      return false;
    }
    dim_std_line_item that = (dim_std_line_item) o;
    boolean equal = true;
    equal = equal && (this.Z_STD_LINE_DW_ID == null ? that.Z_STD_LINE_DW_ID == null : this.Z_STD_LINE_DW_ID.equals(that.Z_STD_LINE_DW_ID));
    equal = equal && (this.LINE_ITEM_CODE == null ? that.LINE_ITEM_CODE == null : this.LINE_ITEM_CODE.equals(that.LINE_ITEM_CODE));
    equal = equal && (this.LINE_ITEM_TYPE == null ? that.LINE_ITEM_TYPE == null : this.LINE_ITEM_TYPE.equals(that.LINE_ITEM_TYPE));
    equal = equal && (this.SHORT_DESC == null ? that.SHORT_DESC == null : this.SHORT_DESC.equals(that.SHORT_DESC));
    equal = equal && (this.LONG_DESC == null ? that.LONG_DESC == null : this.LONG_DESC.equals(that.LONG_DESC));
    equal = equal && (this.FILE_DTTM == null ? that.FILE_DTTM == null : this.FILE_DTTM.equals(that.FILE_DTTM));
    equal = equal && (this.INSERT_DTTM == null ? that.INSERT_DTTM == null : this.INSERT_DTTM.equals(that.INSERT_DTTM));
    equal = equal && (this.UPDATE_DTTM == null ? that.UPDATE_DTTM == null : this.UPDATE_DTTM.equals(that.UPDATE_DTTM));
    equal = equal && (this.LOAD_DW_ID == null ? that.LOAD_DW_ID == null : this.LOAD_DW_ID.equals(that.LOAD_DW_ID));
    equal = equal && (this.VERSION == null ? that.VERSION == null : this.VERSION.equals(that.VERSION));
    equal = equal && (this.PRODUCT_DW_ID == null ? that.PRODUCT_DW_ID == null : this.PRODUCT_DW_ID.equals(that.PRODUCT_DW_ID));
    equal = equal && (this.IS_MY_PANERA_DISCOUNT == null ? that.IS_MY_PANERA_DISCOUNT == null : this.IS_MY_PANERA_DISCOUNT.equals(that.IS_MY_PANERA_DISCOUNT));
    equal = equal && (this.LOAD_DTTM == null ? that.LOAD_DTTM == null : this.LOAD_DTTM.equals(that.LOAD_DTTM));
    equal = equal && (this.LOAD_BY == null ? that.LOAD_BY == null : this.LOAD_BY.equals(that.LOAD_BY));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Z_STD_LINE_DW_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.LINE_ITEM_CODE = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.LINE_ITEM_TYPE = JdbcWritableBridge.readString(3, __dbResults);
    this.SHORT_DESC = JdbcWritableBridge.readString(4, __dbResults);
    this.LONG_DESC = JdbcWritableBridge.readString(5, __dbResults);
    this.FILE_DTTM = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.INSERT_DTTM = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.UPDATE_DTTM = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.LOAD_DW_ID = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.VERSION = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.PRODUCT_DW_ID = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.IS_MY_PANERA_DISCOUNT = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.LOAD_DTTM = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.LOAD_BY = JdbcWritableBridge.readString(14, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Z_STD_LINE_DW_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.LINE_ITEM_CODE = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.LINE_ITEM_TYPE = JdbcWritableBridge.readString(3, __dbResults);
    this.SHORT_DESC = JdbcWritableBridge.readString(4, __dbResults);
    this.LONG_DESC = JdbcWritableBridge.readString(5, __dbResults);
    this.FILE_DTTM = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.INSERT_DTTM = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.UPDATE_DTTM = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.LOAD_DW_ID = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.VERSION = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.PRODUCT_DW_ID = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.IS_MY_PANERA_DISCOUNT = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.LOAD_DTTM = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.LOAD_BY = JdbcWritableBridge.readString(14, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(Z_STD_LINE_DW_ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LINE_ITEM_CODE, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(LINE_ITEM_TYPE, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SHORT_DESC, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LONG_DESC, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FILE_DTTM, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(INSERT_DTTM, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATE_DTTM, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOAD_DW_ID, 9 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VERSION, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PRODUCT_DW_ID, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(IS_MY_PANERA_DISCOUNT, 12 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOAD_DTTM, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_BY, 14 + __off, 12, __dbStmt);
    return 14;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(Z_STD_LINE_DW_ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LINE_ITEM_CODE, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(LINE_ITEM_TYPE, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SHORT_DESC, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LONG_DESC, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FILE_DTTM, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(INSERT_DTTM, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATE_DTTM, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOAD_DW_ID, 9 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VERSION, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PRODUCT_DW_ID, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(IS_MY_PANERA_DISCOUNT, 12 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOAD_DTTM, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_BY, 14 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.Z_STD_LINE_DW_ID = null;
    } else {
    this.Z_STD_LINE_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LINE_ITEM_CODE = null;
    } else {
    this.LINE_ITEM_CODE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LINE_ITEM_TYPE = null;
    } else {
    this.LINE_ITEM_TYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SHORT_DESC = null;
    } else {
    this.SHORT_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LONG_DESC = null;
    } else {
    this.LONG_DESC = Text.readString(__dataIn);
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
        this.PRODUCT_DW_ID = null;
    } else {
    this.PRODUCT_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.IS_MY_PANERA_DISCOUNT = null;
    } else {
    this.IS_MY_PANERA_DISCOUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.Z_STD_LINE_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Z_STD_LINE_DW_ID, __dataOut);
    }
    if (null == this.LINE_ITEM_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LINE_ITEM_CODE, __dataOut);
    }
    if (null == this.LINE_ITEM_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LINE_ITEM_TYPE);
    }
    if (null == this.SHORT_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SHORT_DESC);
    }
    if (null == this.LONG_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LONG_DESC);
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
    if (null == this.PRODUCT_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PRODUCT_DW_ID, __dataOut);
    }
    if (null == this.IS_MY_PANERA_DISCOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.IS_MY_PANERA_DISCOUNT, __dataOut);
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
    if (null == this.Z_STD_LINE_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Z_STD_LINE_DW_ID, __dataOut);
    }
    if (null == this.LINE_ITEM_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LINE_ITEM_CODE, __dataOut);
    }
    if (null == this.LINE_ITEM_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LINE_ITEM_TYPE);
    }
    if (null == this.SHORT_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SHORT_DESC);
    }
    if (null == this.LONG_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LONG_DESC);
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
    if (null == this.PRODUCT_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PRODUCT_DW_ID, __dataOut);
    }
    if (null == this.IS_MY_PANERA_DISCOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.IS_MY_PANERA_DISCOUNT, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(Z_STD_LINE_DW_ID==null?"\\N":Z_STD_LINE_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LINE_ITEM_CODE==null?"\\N":LINE_ITEM_CODE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LINE_ITEM_TYPE==null?"\\N":LINE_ITEM_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SHORT_DESC==null?"\\N":SHORT_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LONG_DESC==null?"\\N":LONG_DESC, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(PRODUCT_DW_ID==null?"\\N":PRODUCT_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IS_MY_PANERA_DISCOUNT==null?"\\N":IS_MY_PANERA_DISCOUNT.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(Z_STD_LINE_DW_ID==null?"\\N":Z_STD_LINE_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LINE_ITEM_CODE==null?"\\N":LINE_ITEM_CODE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LINE_ITEM_TYPE==null?"\\N":LINE_ITEM_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SHORT_DESC==null?"\\N":SHORT_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LONG_DESC==null?"\\N":LONG_DESC, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(PRODUCT_DW_ID==null?"\\N":PRODUCT_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IS_MY_PANERA_DISCOUNT==null?"\\N":IS_MY_PANERA_DISCOUNT.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Z_STD_LINE_DW_ID = null; } else {
      this.Z_STD_LINE_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LINE_ITEM_CODE = null; } else {
      this.LINE_ITEM_CODE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LINE_ITEM_TYPE = null; } else {
      this.LINE_ITEM_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SHORT_DESC = null; } else {
      this.SHORT_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LONG_DESC = null; } else {
      this.LONG_DESC = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PRODUCT_DW_ID = null; } else {
      this.PRODUCT_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.IS_MY_PANERA_DISCOUNT = null; } else {
      this.IS_MY_PANERA_DISCOUNT = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Z_STD_LINE_DW_ID = null; } else {
      this.Z_STD_LINE_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LINE_ITEM_CODE = null; } else {
      this.LINE_ITEM_CODE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LINE_ITEM_TYPE = null; } else {
      this.LINE_ITEM_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SHORT_DESC = null; } else {
      this.SHORT_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LONG_DESC = null; } else {
      this.LONG_DESC = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PRODUCT_DW_ID = null; } else {
      this.PRODUCT_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.IS_MY_PANERA_DISCOUNT = null; } else {
      this.IS_MY_PANERA_DISCOUNT = new java.math.BigDecimal(__cur_str);
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
    dim_std_line_item o = (dim_std_line_item) super.clone();
    o.FILE_DTTM = (o.FILE_DTTM != null) ? (java.sql.Timestamp) o.FILE_DTTM.clone() : null;
    o.INSERT_DTTM = (o.INSERT_DTTM != null) ? (java.sql.Timestamp) o.INSERT_DTTM.clone() : null;
    o.UPDATE_DTTM = (o.UPDATE_DTTM != null) ? (java.sql.Timestamp) o.UPDATE_DTTM.clone() : null;
    o.LOAD_DTTM = (o.LOAD_DTTM != null) ? (java.sql.Timestamp) o.LOAD_DTTM.clone() : null;
    return o;
  }

  public void clone0(dim_std_line_item o) throws CloneNotSupportedException {
    o.FILE_DTTM = (o.FILE_DTTM != null) ? (java.sql.Timestamp) o.FILE_DTTM.clone() : null;
    o.INSERT_DTTM = (o.INSERT_DTTM != null) ? (java.sql.Timestamp) o.INSERT_DTTM.clone() : null;
    o.UPDATE_DTTM = (o.UPDATE_DTTM != null) ? (java.sql.Timestamp) o.UPDATE_DTTM.clone() : null;
    o.LOAD_DTTM = (o.LOAD_DTTM != null) ? (java.sql.Timestamp) o.LOAD_DTTM.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Z_STD_LINE_DW_ID", this.Z_STD_LINE_DW_ID);
    __sqoop$field_map.put("LINE_ITEM_CODE", this.LINE_ITEM_CODE);
    __sqoop$field_map.put("LINE_ITEM_TYPE", this.LINE_ITEM_TYPE);
    __sqoop$field_map.put("SHORT_DESC", this.SHORT_DESC);
    __sqoop$field_map.put("LONG_DESC", this.LONG_DESC);
    __sqoop$field_map.put("FILE_DTTM", this.FILE_DTTM);
    __sqoop$field_map.put("INSERT_DTTM", this.INSERT_DTTM);
    __sqoop$field_map.put("UPDATE_DTTM", this.UPDATE_DTTM);
    __sqoop$field_map.put("LOAD_DW_ID", this.LOAD_DW_ID);
    __sqoop$field_map.put("VERSION", this.VERSION);
    __sqoop$field_map.put("PRODUCT_DW_ID", this.PRODUCT_DW_ID);
    __sqoop$field_map.put("IS_MY_PANERA_DISCOUNT", this.IS_MY_PANERA_DISCOUNT);
    __sqoop$field_map.put("LOAD_DTTM", this.LOAD_DTTM);
    __sqoop$field_map.put("LOAD_BY", this.LOAD_BY);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Z_STD_LINE_DW_ID", this.Z_STD_LINE_DW_ID);
    __sqoop$field_map.put("LINE_ITEM_CODE", this.LINE_ITEM_CODE);
    __sqoop$field_map.put("LINE_ITEM_TYPE", this.LINE_ITEM_TYPE);
    __sqoop$field_map.put("SHORT_DESC", this.SHORT_DESC);
    __sqoop$field_map.put("LONG_DESC", this.LONG_DESC);
    __sqoop$field_map.put("FILE_DTTM", this.FILE_DTTM);
    __sqoop$field_map.put("INSERT_DTTM", this.INSERT_DTTM);
    __sqoop$field_map.put("UPDATE_DTTM", this.UPDATE_DTTM);
    __sqoop$field_map.put("LOAD_DW_ID", this.LOAD_DW_ID);
    __sqoop$field_map.put("VERSION", this.VERSION);
    __sqoop$field_map.put("PRODUCT_DW_ID", this.PRODUCT_DW_ID);
    __sqoop$field_map.put("IS_MY_PANERA_DISCOUNT", this.IS_MY_PANERA_DISCOUNT);
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
