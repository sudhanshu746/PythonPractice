// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 29 17:02:19 GMT 2017
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

public class dim_star_qtr_hour extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("QTR_HOUR_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QTR_HOUR_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("QTR_HOUR_NBR_IN_DAY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QTR_HOUR_NBR_IN_DAY = (java.math.BigDecimal)value;
      }
    });
    setters.put("CAST(START_TIME_OF_DAYASTIMESTAMP)", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CAST_START_TIME_OF_DAYASTIMESTAMP_ = (java.sql.Timestamp)value;
      }
    });
    setters.put("CAST(STOP_TIME_OF_DAYASTIMESTAMP)", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CAST_STOP_TIME_OF_DAYASTIMESTAMP_ = (java.sql.Timestamp)value;
      }
    });
    setters.put("START_TIME_FRAC_OF_DAY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        START_TIME_FRAC_OF_DAY = (java.math.BigDecimal)value;
      }
    });
    setters.put("END_TIME_FRAC_OF_DAY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        END_TIME_FRAC_OF_DAY = (java.math.BigDecimal)value;
      }
    });
    setters.put("HOUR_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HOUR_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("HOUR_NBR_IN_DAY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HOUR_NBR_IN_DAY = (java.math.BigDecimal)value;
      }
    });
    setters.put("CAST(HOUR_START_TIME_OF_DAYASTIMESTAMP)", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_ = (java.sql.Timestamp)value;
      }
    });
    setters.put("CAST(HOUR_STOP_TIME_OF_DAYASTIMESTAMP)", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_ = (java.sql.Timestamp)value;
      }
    });
    setters.put("HOUR_START_TIME_FRAC_OF_DAY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HOUR_START_TIME_FRAC_OF_DAY = (java.math.BigDecimal)value;
      }
    });
    setters.put("HOUR_END_TIME_FRAC_OF_DAY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HOUR_END_TIME_FRAC_OF_DAY = (java.math.BigDecimal)value;
      }
    });
    setters.put("DAYPART_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DAYPART_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("DAYPART_NBR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DAYPART_NBR = (java.math.BigDecimal)value;
      }
    });
    setters.put("DAYPART_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DAYPART_DESC = (String)value;
      }
    });
    setters.put("DAYPART_TIME_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DAYPART_TIME_DESC = (String)value;
      }
    });
    setters.put("CAST(DAYPART_START_TIME_OF_DAYASTIMESTAMP)", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_ = (java.sql.Timestamp)value;
      }
    });
    setters.put("CAST(DAYPART_STOP_TIME_OF_DAYASTIMESTAMP)", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_ = (java.sql.Timestamp)value;
      }
    });
    setters.put("DAYPART_START_TIME_FRAC_OF_DAY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DAYPART_START_TIME_FRAC_OF_DAY = (java.math.BigDecimal)value;
      }
    });
    setters.put("DAYPART_END_TIME_FRAC_OF_DAY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DAYPART_END_TIME_FRAC_OF_DAY = (java.math.BigDecimal)value;
      }
    });
    setters.put("CAST(INSERT_DTTMASTIMESTAMP)", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CAST_INSERT_DTTMASTIMESTAMP_ = (java.sql.Timestamp)value;
      }
    });
    setters.put("CAST(UPDATE_DTTMASTIMESTAMP)", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CAST_UPDATE_DTTMASTIMESTAMP_ = (java.sql.Timestamp)value;
      }
    });
    setters.put("LOAD_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LOAD_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("VERSION", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        VERSION = (java.math.BigDecimal)value;
      }
    });
  }
  public dim_star_qtr_hour() {
    init0();
  }
  private java.math.BigDecimal QTR_HOUR_DW_ID;
  public java.math.BigDecimal get_QTR_HOUR_DW_ID() {
    return QTR_HOUR_DW_ID;
  }
  public void set_QTR_HOUR_DW_ID(java.math.BigDecimal QTR_HOUR_DW_ID) {
    this.QTR_HOUR_DW_ID = QTR_HOUR_DW_ID;
  }
  public dim_star_qtr_hour with_QTR_HOUR_DW_ID(java.math.BigDecimal QTR_HOUR_DW_ID) {
    this.QTR_HOUR_DW_ID = QTR_HOUR_DW_ID;
    return this;
  }
  private java.math.BigDecimal QTR_HOUR_NBR_IN_DAY;
  public java.math.BigDecimal get_QTR_HOUR_NBR_IN_DAY() {
    return QTR_HOUR_NBR_IN_DAY;
  }
  public void set_QTR_HOUR_NBR_IN_DAY(java.math.BigDecimal QTR_HOUR_NBR_IN_DAY) {
    this.QTR_HOUR_NBR_IN_DAY = QTR_HOUR_NBR_IN_DAY;
  }
  public dim_star_qtr_hour with_QTR_HOUR_NBR_IN_DAY(java.math.BigDecimal QTR_HOUR_NBR_IN_DAY) {
    this.QTR_HOUR_NBR_IN_DAY = QTR_HOUR_NBR_IN_DAY;
    return this;
  }
  private java.sql.Timestamp CAST_START_TIME_OF_DAYASTIMESTAMP_;
  public java.sql.Timestamp get_CAST_START_TIME_OF_DAYASTIMESTAMP_() {
    return CAST_START_TIME_OF_DAYASTIMESTAMP_;
  }
  public void set_CAST_START_TIME_OF_DAYASTIMESTAMP_(java.sql.Timestamp CAST_START_TIME_OF_DAYASTIMESTAMP_) {
    this.CAST_START_TIME_OF_DAYASTIMESTAMP_ = CAST_START_TIME_OF_DAYASTIMESTAMP_;
  }
  public dim_star_qtr_hour with_CAST_START_TIME_OF_DAYASTIMESTAMP_(java.sql.Timestamp CAST_START_TIME_OF_DAYASTIMESTAMP_) {
    this.CAST_START_TIME_OF_DAYASTIMESTAMP_ = CAST_START_TIME_OF_DAYASTIMESTAMP_;
    return this;
  }
  private java.sql.Timestamp CAST_STOP_TIME_OF_DAYASTIMESTAMP_;
  public java.sql.Timestamp get_CAST_STOP_TIME_OF_DAYASTIMESTAMP_() {
    return CAST_STOP_TIME_OF_DAYASTIMESTAMP_;
  }
  public void set_CAST_STOP_TIME_OF_DAYASTIMESTAMP_(java.sql.Timestamp CAST_STOP_TIME_OF_DAYASTIMESTAMP_) {
    this.CAST_STOP_TIME_OF_DAYASTIMESTAMP_ = CAST_STOP_TIME_OF_DAYASTIMESTAMP_;
  }
  public dim_star_qtr_hour with_CAST_STOP_TIME_OF_DAYASTIMESTAMP_(java.sql.Timestamp CAST_STOP_TIME_OF_DAYASTIMESTAMP_) {
    this.CAST_STOP_TIME_OF_DAYASTIMESTAMP_ = CAST_STOP_TIME_OF_DAYASTIMESTAMP_;
    return this;
  }
  private java.math.BigDecimal START_TIME_FRAC_OF_DAY;
  public java.math.BigDecimal get_START_TIME_FRAC_OF_DAY() {
    return START_TIME_FRAC_OF_DAY;
  }
  public void set_START_TIME_FRAC_OF_DAY(java.math.BigDecimal START_TIME_FRAC_OF_DAY) {
    this.START_TIME_FRAC_OF_DAY = START_TIME_FRAC_OF_DAY;
  }
  public dim_star_qtr_hour with_START_TIME_FRAC_OF_DAY(java.math.BigDecimal START_TIME_FRAC_OF_DAY) {
    this.START_TIME_FRAC_OF_DAY = START_TIME_FRAC_OF_DAY;
    return this;
  }
  private java.math.BigDecimal END_TIME_FRAC_OF_DAY;
  public java.math.BigDecimal get_END_TIME_FRAC_OF_DAY() {
    return END_TIME_FRAC_OF_DAY;
  }
  public void set_END_TIME_FRAC_OF_DAY(java.math.BigDecimal END_TIME_FRAC_OF_DAY) {
    this.END_TIME_FRAC_OF_DAY = END_TIME_FRAC_OF_DAY;
  }
  public dim_star_qtr_hour with_END_TIME_FRAC_OF_DAY(java.math.BigDecimal END_TIME_FRAC_OF_DAY) {
    this.END_TIME_FRAC_OF_DAY = END_TIME_FRAC_OF_DAY;
    return this;
  }
  private java.math.BigDecimal HOUR_DW_ID;
  public java.math.BigDecimal get_HOUR_DW_ID() {
    return HOUR_DW_ID;
  }
  public void set_HOUR_DW_ID(java.math.BigDecimal HOUR_DW_ID) {
    this.HOUR_DW_ID = HOUR_DW_ID;
  }
  public dim_star_qtr_hour with_HOUR_DW_ID(java.math.BigDecimal HOUR_DW_ID) {
    this.HOUR_DW_ID = HOUR_DW_ID;
    return this;
  }
  private java.math.BigDecimal HOUR_NBR_IN_DAY;
  public java.math.BigDecimal get_HOUR_NBR_IN_DAY() {
    return HOUR_NBR_IN_DAY;
  }
  public void set_HOUR_NBR_IN_DAY(java.math.BigDecimal HOUR_NBR_IN_DAY) {
    this.HOUR_NBR_IN_DAY = HOUR_NBR_IN_DAY;
  }
  public dim_star_qtr_hour with_HOUR_NBR_IN_DAY(java.math.BigDecimal HOUR_NBR_IN_DAY) {
    this.HOUR_NBR_IN_DAY = HOUR_NBR_IN_DAY;
    return this;
  }
  private java.sql.Timestamp CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_;
  public java.sql.Timestamp get_CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_() {
    return CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_;
  }
  public void set_CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_(java.sql.Timestamp CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_) {
    this.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_ = CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_;
  }
  public dim_star_qtr_hour with_CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_(java.sql.Timestamp CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_) {
    this.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_ = CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_;
    return this;
  }
  private java.sql.Timestamp CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_;
  public java.sql.Timestamp get_CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_() {
    return CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_;
  }
  public void set_CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_(java.sql.Timestamp CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_) {
    this.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_ = CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_;
  }
  public dim_star_qtr_hour with_CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_(java.sql.Timestamp CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_) {
    this.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_ = CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_;
    return this;
  }
  private java.math.BigDecimal HOUR_START_TIME_FRAC_OF_DAY;
  public java.math.BigDecimal get_HOUR_START_TIME_FRAC_OF_DAY() {
    return HOUR_START_TIME_FRAC_OF_DAY;
  }
  public void set_HOUR_START_TIME_FRAC_OF_DAY(java.math.BigDecimal HOUR_START_TIME_FRAC_OF_DAY) {
    this.HOUR_START_TIME_FRAC_OF_DAY = HOUR_START_TIME_FRAC_OF_DAY;
  }
  public dim_star_qtr_hour with_HOUR_START_TIME_FRAC_OF_DAY(java.math.BigDecimal HOUR_START_TIME_FRAC_OF_DAY) {
    this.HOUR_START_TIME_FRAC_OF_DAY = HOUR_START_TIME_FRAC_OF_DAY;
    return this;
  }
  private java.math.BigDecimal HOUR_END_TIME_FRAC_OF_DAY;
  public java.math.BigDecimal get_HOUR_END_TIME_FRAC_OF_DAY() {
    return HOUR_END_TIME_FRAC_OF_DAY;
  }
  public void set_HOUR_END_TIME_FRAC_OF_DAY(java.math.BigDecimal HOUR_END_TIME_FRAC_OF_DAY) {
    this.HOUR_END_TIME_FRAC_OF_DAY = HOUR_END_TIME_FRAC_OF_DAY;
  }
  public dim_star_qtr_hour with_HOUR_END_TIME_FRAC_OF_DAY(java.math.BigDecimal HOUR_END_TIME_FRAC_OF_DAY) {
    this.HOUR_END_TIME_FRAC_OF_DAY = HOUR_END_TIME_FRAC_OF_DAY;
    return this;
  }
  private java.math.BigDecimal DAYPART_DW_ID;
  public java.math.BigDecimal get_DAYPART_DW_ID() {
    return DAYPART_DW_ID;
  }
  public void set_DAYPART_DW_ID(java.math.BigDecimal DAYPART_DW_ID) {
    this.DAYPART_DW_ID = DAYPART_DW_ID;
  }
  public dim_star_qtr_hour with_DAYPART_DW_ID(java.math.BigDecimal DAYPART_DW_ID) {
    this.DAYPART_DW_ID = DAYPART_DW_ID;
    return this;
  }
  private java.math.BigDecimal DAYPART_NBR;
  public java.math.BigDecimal get_DAYPART_NBR() {
    return DAYPART_NBR;
  }
  public void set_DAYPART_NBR(java.math.BigDecimal DAYPART_NBR) {
    this.DAYPART_NBR = DAYPART_NBR;
  }
  public dim_star_qtr_hour with_DAYPART_NBR(java.math.BigDecimal DAYPART_NBR) {
    this.DAYPART_NBR = DAYPART_NBR;
    return this;
  }
  private String DAYPART_DESC;
  public String get_DAYPART_DESC() {
    return DAYPART_DESC;
  }
  public void set_DAYPART_DESC(String DAYPART_DESC) {
    this.DAYPART_DESC = DAYPART_DESC;
  }
  public dim_star_qtr_hour with_DAYPART_DESC(String DAYPART_DESC) {
    this.DAYPART_DESC = DAYPART_DESC;
    return this;
  }
  private String DAYPART_TIME_DESC;
  public String get_DAYPART_TIME_DESC() {
    return DAYPART_TIME_DESC;
  }
  public void set_DAYPART_TIME_DESC(String DAYPART_TIME_DESC) {
    this.DAYPART_TIME_DESC = DAYPART_TIME_DESC;
  }
  public dim_star_qtr_hour with_DAYPART_TIME_DESC(String DAYPART_TIME_DESC) {
    this.DAYPART_TIME_DESC = DAYPART_TIME_DESC;
    return this;
  }
  private java.sql.Timestamp CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_;
  public java.sql.Timestamp get_CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_() {
    return CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_;
  }
  public void set_CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_(java.sql.Timestamp CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_) {
    this.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_ = CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_;
  }
  public dim_star_qtr_hour with_CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_(java.sql.Timestamp CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_) {
    this.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_ = CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_;
    return this;
  }
  private java.sql.Timestamp CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_;
  public java.sql.Timestamp get_CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_() {
    return CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_;
  }
  public void set_CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_(java.sql.Timestamp CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_) {
    this.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_ = CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_;
  }
  public dim_star_qtr_hour with_CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_(java.sql.Timestamp CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_) {
    this.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_ = CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_;
    return this;
  }
  private java.math.BigDecimal DAYPART_START_TIME_FRAC_OF_DAY;
  public java.math.BigDecimal get_DAYPART_START_TIME_FRAC_OF_DAY() {
    return DAYPART_START_TIME_FRAC_OF_DAY;
  }
  public void set_DAYPART_START_TIME_FRAC_OF_DAY(java.math.BigDecimal DAYPART_START_TIME_FRAC_OF_DAY) {
    this.DAYPART_START_TIME_FRAC_OF_DAY = DAYPART_START_TIME_FRAC_OF_DAY;
  }
  public dim_star_qtr_hour with_DAYPART_START_TIME_FRAC_OF_DAY(java.math.BigDecimal DAYPART_START_TIME_FRAC_OF_DAY) {
    this.DAYPART_START_TIME_FRAC_OF_DAY = DAYPART_START_TIME_FRAC_OF_DAY;
    return this;
  }
  private java.math.BigDecimal DAYPART_END_TIME_FRAC_OF_DAY;
  public java.math.BigDecimal get_DAYPART_END_TIME_FRAC_OF_DAY() {
    return DAYPART_END_TIME_FRAC_OF_DAY;
  }
  public void set_DAYPART_END_TIME_FRAC_OF_DAY(java.math.BigDecimal DAYPART_END_TIME_FRAC_OF_DAY) {
    this.DAYPART_END_TIME_FRAC_OF_DAY = DAYPART_END_TIME_FRAC_OF_DAY;
  }
  public dim_star_qtr_hour with_DAYPART_END_TIME_FRAC_OF_DAY(java.math.BigDecimal DAYPART_END_TIME_FRAC_OF_DAY) {
    this.DAYPART_END_TIME_FRAC_OF_DAY = DAYPART_END_TIME_FRAC_OF_DAY;
    return this;
  }
  private java.sql.Timestamp CAST_INSERT_DTTMASTIMESTAMP_;
  public java.sql.Timestamp get_CAST_INSERT_DTTMASTIMESTAMP_() {
    return CAST_INSERT_DTTMASTIMESTAMP_;
  }
  public void set_CAST_INSERT_DTTMASTIMESTAMP_(java.sql.Timestamp CAST_INSERT_DTTMASTIMESTAMP_) {
    this.CAST_INSERT_DTTMASTIMESTAMP_ = CAST_INSERT_DTTMASTIMESTAMP_;
  }
  public dim_star_qtr_hour with_CAST_INSERT_DTTMASTIMESTAMP_(java.sql.Timestamp CAST_INSERT_DTTMASTIMESTAMP_) {
    this.CAST_INSERT_DTTMASTIMESTAMP_ = CAST_INSERT_DTTMASTIMESTAMP_;
    return this;
  }
  private java.sql.Timestamp CAST_UPDATE_DTTMASTIMESTAMP_;
  public java.sql.Timestamp get_CAST_UPDATE_DTTMASTIMESTAMP_() {
    return CAST_UPDATE_DTTMASTIMESTAMP_;
  }
  public void set_CAST_UPDATE_DTTMASTIMESTAMP_(java.sql.Timestamp CAST_UPDATE_DTTMASTIMESTAMP_) {
    this.CAST_UPDATE_DTTMASTIMESTAMP_ = CAST_UPDATE_DTTMASTIMESTAMP_;
  }
  public dim_star_qtr_hour with_CAST_UPDATE_DTTMASTIMESTAMP_(java.sql.Timestamp CAST_UPDATE_DTTMASTIMESTAMP_) {
    this.CAST_UPDATE_DTTMASTIMESTAMP_ = CAST_UPDATE_DTTMASTIMESTAMP_;
    return this;
  }
  private java.math.BigDecimal LOAD_ID;
  public java.math.BigDecimal get_LOAD_ID() {
    return LOAD_ID;
  }
  public void set_LOAD_ID(java.math.BigDecimal LOAD_ID) {
    this.LOAD_ID = LOAD_ID;
  }
  public dim_star_qtr_hour with_LOAD_ID(java.math.BigDecimal LOAD_ID) {
    this.LOAD_ID = LOAD_ID;
    return this;
  }
  private java.math.BigDecimal VERSION;
  public java.math.BigDecimal get_VERSION() {
    return VERSION;
  }
  public void set_VERSION(java.math.BigDecimal VERSION) {
    this.VERSION = VERSION;
  }
  public dim_star_qtr_hour with_VERSION(java.math.BigDecimal VERSION) {
    this.VERSION = VERSION;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_star_qtr_hour)) {
      return false;
    }
    dim_star_qtr_hour that = (dim_star_qtr_hour) o;
    boolean equal = true;
    equal = equal && (this.QTR_HOUR_DW_ID == null ? that.QTR_HOUR_DW_ID == null : this.QTR_HOUR_DW_ID.equals(that.QTR_HOUR_DW_ID));
    equal = equal && (this.QTR_HOUR_NBR_IN_DAY == null ? that.QTR_HOUR_NBR_IN_DAY == null : this.QTR_HOUR_NBR_IN_DAY.equals(that.QTR_HOUR_NBR_IN_DAY));
    equal = equal && (this.CAST_START_TIME_OF_DAYASTIMESTAMP_ == null ? that.CAST_START_TIME_OF_DAYASTIMESTAMP_ == null : this.CAST_START_TIME_OF_DAYASTIMESTAMP_.equals(that.CAST_START_TIME_OF_DAYASTIMESTAMP_));
    equal = equal && (this.CAST_STOP_TIME_OF_DAYASTIMESTAMP_ == null ? that.CAST_STOP_TIME_OF_DAYASTIMESTAMP_ == null : this.CAST_STOP_TIME_OF_DAYASTIMESTAMP_.equals(that.CAST_STOP_TIME_OF_DAYASTIMESTAMP_));
    equal = equal && (this.START_TIME_FRAC_OF_DAY == null ? that.START_TIME_FRAC_OF_DAY == null : this.START_TIME_FRAC_OF_DAY.equals(that.START_TIME_FRAC_OF_DAY));
    equal = equal && (this.END_TIME_FRAC_OF_DAY == null ? that.END_TIME_FRAC_OF_DAY == null : this.END_TIME_FRAC_OF_DAY.equals(that.END_TIME_FRAC_OF_DAY));
    equal = equal && (this.HOUR_DW_ID == null ? that.HOUR_DW_ID == null : this.HOUR_DW_ID.equals(that.HOUR_DW_ID));
    equal = equal && (this.HOUR_NBR_IN_DAY == null ? that.HOUR_NBR_IN_DAY == null : this.HOUR_NBR_IN_DAY.equals(that.HOUR_NBR_IN_DAY));
    equal = equal && (this.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_ == null ? that.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_ == null : this.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_.equals(that.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_));
    equal = equal && (this.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_ == null ? that.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_ == null : this.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_.equals(that.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_));
    equal = equal && (this.HOUR_START_TIME_FRAC_OF_DAY == null ? that.HOUR_START_TIME_FRAC_OF_DAY == null : this.HOUR_START_TIME_FRAC_OF_DAY.equals(that.HOUR_START_TIME_FRAC_OF_DAY));
    equal = equal && (this.HOUR_END_TIME_FRAC_OF_DAY == null ? that.HOUR_END_TIME_FRAC_OF_DAY == null : this.HOUR_END_TIME_FRAC_OF_DAY.equals(that.HOUR_END_TIME_FRAC_OF_DAY));
    equal = equal && (this.DAYPART_DW_ID == null ? that.DAYPART_DW_ID == null : this.DAYPART_DW_ID.equals(that.DAYPART_DW_ID));
    equal = equal && (this.DAYPART_NBR == null ? that.DAYPART_NBR == null : this.DAYPART_NBR.equals(that.DAYPART_NBR));
    equal = equal && (this.DAYPART_DESC == null ? that.DAYPART_DESC == null : this.DAYPART_DESC.equals(that.DAYPART_DESC));
    equal = equal && (this.DAYPART_TIME_DESC == null ? that.DAYPART_TIME_DESC == null : this.DAYPART_TIME_DESC.equals(that.DAYPART_TIME_DESC));
    equal = equal && (this.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_ == null ? that.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_ == null : this.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_.equals(that.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_));
    equal = equal && (this.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_ == null ? that.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_ == null : this.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_.equals(that.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_));
    equal = equal && (this.DAYPART_START_TIME_FRAC_OF_DAY == null ? that.DAYPART_START_TIME_FRAC_OF_DAY == null : this.DAYPART_START_TIME_FRAC_OF_DAY.equals(that.DAYPART_START_TIME_FRAC_OF_DAY));
    equal = equal && (this.DAYPART_END_TIME_FRAC_OF_DAY == null ? that.DAYPART_END_TIME_FRAC_OF_DAY == null : this.DAYPART_END_TIME_FRAC_OF_DAY.equals(that.DAYPART_END_TIME_FRAC_OF_DAY));
    equal = equal && (this.CAST_INSERT_DTTMASTIMESTAMP_ == null ? that.CAST_INSERT_DTTMASTIMESTAMP_ == null : this.CAST_INSERT_DTTMASTIMESTAMP_.equals(that.CAST_INSERT_DTTMASTIMESTAMP_));
    equal = equal && (this.CAST_UPDATE_DTTMASTIMESTAMP_ == null ? that.CAST_UPDATE_DTTMASTIMESTAMP_ == null : this.CAST_UPDATE_DTTMASTIMESTAMP_.equals(that.CAST_UPDATE_DTTMASTIMESTAMP_));
    equal = equal && (this.LOAD_ID == null ? that.LOAD_ID == null : this.LOAD_ID.equals(that.LOAD_ID));
    equal = equal && (this.VERSION == null ? that.VERSION == null : this.VERSION.equals(that.VERSION));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_star_qtr_hour)) {
      return false;
    }
    dim_star_qtr_hour that = (dim_star_qtr_hour) o;
    boolean equal = true;
    equal = equal && (this.QTR_HOUR_DW_ID == null ? that.QTR_HOUR_DW_ID == null : this.QTR_HOUR_DW_ID.equals(that.QTR_HOUR_DW_ID));
    equal = equal && (this.QTR_HOUR_NBR_IN_DAY == null ? that.QTR_HOUR_NBR_IN_DAY == null : this.QTR_HOUR_NBR_IN_DAY.equals(that.QTR_HOUR_NBR_IN_DAY));
    equal = equal && (this.CAST_START_TIME_OF_DAYASTIMESTAMP_ == null ? that.CAST_START_TIME_OF_DAYASTIMESTAMP_ == null : this.CAST_START_TIME_OF_DAYASTIMESTAMP_.equals(that.CAST_START_TIME_OF_DAYASTIMESTAMP_));
    equal = equal && (this.CAST_STOP_TIME_OF_DAYASTIMESTAMP_ == null ? that.CAST_STOP_TIME_OF_DAYASTIMESTAMP_ == null : this.CAST_STOP_TIME_OF_DAYASTIMESTAMP_.equals(that.CAST_STOP_TIME_OF_DAYASTIMESTAMP_));
    equal = equal && (this.START_TIME_FRAC_OF_DAY == null ? that.START_TIME_FRAC_OF_DAY == null : this.START_TIME_FRAC_OF_DAY.equals(that.START_TIME_FRAC_OF_DAY));
    equal = equal && (this.END_TIME_FRAC_OF_DAY == null ? that.END_TIME_FRAC_OF_DAY == null : this.END_TIME_FRAC_OF_DAY.equals(that.END_TIME_FRAC_OF_DAY));
    equal = equal && (this.HOUR_DW_ID == null ? that.HOUR_DW_ID == null : this.HOUR_DW_ID.equals(that.HOUR_DW_ID));
    equal = equal && (this.HOUR_NBR_IN_DAY == null ? that.HOUR_NBR_IN_DAY == null : this.HOUR_NBR_IN_DAY.equals(that.HOUR_NBR_IN_DAY));
    equal = equal && (this.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_ == null ? that.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_ == null : this.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_.equals(that.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_));
    equal = equal && (this.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_ == null ? that.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_ == null : this.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_.equals(that.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_));
    equal = equal && (this.HOUR_START_TIME_FRAC_OF_DAY == null ? that.HOUR_START_TIME_FRAC_OF_DAY == null : this.HOUR_START_TIME_FRAC_OF_DAY.equals(that.HOUR_START_TIME_FRAC_OF_DAY));
    equal = equal && (this.HOUR_END_TIME_FRAC_OF_DAY == null ? that.HOUR_END_TIME_FRAC_OF_DAY == null : this.HOUR_END_TIME_FRAC_OF_DAY.equals(that.HOUR_END_TIME_FRAC_OF_DAY));
    equal = equal && (this.DAYPART_DW_ID == null ? that.DAYPART_DW_ID == null : this.DAYPART_DW_ID.equals(that.DAYPART_DW_ID));
    equal = equal && (this.DAYPART_NBR == null ? that.DAYPART_NBR == null : this.DAYPART_NBR.equals(that.DAYPART_NBR));
    equal = equal && (this.DAYPART_DESC == null ? that.DAYPART_DESC == null : this.DAYPART_DESC.equals(that.DAYPART_DESC));
    equal = equal && (this.DAYPART_TIME_DESC == null ? that.DAYPART_TIME_DESC == null : this.DAYPART_TIME_DESC.equals(that.DAYPART_TIME_DESC));
    equal = equal && (this.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_ == null ? that.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_ == null : this.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_.equals(that.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_));
    equal = equal && (this.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_ == null ? that.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_ == null : this.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_.equals(that.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_));
    equal = equal && (this.DAYPART_START_TIME_FRAC_OF_DAY == null ? that.DAYPART_START_TIME_FRAC_OF_DAY == null : this.DAYPART_START_TIME_FRAC_OF_DAY.equals(that.DAYPART_START_TIME_FRAC_OF_DAY));
    equal = equal && (this.DAYPART_END_TIME_FRAC_OF_DAY == null ? that.DAYPART_END_TIME_FRAC_OF_DAY == null : this.DAYPART_END_TIME_FRAC_OF_DAY.equals(that.DAYPART_END_TIME_FRAC_OF_DAY));
    equal = equal && (this.CAST_INSERT_DTTMASTIMESTAMP_ == null ? that.CAST_INSERT_DTTMASTIMESTAMP_ == null : this.CAST_INSERT_DTTMASTIMESTAMP_.equals(that.CAST_INSERT_DTTMASTIMESTAMP_));
    equal = equal && (this.CAST_UPDATE_DTTMASTIMESTAMP_ == null ? that.CAST_UPDATE_DTTMASTIMESTAMP_ == null : this.CAST_UPDATE_DTTMASTIMESTAMP_.equals(that.CAST_UPDATE_DTTMASTIMESTAMP_));
    equal = equal && (this.LOAD_ID == null ? that.LOAD_ID == null : this.LOAD_ID.equals(that.LOAD_ID));
    equal = equal && (this.VERSION == null ? that.VERSION == null : this.VERSION.equals(that.VERSION));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.QTR_HOUR_DW_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.QTR_HOUR_NBR_IN_DAY = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.CAST_START_TIME_OF_DAYASTIMESTAMP_ = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.CAST_STOP_TIME_OF_DAYASTIMESTAMP_ = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.START_TIME_FRAC_OF_DAY = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.END_TIME_FRAC_OF_DAY = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.HOUR_DW_ID = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.HOUR_NBR_IN_DAY = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_ = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_ = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.HOUR_START_TIME_FRAC_OF_DAY = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.HOUR_END_TIME_FRAC_OF_DAY = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.DAYPART_DW_ID = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.DAYPART_NBR = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.DAYPART_DESC = JdbcWritableBridge.readString(15, __dbResults);
    this.DAYPART_TIME_DESC = JdbcWritableBridge.readString(16, __dbResults);
    this.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_ = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_ = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.DAYPART_START_TIME_FRAC_OF_DAY = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.DAYPART_END_TIME_FRAC_OF_DAY = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.CAST_INSERT_DTTMASTIMESTAMP_ = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.CAST_UPDATE_DTTMASTIMESTAMP_ = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.LOAD_ID = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.VERSION = JdbcWritableBridge.readBigDecimal(24, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.QTR_HOUR_DW_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.QTR_HOUR_NBR_IN_DAY = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.CAST_START_TIME_OF_DAYASTIMESTAMP_ = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.CAST_STOP_TIME_OF_DAYASTIMESTAMP_ = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.START_TIME_FRAC_OF_DAY = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.END_TIME_FRAC_OF_DAY = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.HOUR_DW_ID = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.HOUR_NBR_IN_DAY = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_ = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_ = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.HOUR_START_TIME_FRAC_OF_DAY = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.HOUR_END_TIME_FRAC_OF_DAY = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.DAYPART_DW_ID = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.DAYPART_NBR = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.DAYPART_DESC = JdbcWritableBridge.readString(15, __dbResults);
    this.DAYPART_TIME_DESC = JdbcWritableBridge.readString(16, __dbResults);
    this.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_ = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_ = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.DAYPART_START_TIME_FRAC_OF_DAY = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.DAYPART_END_TIME_FRAC_OF_DAY = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.CAST_INSERT_DTTMASTIMESTAMP_ = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.CAST_UPDATE_DTTMASTIMESTAMP_ = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.LOAD_ID = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.VERSION = JdbcWritableBridge.readBigDecimal(24, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(QTR_HOUR_DW_ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(QTR_HOUR_NBR_IN_DAY, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CAST_START_TIME_OF_DAYASTIMESTAMP_, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CAST_STOP_TIME_OF_DAYASTIMESTAMP_, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(START_TIME_FRAC_OF_DAY, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(END_TIME_FRAC_OF_DAY, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HOUR_DW_ID, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HOUR_NBR_IN_DAY, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HOUR_START_TIME_FRAC_OF_DAY, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HOUR_END_TIME_FRAC_OF_DAY, 12 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAYPART_DW_ID, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAYPART_NBR, 14 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(DAYPART_DESC, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DAYPART_TIME_DESC, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAYPART_START_TIME_FRAC_OF_DAY, 19 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAYPART_END_TIME_FRAC_OF_DAY, 20 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CAST_INSERT_DTTMASTIMESTAMP_, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CAST_UPDATE_DTTMASTIMESTAMP_, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOAD_ID, 23 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VERSION, 24 + __off, 2, __dbStmt);
    return 24;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(QTR_HOUR_DW_ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(QTR_HOUR_NBR_IN_DAY, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CAST_START_TIME_OF_DAYASTIMESTAMP_, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CAST_STOP_TIME_OF_DAYASTIMESTAMP_, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(START_TIME_FRAC_OF_DAY, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(END_TIME_FRAC_OF_DAY, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HOUR_DW_ID, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HOUR_NBR_IN_DAY, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HOUR_START_TIME_FRAC_OF_DAY, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HOUR_END_TIME_FRAC_OF_DAY, 12 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAYPART_DW_ID, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAYPART_NBR, 14 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(DAYPART_DESC, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DAYPART_TIME_DESC, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAYPART_START_TIME_FRAC_OF_DAY, 19 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAYPART_END_TIME_FRAC_OF_DAY, 20 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CAST_INSERT_DTTMASTIMESTAMP_, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CAST_UPDATE_DTTMASTIMESTAMP_, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOAD_ID, 23 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VERSION, 24 + __off, 2, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.QTR_HOUR_DW_ID = null;
    } else {
    this.QTR_HOUR_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.QTR_HOUR_NBR_IN_DAY = null;
    } else {
    this.QTR_HOUR_NBR_IN_DAY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CAST_START_TIME_OF_DAYASTIMESTAMP_ = null;
    } else {
    this.CAST_START_TIME_OF_DAYASTIMESTAMP_ = new Timestamp(__dataIn.readLong());
    this.CAST_START_TIME_OF_DAYASTIMESTAMP_.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CAST_STOP_TIME_OF_DAYASTIMESTAMP_ = null;
    } else {
    this.CAST_STOP_TIME_OF_DAYASTIMESTAMP_ = new Timestamp(__dataIn.readLong());
    this.CAST_STOP_TIME_OF_DAYASTIMESTAMP_.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.START_TIME_FRAC_OF_DAY = null;
    } else {
    this.START_TIME_FRAC_OF_DAY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.END_TIME_FRAC_OF_DAY = null;
    } else {
    this.END_TIME_FRAC_OF_DAY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOUR_DW_ID = null;
    } else {
    this.HOUR_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOUR_NBR_IN_DAY = null;
    } else {
    this.HOUR_NBR_IN_DAY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_ = null;
    } else {
    this.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_ = new Timestamp(__dataIn.readLong());
    this.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_ = null;
    } else {
    this.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_ = new Timestamp(__dataIn.readLong());
    this.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.HOUR_START_TIME_FRAC_OF_DAY = null;
    } else {
    this.HOUR_START_TIME_FRAC_OF_DAY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOUR_END_TIME_FRAC_OF_DAY = null;
    } else {
    this.HOUR_END_TIME_FRAC_OF_DAY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DAYPART_DW_ID = null;
    } else {
    this.DAYPART_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DAYPART_NBR = null;
    } else {
    this.DAYPART_NBR = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DAYPART_DESC = null;
    } else {
    this.DAYPART_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DAYPART_TIME_DESC = null;
    } else {
    this.DAYPART_TIME_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_ = null;
    } else {
    this.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_ = new Timestamp(__dataIn.readLong());
    this.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_ = null;
    } else {
    this.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_ = new Timestamp(__dataIn.readLong());
    this.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DAYPART_START_TIME_FRAC_OF_DAY = null;
    } else {
    this.DAYPART_START_TIME_FRAC_OF_DAY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DAYPART_END_TIME_FRAC_OF_DAY = null;
    } else {
    this.DAYPART_END_TIME_FRAC_OF_DAY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CAST_INSERT_DTTMASTIMESTAMP_ = null;
    } else {
    this.CAST_INSERT_DTTMASTIMESTAMP_ = new Timestamp(__dataIn.readLong());
    this.CAST_INSERT_DTTMASTIMESTAMP_.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CAST_UPDATE_DTTMASTIMESTAMP_ = null;
    } else {
    this.CAST_UPDATE_DTTMASTIMESTAMP_ = new Timestamp(__dataIn.readLong());
    this.CAST_UPDATE_DTTMASTIMESTAMP_.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.LOAD_ID = null;
    } else {
    this.LOAD_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VERSION = null;
    } else {
    this.VERSION = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.QTR_HOUR_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.QTR_HOUR_DW_ID, __dataOut);
    }
    if (null == this.QTR_HOUR_NBR_IN_DAY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.QTR_HOUR_NBR_IN_DAY, __dataOut);
    }
    if (null == this.CAST_START_TIME_OF_DAYASTIMESTAMP_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CAST_START_TIME_OF_DAYASTIMESTAMP_.getTime());
    __dataOut.writeInt(this.CAST_START_TIME_OF_DAYASTIMESTAMP_.getNanos());
    }
    if (null == this.CAST_STOP_TIME_OF_DAYASTIMESTAMP_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CAST_STOP_TIME_OF_DAYASTIMESTAMP_.getTime());
    __dataOut.writeInt(this.CAST_STOP_TIME_OF_DAYASTIMESTAMP_.getNanos());
    }
    if (null == this.START_TIME_FRAC_OF_DAY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.START_TIME_FRAC_OF_DAY, __dataOut);
    }
    if (null == this.END_TIME_FRAC_OF_DAY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.END_TIME_FRAC_OF_DAY, __dataOut);
    }
    if (null == this.HOUR_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HOUR_DW_ID, __dataOut);
    }
    if (null == this.HOUR_NBR_IN_DAY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HOUR_NBR_IN_DAY, __dataOut);
    }
    if (null == this.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_.getTime());
    __dataOut.writeInt(this.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_.getNanos());
    }
    if (null == this.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_.getTime());
    __dataOut.writeInt(this.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_.getNanos());
    }
    if (null == this.HOUR_START_TIME_FRAC_OF_DAY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HOUR_START_TIME_FRAC_OF_DAY, __dataOut);
    }
    if (null == this.HOUR_END_TIME_FRAC_OF_DAY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HOUR_END_TIME_FRAC_OF_DAY, __dataOut);
    }
    if (null == this.DAYPART_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAYPART_DW_ID, __dataOut);
    }
    if (null == this.DAYPART_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAYPART_NBR, __dataOut);
    }
    if (null == this.DAYPART_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DAYPART_DESC);
    }
    if (null == this.DAYPART_TIME_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DAYPART_TIME_DESC);
    }
    if (null == this.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_.getTime());
    __dataOut.writeInt(this.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_.getNanos());
    }
    if (null == this.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_.getTime());
    __dataOut.writeInt(this.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_.getNanos());
    }
    if (null == this.DAYPART_START_TIME_FRAC_OF_DAY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAYPART_START_TIME_FRAC_OF_DAY, __dataOut);
    }
    if (null == this.DAYPART_END_TIME_FRAC_OF_DAY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAYPART_END_TIME_FRAC_OF_DAY, __dataOut);
    }
    if (null == this.CAST_INSERT_DTTMASTIMESTAMP_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CAST_INSERT_DTTMASTIMESTAMP_.getTime());
    __dataOut.writeInt(this.CAST_INSERT_DTTMASTIMESTAMP_.getNanos());
    }
    if (null == this.CAST_UPDATE_DTTMASTIMESTAMP_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CAST_UPDATE_DTTMASTIMESTAMP_.getTime());
    __dataOut.writeInt(this.CAST_UPDATE_DTTMASTIMESTAMP_.getNanos());
    }
    if (null == this.LOAD_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOAD_ID, __dataOut);
    }
    if (null == this.VERSION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VERSION, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.QTR_HOUR_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.QTR_HOUR_DW_ID, __dataOut);
    }
    if (null == this.QTR_HOUR_NBR_IN_DAY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.QTR_HOUR_NBR_IN_DAY, __dataOut);
    }
    if (null == this.CAST_START_TIME_OF_DAYASTIMESTAMP_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CAST_START_TIME_OF_DAYASTIMESTAMP_.getTime());
    __dataOut.writeInt(this.CAST_START_TIME_OF_DAYASTIMESTAMP_.getNanos());
    }
    if (null == this.CAST_STOP_TIME_OF_DAYASTIMESTAMP_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CAST_STOP_TIME_OF_DAYASTIMESTAMP_.getTime());
    __dataOut.writeInt(this.CAST_STOP_TIME_OF_DAYASTIMESTAMP_.getNanos());
    }
    if (null == this.START_TIME_FRAC_OF_DAY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.START_TIME_FRAC_OF_DAY, __dataOut);
    }
    if (null == this.END_TIME_FRAC_OF_DAY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.END_TIME_FRAC_OF_DAY, __dataOut);
    }
    if (null == this.HOUR_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HOUR_DW_ID, __dataOut);
    }
    if (null == this.HOUR_NBR_IN_DAY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HOUR_NBR_IN_DAY, __dataOut);
    }
    if (null == this.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_.getTime());
    __dataOut.writeInt(this.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_.getNanos());
    }
    if (null == this.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_.getTime());
    __dataOut.writeInt(this.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_.getNanos());
    }
    if (null == this.HOUR_START_TIME_FRAC_OF_DAY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HOUR_START_TIME_FRAC_OF_DAY, __dataOut);
    }
    if (null == this.HOUR_END_TIME_FRAC_OF_DAY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HOUR_END_TIME_FRAC_OF_DAY, __dataOut);
    }
    if (null == this.DAYPART_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAYPART_DW_ID, __dataOut);
    }
    if (null == this.DAYPART_NBR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAYPART_NBR, __dataOut);
    }
    if (null == this.DAYPART_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DAYPART_DESC);
    }
    if (null == this.DAYPART_TIME_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DAYPART_TIME_DESC);
    }
    if (null == this.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_.getTime());
    __dataOut.writeInt(this.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_.getNanos());
    }
    if (null == this.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_.getTime());
    __dataOut.writeInt(this.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_.getNanos());
    }
    if (null == this.DAYPART_START_TIME_FRAC_OF_DAY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAYPART_START_TIME_FRAC_OF_DAY, __dataOut);
    }
    if (null == this.DAYPART_END_TIME_FRAC_OF_DAY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAYPART_END_TIME_FRAC_OF_DAY, __dataOut);
    }
    if (null == this.CAST_INSERT_DTTMASTIMESTAMP_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CAST_INSERT_DTTMASTIMESTAMP_.getTime());
    __dataOut.writeInt(this.CAST_INSERT_DTTMASTIMESTAMP_.getNanos());
    }
    if (null == this.CAST_UPDATE_DTTMASTIMESTAMP_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CAST_UPDATE_DTTMASTIMESTAMP_.getTime());
    __dataOut.writeInt(this.CAST_UPDATE_DTTMASTIMESTAMP_.getNanos());
    }
    if (null == this.LOAD_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOAD_ID, __dataOut);
    }
    if (null == this.VERSION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VERSION, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(QTR_HOUR_DW_ID==null?"\\N":QTR_HOUR_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(QTR_HOUR_NBR_IN_DAY==null?"\\N":QTR_HOUR_NBR_IN_DAY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAST_START_TIME_OF_DAYASTIMESTAMP_==null?"\\N":"" + CAST_START_TIME_OF_DAYASTIMESTAMP_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAST_STOP_TIME_OF_DAYASTIMESTAMP_==null?"\\N":"" + CAST_STOP_TIME_OF_DAYASTIMESTAMP_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(START_TIME_FRAC_OF_DAY==null?"\\N":START_TIME_FRAC_OF_DAY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(END_TIME_FRAC_OF_DAY==null?"\\N":END_TIME_FRAC_OF_DAY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOUR_DW_ID==null?"\\N":HOUR_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOUR_NBR_IN_DAY==null?"\\N":HOUR_NBR_IN_DAY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_==null?"\\N":"" + CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_==null?"\\N":"" + CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOUR_START_TIME_FRAC_OF_DAY==null?"\\N":HOUR_START_TIME_FRAC_OF_DAY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOUR_END_TIME_FRAC_OF_DAY==null?"\\N":HOUR_END_TIME_FRAC_OF_DAY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAYPART_DW_ID==null?"\\N":DAYPART_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAYPART_NBR==null?"\\N":DAYPART_NBR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAYPART_DESC==null?"\\N":DAYPART_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAYPART_TIME_DESC==null?"\\N":DAYPART_TIME_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_==null?"\\N":"" + CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_==null?"\\N":"" + CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAYPART_START_TIME_FRAC_OF_DAY==null?"\\N":DAYPART_START_TIME_FRAC_OF_DAY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAYPART_END_TIME_FRAC_OF_DAY==null?"\\N":DAYPART_END_TIME_FRAC_OF_DAY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAST_INSERT_DTTMASTIMESTAMP_==null?"\\N":"" + CAST_INSERT_DTTMASTIMESTAMP_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAST_UPDATE_DTTMASTIMESTAMP_==null?"\\N":"" + CAST_UPDATE_DTTMASTIMESTAMP_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOAD_ID==null?"\\N":LOAD_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERSION==null?"\\N":VERSION.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(QTR_HOUR_DW_ID==null?"\\N":QTR_HOUR_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(QTR_HOUR_NBR_IN_DAY==null?"\\N":QTR_HOUR_NBR_IN_DAY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAST_START_TIME_OF_DAYASTIMESTAMP_==null?"\\N":"" + CAST_START_TIME_OF_DAYASTIMESTAMP_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAST_STOP_TIME_OF_DAYASTIMESTAMP_==null?"\\N":"" + CAST_STOP_TIME_OF_DAYASTIMESTAMP_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(START_TIME_FRAC_OF_DAY==null?"\\N":START_TIME_FRAC_OF_DAY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(END_TIME_FRAC_OF_DAY==null?"\\N":END_TIME_FRAC_OF_DAY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOUR_DW_ID==null?"\\N":HOUR_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOUR_NBR_IN_DAY==null?"\\N":HOUR_NBR_IN_DAY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_==null?"\\N":"" + CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_==null?"\\N":"" + CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOUR_START_TIME_FRAC_OF_DAY==null?"\\N":HOUR_START_TIME_FRAC_OF_DAY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOUR_END_TIME_FRAC_OF_DAY==null?"\\N":HOUR_END_TIME_FRAC_OF_DAY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAYPART_DW_ID==null?"\\N":DAYPART_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAYPART_NBR==null?"\\N":DAYPART_NBR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAYPART_DESC==null?"\\N":DAYPART_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAYPART_TIME_DESC==null?"\\N":DAYPART_TIME_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_==null?"\\N":"" + CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_==null?"\\N":"" + CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAYPART_START_TIME_FRAC_OF_DAY==null?"\\N":DAYPART_START_TIME_FRAC_OF_DAY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAYPART_END_TIME_FRAC_OF_DAY==null?"\\N":DAYPART_END_TIME_FRAC_OF_DAY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAST_INSERT_DTTMASTIMESTAMP_==null?"\\N":"" + CAST_INSERT_DTTMASTIMESTAMP_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAST_UPDATE_DTTMASTIMESTAMP_==null?"\\N":"" + CAST_UPDATE_DTTMASTIMESTAMP_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOAD_ID==null?"\\N":LOAD_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERSION==null?"\\N":VERSION.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.QTR_HOUR_DW_ID = null; } else {
      this.QTR_HOUR_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.QTR_HOUR_NBR_IN_DAY = null; } else {
      this.QTR_HOUR_NBR_IN_DAY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CAST_START_TIME_OF_DAYASTIMESTAMP_ = null; } else {
      this.CAST_START_TIME_OF_DAYASTIMESTAMP_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CAST_STOP_TIME_OF_DAYASTIMESTAMP_ = null; } else {
      this.CAST_STOP_TIME_OF_DAYASTIMESTAMP_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.START_TIME_FRAC_OF_DAY = null; } else {
      this.START_TIME_FRAC_OF_DAY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.END_TIME_FRAC_OF_DAY = null; } else {
      this.END_TIME_FRAC_OF_DAY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HOUR_DW_ID = null; } else {
      this.HOUR_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HOUR_NBR_IN_DAY = null; } else {
      this.HOUR_NBR_IN_DAY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_ = null; } else {
      this.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_ = null; } else {
      this.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HOUR_START_TIME_FRAC_OF_DAY = null; } else {
      this.HOUR_START_TIME_FRAC_OF_DAY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HOUR_END_TIME_FRAC_OF_DAY = null; } else {
      this.HOUR_END_TIME_FRAC_OF_DAY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAYPART_DW_ID = null; } else {
      this.DAYPART_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAYPART_NBR = null; } else {
      this.DAYPART_NBR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DAYPART_DESC = null; } else {
      this.DAYPART_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DAYPART_TIME_DESC = null; } else {
      this.DAYPART_TIME_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_ = null; } else {
      this.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_ = null; } else {
      this.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAYPART_START_TIME_FRAC_OF_DAY = null; } else {
      this.DAYPART_START_TIME_FRAC_OF_DAY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAYPART_END_TIME_FRAC_OF_DAY = null; } else {
      this.DAYPART_END_TIME_FRAC_OF_DAY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CAST_INSERT_DTTMASTIMESTAMP_ = null; } else {
      this.CAST_INSERT_DTTMASTIMESTAMP_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CAST_UPDATE_DTTMASTIMESTAMP_ = null; } else {
      this.CAST_UPDATE_DTTMASTIMESTAMP_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LOAD_ID = null; } else {
      this.LOAD_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VERSION = null; } else {
      this.VERSION = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.QTR_HOUR_DW_ID = null; } else {
      this.QTR_HOUR_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.QTR_HOUR_NBR_IN_DAY = null; } else {
      this.QTR_HOUR_NBR_IN_DAY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CAST_START_TIME_OF_DAYASTIMESTAMP_ = null; } else {
      this.CAST_START_TIME_OF_DAYASTIMESTAMP_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CAST_STOP_TIME_OF_DAYASTIMESTAMP_ = null; } else {
      this.CAST_STOP_TIME_OF_DAYASTIMESTAMP_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.START_TIME_FRAC_OF_DAY = null; } else {
      this.START_TIME_FRAC_OF_DAY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.END_TIME_FRAC_OF_DAY = null; } else {
      this.END_TIME_FRAC_OF_DAY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HOUR_DW_ID = null; } else {
      this.HOUR_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HOUR_NBR_IN_DAY = null; } else {
      this.HOUR_NBR_IN_DAY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_ = null; } else {
      this.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_ = null; } else {
      this.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HOUR_START_TIME_FRAC_OF_DAY = null; } else {
      this.HOUR_START_TIME_FRAC_OF_DAY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HOUR_END_TIME_FRAC_OF_DAY = null; } else {
      this.HOUR_END_TIME_FRAC_OF_DAY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAYPART_DW_ID = null; } else {
      this.DAYPART_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAYPART_NBR = null; } else {
      this.DAYPART_NBR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DAYPART_DESC = null; } else {
      this.DAYPART_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DAYPART_TIME_DESC = null; } else {
      this.DAYPART_TIME_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_ = null; } else {
      this.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_ = null; } else {
      this.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAYPART_START_TIME_FRAC_OF_DAY = null; } else {
      this.DAYPART_START_TIME_FRAC_OF_DAY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DAYPART_END_TIME_FRAC_OF_DAY = null; } else {
      this.DAYPART_END_TIME_FRAC_OF_DAY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CAST_INSERT_DTTMASTIMESTAMP_ = null; } else {
      this.CAST_INSERT_DTTMASTIMESTAMP_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CAST_UPDATE_DTTMASTIMESTAMP_ = null; } else {
      this.CAST_UPDATE_DTTMASTIMESTAMP_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LOAD_ID = null; } else {
      this.LOAD_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VERSION = null; } else {
      this.VERSION = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    dim_star_qtr_hour o = (dim_star_qtr_hour) super.clone();
    o.CAST_START_TIME_OF_DAYASTIMESTAMP_ = (o.CAST_START_TIME_OF_DAYASTIMESTAMP_ != null) ? (java.sql.Timestamp) o.CAST_START_TIME_OF_DAYASTIMESTAMP_.clone() : null;
    o.CAST_STOP_TIME_OF_DAYASTIMESTAMP_ = (o.CAST_STOP_TIME_OF_DAYASTIMESTAMP_ != null) ? (java.sql.Timestamp) o.CAST_STOP_TIME_OF_DAYASTIMESTAMP_.clone() : null;
    o.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_ = (o.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_ != null) ? (java.sql.Timestamp) o.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_.clone() : null;
    o.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_ = (o.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_ != null) ? (java.sql.Timestamp) o.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_.clone() : null;
    o.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_ = (o.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_ != null) ? (java.sql.Timestamp) o.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_.clone() : null;
    o.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_ = (o.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_ != null) ? (java.sql.Timestamp) o.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_.clone() : null;
    o.CAST_INSERT_DTTMASTIMESTAMP_ = (o.CAST_INSERT_DTTMASTIMESTAMP_ != null) ? (java.sql.Timestamp) o.CAST_INSERT_DTTMASTIMESTAMP_.clone() : null;
    o.CAST_UPDATE_DTTMASTIMESTAMP_ = (o.CAST_UPDATE_DTTMASTIMESTAMP_ != null) ? (java.sql.Timestamp) o.CAST_UPDATE_DTTMASTIMESTAMP_.clone() : null;
    return o;
  }

  public void clone0(dim_star_qtr_hour o) throws CloneNotSupportedException {
    o.CAST_START_TIME_OF_DAYASTIMESTAMP_ = (o.CAST_START_TIME_OF_DAYASTIMESTAMP_ != null) ? (java.sql.Timestamp) o.CAST_START_TIME_OF_DAYASTIMESTAMP_.clone() : null;
    o.CAST_STOP_TIME_OF_DAYASTIMESTAMP_ = (o.CAST_STOP_TIME_OF_DAYASTIMESTAMP_ != null) ? (java.sql.Timestamp) o.CAST_STOP_TIME_OF_DAYASTIMESTAMP_.clone() : null;
    o.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_ = (o.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_ != null) ? (java.sql.Timestamp) o.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_.clone() : null;
    o.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_ = (o.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_ != null) ? (java.sql.Timestamp) o.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_.clone() : null;
    o.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_ = (o.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_ != null) ? (java.sql.Timestamp) o.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_.clone() : null;
    o.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_ = (o.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_ != null) ? (java.sql.Timestamp) o.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_.clone() : null;
    o.CAST_INSERT_DTTMASTIMESTAMP_ = (o.CAST_INSERT_DTTMASTIMESTAMP_ != null) ? (java.sql.Timestamp) o.CAST_INSERT_DTTMASTIMESTAMP_.clone() : null;
    o.CAST_UPDATE_DTTMASTIMESTAMP_ = (o.CAST_UPDATE_DTTMASTIMESTAMP_ != null) ? (java.sql.Timestamp) o.CAST_UPDATE_DTTMASTIMESTAMP_.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("QTR_HOUR_DW_ID", this.QTR_HOUR_DW_ID);
    __sqoop$field_map.put("QTR_HOUR_NBR_IN_DAY", this.QTR_HOUR_NBR_IN_DAY);
    __sqoop$field_map.put("CAST(START_TIME_OF_DAYASTIMESTAMP)", this.CAST_START_TIME_OF_DAYASTIMESTAMP_);
    __sqoop$field_map.put("CAST(STOP_TIME_OF_DAYASTIMESTAMP)", this.CAST_STOP_TIME_OF_DAYASTIMESTAMP_);
    __sqoop$field_map.put("START_TIME_FRAC_OF_DAY", this.START_TIME_FRAC_OF_DAY);
    __sqoop$field_map.put("END_TIME_FRAC_OF_DAY", this.END_TIME_FRAC_OF_DAY);
    __sqoop$field_map.put("HOUR_DW_ID", this.HOUR_DW_ID);
    __sqoop$field_map.put("HOUR_NBR_IN_DAY", this.HOUR_NBR_IN_DAY);
    __sqoop$field_map.put("CAST(HOUR_START_TIME_OF_DAYASTIMESTAMP)", this.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_);
    __sqoop$field_map.put("CAST(HOUR_STOP_TIME_OF_DAYASTIMESTAMP)", this.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_);
    __sqoop$field_map.put("HOUR_START_TIME_FRAC_OF_DAY", this.HOUR_START_TIME_FRAC_OF_DAY);
    __sqoop$field_map.put("HOUR_END_TIME_FRAC_OF_DAY", this.HOUR_END_TIME_FRAC_OF_DAY);
    __sqoop$field_map.put("DAYPART_DW_ID", this.DAYPART_DW_ID);
    __sqoop$field_map.put("DAYPART_NBR", this.DAYPART_NBR);
    __sqoop$field_map.put("DAYPART_DESC", this.DAYPART_DESC);
    __sqoop$field_map.put("DAYPART_TIME_DESC", this.DAYPART_TIME_DESC);
    __sqoop$field_map.put("CAST(DAYPART_START_TIME_OF_DAYASTIMESTAMP)", this.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_);
    __sqoop$field_map.put("CAST(DAYPART_STOP_TIME_OF_DAYASTIMESTAMP)", this.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_);
    __sqoop$field_map.put("DAYPART_START_TIME_FRAC_OF_DAY", this.DAYPART_START_TIME_FRAC_OF_DAY);
    __sqoop$field_map.put("DAYPART_END_TIME_FRAC_OF_DAY", this.DAYPART_END_TIME_FRAC_OF_DAY);
    __sqoop$field_map.put("CAST(INSERT_DTTMASTIMESTAMP)", this.CAST_INSERT_DTTMASTIMESTAMP_);
    __sqoop$field_map.put("CAST(UPDATE_DTTMASTIMESTAMP)", this.CAST_UPDATE_DTTMASTIMESTAMP_);
    __sqoop$field_map.put("LOAD_ID", this.LOAD_ID);
    __sqoop$field_map.put("VERSION", this.VERSION);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("QTR_HOUR_DW_ID", this.QTR_HOUR_DW_ID);
    __sqoop$field_map.put("QTR_HOUR_NBR_IN_DAY", this.QTR_HOUR_NBR_IN_DAY);
    __sqoop$field_map.put("CAST(START_TIME_OF_DAYASTIMESTAMP)", this.CAST_START_TIME_OF_DAYASTIMESTAMP_);
    __sqoop$field_map.put("CAST(STOP_TIME_OF_DAYASTIMESTAMP)", this.CAST_STOP_TIME_OF_DAYASTIMESTAMP_);
    __sqoop$field_map.put("START_TIME_FRAC_OF_DAY", this.START_TIME_FRAC_OF_DAY);
    __sqoop$field_map.put("END_TIME_FRAC_OF_DAY", this.END_TIME_FRAC_OF_DAY);
    __sqoop$field_map.put("HOUR_DW_ID", this.HOUR_DW_ID);
    __sqoop$field_map.put("HOUR_NBR_IN_DAY", this.HOUR_NBR_IN_DAY);
    __sqoop$field_map.put("CAST(HOUR_START_TIME_OF_DAYASTIMESTAMP)", this.CAST_HOUR_START_TIME_OF_DAYASTIMESTAMP_);
    __sqoop$field_map.put("CAST(HOUR_STOP_TIME_OF_DAYASTIMESTAMP)", this.CAST_HOUR_STOP_TIME_OF_DAYASTIMESTAMP_);
    __sqoop$field_map.put("HOUR_START_TIME_FRAC_OF_DAY", this.HOUR_START_TIME_FRAC_OF_DAY);
    __sqoop$field_map.put("HOUR_END_TIME_FRAC_OF_DAY", this.HOUR_END_TIME_FRAC_OF_DAY);
    __sqoop$field_map.put("DAYPART_DW_ID", this.DAYPART_DW_ID);
    __sqoop$field_map.put("DAYPART_NBR", this.DAYPART_NBR);
    __sqoop$field_map.put("DAYPART_DESC", this.DAYPART_DESC);
    __sqoop$field_map.put("DAYPART_TIME_DESC", this.DAYPART_TIME_DESC);
    __sqoop$field_map.put("CAST(DAYPART_START_TIME_OF_DAYASTIMESTAMP)", this.CAST_DAYPART_START_TIME_OF_DAYASTIMESTAMP_);
    __sqoop$field_map.put("CAST(DAYPART_STOP_TIME_OF_DAYASTIMESTAMP)", this.CAST_DAYPART_STOP_TIME_OF_DAYASTIMESTAMP_);
    __sqoop$field_map.put("DAYPART_START_TIME_FRAC_OF_DAY", this.DAYPART_START_TIME_FRAC_OF_DAY);
    __sqoop$field_map.put("DAYPART_END_TIME_FRAC_OF_DAY", this.DAYPART_END_TIME_FRAC_OF_DAY);
    __sqoop$field_map.put("CAST(INSERT_DTTMASTIMESTAMP)", this.CAST_INSERT_DTTMASTIMESTAMP_);
    __sqoop$field_map.put("CAST(UPDATE_DTTMASTIMESTAMP)", this.CAST_UPDATE_DTTMASTIMESTAMP_);
    __sqoop$field_map.put("LOAD_ID", this.LOAD_ID);
    __sqoop$field_map.put("VERSION", this.VERSION);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
