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

public class dim_email extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Z_EMAIL_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Z_EMAIL_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("EMAIL_ADDR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EMAIL_ADDR = (String)value;
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
    setters.put("EMAIL_DOMAIN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EMAIL_DOMAIN = (String)value;
      }
    });
    setters.put("EMAIL_VALID_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EMAIL_VALID_FLAG = (java.math.BigDecimal)value;
      }
    });
    setters.put("EMAIL_HASH", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EMAIL_HASH = (String)value;
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
  public dim_email() {
    init0();
  }
  private java.math.BigDecimal Z_EMAIL_DW_ID;
  public java.math.BigDecimal get_Z_EMAIL_DW_ID() {
    return Z_EMAIL_DW_ID;
  }
  public void set_Z_EMAIL_DW_ID(java.math.BigDecimal Z_EMAIL_DW_ID) {
    this.Z_EMAIL_DW_ID = Z_EMAIL_DW_ID;
  }
  public dim_email with_Z_EMAIL_DW_ID(java.math.BigDecimal Z_EMAIL_DW_ID) {
    this.Z_EMAIL_DW_ID = Z_EMAIL_DW_ID;
    return this;
  }
  private String EMAIL_ADDR;
  public String get_EMAIL_ADDR() {
    return EMAIL_ADDR;
  }
  public void set_EMAIL_ADDR(String EMAIL_ADDR) {
    this.EMAIL_ADDR = EMAIL_ADDR;
  }
  public dim_email with_EMAIL_ADDR(String EMAIL_ADDR) {
    this.EMAIL_ADDR = EMAIL_ADDR;
    return this;
  }
  private java.sql.Timestamp INSERT_DTTM;
  public java.sql.Timestamp get_INSERT_DTTM() {
    return INSERT_DTTM;
  }
  public void set_INSERT_DTTM(java.sql.Timestamp INSERT_DTTM) {
    this.INSERT_DTTM = INSERT_DTTM;
  }
  public dim_email with_INSERT_DTTM(java.sql.Timestamp INSERT_DTTM) {
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
  public dim_email with_UPDATE_DTTM(java.sql.Timestamp UPDATE_DTTM) {
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
  public dim_email with_LOAD_DW_ID(java.math.BigDecimal LOAD_DW_ID) {
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
  public dim_email with_VERSION(java.math.BigDecimal VERSION) {
    this.VERSION = VERSION;
    return this;
  }
  private String EMAIL_DOMAIN;
  public String get_EMAIL_DOMAIN() {
    return EMAIL_DOMAIN;
  }
  public void set_EMAIL_DOMAIN(String EMAIL_DOMAIN) {
    this.EMAIL_DOMAIN = EMAIL_DOMAIN;
  }
  public dim_email with_EMAIL_DOMAIN(String EMAIL_DOMAIN) {
    this.EMAIL_DOMAIN = EMAIL_DOMAIN;
    return this;
  }
  private java.math.BigDecimal EMAIL_VALID_FLAG;
  public java.math.BigDecimal get_EMAIL_VALID_FLAG() {
    return EMAIL_VALID_FLAG;
  }
  public void set_EMAIL_VALID_FLAG(java.math.BigDecimal EMAIL_VALID_FLAG) {
    this.EMAIL_VALID_FLAG = EMAIL_VALID_FLAG;
  }
  public dim_email with_EMAIL_VALID_FLAG(java.math.BigDecimal EMAIL_VALID_FLAG) {
    this.EMAIL_VALID_FLAG = EMAIL_VALID_FLAG;
    return this;
  }
  private String EMAIL_HASH;
  public String get_EMAIL_HASH() {
    return EMAIL_HASH;
  }
  public void set_EMAIL_HASH(String EMAIL_HASH) {
    this.EMAIL_HASH = EMAIL_HASH;
  }
  public dim_email with_EMAIL_HASH(String EMAIL_HASH) {
    this.EMAIL_HASH = EMAIL_HASH;
    return this;
  }
  private java.sql.Timestamp LOAD_DTTM;
  public java.sql.Timestamp get_LOAD_DTTM() {
    return LOAD_DTTM;
  }
  public void set_LOAD_DTTM(java.sql.Timestamp LOAD_DTTM) {
    this.LOAD_DTTM = LOAD_DTTM;
  }
  public dim_email with_LOAD_DTTM(java.sql.Timestamp LOAD_DTTM) {
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
  public dim_email with_LOAD_BY(String LOAD_BY) {
    this.LOAD_BY = LOAD_BY;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_email)) {
      return false;
    }
    dim_email that = (dim_email) o;
    boolean equal = true;
    equal = equal && (this.Z_EMAIL_DW_ID == null ? that.Z_EMAIL_DW_ID == null : this.Z_EMAIL_DW_ID.equals(that.Z_EMAIL_DW_ID));
    equal = equal && (this.EMAIL_ADDR == null ? that.EMAIL_ADDR == null : this.EMAIL_ADDR.equals(that.EMAIL_ADDR));
    equal = equal && (this.INSERT_DTTM == null ? that.INSERT_DTTM == null : this.INSERT_DTTM.equals(that.INSERT_DTTM));
    equal = equal && (this.UPDATE_DTTM == null ? that.UPDATE_DTTM == null : this.UPDATE_DTTM.equals(that.UPDATE_DTTM));
    equal = equal && (this.LOAD_DW_ID == null ? that.LOAD_DW_ID == null : this.LOAD_DW_ID.equals(that.LOAD_DW_ID));
    equal = equal && (this.VERSION == null ? that.VERSION == null : this.VERSION.equals(that.VERSION));
    equal = equal && (this.EMAIL_DOMAIN == null ? that.EMAIL_DOMAIN == null : this.EMAIL_DOMAIN.equals(that.EMAIL_DOMAIN));
    equal = equal && (this.EMAIL_VALID_FLAG == null ? that.EMAIL_VALID_FLAG == null : this.EMAIL_VALID_FLAG.equals(that.EMAIL_VALID_FLAG));
    equal = equal && (this.EMAIL_HASH == null ? that.EMAIL_HASH == null : this.EMAIL_HASH.equals(that.EMAIL_HASH));
    equal = equal && (this.LOAD_DTTM == null ? that.LOAD_DTTM == null : this.LOAD_DTTM.equals(that.LOAD_DTTM));
    equal = equal && (this.LOAD_BY == null ? that.LOAD_BY == null : this.LOAD_BY.equals(that.LOAD_BY));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_email)) {
      return false;
    }
    dim_email that = (dim_email) o;
    boolean equal = true;
    equal = equal && (this.Z_EMAIL_DW_ID == null ? that.Z_EMAIL_DW_ID == null : this.Z_EMAIL_DW_ID.equals(that.Z_EMAIL_DW_ID));
    equal = equal && (this.EMAIL_ADDR == null ? that.EMAIL_ADDR == null : this.EMAIL_ADDR.equals(that.EMAIL_ADDR));
    equal = equal && (this.INSERT_DTTM == null ? that.INSERT_DTTM == null : this.INSERT_DTTM.equals(that.INSERT_DTTM));
    equal = equal && (this.UPDATE_DTTM == null ? that.UPDATE_DTTM == null : this.UPDATE_DTTM.equals(that.UPDATE_DTTM));
    equal = equal && (this.LOAD_DW_ID == null ? that.LOAD_DW_ID == null : this.LOAD_DW_ID.equals(that.LOAD_DW_ID));
    equal = equal && (this.VERSION == null ? that.VERSION == null : this.VERSION.equals(that.VERSION));
    equal = equal && (this.EMAIL_DOMAIN == null ? that.EMAIL_DOMAIN == null : this.EMAIL_DOMAIN.equals(that.EMAIL_DOMAIN));
    equal = equal && (this.EMAIL_VALID_FLAG == null ? that.EMAIL_VALID_FLAG == null : this.EMAIL_VALID_FLAG.equals(that.EMAIL_VALID_FLAG));
    equal = equal && (this.EMAIL_HASH == null ? that.EMAIL_HASH == null : this.EMAIL_HASH.equals(that.EMAIL_HASH));
    equal = equal && (this.LOAD_DTTM == null ? that.LOAD_DTTM == null : this.LOAD_DTTM.equals(that.LOAD_DTTM));
    equal = equal && (this.LOAD_BY == null ? that.LOAD_BY == null : this.LOAD_BY.equals(that.LOAD_BY));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Z_EMAIL_DW_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.EMAIL_ADDR = JdbcWritableBridge.readString(2, __dbResults);
    this.INSERT_DTTM = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.UPDATE_DTTM = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.LOAD_DW_ID = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.VERSION = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.EMAIL_DOMAIN = JdbcWritableBridge.readString(7, __dbResults);
    this.EMAIL_VALID_FLAG = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.EMAIL_HASH = JdbcWritableBridge.readString(9, __dbResults);
    this.LOAD_DTTM = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.LOAD_BY = JdbcWritableBridge.readString(11, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Z_EMAIL_DW_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.EMAIL_ADDR = JdbcWritableBridge.readString(2, __dbResults);
    this.INSERT_DTTM = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.UPDATE_DTTM = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.LOAD_DW_ID = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.VERSION = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.EMAIL_DOMAIN = JdbcWritableBridge.readString(7, __dbResults);
    this.EMAIL_VALID_FLAG = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.EMAIL_HASH = JdbcWritableBridge.readString(9, __dbResults);
    this.LOAD_DTTM = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.LOAD_BY = JdbcWritableBridge.readString(11, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(Z_EMAIL_DW_ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(EMAIL_ADDR, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(INSERT_DTTM, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATE_DTTM, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOAD_DW_ID, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VERSION, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(EMAIL_DOMAIN, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(EMAIL_VALID_FLAG, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(EMAIL_HASH, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOAD_DTTM, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_BY, 11 + __off, 12, __dbStmt);
    return 11;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(Z_EMAIL_DW_ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(EMAIL_ADDR, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(INSERT_DTTM, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATE_DTTM, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOAD_DW_ID, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VERSION, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(EMAIL_DOMAIN, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(EMAIL_VALID_FLAG, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(EMAIL_HASH, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOAD_DTTM, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_BY, 11 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.Z_EMAIL_DW_ID = null;
    } else {
    this.Z_EMAIL_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EMAIL_ADDR = null;
    } else {
    this.EMAIL_ADDR = Text.readString(__dataIn);
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
        this.EMAIL_DOMAIN = null;
    } else {
    this.EMAIL_DOMAIN = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EMAIL_VALID_FLAG = null;
    } else {
    this.EMAIL_VALID_FLAG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EMAIL_HASH = null;
    } else {
    this.EMAIL_HASH = Text.readString(__dataIn);
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
    if (null == this.Z_EMAIL_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Z_EMAIL_DW_ID, __dataOut);
    }
    if (null == this.EMAIL_ADDR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EMAIL_ADDR);
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
    if (null == this.EMAIL_DOMAIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EMAIL_DOMAIN);
    }
    if (null == this.EMAIL_VALID_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.EMAIL_VALID_FLAG, __dataOut);
    }
    if (null == this.EMAIL_HASH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EMAIL_HASH);
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
    if (null == this.Z_EMAIL_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Z_EMAIL_DW_ID, __dataOut);
    }
    if (null == this.EMAIL_ADDR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EMAIL_ADDR);
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
    if (null == this.EMAIL_DOMAIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EMAIL_DOMAIN);
    }
    if (null == this.EMAIL_VALID_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.EMAIL_VALID_FLAG, __dataOut);
    }
    if (null == this.EMAIL_HASH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EMAIL_HASH);
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
    __sb.append(FieldFormatter.escapeAndEnclose(Z_EMAIL_DW_ID==null?"\\N":Z_EMAIL_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(EMAIL_ADDR==null?"\\N":EMAIL_ADDR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INSERT_DTTM==null?"\\N":"" + INSERT_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UPDATE_DTTM==null?"\\N":"" + UPDATE_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOAD_DW_ID==null?"\\N":LOAD_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERSION==null?"\\N":VERSION.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(EMAIL_DOMAIN==null?"\\N":EMAIL_DOMAIN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EMAIL_VALID_FLAG==null?"\\N":EMAIL_VALID_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(EMAIL_HASH==null?"\\N":EMAIL_HASH, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(Z_EMAIL_DW_ID==null?"\\N":Z_EMAIL_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(EMAIL_ADDR==null?"\\N":EMAIL_ADDR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INSERT_DTTM==null?"\\N":"" + INSERT_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UPDATE_DTTM==null?"\\N":"" + UPDATE_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOAD_DW_ID==null?"\\N":LOAD_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERSION==null?"\\N":VERSION.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(EMAIL_DOMAIN==null?"\\N":EMAIL_DOMAIN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EMAIL_VALID_FLAG==null?"\\N":EMAIL_VALID_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(EMAIL_HASH==null?"\\N":EMAIL_HASH, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Z_EMAIL_DW_ID = null; } else {
      this.Z_EMAIL_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EMAIL_ADDR = null; } else {
      this.EMAIL_ADDR = __cur_str;
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
    if (__cur_str.equals("null")) { this.EMAIL_DOMAIN = null; } else {
      this.EMAIL_DOMAIN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EMAIL_VALID_FLAG = null; } else {
      this.EMAIL_VALID_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EMAIL_HASH = null; } else {
      this.EMAIL_HASH = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Z_EMAIL_DW_ID = null; } else {
      this.Z_EMAIL_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EMAIL_ADDR = null; } else {
      this.EMAIL_ADDR = __cur_str;
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
    if (__cur_str.equals("null")) { this.EMAIL_DOMAIN = null; } else {
      this.EMAIL_DOMAIN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EMAIL_VALID_FLAG = null; } else {
      this.EMAIL_VALID_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EMAIL_HASH = null; } else {
      this.EMAIL_HASH = __cur_str;
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
    dim_email o = (dim_email) super.clone();
    o.INSERT_DTTM = (o.INSERT_DTTM != null) ? (java.sql.Timestamp) o.INSERT_DTTM.clone() : null;
    o.UPDATE_DTTM = (o.UPDATE_DTTM != null) ? (java.sql.Timestamp) o.UPDATE_DTTM.clone() : null;
    o.LOAD_DTTM = (o.LOAD_DTTM != null) ? (java.sql.Timestamp) o.LOAD_DTTM.clone() : null;
    return o;
  }

  public void clone0(dim_email o) throws CloneNotSupportedException {
    o.INSERT_DTTM = (o.INSERT_DTTM != null) ? (java.sql.Timestamp) o.INSERT_DTTM.clone() : null;
    o.UPDATE_DTTM = (o.UPDATE_DTTM != null) ? (java.sql.Timestamp) o.UPDATE_DTTM.clone() : null;
    o.LOAD_DTTM = (o.LOAD_DTTM != null) ? (java.sql.Timestamp) o.LOAD_DTTM.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Z_EMAIL_DW_ID", this.Z_EMAIL_DW_ID);
    __sqoop$field_map.put("EMAIL_ADDR", this.EMAIL_ADDR);
    __sqoop$field_map.put("INSERT_DTTM", this.INSERT_DTTM);
    __sqoop$field_map.put("UPDATE_DTTM", this.UPDATE_DTTM);
    __sqoop$field_map.put("LOAD_DW_ID", this.LOAD_DW_ID);
    __sqoop$field_map.put("VERSION", this.VERSION);
    __sqoop$field_map.put("EMAIL_DOMAIN", this.EMAIL_DOMAIN);
    __sqoop$field_map.put("EMAIL_VALID_FLAG", this.EMAIL_VALID_FLAG);
    __sqoop$field_map.put("EMAIL_HASH", this.EMAIL_HASH);
    __sqoop$field_map.put("LOAD_DTTM", this.LOAD_DTTM);
    __sqoop$field_map.put("LOAD_BY", this.LOAD_BY);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Z_EMAIL_DW_ID", this.Z_EMAIL_DW_ID);
    __sqoop$field_map.put("EMAIL_ADDR", this.EMAIL_ADDR);
    __sqoop$field_map.put("INSERT_DTTM", this.INSERT_DTTM);
    __sqoop$field_map.put("UPDATE_DTTM", this.UPDATE_DTTM);
    __sqoop$field_map.put("LOAD_DW_ID", this.LOAD_DW_ID);
    __sqoop$field_map.put("VERSION", this.VERSION);
    __sqoop$field_map.put("EMAIL_DOMAIN", this.EMAIL_DOMAIN);
    __sqoop$field_map.put("EMAIL_VALID_FLAG", this.EMAIL_VALID_FLAG);
    __sqoop$field_map.put("EMAIL_HASH", this.EMAIL_HASH);
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
