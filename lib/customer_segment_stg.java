// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 29 17:02:14 GMT 2017
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

public class customer_segment_stg extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Z_LOY_CUST_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Z_LOY_CUST_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("HUB_CUST_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HUB_CUST_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("CONTACT_DTTM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CONTACT_DTTM = (java.sql.Timestamp)value;
      }
    });
    setters.put("CAMPAIGN_CD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CAMPAIGN_CD = (String)value;
      }
    });
    setters.put("MARKETING_CELL_CD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MARKETING_CELL_CD = (String)value;
      }
    });
    setters.put("MARKETING_CELL_NM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MARKETING_CELL_NM = (String)value;
      }
    });
    setters.put("EMAIL_MARKETABLE_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EMAIL_MARKETABLE_FLAG = (java.math.BigDecimal)value;
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
  public customer_segment_stg() {
    init0();
  }
  private java.math.BigDecimal Z_LOY_CUST_DW_ID;
  public java.math.BigDecimal get_Z_LOY_CUST_DW_ID() {
    return Z_LOY_CUST_DW_ID;
  }
  public void set_Z_LOY_CUST_DW_ID(java.math.BigDecimal Z_LOY_CUST_DW_ID) {
    this.Z_LOY_CUST_DW_ID = Z_LOY_CUST_DW_ID;
  }
  public customer_segment_stg with_Z_LOY_CUST_DW_ID(java.math.BigDecimal Z_LOY_CUST_DW_ID) {
    this.Z_LOY_CUST_DW_ID = Z_LOY_CUST_DW_ID;
    return this;
  }
  private java.math.BigDecimal HUB_CUST_ID;
  public java.math.BigDecimal get_HUB_CUST_ID() {
    return HUB_CUST_ID;
  }
  public void set_HUB_CUST_ID(java.math.BigDecimal HUB_CUST_ID) {
    this.HUB_CUST_ID = HUB_CUST_ID;
  }
  public customer_segment_stg with_HUB_CUST_ID(java.math.BigDecimal HUB_CUST_ID) {
    this.HUB_CUST_ID = HUB_CUST_ID;
    return this;
  }
  private java.sql.Timestamp CONTACT_DTTM;
  public java.sql.Timestamp get_CONTACT_DTTM() {
    return CONTACT_DTTM;
  }
  public void set_CONTACT_DTTM(java.sql.Timestamp CONTACT_DTTM) {
    this.CONTACT_DTTM = CONTACT_DTTM;
  }
  public customer_segment_stg with_CONTACT_DTTM(java.sql.Timestamp CONTACT_DTTM) {
    this.CONTACT_DTTM = CONTACT_DTTM;
    return this;
  }
  private String CAMPAIGN_CD;
  public String get_CAMPAIGN_CD() {
    return CAMPAIGN_CD;
  }
  public void set_CAMPAIGN_CD(String CAMPAIGN_CD) {
    this.CAMPAIGN_CD = CAMPAIGN_CD;
  }
  public customer_segment_stg with_CAMPAIGN_CD(String CAMPAIGN_CD) {
    this.CAMPAIGN_CD = CAMPAIGN_CD;
    return this;
  }
  private String MARKETING_CELL_CD;
  public String get_MARKETING_CELL_CD() {
    return MARKETING_CELL_CD;
  }
  public void set_MARKETING_CELL_CD(String MARKETING_CELL_CD) {
    this.MARKETING_CELL_CD = MARKETING_CELL_CD;
  }
  public customer_segment_stg with_MARKETING_CELL_CD(String MARKETING_CELL_CD) {
    this.MARKETING_CELL_CD = MARKETING_CELL_CD;
    return this;
  }
  private String MARKETING_CELL_NM;
  public String get_MARKETING_CELL_NM() {
    return MARKETING_CELL_NM;
  }
  public void set_MARKETING_CELL_NM(String MARKETING_CELL_NM) {
    this.MARKETING_CELL_NM = MARKETING_CELL_NM;
  }
  public customer_segment_stg with_MARKETING_CELL_NM(String MARKETING_CELL_NM) {
    this.MARKETING_CELL_NM = MARKETING_CELL_NM;
    return this;
  }
  private java.math.BigDecimal EMAIL_MARKETABLE_FLAG;
  public java.math.BigDecimal get_EMAIL_MARKETABLE_FLAG() {
    return EMAIL_MARKETABLE_FLAG;
  }
  public void set_EMAIL_MARKETABLE_FLAG(java.math.BigDecimal EMAIL_MARKETABLE_FLAG) {
    this.EMAIL_MARKETABLE_FLAG = EMAIL_MARKETABLE_FLAG;
  }
  public customer_segment_stg with_EMAIL_MARKETABLE_FLAG(java.math.BigDecimal EMAIL_MARKETABLE_FLAG) {
    this.EMAIL_MARKETABLE_FLAG = EMAIL_MARKETABLE_FLAG;
    return this;
  }
  private java.sql.Timestamp LOAD_DTTM;
  public java.sql.Timestamp get_LOAD_DTTM() {
    return LOAD_DTTM;
  }
  public void set_LOAD_DTTM(java.sql.Timestamp LOAD_DTTM) {
    this.LOAD_DTTM = LOAD_DTTM;
  }
  public customer_segment_stg with_LOAD_DTTM(java.sql.Timestamp LOAD_DTTM) {
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
  public customer_segment_stg with_LOAD_BY(String LOAD_BY) {
    this.LOAD_BY = LOAD_BY;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof customer_segment_stg)) {
      return false;
    }
    customer_segment_stg that = (customer_segment_stg) o;
    boolean equal = true;
    equal = equal && (this.Z_LOY_CUST_DW_ID == null ? that.Z_LOY_CUST_DW_ID == null : this.Z_LOY_CUST_DW_ID.equals(that.Z_LOY_CUST_DW_ID));
    equal = equal && (this.HUB_CUST_ID == null ? that.HUB_CUST_ID == null : this.HUB_CUST_ID.equals(that.HUB_CUST_ID));
    equal = equal && (this.CONTACT_DTTM == null ? that.CONTACT_DTTM == null : this.CONTACT_DTTM.equals(that.CONTACT_DTTM));
    equal = equal && (this.CAMPAIGN_CD == null ? that.CAMPAIGN_CD == null : this.CAMPAIGN_CD.equals(that.CAMPAIGN_CD));
    equal = equal && (this.MARKETING_CELL_CD == null ? that.MARKETING_CELL_CD == null : this.MARKETING_CELL_CD.equals(that.MARKETING_CELL_CD));
    equal = equal && (this.MARKETING_CELL_NM == null ? that.MARKETING_CELL_NM == null : this.MARKETING_CELL_NM.equals(that.MARKETING_CELL_NM));
    equal = equal && (this.EMAIL_MARKETABLE_FLAG == null ? that.EMAIL_MARKETABLE_FLAG == null : this.EMAIL_MARKETABLE_FLAG.equals(that.EMAIL_MARKETABLE_FLAG));
    equal = equal && (this.LOAD_DTTM == null ? that.LOAD_DTTM == null : this.LOAD_DTTM.equals(that.LOAD_DTTM));
    equal = equal && (this.LOAD_BY == null ? that.LOAD_BY == null : this.LOAD_BY.equals(that.LOAD_BY));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof customer_segment_stg)) {
      return false;
    }
    customer_segment_stg that = (customer_segment_stg) o;
    boolean equal = true;
    equal = equal && (this.Z_LOY_CUST_DW_ID == null ? that.Z_LOY_CUST_DW_ID == null : this.Z_LOY_CUST_DW_ID.equals(that.Z_LOY_CUST_DW_ID));
    equal = equal && (this.HUB_CUST_ID == null ? that.HUB_CUST_ID == null : this.HUB_CUST_ID.equals(that.HUB_CUST_ID));
    equal = equal && (this.CONTACT_DTTM == null ? that.CONTACT_DTTM == null : this.CONTACT_DTTM.equals(that.CONTACT_DTTM));
    equal = equal && (this.CAMPAIGN_CD == null ? that.CAMPAIGN_CD == null : this.CAMPAIGN_CD.equals(that.CAMPAIGN_CD));
    equal = equal && (this.MARKETING_CELL_CD == null ? that.MARKETING_CELL_CD == null : this.MARKETING_CELL_CD.equals(that.MARKETING_CELL_CD));
    equal = equal && (this.MARKETING_CELL_NM == null ? that.MARKETING_CELL_NM == null : this.MARKETING_CELL_NM.equals(that.MARKETING_CELL_NM));
    equal = equal && (this.EMAIL_MARKETABLE_FLAG == null ? that.EMAIL_MARKETABLE_FLAG == null : this.EMAIL_MARKETABLE_FLAG.equals(that.EMAIL_MARKETABLE_FLAG));
    equal = equal && (this.LOAD_DTTM == null ? that.LOAD_DTTM == null : this.LOAD_DTTM.equals(that.LOAD_DTTM));
    equal = equal && (this.LOAD_BY == null ? that.LOAD_BY == null : this.LOAD_BY.equals(that.LOAD_BY));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Z_LOY_CUST_DW_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.HUB_CUST_ID = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.CONTACT_DTTM = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.CAMPAIGN_CD = JdbcWritableBridge.readString(4, __dbResults);
    this.MARKETING_CELL_CD = JdbcWritableBridge.readString(5, __dbResults);
    this.MARKETING_CELL_NM = JdbcWritableBridge.readString(6, __dbResults);
    this.EMAIL_MARKETABLE_FLAG = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.LOAD_DTTM = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.LOAD_BY = JdbcWritableBridge.readString(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Z_LOY_CUST_DW_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.HUB_CUST_ID = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.CONTACT_DTTM = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.CAMPAIGN_CD = JdbcWritableBridge.readString(4, __dbResults);
    this.MARKETING_CELL_CD = JdbcWritableBridge.readString(5, __dbResults);
    this.MARKETING_CELL_NM = JdbcWritableBridge.readString(6, __dbResults);
    this.EMAIL_MARKETABLE_FLAG = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.LOAD_DTTM = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.LOAD_BY = JdbcWritableBridge.readString(9, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(Z_LOY_CUST_DW_ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HUB_CUST_ID, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CONTACT_DTTM, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(CAMPAIGN_CD, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MARKETING_CELL_CD, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MARKETING_CELL_NM, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(EMAIL_MARKETABLE_FLAG, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOAD_DTTM, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_BY, 9 + __off, 12, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(Z_LOY_CUST_DW_ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HUB_CUST_ID, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CONTACT_DTTM, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(CAMPAIGN_CD, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MARKETING_CELL_CD, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MARKETING_CELL_NM, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(EMAIL_MARKETABLE_FLAG, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOAD_DTTM, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_BY, 9 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.Z_LOY_CUST_DW_ID = null;
    } else {
    this.Z_LOY_CUST_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HUB_CUST_ID = null;
    } else {
    this.HUB_CUST_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CONTACT_DTTM = null;
    } else {
    this.CONTACT_DTTM = new Timestamp(__dataIn.readLong());
    this.CONTACT_DTTM.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CAMPAIGN_CD = null;
    } else {
    this.CAMPAIGN_CD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MARKETING_CELL_CD = null;
    } else {
    this.MARKETING_CELL_CD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MARKETING_CELL_NM = null;
    } else {
    this.MARKETING_CELL_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EMAIL_MARKETABLE_FLAG = null;
    } else {
    this.EMAIL_MARKETABLE_FLAG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.Z_LOY_CUST_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Z_LOY_CUST_DW_ID, __dataOut);
    }
    if (null == this.HUB_CUST_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HUB_CUST_ID, __dataOut);
    }
    if (null == this.CONTACT_DTTM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CONTACT_DTTM.getTime());
    __dataOut.writeInt(this.CONTACT_DTTM.getNanos());
    }
    if (null == this.CAMPAIGN_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CAMPAIGN_CD);
    }
    if (null == this.MARKETING_CELL_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MARKETING_CELL_CD);
    }
    if (null == this.MARKETING_CELL_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MARKETING_CELL_NM);
    }
    if (null == this.EMAIL_MARKETABLE_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.EMAIL_MARKETABLE_FLAG, __dataOut);
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
    if (null == this.Z_LOY_CUST_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Z_LOY_CUST_DW_ID, __dataOut);
    }
    if (null == this.HUB_CUST_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HUB_CUST_ID, __dataOut);
    }
    if (null == this.CONTACT_DTTM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CONTACT_DTTM.getTime());
    __dataOut.writeInt(this.CONTACT_DTTM.getNanos());
    }
    if (null == this.CAMPAIGN_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CAMPAIGN_CD);
    }
    if (null == this.MARKETING_CELL_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MARKETING_CELL_CD);
    }
    if (null == this.MARKETING_CELL_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MARKETING_CELL_NM);
    }
    if (null == this.EMAIL_MARKETABLE_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.EMAIL_MARKETABLE_FLAG, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(Z_LOY_CUST_DW_ID==null?"\\N":Z_LOY_CUST_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HUB_CUST_ID==null?"\\N":HUB_CUST_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONTACT_DTTM==null?"\\N":"" + CONTACT_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAMPAIGN_CD==null?"\\N":CAMPAIGN_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MARKETING_CELL_CD==null?"\\N":MARKETING_CELL_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MARKETING_CELL_NM==null?"\\N":MARKETING_CELL_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EMAIL_MARKETABLE_FLAG==null?"\\N":EMAIL_MARKETABLE_FLAG.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(Z_LOY_CUST_DW_ID==null?"\\N":Z_LOY_CUST_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HUB_CUST_ID==null?"\\N":HUB_CUST_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONTACT_DTTM==null?"\\N":"" + CONTACT_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAMPAIGN_CD==null?"\\N":CAMPAIGN_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MARKETING_CELL_CD==null?"\\N":MARKETING_CELL_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MARKETING_CELL_NM==null?"\\N":MARKETING_CELL_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EMAIL_MARKETABLE_FLAG==null?"\\N":EMAIL_MARKETABLE_FLAG.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Z_LOY_CUST_DW_ID = null; } else {
      this.Z_LOY_CUST_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HUB_CUST_ID = null; } else {
      this.HUB_CUST_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CONTACT_DTTM = null; } else {
      this.CONTACT_DTTM = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CAMPAIGN_CD = null; } else {
      this.CAMPAIGN_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MARKETING_CELL_CD = null; } else {
      this.MARKETING_CELL_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MARKETING_CELL_NM = null; } else {
      this.MARKETING_CELL_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EMAIL_MARKETABLE_FLAG = null; } else {
      this.EMAIL_MARKETABLE_FLAG = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Z_LOY_CUST_DW_ID = null; } else {
      this.Z_LOY_CUST_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HUB_CUST_ID = null; } else {
      this.HUB_CUST_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CONTACT_DTTM = null; } else {
      this.CONTACT_DTTM = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CAMPAIGN_CD = null; } else {
      this.CAMPAIGN_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MARKETING_CELL_CD = null; } else {
      this.MARKETING_CELL_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MARKETING_CELL_NM = null; } else {
      this.MARKETING_CELL_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EMAIL_MARKETABLE_FLAG = null; } else {
      this.EMAIL_MARKETABLE_FLAG = new java.math.BigDecimal(__cur_str);
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
    customer_segment_stg o = (customer_segment_stg) super.clone();
    o.CONTACT_DTTM = (o.CONTACT_DTTM != null) ? (java.sql.Timestamp) o.CONTACT_DTTM.clone() : null;
    o.LOAD_DTTM = (o.LOAD_DTTM != null) ? (java.sql.Timestamp) o.LOAD_DTTM.clone() : null;
    return o;
  }

  public void clone0(customer_segment_stg o) throws CloneNotSupportedException {
    o.CONTACT_DTTM = (o.CONTACT_DTTM != null) ? (java.sql.Timestamp) o.CONTACT_DTTM.clone() : null;
    o.LOAD_DTTM = (o.LOAD_DTTM != null) ? (java.sql.Timestamp) o.LOAD_DTTM.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Z_LOY_CUST_DW_ID", this.Z_LOY_CUST_DW_ID);
    __sqoop$field_map.put("HUB_CUST_ID", this.HUB_CUST_ID);
    __sqoop$field_map.put("CONTACT_DTTM", this.CONTACT_DTTM);
    __sqoop$field_map.put("CAMPAIGN_CD", this.CAMPAIGN_CD);
    __sqoop$field_map.put("MARKETING_CELL_CD", this.MARKETING_CELL_CD);
    __sqoop$field_map.put("MARKETING_CELL_NM", this.MARKETING_CELL_NM);
    __sqoop$field_map.put("EMAIL_MARKETABLE_FLAG", this.EMAIL_MARKETABLE_FLAG);
    __sqoop$field_map.put("LOAD_DTTM", this.LOAD_DTTM);
    __sqoop$field_map.put("LOAD_BY", this.LOAD_BY);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Z_LOY_CUST_DW_ID", this.Z_LOY_CUST_DW_ID);
    __sqoop$field_map.put("HUB_CUST_ID", this.HUB_CUST_ID);
    __sqoop$field_map.put("CONTACT_DTTM", this.CONTACT_DTTM);
    __sqoop$field_map.put("CAMPAIGN_CD", this.CAMPAIGN_CD);
    __sqoop$field_map.put("MARKETING_CELL_CD", this.MARKETING_CELL_CD);
    __sqoop$field_map.put("MARKETING_CELL_NM", this.MARKETING_CELL_NM);
    __sqoop$field_map.put("EMAIL_MARKETABLE_FLAG", this.EMAIL_MARKETABLE_FLAG);
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
