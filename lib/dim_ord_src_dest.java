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

public class dim_ord_src_dest extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("ORD_DEST_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ORD_DEST_CODE = (java.math.BigDecimal)value;
      }
    });
    setters.put("ORD_SRC_SYS_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ORD_SRC_SYS_CODE = (java.math.BigDecimal)value;
      }
    });
    setters.put("ORD_DEST_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ORD_DEST_DESC = (String)value;
      }
    });
    setters.put("ORD_SRC_SYS_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ORD_SRC_SYS_DESC = (String)value;
      }
    });
    setters.put("Z_ORD_DEST_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Z_ORD_DEST_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("Z_ORD_SRC_SYS_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Z_ORD_SRC_SYS_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("CONSUMPTION_AREA", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CONSUMPTION_AREA = (String)value;
      }
    });
    setters.put("CONSUMPTION_AREA_GROUP", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CONSUMPTION_AREA_GROUP = (String)value;
      }
    });
    setters.put("INPUT_TYPE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        INPUT_TYPE = (String)value;
      }
    });
    setters.put("INPUT_TYPE_GROUP", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        INPUT_TYPE_GROUP = (String)value;
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
    setters.put("INPUT_CONSUMPTION_LEVEL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        INPUT_CONSUMPTION_LEVEL = (String)value;
      }
    });
    setters.put("DIGITAL_INPUT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DIGITAL_INPUT = (String)value;
      }
    });
    setters.put("DIGITAL_INPUT_GROUP", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DIGITAL_INPUT_GROUP = (String)value;
      }
    });
    setters.put("INPUT_CONSUMPTION_DETAIL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        INPUT_CONSUMPTION_DETAIL = (String)value;
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
  public dim_ord_src_dest() {
    init0();
  }
  private java.math.BigDecimal ORD_DEST_CODE;
  public java.math.BigDecimal get_ORD_DEST_CODE() {
    return ORD_DEST_CODE;
  }
  public void set_ORD_DEST_CODE(java.math.BigDecimal ORD_DEST_CODE) {
    this.ORD_DEST_CODE = ORD_DEST_CODE;
  }
  public dim_ord_src_dest with_ORD_DEST_CODE(java.math.BigDecimal ORD_DEST_CODE) {
    this.ORD_DEST_CODE = ORD_DEST_CODE;
    return this;
  }
  private java.math.BigDecimal ORD_SRC_SYS_CODE;
  public java.math.BigDecimal get_ORD_SRC_SYS_CODE() {
    return ORD_SRC_SYS_CODE;
  }
  public void set_ORD_SRC_SYS_CODE(java.math.BigDecimal ORD_SRC_SYS_CODE) {
    this.ORD_SRC_SYS_CODE = ORD_SRC_SYS_CODE;
  }
  public dim_ord_src_dest with_ORD_SRC_SYS_CODE(java.math.BigDecimal ORD_SRC_SYS_CODE) {
    this.ORD_SRC_SYS_CODE = ORD_SRC_SYS_CODE;
    return this;
  }
  private String ORD_DEST_DESC;
  public String get_ORD_DEST_DESC() {
    return ORD_DEST_DESC;
  }
  public void set_ORD_DEST_DESC(String ORD_DEST_DESC) {
    this.ORD_DEST_DESC = ORD_DEST_DESC;
  }
  public dim_ord_src_dest with_ORD_DEST_DESC(String ORD_DEST_DESC) {
    this.ORD_DEST_DESC = ORD_DEST_DESC;
    return this;
  }
  private String ORD_SRC_SYS_DESC;
  public String get_ORD_SRC_SYS_DESC() {
    return ORD_SRC_SYS_DESC;
  }
  public void set_ORD_SRC_SYS_DESC(String ORD_SRC_SYS_DESC) {
    this.ORD_SRC_SYS_DESC = ORD_SRC_SYS_DESC;
  }
  public dim_ord_src_dest with_ORD_SRC_SYS_DESC(String ORD_SRC_SYS_DESC) {
    this.ORD_SRC_SYS_DESC = ORD_SRC_SYS_DESC;
    return this;
  }
  private java.math.BigDecimal Z_ORD_DEST_DW_ID;
  public java.math.BigDecimal get_Z_ORD_DEST_DW_ID() {
    return Z_ORD_DEST_DW_ID;
  }
  public void set_Z_ORD_DEST_DW_ID(java.math.BigDecimal Z_ORD_DEST_DW_ID) {
    this.Z_ORD_DEST_DW_ID = Z_ORD_DEST_DW_ID;
  }
  public dim_ord_src_dest with_Z_ORD_DEST_DW_ID(java.math.BigDecimal Z_ORD_DEST_DW_ID) {
    this.Z_ORD_DEST_DW_ID = Z_ORD_DEST_DW_ID;
    return this;
  }
  private java.math.BigDecimal Z_ORD_SRC_SYS_DW_ID;
  public java.math.BigDecimal get_Z_ORD_SRC_SYS_DW_ID() {
    return Z_ORD_SRC_SYS_DW_ID;
  }
  public void set_Z_ORD_SRC_SYS_DW_ID(java.math.BigDecimal Z_ORD_SRC_SYS_DW_ID) {
    this.Z_ORD_SRC_SYS_DW_ID = Z_ORD_SRC_SYS_DW_ID;
  }
  public dim_ord_src_dest with_Z_ORD_SRC_SYS_DW_ID(java.math.BigDecimal Z_ORD_SRC_SYS_DW_ID) {
    this.Z_ORD_SRC_SYS_DW_ID = Z_ORD_SRC_SYS_DW_ID;
    return this;
  }
  private String CONSUMPTION_AREA;
  public String get_CONSUMPTION_AREA() {
    return CONSUMPTION_AREA;
  }
  public void set_CONSUMPTION_AREA(String CONSUMPTION_AREA) {
    this.CONSUMPTION_AREA = CONSUMPTION_AREA;
  }
  public dim_ord_src_dest with_CONSUMPTION_AREA(String CONSUMPTION_AREA) {
    this.CONSUMPTION_AREA = CONSUMPTION_AREA;
    return this;
  }
  private String CONSUMPTION_AREA_GROUP;
  public String get_CONSUMPTION_AREA_GROUP() {
    return CONSUMPTION_AREA_GROUP;
  }
  public void set_CONSUMPTION_AREA_GROUP(String CONSUMPTION_AREA_GROUP) {
    this.CONSUMPTION_AREA_GROUP = CONSUMPTION_AREA_GROUP;
  }
  public dim_ord_src_dest with_CONSUMPTION_AREA_GROUP(String CONSUMPTION_AREA_GROUP) {
    this.CONSUMPTION_AREA_GROUP = CONSUMPTION_AREA_GROUP;
    return this;
  }
  private String INPUT_TYPE;
  public String get_INPUT_TYPE() {
    return INPUT_TYPE;
  }
  public void set_INPUT_TYPE(String INPUT_TYPE) {
    this.INPUT_TYPE = INPUT_TYPE;
  }
  public dim_ord_src_dest with_INPUT_TYPE(String INPUT_TYPE) {
    this.INPUT_TYPE = INPUT_TYPE;
    return this;
  }
  private String INPUT_TYPE_GROUP;
  public String get_INPUT_TYPE_GROUP() {
    return INPUT_TYPE_GROUP;
  }
  public void set_INPUT_TYPE_GROUP(String INPUT_TYPE_GROUP) {
    this.INPUT_TYPE_GROUP = INPUT_TYPE_GROUP;
  }
  public dim_ord_src_dest with_INPUT_TYPE_GROUP(String INPUT_TYPE_GROUP) {
    this.INPUT_TYPE_GROUP = INPUT_TYPE_GROUP;
    return this;
  }
  private java.sql.Timestamp FILE_DTTM;
  public java.sql.Timestamp get_FILE_DTTM() {
    return FILE_DTTM;
  }
  public void set_FILE_DTTM(java.sql.Timestamp FILE_DTTM) {
    this.FILE_DTTM = FILE_DTTM;
  }
  public dim_ord_src_dest with_FILE_DTTM(java.sql.Timestamp FILE_DTTM) {
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
  public dim_ord_src_dest with_INSERT_DTTM(java.sql.Timestamp INSERT_DTTM) {
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
  public dim_ord_src_dest with_UPDATE_DTTM(java.sql.Timestamp UPDATE_DTTM) {
    this.UPDATE_DTTM = UPDATE_DTTM;
    return this;
  }
  private String INPUT_CONSUMPTION_LEVEL;
  public String get_INPUT_CONSUMPTION_LEVEL() {
    return INPUT_CONSUMPTION_LEVEL;
  }
  public void set_INPUT_CONSUMPTION_LEVEL(String INPUT_CONSUMPTION_LEVEL) {
    this.INPUT_CONSUMPTION_LEVEL = INPUT_CONSUMPTION_LEVEL;
  }
  public dim_ord_src_dest with_INPUT_CONSUMPTION_LEVEL(String INPUT_CONSUMPTION_LEVEL) {
    this.INPUT_CONSUMPTION_LEVEL = INPUT_CONSUMPTION_LEVEL;
    return this;
  }
  private String DIGITAL_INPUT;
  public String get_DIGITAL_INPUT() {
    return DIGITAL_INPUT;
  }
  public void set_DIGITAL_INPUT(String DIGITAL_INPUT) {
    this.DIGITAL_INPUT = DIGITAL_INPUT;
  }
  public dim_ord_src_dest with_DIGITAL_INPUT(String DIGITAL_INPUT) {
    this.DIGITAL_INPUT = DIGITAL_INPUT;
    return this;
  }
  private String DIGITAL_INPUT_GROUP;
  public String get_DIGITAL_INPUT_GROUP() {
    return DIGITAL_INPUT_GROUP;
  }
  public void set_DIGITAL_INPUT_GROUP(String DIGITAL_INPUT_GROUP) {
    this.DIGITAL_INPUT_GROUP = DIGITAL_INPUT_GROUP;
  }
  public dim_ord_src_dest with_DIGITAL_INPUT_GROUP(String DIGITAL_INPUT_GROUP) {
    this.DIGITAL_INPUT_GROUP = DIGITAL_INPUT_GROUP;
    return this;
  }
  private String INPUT_CONSUMPTION_DETAIL;
  public String get_INPUT_CONSUMPTION_DETAIL() {
    return INPUT_CONSUMPTION_DETAIL;
  }
  public void set_INPUT_CONSUMPTION_DETAIL(String INPUT_CONSUMPTION_DETAIL) {
    this.INPUT_CONSUMPTION_DETAIL = INPUT_CONSUMPTION_DETAIL;
  }
  public dim_ord_src_dest with_INPUT_CONSUMPTION_DETAIL(String INPUT_CONSUMPTION_DETAIL) {
    this.INPUT_CONSUMPTION_DETAIL = INPUT_CONSUMPTION_DETAIL;
    return this;
  }
  private java.sql.Timestamp LOAD_DTTM;
  public java.sql.Timestamp get_LOAD_DTTM() {
    return LOAD_DTTM;
  }
  public void set_LOAD_DTTM(java.sql.Timestamp LOAD_DTTM) {
    this.LOAD_DTTM = LOAD_DTTM;
  }
  public dim_ord_src_dest with_LOAD_DTTM(java.sql.Timestamp LOAD_DTTM) {
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
  public dim_ord_src_dest with_LOAD_BY(String LOAD_BY) {
    this.LOAD_BY = LOAD_BY;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_ord_src_dest)) {
      return false;
    }
    dim_ord_src_dest that = (dim_ord_src_dest) o;
    boolean equal = true;
    equal = equal && (this.ORD_DEST_CODE == null ? that.ORD_DEST_CODE == null : this.ORD_DEST_CODE.equals(that.ORD_DEST_CODE));
    equal = equal && (this.ORD_SRC_SYS_CODE == null ? that.ORD_SRC_SYS_CODE == null : this.ORD_SRC_SYS_CODE.equals(that.ORD_SRC_SYS_CODE));
    equal = equal && (this.ORD_DEST_DESC == null ? that.ORD_DEST_DESC == null : this.ORD_DEST_DESC.equals(that.ORD_DEST_DESC));
    equal = equal && (this.ORD_SRC_SYS_DESC == null ? that.ORD_SRC_SYS_DESC == null : this.ORD_SRC_SYS_DESC.equals(that.ORD_SRC_SYS_DESC));
    equal = equal && (this.Z_ORD_DEST_DW_ID == null ? that.Z_ORD_DEST_DW_ID == null : this.Z_ORD_DEST_DW_ID.equals(that.Z_ORD_DEST_DW_ID));
    equal = equal && (this.Z_ORD_SRC_SYS_DW_ID == null ? that.Z_ORD_SRC_SYS_DW_ID == null : this.Z_ORD_SRC_SYS_DW_ID.equals(that.Z_ORD_SRC_SYS_DW_ID));
    equal = equal && (this.CONSUMPTION_AREA == null ? that.CONSUMPTION_AREA == null : this.CONSUMPTION_AREA.equals(that.CONSUMPTION_AREA));
    equal = equal && (this.CONSUMPTION_AREA_GROUP == null ? that.CONSUMPTION_AREA_GROUP == null : this.CONSUMPTION_AREA_GROUP.equals(that.CONSUMPTION_AREA_GROUP));
    equal = equal && (this.INPUT_TYPE == null ? that.INPUT_TYPE == null : this.INPUT_TYPE.equals(that.INPUT_TYPE));
    equal = equal && (this.INPUT_TYPE_GROUP == null ? that.INPUT_TYPE_GROUP == null : this.INPUT_TYPE_GROUP.equals(that.INPUT_TYPE_GROUP));
    equal = equal && (this.FILE_DTTM == null ? that.FILE_DTTM == null : this.FILE_DTTM.equals(that.FILE_DTTM));
    equal = equal && (this.INSERT_DTTM == null ? that.INSERT_DTTM == null : this.INSERT_DTTM.equals(that.INSERT_DTTM));
    equal = equal && (this.UPDATE_DTTM == null ? that.UPDATE_DTTM == null : this.UPDATE_DTTM.equals(that.UPDATE_DTTM));
    equal = equal && (this.INPUT_CONSUMPTION_LEVEL == null ? that.INPUT_CONSUMPTION_LEVEL == null : this.INPUT_CONSUMPTION_LEVEL.equals(that.INPUT_CONSUMPTION_LEVEL));
    equal = equal && (this.DIGITAL_INPUT == null ? that.DIGITAL_INPUT == null : this.DIGITAL_INPUT.equals(that.DIGITAL_INPUT));
    equal = equal && (this.DIGITAL_INPUT_GROUP == null ? that.DIGITAL_INPUT_GROUP == null : this.DIGITAL_INPUT_GROUP.equals(that.DIGITAL_INPUT_GROUP));
    equal = equal && (this.INPUT_CONSUMPTION_DETAIL == null ? that.INPUT_CONSUMPTION_DETAIL == null : this.INPUT_CONSUMPTION_DETAIL.equals(that.INPUT_CONSUMPTION_DETAIL));
    equal = equal && (this.LOAD_DTTM == null ? that.LOAD_DTTM == null : this.LOAD_DTTM.equals(that.LOAD_DTTM));
    equal = equal && (this.LOAD_BY == null ? that.LOAD_BY == null : this.LOAD_BY.equals(that.LOAD_BY));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_ord_src_dest)) {
      return false;
    }
    dim_ord_src_dest that = (dim_ord_src_dest) o;
    boolean equal = true;
    equal = equal && (this.ORD_DEST_CODE == null ? that.ORD_DEST_CODE == null : this.ORD_DEST_CODE.equals(that.ORD_DEST_CODE));
    equal = equal && (this.ORD_SRC_SYS_CODE == null ? that.ORD_SRC_SYS_CODE == null : this.ORD_SRC_SYS_CODE.equals(that.ORD_SRC_SYS_CODE));
    equal = equal && (this.ORD_DEST_DESC == null ? that.ORD_DEST_DESC == null : this.ORD_DEST_DESC.equals(that.ORD_DEST_DESC));
    equal = equal && (this.ORD_SRC_SYS_DESC == null ? that.ORD_SRC_SYS_DESC == null : this.ORD_SRC_SYS_DESC.equals(that.ORD_SRC_SYS_DESC));
    equal = equal && (this.Z_ORD_DEST_DW_ID == null ? that.Z_ORD_DEST_DW_ID == null : this.Z_ORD_DEST_DW_ID.equals(that.Z_ORD_DEST_DW_ID));
    equal = equal && (this.Z_ORD_SRC_SYS_DW_ID == null ? that.Z_ORD_SRC_SYS_DW_ID == null : this.Z_ORD_SRC_SYS_DW_ID.equals(that.Z_ORD_SRC_SYS_DW_ID));
    equal = equal && (this.CONSUMPTION_AREA == null ? that.CONSUMPTION_AREA == null : this.CONSUMPTION_AREA.equals(that.CONSUMPTION_AREA));
    equal = equal && (this.CONSUMPTION_AREA_GROUP == null ? that.CONSUMPTION_AREA_GROUP == null : this.CONSUMPTION_AREA_GROUP.equals(that.CONSUMPTION_AREA_GROUP));
    equal = equal && (this.INPUT_TYPE == null ? that.INPUT_TYPE == null : this.INPUT_TYPE.equals(that.INPUT_TYPE));
    equal = equal && (this.INPUT_TYPE_GROUP == null ? that.INPUT_TYPE_GROUP == null : this.INPUT_TYPE_GROUP.equals(that.INPUT_TYPE_GROUP));
    equal = equal && (this.FILE_DTTM == null ? that.FILE_DTTM == null : this.FILE_DTTM.equals(that.FILE_DTTM));
    equal = equal && (this.INSERT_DTTM == null ? that.INSERT_DTTM == null : this.INSERT_DTTM.equals(that.INSERT_DTTM));
    equal = equal && (this.UPDATE_DTTM == null ? that.UPDATE_DTTM == null : this.UPDATE_DTTM.equals(that.UPDATE_DTTM));
    equal = equal && (this.INPUT_CONSUMPTION_LEVEL == null ? that.INPUT_CONSUMPTION_LEVEL == null : this.INPUT_CONSUMPTION_LEVEL.equals(that.INPUT_CONSUMPTION_LEVEL));
    equal = equal && (this.DIGITAL_INPUT == null ? that.DIGITAL_INPUT == null : this.DIGITAL_INPUT.equals(that.DIGITAL_INPUT));
    equal = equal && (this.DIGITAL_INPUT_GROUP == null ? that.DIGITAL_INPUT_GROUP == null : this.DIGITAL_INPUT_GROUP.equals(that.DIGITAL_INPUT_GROUP));
    equal = equal && (this.INPUT_CONSUMPTION_DETAIL == null ? that.INPUT_CONSUMPTION_DETAIL == null : this.INPUT_CONSUMPTION_DETAIL.equals(that.INPUT_CONSUMPTION_DETAIL));
    equal = equal && (this.LOAD_DTTM == null ? that.LOAD_DTTM == null : this.LOAD_DTTM.equals(that.LOAD_DTTM));
    equal = equal && (this.LOAD_BY == null ? that.LOAD_BY == null : this.LOAD_BY.equals(that.LOAD_BY));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.ORD_DEST_CODE = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.ORD_SRC_SYS_CODE = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.ORD_DEST_DESC = JdbcWritableBridge.readString(3, __dbResults);
    this.ORD_SRC_SYS_DESC = JdbcWritableBridge.readString(4, __dbResults);
    this.Z_ORD_DEST_DW_ID = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.Z_ORD_SRC_SYS_DW_ID = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.CONSUMPTION_AREA = JdbcWritableBridge.readString(7, __dbResults);
    this.CONSUMPTION_AREA_GROUP = JdbcWritableBridge.readString(8, __dbResults);
    this.INPUT_TYPE = JdbcWritableBridge.readString(9, __dbResults);
    this.INPUT_TYPE_GROUP = JdbcWritableBridge.readString(10, __dbResults);
    this.FILE_DTTM = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.INSERT_DTTM = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.UPDATE_DTTM = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.INPUT_CONSUMPTION_LEVEL = JdbcWritableBridge.readString(14, __dbResults);
    this.DIGITAL_INPUT = JdbcWritableBridge.readString(15, __dbResults);
    this.DIGITAL_INPUT_GROUP = JdbcWritableBridge.readString(16, __dbResults);
    this.INPUT_CONSUMPTION_DETAIL = JdbcWritableBridge.readString(17, __dbResults);
    this.LOAD_DTTM = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.LOAD_BY = JdbcWritableBridge.readString(19, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.ORD_DEST_CODE = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.ORD_SRC_SYS_CODE = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.ORD_DEST_DESC = JdbcWritableBridge.readString(3, __dbResults);
    this.ORD_SRC_SYS_DESC = JdbcWritableBridge.readString(4, __dbResults);
    this.Z_ORD_DEST_DW_ID = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.Z_ORD_SRC_SYS_DW_ID = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.CONSUMPTION_AREA = JdbcWritableBridge.readString(7, __dbResults);
    this.CONSUMPTION_AREA_GROUP = JdbcWritableBridge.readString(8, __dbResults);
    this.INPUT_TYPE = JdbcWritableBridge.readString(9, __dbResults);
    this.INPUT_TYPE_GROUP = JdbcWritableBridge.readString(10, __dbResults);
    this.FILE_DTTM = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.INSERT_DTTM = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.UPDATE_DTTM = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.INPUT_CONSUMPTION_LEVEL = JdbcWritableBridge.readString(14, __dbResults);
    this.DIGITAL_INPUT = JdbcWritableBridge.readString(15, __dbResults);
    this.DIGITAL_INPUT_GROUP = JdbcWritableBridge.readString(16, __dbResults);
    this.INPUT_CONSUMPTION_DETAIL = JdbcWritableBridge.readString(17, __dbResults);
    this.LOAD_DTTM = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.LOAD_BY = JdbcWritableBridge.readString(19, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(ORD_DEST_CODE, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ORD_SRC_SYS_CODE, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(ORD_DEST_DESC, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ORD_SRC_SYS_DESC, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Z_ORD_DEST_DW_ID, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Z_ORD_SRC_SYS_DW_ID, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(CONSUMPTION_AREA, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CONSUMPTION_AREA_GROUP, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(INPUT_TYPE, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(INPUT_TYPE_GROUP, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FILE_DTTM, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(INSERT_DTTM, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATE_DTTM, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(INPUT_CONSUMPTION_LEVEL, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DIGITAL_INPUT, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DIGITAL_INPUT_GROUP, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(INPUT_CONSUMPTION_DETAIL, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOAD_DTTM, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_BY, 19 + __off, 12, __dbStmt);
    return 19;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(ORD_DEST_CODE, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ORD_SRC_SYS_CODE, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(ORD_DEST_DESC, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ORD_SRC_SYS_DESC, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Z_ORD_DEST_DW_ID, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Z_ORD_SRC_SYS_DW_ID, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(CONSUMPTION_AREA, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CONSUMPTION_AREA_GROUP, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(INPUT_TYPE, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(INPUT_TYPE_GROUP, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FILE_DTTM, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(INSERT_DTTM, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATE_DTTM, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(INPUT_CONSUMPTION_LEVEL, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DIGITAL_INPUT, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DIGITAL_INPUT_GROUP, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(INPUT_CONSUMPTION_DETAIL, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOAD_DTTM, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_BY, 19 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.ORD_DEST_CODE = null;
    } else {
    this.ORD_DEST_CODE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ORD_SRC_SYS_CODE = null;
    } else {
    this.ORD_SRC_SYS_CODE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ORD_DEST_DESC = null;
    } else {
    this.ORD_DEST_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ORD_SRC_SYS_DESC = null;
    } else {
    this.ORD_SRC_SYS_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Z_ORD_DEST_DW_ID = null;
    } else {
    this.Z_ORD_DEST_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Z_ORD_SRC_SYS_DW_ID = null;
    } else {
    this.Z_ORD_SRC_SYS_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CONSUMPTION_AREA = null;
    } else {
    this.CONSUMPTION_AREA = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CONSUMPTION_AREA_GROUP = null;
    } else {
    this.CONSUMPTION_AREA_GROUP = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INPUT_TYPE = null;
    } else {
    this.INPUT_TYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INPUT_TYPE_GROUP = null;
    } else {
    this.INPUT_TYPE_GROUP = Text.readString(__dataIn);
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
        this.INPUT_CONSUMPTION_LEVEL = null;
    } else {
    this.INPUT_CONSUMPTION_LEVEL = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DIGITAL_INPUT = null;
    } else {
    this.DIGITAL_INPUT = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DIGITAL_INPUT_GROUP = null;
    } else {
    this.DIGITAL_INPUT_GROUP = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INPUT_CONSUMPTION_DETAIL = null;
    } else {
    this.INPUT_CONSUMPTION_DETAIL = Text.readString(__dataIn);
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
    if (null == this.ORD_DEST_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ORD_DEST_CODE, __dataOut);
    }
    if (null == this.ORD_SRC_SYS_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ORD_SRC_SYS_CODE, __dataOut);
    }
    if (null == this.ORD_DEST_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ORD_DEST_DESC);
    }
    if (null == this.ORD_SRC_SYS_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ORD_SRC_SYS_DESC);
    }
    if (null == this.Z_ORD_DEST_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Z_ORD_DEST_DW_ID, __dataOut);
    }
    if (null == this.Z_ORD_SRC_SYS_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Z_ORD_SRC_SYS_DW_ID, __dataOut);
    }
    if (null == this.CONSUMPTION_AREA) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CONSUMPTION_AREA);
    }
    if (null == this.CONSUMPTION_AREA_GROUP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CONSUMPTION_AREA_GROUP);
    }
    if (null == this.INPUT_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INPUT_TYPE);
    }
    if (null == this.INPUT_TYPE_GROUP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INPUT_TYPE_GROUP);
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
    if (null == this.INPUT_CONSUMPTION_LEVEL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INPUT_CONSUMPTION_LEVEL);
    }
    if (null == this.DIGITAL_INPUT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DIGITAL_INPUT);
    }
    if (null == this.DIGITAL_INPUT_GROUP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DIGITAL_INPUT_GROUP);
    }
    if (null == this.INPUT_CONSUMPTION_DETAIL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INPUT_CONSUMPTION_DETAIL);
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
    if (null == this.ORD_DEST_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ORD_DEST_CODE, __dataOut);
    }
    if (null == this.ORD_SRC_SYS_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ORD_SRC_SYS_CODE, __dataOut);
    }
    if (null == this.ORD_DEST_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ORD_DEST_DESC);
    }
    if (null == this.ORD_SRC_SYS_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ORD_SRC_SYS_DESC);
    }
    if (null == this.Z_ORD_DEST_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Z_ORD_DEST_DW_ID, __dataOut);
    }
    if (null == this.Z_ORD_SRC_SYS_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Z_ORD_SRC_SYS_DW_ID, __dataOut);
    }
    if (null == this.CONSUMPTION_AREA) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CONSUMPTION_AREA);
    }
    if (null == this.CONSUMPTION_AREA_GROUP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CONSUMPTION_AREA_GROUP);
    }
    if (null == this.INPUT_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INPUT_TYPE);
    }
    if (null == this.INPUT_TYPE_GROUP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INPUT_TYPE_GROUP);
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
    if (null == this.INPUT_CONSUMPTION_LEVEL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INPUT_CONSUMPTION_LEVEL);
    }
    if (null == this.DIGITAL_INPUT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DIGITAL_INPUT);
    }
    if (null == this.DIGITAL_INPUT_GROUP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DIGITAL_INPUT_GROUP);
    }
    if (null == this.INPUT_CONSUMPTION_DETAIL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INPUT_CONSUMPTION_DETAIL);
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
    __sb.append(FieldFormatter.escapeAndEnclose(ORD_DEST_CODE==null?"\\N":ORD_DEST_CODE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ORD_SRC_SYS_CODE==null?"\\N":ORD_SRC_SYS_CODE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ORD_DEST_DESC==null?"\\N":ORD_DEST_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ORD_SRC_SYS_DESC==null?"\\N":ORD_SRC_SYS_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Z_ORD_DEST_DW_ID==null?"\\N":Z_ORD_DEST_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Z_ORD_SRC_SYS_DW_ID==null?"\\N":Z_ORD_SRC_SYS_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONSUMPTION_AREA==null?"\\N":CONSUMPTION_AREA, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONSUMPTION_AREA_GROUP==null?"\\N":CONSUMPTION_AREA_GROUP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INPUT_TYPE==null?"\\N":INPUT_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INPUT_TYPE_GROUP==null?"\\N":INPUT_TYPE_GROUP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FILE_DTTM==null?"\\N":"" + FILE_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INSERT_DTTM==null?"\\N":"" + INSERT_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UPDATE_DTTM==null?"\\N":"" + UPDATE_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INPUT_CONSUMPTION_LEVEL==null?"\\N":INPUT_CONSUMPTION_LEVEL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DIGITAL_INPUT==null?"\\N":DIGITAL_INPUT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DIGITAL_INPUT_GROUP==null?"\\N":DIGITAL_INPUT_GROUP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INPUT_CONSUMPTION_DETAIL==null?"\\N":INPUT_CONSUMPTION_DETAIL, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(ORD_DEST_CODE==null?"\\N":ORD_DEST_CODE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ORD_SRC_SYS_CODE==null?"\\N":ORD_SRC_SYS_CODE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ORD_DEST_DESC==null?"\\N":ORD_DEST_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ORD_SRC_SYS_DESC==null?"\\N":ORD_SRC_SYS_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Z_ORD_DEST_DW_ID==null?"\\N":Z_ORD_DEST_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Z_ORD_SRC_SYS_DW_ID==null?"\\N":Z_ORD_SRC_SYS_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONSUMPTION_AREA==null?"\\N":CONSUMPTION_AREA, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONSUMPTION_AREA_GROUP==null?"\\N":CONSUMPTION_AREA_GROUP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INPUT_TYPE==null?"\\N":INPUT_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INPUT_TYPE_GROUP==null?"\\N":INPUT_TYPE_GROUP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FILE_DTTM==null?"\\N":"" + FILE_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INSERT_DTTM==null?"\\N":"" + INSERT_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UPDATE_DTTM==null?"\\N":"" + UPDATE_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INPUT_CONSUMPTION_LEVEL==null?"\\N":INPUT_CONSUMPTION_LEVEL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DIGITAL_INPUT==null?"\\N":DIGITAL_INPUT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DIGITAL_INPUT_GROUP==null?"\\N":DIGITAL_INPUT_GROUP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INPUT_CONSUMPTION_DETAIL==null?"\\N":INPUT_CONSUMPTION_DETAIL, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ORD_DEST_CODE = null; } else {
      this.ORD_DEST_CODE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ORD_SRC_SYS_CODE = null; } else {
      this.ORD_SRC_SYS_CODE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ORD_DEST_DESC = null; } else {
      this.ORD_DEST_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ORD_SRC_SYS_DESC = null; } else {
      this.ORD_SRC_SYS_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Z_ORD_DEST_DW_ID = null; } else {
      this.Z_ORD_DEST_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Z_ORD_SRC_SYS_DW_ID = null; } else {
      this.Z_ORD_SRC_SYS_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CONSUMPTION_AREA = null; } else {
      this.CONSUMPTION_AREA = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CONSUMPTION_AREA_GROUP = null; } else {
      this.CONSUMPTION_AREA_GROUP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.INPUT_TYPE = null; } else {
      this.INPUT_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.INPUT_TYPE_GROUP = null; } else {
      this.INPUT_TYPE_GROUP = __cur_str;
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
    if (__cur_str.equals("null")) { this.INPUT_CONSUMPTION_LEVEL = null; } else {
      this.INPUT_CONSUMPTION_LEVEL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DIGITAL_INPUT = null; } else {
      this.DIGITAL_INPUT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DIGITAL_INPUT_GROUP = null; } else {
      this.DIGITAL_INPUT_GROUP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.INPUT_CONSUMPTION_DETAIL = null; } else {
      this.INPUT_CONSUMPTION_DETAIL = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ORD_DEST_CODE = null; } else {
      this.ORD_DEST_CODE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ORD_SRC_SYS_CODE = null; } else {
      this.ORD_SRC_SYS_CODE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ORD_DEST_DESC = null; } else {
      this.ORD_DEST_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ORD_SRC_SYS_DESC = null; } else {
      this.ORD_SRC_SYS_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Z_ORD_DEST_DW_ID = null; } else {
      this.Z_ORD_DEST_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Z_ORD_SRC_SYS_DW_ID = null; } else {
      this.Z_ORD_SRC_SYS_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CONSUMPTION_AREA = null; } else {
      this.CONSUMPTION_AREA = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CONSUMPTION_AREA_GROUP = null; } else {
      this.CONSUMPTION_AREA_GROUP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.INPUT_TYPE = null; } else {
      this.INPUT_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.INPUT_TYPE_GROUP = null; } else {
      this.INPUT_TYPE_GROUP = __cur_str;
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
    if (__cur_str.equals("null")) { this.INPUT_CONSUMPTION_LEVEL = null; } else {
      this.INPUT_CONSUMPTION_LEVEL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DIGITAL_INPUT = null; } else {
      this.DIGITAL_INPUT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DIGITAL_INPUT_GROUP = null; } else {
      this.DIGITAL_INPUT_GROUP = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.INPUT_CONSUMPTION_DETAIL = null; } else {
      this.INPUT_CONSUMPTION_DETAIL = __cur_str;
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
    dim_ord_src_dest o = (dim_ord_src_dest) super.clone();
    o.FILE_DTTM = (o.FILE_DTTM != null) ? (java.sql.Timestamp) o.FILE_DTTM.clone() : null;
    o.INSERT_DTTM = (o.INSERT_DTTM != null) ? (java.sql.Timestamp) o.INSERT_DTTM.clone() : null;
    o.UPDATE_DTTM = (o.UPDATE_DTTM != null) ? (java.sql.Timestamp) o.UPDATE_DTTM.clone() : null;
    o.LOAD_DTTM = (o.LOAD_DTTM != null) ? (java.sql.Timestamp) o.LOAD_DTTM.clone() : null;
    return o;
  }

  public void clone0(dim_ord_src_dest o) throws CloneNotSupportedException {
    o.FILE_DTTM = (o.FILE_DTTM != null) ? (java.sql.Timestamp) o.FILE_DTTM.clone() : null;
    o.INSERT_DTTM = (o.INSERT_DTTM != null) ? (java.sql.Timestamp) o.INSERT_DTTM.clone() : null;
    o.UPDATE_DTTM = (o.UPDATE_DTTM != null) ? (java.sql.Timestamp) o.UPDATE_DTTM.clone() : null;
    o.LOAD_DTTM = (o.LOAD_DTTM != null) ? (java.sql.Timestamp) o.LOAD_DTTM.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("ORD_DEST_CODE", this.ORD_DEST_CODE);
    __sqoop$field_map.put("ORD_SRC_SYS_CODE", this.ORD_SRC_SYS_CODE);
    __sqoop$field_map.put("ORD_DEST_DESC", this.ORD_DEST_DESC);
    __sqoop$field_map.put("ORD_SRC_SYS_DESC", this.ORD_SRC_SYS_DESC);
    __sqoop$field_map.put("Z_ORD_DEST_DW_ID", this.Z_ORD_DEST_DW_ID);
    __sqoop$field_map.put("Z_ORD_SRC_SYS_DW_ID", this.Z_ORD_SRC_SYS_DW_ID);
    __sqoop$field_map.put("CONSUMPTION_AREA", this.CONSUMPTION_AREA);
    __sqoop$field_map.put("CONSUMPTION_AREA_GROUP", this.CONSUMPTION_AREA_GROUP);
    __sqoop$field_map.put("INPUT_TYPE", this.INPUT_TYPE);
    __sqoop$field_map.put("INPUT_TYPE_GROUP", this.INPUT_TYPE_GROUP);
    __sqoop$field_map.put("FILE_DTTM", this.FILE_DTTM);
    __sqoop$field_map.put("INSERT_DTTM", this.INSERT_DTTM);
    __sqoop$field_map.put("UPDATE_DTTM", this.UPDATE_DTTM);
    __sqoop$field_map.put("INPUT_CONSUMPTION_LEVEL", this.INPUT_CONSUMPTION_LEVEL);
    __sqoop$field_map.put("DIGITAL_INPUT", this.DIGITAL_INPUT);
    __sqoop$field_map.put("DIGITAL_INPUT_GROUP", this.DIGITAL_INPUT_GROUP);
    __sqoop$field_map.put("INPUT_CONSUMPTION_DETAIL", this.INPUT_CONSUMPTION_DETAIL);
    __sqoop$field_map.put("LOAD_DTTM", this.LOAD_DTTM);
    __sqoop$field_map.put("LOAD_BY", this.LOAD_BY);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("ORD_DEST_CODE", this.ORD_DEST_CODE);
    __sqoop$field_map.put("ORD_SRC_SYS_CODE", this.ORD_SRC_SYS_CODE);
    __sqoop$field_map.put("ORD_DEST_DESC", this.ORD_DEST_DESC);
    __sqoop$field_map.put("ORD_SRC_SYS_DESC", this.ORD_SRC_SYS_DESC);
    __sqoop$field_map.put("Z_ORD_DEST_DW_ID", this.Z_ORD_DEST_DW_ID);
    __sqoop$field_map.put("Z_ORD_SRC_SYS_DW_ID", this.Z_ORD_SRC_SYS_DW_ID);
    __sqoop$field_map.put("CONSUMPTION_AREA", this.CONSUMPTION_AREA);
    __sqoop$field_map.put("CONSUMPTION_AREA_GROUP", this.CONSUMPTION_AREA_GROUP);
    __sqoop$field_map.put("INPUT_TYPE", this.INPUT_TYPE);
    __sqoop$field_map.put("INPUT_TYPE_GROUP", this.INPUT_TYPE_GROUP);
    __sqoop$field_map.put("FILE_DTTM", this.FILE_DTTM);
    __sqoop$field_map.put("INSERT_DTTM", this.INSERT_DTTM);
    __sqoop$field_map.put("UPDATE_DTTM", this.UPDATE_DTTM);
    __sqoop$field_map.put("INPUT_CONSUMPTION_LEVEL", this.INPUT_CONSUMPTION_LEVEL);
    __sqoop$field_map.put("DIGITAL_INPUT", this.DIGITAL_INPUT);
    __sqoop$field_map.put("DIGITAL_INPUT_GROUP", this.DIGITAL_INPUT_GROUP);
    __sqoop$field_map.put("INPUT_CONSUMPTION_DETAIL", this.INPUT_CONSUMPTION_DETAIL);
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
