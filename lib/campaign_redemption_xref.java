// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 29 17:02:07 GMT 2017
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

public class campaign_redemption_xref extends SqoopRecord  implements DBWritable, Writable {
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
    setters.put("CAMPAIGN_CD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CAMPAIGN_CD = (String)value;
      }
    });
    setters.put("CAMPAIGN_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CAMPAIGN_DESC = (String)value;
      }
    });
    setters.put("WALLET_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WALLET_CODE = (String)value;
      }
    });
    setters.put("WALLET_EXPIRE_DATE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WALLET_EXPIRE_DATE = (java.sql.Timestamp)value;
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
  public campaign_redemption_xref() {
    init0();
  }
  private java.math.BigDecimal SEND_ID;
  public java.math.BigDecimal get_SEND_ID() {
    return SEND_ID;
  }
  public void set_SEND_ID(java.math.BigDecimal SEND_ID) {
    this.SEND_ID = SEND_ID;
  }
  public campaign_redemption_xref with_SEND_ID(java.math.BigDecimal SEND_ID) {
    this.SEND_ID = SEND_ID;
    return this;
  }
  private String CAMPAIGN_CD;
  public String get_CAMPAIGN_CD() {
    return CAMPAIGN_CD;
  }
  public void set_CAMPAIGN_CD(String CAMPAIGN_CD) {
    this.CAMPAIGN_CD = CAMPAIGN_CD;
  }
  public campaign_redemption_xref with_CAMPAIGN_CD(String CAMPAIGN_CD) {
    this.CAMPAIGN_CD = CAMPAIGN_CD;
    return this;
  }
  private String CAMPAIGN_DESC;
  public String get_CAMPAIGN_DESC() {
    return CAMPAIGN_DESC;
  }
  public void set_CAMPAIGN_DESC(String CAMPAIGN_DESC) {
    this.CAMPAIGN_DESC = CAMPAIGN_DESC;
  }
  public campaign_redemption_xref with_CAMPAIGN_DESC(String CAMPAIGN_DESC) {
    this.CAMPAIGN_DESC = CAMPAIGN_DESC;
    return this;
  }
  private String WALLET_CODE;
  public String get_WALLET_CODE() {
    return WALLET_CODE;
  }
  public void set_WALLET_CODE(String WALLET_CODE) {
    this.WALLET_CODE = WALLET_CODE;
  }
  public campaign_redemption_xref with_WALLET_CODE(String WALLET_CODE) {
    this.WALLET_CODE = WALLET_CODE;
    return this;
  }
  private java.sql.Timestamp WALLET_EXPIRE_DATE;
  public java.sql.Timestamp get_WALLET_EXPIRE_DATE() {
    return WALLET_EXPIRE_DATE;
  }
  public void set_WALLET_EXPIRE_DATE(java.sql.Timestamp WALLET_EXPIRE_DATE) {
    this.WALLET_EXPIRE_DATE = WALLET_EXPIRE_DATE;
  }
  public campaign_redemption_xref with_WALLET_EXPIRE_DATE(java.sql.Timestamp WALLET_EXPIRE_DATE) {
    this.WALLET_EXPIRE_DATE = WALLET_EXPIRE_DATE;
    return this;
  }
  private java.sql.Timestamp LOAD_DTTM;
  public java.sql.Timestamp get_LOAD_DTTM() {
    return LOAD_DTTM;
  }
  public void set_LOAD_DTTM(java.sql.Timestamp LOAD_DTTM) {
    this.LOAD_DTTM = LOAD_DTTM;
  }
  public campaign_redemption_xref with_LOAD_DTTM(java.sql.Timestamp LOAD_DTTM) {
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
  public campaign_redemption_xref with_LOAD_BY(String LOAD_BY) {
    this.LOAD_BY = LOAD_BY;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof campaign_redemption_xref)) {
      return false;
    }
    campaign_redemption_xref that = (campaign_redemption_xref) o;
    boolean equal = true;
    equal = equal && (this.SEND_ID == null ? that.SEND_ID == null : this.SEND_ID.equals(that.SEND_ID));
    equal = equal && (this.CAMPAIGN_CD == null ? that.CAMPAIGN_CD == null : this.CAMPAIGN_CD.equals(that.CAMPAIGN_CD));
    equal = equal && (this.CAMPAIGN_DESC == null ? that.CAMPAIGN_DESC == null : this.CAMPAIGN_DESC.equals(that.CAMPAIGN_DESC));
    equal = equal && (this.WALLET_CODE == null ? that.WALLET_CODE == null : this.WALLET_CODE.equals(that.WALLET_CODE));
    equal = equal && (this.WALLET_EXPIRE_DATE == null ? that.WALLET_EXPIRE_DATE == null : this.WALLET_EXPIRE_DATE.equals(that.WALLET_EXPIRE_DATE));
    equal = equal && (this.LOAD_DTTM == null ? that.LOAD_DTTM == null : this.LOAD_DTTM.equals(that.LOAD_DTTM));
    equal = equal && (this.LOAD_BY == null ? that.LOAD_BY == null : this.LOAD_BY.equals(that.LOAD_BY));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof campaign_redemption_xref)) {
      return false;
    }
    campaign_redemption_xref that = (campaign_redemption_xref) o;
    boolean equal = true;
    equal = equal && (this.SEND_ID == null ? that.SEND_ID == null : this.SEND_ID.equals(that.SEND_ID));
    equal = equal && (this.CAMPAIGN_CD == null ? that.CAMPAIGN_CD == null : this.CAMPAIGN_CD.equals(that.CAMPAIGN_CD));
    equal = equal && (this.CAMPAIGN_DESC == null ? that.CAMPAIGN_DESC == null : this.CAMPAIGN_DESC.equals(that.CAMPAIGN_DESC));
    equal = equal && (this.WALLET_CODE == null ? that.WALLET_CODE == null : this.WALLET_CODE.equals(that.WALLET_CODE));
    equal = equal && (this.WALLET_EXPIRE_DATE == null ? that.WALLET_EXPIRE_DATE == null : this.WALLET_EXPIRE_DATE.equals(that.WALLET_EXPIRE_DATE));
    equal = equal && (this.LOAD_DTTM == null ? that.LOAD_DTTM == null : this.LOAD_DTTM.equals(that.LOAD_DTTM));
    equal = equal && (this.LOAD_BY == null ? that.LOAD_BY == null : this.LOAD_BY.equals(that.LOAD_BY));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.SEND_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.CAMPAIGN_CD = JdbcWritableBridge.readString(2, __dbResults);
    this.CAMPAIGN_DESC = JdbcWritableBridge.readString(3, __dbResults);
    this.WALLET_CODE = JdbcWritableBridge.readString(4, __dbResults);
    this.WALLET_EXPIRE_DATE = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.LOAD_DTTM = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.LOAD_BY = JdbcWritableBridge.readString(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.SEND_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.CAMPAIGN_CD = JdbcWritableBridge.readString(2, __dbResults);
    this.CAMPAIGN_DESC = JdbcWritableBridge.readString(3, __dbResults);
    this.WALLET_CODE = JdbcWritableBridge.readString(4, __dbResults);
    this.WALLET_EXPIRE_DATE = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.LOAD_DTTM = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.LOAD_BY = JdbcWritableBridge.readString(7, __dbResults);
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
    JdbcWritableBridge.writeString(CAMPAIGN_CD, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CAMPAIGN_DESC, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(WALLET_CODE, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(WALLET_EXPIRE_DATE, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOAD_DTTM, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_BY, 7 + __off, 12, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(SEND_ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(CAMPAIGN_CD, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CAMPAIGN_DESC, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(WALLET_CODE, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(WALLET_EXPIRE_DATE, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOAD_DTTM, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_BY, 7 + __off, 12, __dbStmt);
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
        this.CAMPAIGN_CD = null;
    } else {
    this.CAMPAIGN_CD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CAMPAIGN_DESC = null;
    } else {
    this.CAMPAIGN_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WALLET_CODE = null;
    } else {
    this.WALLET_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WALLET_EXPIRE_DATE = null;
    } else {
    this.WALLET_EXPIRE_DATE = new Timestamp(__dataIn.readLong());
    this.WALLET_EXPIRE_DATE.setNanos(__dataIn.readInt());
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
    if (null == this.CAMPAIGN_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CAMPAIGN_CD);
    }
    if (null == this.CAMPAIGN_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CAMPAIGN_DESC);
    }
    if (null == this.WALLET_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WALLET_CODE);
    }
    if (null == this.WALLET_EXPIRE_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.WALLET_EXPIRE_DATE.getTime());
    __dataOut.writeInt(this.WALLET_EXPIRE_DATE.getNanos());
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
    if (null == this.CAMPAIGN_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CAMPAIGN_CD);
    }
    if (null == this.CAMPAIGN_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CAMPAIGN_DESC);
    }
    if (null == this.WALLET_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WALLET_CODE);
    }
    if (null == this.WALLET_EXPIRE_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.WALLET_EXPIRE_DATE.getTime());
    __dataOut.writeInt(this.WALLET_EXPIRE_DATE.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(CAMPAIGN_CD==null?"\\N":CAMPAIGN_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAMPAIGN_DESC==null?"\\N":CAMPAIGN_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WALLET_CODE==null?"\\N":WALLET_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WALLET_EXPIRE_DATE==null?"\\N":"" + WALLET_EXPIRE_DATE, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(CAMPAIGN_CD==null?"\\N":CAMPAIGN_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAMPAIGN_DESC==null?"\\N":CAMPAIGN_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WALLET_CODE==null?"\\N":WALLET_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WALLET_EXPIRE_DATE==null?"\\N":"" + WALLET_EXPIRE_DATE, delimiters));
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
    if (__cur_str.equals("null")) { this.CAMPAIGN_CD = null; } else {
      this.CAMPAIGN_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CAMPAIGN_DESC = null; } else {
      this.CAMPAIGN_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WALLET_CODE = null; } else {
      this.WALLET_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WALLET_EXPIRE_DATE = null; } else {
      this.WALLET_EXPIRE_DATE = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.CAMPAIGN_CD = null; } else {
      this.CAMPAIGN_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CAMPAIGN_DESC = null; } else {
      this.CAMPAIGN_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WALLET_CODE = null; } else {
      this.WALLET_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WALLET_EXPIRE_DATE = null; } else {
      this.WALLET_EXPIRE_DATE = java.sql.Timestamp.valueOf(__cur_str);
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
    campaign_redemption_xref o = (campaign_redemption_xref) super.clone();
    o.WALLET_EXPIRE_DATE = (o.WALLET_EXPIRE_DATE != null) ? (java.sql.Timestamp) o.WALLET_EXPIRE_DATE.clone() : null;
    o.LOAD_DTTM = (o.LOAD_DTTM != null) ? (java.sql.Timestamp) o.LOAD_DTTM.clone() : null;
    return o;
  }

  public void clone0(campaign_redemption_xref o) throws CloneNotSupportedException {
    o.WALLET_EXPIRE_DATE = (o.WALLET_EXPIRE_DATE != null) ? (java.sql.Timestamp) o.WALLET_EXPIRE_DATE.clone() : null;
    o.LOAD_DTTM = (o.LOAD_DTTM != null) ? (java.sql.Timestamp) o.LOAD_DTTM.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("SEND_ID", this.SEND_ID);
    __sqoop$field_map.put("CAMPAIGN_CD", this.CAMPAIGN_CD);
    __sqoop$field_map.put("CAMPAIGN_DESC", this.CAMPAIGN_DESC);
    __sqoop$field_map.put("WALLET_CODE", this.WALLET_CODE);
    __sqoop$field_map.put("WALLET_EXPIRE_DATE", this.WALLET_EXPIRE_DATE);
    __sqoop$field_map.put("LOAD_DTTM", this.LOAD_DTTM);
    __sqoop$field_map.put("LOAD_BY", this.LOAD_BY);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("SEND_ID", this.SEND_ID);
    __sqoop$field_map.put("CAMPAIGN_CD", this.CAMPAIGN_CD);
    __sqoop$field_map.put("CAMPAIGN_DESC", this.CAMPAIGN_DESC);
    __sqoop$field_map.put("WALLET_CODE", this.WALLET_CODE);
    __sqoop$field_map.put("WALLET_EXPIRE_DATE", this.WALLET_EXPIRE_DATE);
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
