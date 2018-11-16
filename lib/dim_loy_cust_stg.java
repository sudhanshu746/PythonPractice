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

public class dim_loy_cust_stg extends SqoopRecord  implements DBWritable, Writable {
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
    setters.put("TITLE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TITLE = (String)value;
      }
    });
    setters.put("FIRST_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FIRST_NAME = (String)value;
      }
    });
    setters.put("GENDER_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        GENDER_CODE = (String)value;
      }
    });
    setters.put("HUB_CUST_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HUB_CUST_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("EMAIL_OPT_IN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EMAIL_OPT_IN = (String)value;
      }
    });
    setters.put("WEB_REGISTRATION_DATE_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WEB_REGISTRATION_DATE_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("GATHER_PREFERENCE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        GATHER_PREFERENCE = (String)value;
      }
    });
    setters.put("FOOD_PREFERENCE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FOOD_PREFERENCE = (String)value;
      }
    });
    setters.put("EMAIL_ADDR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EMAIL_ADDR = (String)value;
      }
    });
    setters.put("EMAIL_VALID_INDICATOR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EMAIL_VALID_INDICATOR = (String)value;
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
    setters.put("EMAIL_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EMAIL_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("PREF_CAFE_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PREF_CAFE_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("UNIVERSAL_CNTL_GROUP_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        UNIVERSAL_CNTL_GROUP_FLAG = (java.math.BigDecimal)value;
      }
    });
    setters.put("NON_JOURNAL_CNTL_GROUP_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NON_JOURNAL_CNTL_GROUP_FLAG = (java.math.BigDecimal)value;
      }
    });
    setters.put("MOBILE_PUSH_OPT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MOBILE_PUSH_OPT = (String)value;
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
  public dim_loy_cust_stg() {
    init0();
  }
  private java.math.BigDecimal Z_LOY_CUST_DW_ID;
  public java.math.BigDecimal get_Z_LOY_CUST_DW_ID() {
    return Z_LOY_CUST_DW_ID;
  }
  public void set_Z_LOY_CUST_DW_ID(java.math.BigDecimal Z_LOY_CUST_DW_ID) {
    this.Z_LOY_CUST_DW_ID = Z_LOY_CUST_DW_ID;
  }
  public dim_loy_cust_stg with_Z_LOY_CUST_DW_ID(java.math.BigDecimal Z_LOY_CUST_DW_ID) {
    this.Z_LOY_CUST_DW_ID = Z_LOY_CUST_DW_ID;
    return this;
  }
  private String TITLE;
  public String get_TITLE() {
    return TITLE;
  }
  public void set_TITLE(String TITLE) {
    this.TITLE = TITLE;
  }
  public dim_loy_cust_stg with_TITLE(String TITLE) {
    this.TITLE = TITLE;
    return this;
  }
  private String FIRST_NAME;
  public String get_FIRST_NAME() {
    return FIRST_NAME;
  }
  public void set_FIRST_NAME(String FIRST_NAME) {
    this.FIRST_NAME = FIRST_NAME;
  }
  public dim_loy_cust_stg with_FIRST_NAME(String FIRST_NAME) {
    this.FIRST_NAME = FIRST_NAME;
    return this;
  }
  private String GENDER_CODE;
  public String get_GENDER_CODE() {
    return GENDER_CODE;
  }
  public void set_GENDER_CODE(String GENDER_CODE) {
    this.GENDER_CODE = GENDER_CODE;
  }
  public dim_loy_cust_stg with_GENDER_CODE(String GENDER_CODE) {
    this.GENDER_CODE = GENDER_CODE;
    return this;
  }
  private java.math.BigDecimal HUB_CUST_ID;
  public java.math.BigDecimal get_HUB_CUST_ID() {
    return HUB_CUST_ID;
  }
  public void set_HUB_CUST_ID(java.math.BigDecimal HUB_CUST_ID) {
    this.HUB_CUST_ID = HUB_CUST_ID;
  }
  public dim_loy_cust_stg with_HUB_CUST_ID(java.math.BigDecimal HUB_CUST_ID) {
    this.HUB_CUST_ID = HUB_CUST_ID;
    return this;
  }
  private String EMAIL_OPT_IN;
  public String get_EMAIL_OPT_IN() {
    return EMAIL_OPT_IN;
  }
  public void set_EMAIL_OPT_IN(String EMAIL_OPT_IN) {
    this.EMAIL_OPT_IN = EMAIL_OPT_IN;
  }
  public dim_loy_cust_stg with_EMAIL_OPT_IN(String EMAIL_OPT_IN) {
    this.EMAIL_OPT_IN = EMAIL_OPT_IN;
    return this;
  }
  private java.math.BigDecimal WEB_REGISTRATION_DATE_DW_ID;
  public java.math.BigDecimal get_WEB_REGISTRATION_DATE_DW_ID() {
    return WEB_REGISTRATION_DATE_DW_ID;
  }
  public void set_WEB_REGISTRATION_DATE_DW_ID(java.math.BigDecimal WEB_REGISTRATION_DATE_DW_ID) {
    this.WEB_REGISTRATION_DATE_DW_ID = WEB_REGISTRATION_DATE_DW_ID;
  }
  public dim_loy_cust_stg with_WEB_REGISTRATION_DATE_DW_ID(java.math.BigDecimal WEB_REGISTRATION_DATE_DW_ID) {
    this.WEB_REGISTRATION_DATE_DW_ID = WEB_REGISTRATION_DATE_DW_ID;
    return this;
  }
  private String GATHER_PREFERENCE;
  public String get_GATHER_PREFERENCE() {
    return GATHER_PREFERENCE;
  }
  public void set_GATHER_PREFERENCE(String GATHER_PREFERENCE) {
    this.GATHER_PREFERENCE = GATHER_PREFERENCE;
  }
  public dim_loy_cust_stg with_GATHER_PREFERENCE(String GATHER_PREFERENCE) {
    this.GATHER_PREFERENCE = GATHER_PREFERENCE;
    return this;
  }
  private String FOOD_PREFERENCE;
  public String get_FOOD_PREFERENCE() {
    return FOOD_PREFERENCE;
  }
  public void set_FOOD_PREFERENCE(String FOOD_PREFERENCE) {
    this.FOOD_PREFERENCE = FOOD_PREFERENCE;
  }
  public dim_loy_cust_stg with_FOOD_PREFERENCE(String FOOD_PREFERENCE) {
    this.FOOD_PREFERENCE = FOOD_PREFERENCE;
    return this;
  }
  private String EMAIL_ADDR;
  public String get_EMAIL_ADDR() {
    return EMAIL_ADDR;
  }
  public void set_EMAIL_ADDR(String EMAIL_ADDR) {
    this.EMAIL_ADDR = EMAIL_ADDR;
  }
  public dim_loy_cust_stg with_EMAIL_ADDR(String EMAIL_ADDR) {
    this.EMAIL_ADDR = EMAIL_ADDR;
    return this;
  }
  private String EMAIL_VALID_INDICATOR;
  public String get_EMAIL_VALID_INDICATOR() {
    return EMAIL_VALID_INDICATOR;
  }
  public void set_EMAIL_VALID_INDICATOR(String EMAIL_VALID_INDICATOR) {
    this.EMAIL_VALID_INDICATOR = EMAIL_VALID_INDICATOR;
  }
  public dim_loy_cust_stg with_EMAIL_VALID_INDICATOR(String EMAIL_VALID_INDICATOR) {
    this.EMAIL_VALID_INDICATOR = EMAIL_VALID_INDICATOR;
    return this;
  }
  private java.sql.Timestamp INSERT_DTTM;
  public java.sql.Timestamp get_INSERT_DTTM() {
    return INSERT_DTTM;
  }
  public void set_INSERT_DTTM(java.sql.Timestamp INSERT_DTTM) {
    this.INSERT_DTTM = INSERT_DTTM;
  }
  public dim_loy_cust_stg with_INSERT_DTTM(java.sql.Timestamp INSERT_DTTM) {
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
  public dim_loy_cust_stg with_UPDATE_DTTM(java.sql.Timestamp UPDATE_DTTM) {
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
  public dim_loy_cust_stg with_LOAD_DW_ID(java.math.BigDecimal LOAD_DW_ID) {
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
  public dim_loy_cust_stg with_VERSION(java.math.BigDecimal VERSION) {
    this.VERSION = VERSION;
    return this;
  }
  private java.math.BigDecimal EMAIL_DW_ID;
  public java.math.BigDecimal get_EMAIL_DW_ID() {
    return EMAIL_DW_ID;
  }
  public void set_EMAIL_DW_ID(java.math.BigDecimal EMAIL_DW_ID) {
    this.EMAIL_DW_ID = EMAIL_DW_ID;
  }
  public dim_loy_cust_stg with_EMAIL_DW_ID(java.math.BigDecimal EMAIL_DW_ID) {
    this.EMAIL_DW_ID = EMAIL_DW_ID;
    return this;
  }
  private java.math.BigDecimal PREF_CAFE_DW_ID;
  public java.math.BigDecimal get_PREF_CAFE_DW_ID() {
    return PREF_CAFE_DW_ID;
  }
  public void set_PREF_CAFE_DW_ID(java.math.BigDecimal PREF_CAFE_DW_ID) {
    this.PREF_CAFE_DW_ID = PREF_CAFE_DW_ID;
  }
  public dim_loy_cust_stg with_PREF_CAFE_DW_ID(java.math.BigDecimal PREF_CAFE_DW_ID) {
    this.PREF_CAFE_DW_ID = PREF_CAFE_DW_ID;
    return this;
  }
  private java.math.BigDecimal UNIVERSAL_CNTL_GROUP_FLAG;
  public java.math.BigDecimal get_UNIVERSAL_CNTL_GROUP_FLAG() {
    return UNIVERSAL_CNTL_GROUP_FLAG;
  }
  public void set_UNIVERSAL_CNTL_GROUP_FLAG(java.math.BigDecimal UNIVERSAL_CNTL_GROUP_FLAG) {
    this.UNIVERSAL_CNTL_GROUP_FLAG = UNIVERSAL_CNTL_GROUP_FLAG;
  }
  public dim_loy_cust_stg with_UNIVERSAL_CNTL_GROUP_FLAG(java.math.BigDecimal UNIVERSAL_CNTL_GROUP_FLAG) {
    this.UNIVERSAL_CNTL_GROUP_FLAG = UNIVERSAL_CNTL_GROUP_FLAG;
    return this;
  }
  private java.math.BigDecimal NON_JOURNAL_CNTL_GROUP_FLAG;
  public java.math.BigDecimal get_NON_JOURNAL_CNTL_GROUP_FLAG() {
    return NON_JOURNAL_CNTL_GROUP_FLAG;
  }
  public void set_NON_JOURNAL_CNTL_GROUP_FLAG(java.math.BigDecimal NON_JOURNAL_CNTL_GROUP_FLAG) {
    this.NON_JOURNAL_CNTL_GROUP_FLAG = NON_JOURNAL_CNTL_GROUP_FLAG;
  }
  public dim_loy_cust_stg with_NON_JOURNAL_CNTL_GROUP_FLAG(java.math.BigDecimal NON_JOURNAL_CNTL_GROUP_FLAG) {
    this.NON_JOURNAL_CNTL_GROUP_FLAG = NON_JOURNAL_CNTL_GROUP_FLAG;
    return this;
  }
  private String MOBILE_PUSH_OPT;
  public String get_MOBILE_PUSH_OPT() {
    return MOBILE_PUSH_OPT;
  }
  public void set_MOBILE_PUSH_OPT(String MOBILE_PUSH_OPT) {
    this.MOBILE_PUSH_OPT = MOBILE_PUSH_OPT;
  }
  public dim_loy_cust_stg with_MOBILE_PUSH_OPT(String MOBILE_PUSH_OPT) {
    this.MOBILE_PUSH_OPT = MOBILE_PUSH_OPT;
    return this;
  }
  private java.sql.Timestamp LOAD_DTTM;
  public java.sql.Timestamp get_LOAD_DTTM() {
    return LOAD_DTTM;
  }
  public void set_LOAD_DTTM(java.sql.Timestamp LOAD_DTTM) {
    this.LOAD_DTTM = LOAD_DTTM;
  }
  public dim_loy_cust_stg with_LOAD_DTTM(java.sql.Timestamp LOAD_DTTM) {
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
  public dim_loy_cust_stg with_LOAD_BY(String LOAD_BY) {
    this.LOAD_BY = LOAD_BY;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_loy_cust_stg)) {
      return false;
    }
    dim_loy_cust_stg that = (dim_loy_cust_stg) o;
    boolean equal = true;
    equal = equal && (this.Z_LOY_CUST_DW_ID == null ? that.Z_LOY_CUST_DW_ID == null : this.Z_LOY_CUST_DW_ID.equals(that.Z_LOY_CUST_DW_ID));
    equal = equal && (this.TITLE == null ? that.TITLE == null : this.TITLE.equals(that.TITLE));
    equal = equal && (this.FIRST_NAME == null ? that.FIRST_NAME == null : this.FIRST_NAME.equals(that.FIRST_NAME));
    equal = equal && (this.GENDER_CODE == null ? that.GENDER_CODE == null : this.GENDER_CODE.equals(that.GENDER_CODE));
    equal = equal && (this.HUB_CUST_ID == null ? that.HUB_CUST_ID == null : this.HUB_CUST_ID.equals(that.HUB_CUST_ID));
    equal = equal && (this.EMAIL_OPT_IN == null ? that.EMAIL_OPT_IN == null : this.EMAIL_OPT_IN.equals(that.EMAIL_OPT_IN));
    equal = equal && (this.WEB_REGISTRATION_DATE_DW_ID == null ? that.WEB_REGISTRATION_DATE_DW_ID == null : this.WEB_REGISTRATION_DATE_DW_ID.equals(that.WEB_REGISTRATION_DATE_DW_ID));
    equal = equal && (this.GATHER_PREFERENCE == null ? that.GATHER_PREFERENCE == null : this.GATHER_PREFERENCE.equals(that.GATHER_PREFERENCE));
    equal = equal && (this.FOOD_PREFERENCE == null ? that.FOOD_PREFERENCE == null : this.FOOD_PREFERENCE.equals(that.FOOD_PREFERENCE));
    equal = equal && (this.EMAIL_ADDR == null ? that.EMAIL_ADDR == null : this.EMAIL_ADDR.equals(that.EMAIL_ADDR));
    equal = equal && (this.EMAIL_VALID_INDICATOR == null ? that.EMAIL_VALID_INDICATOR == null : this.EMAIL_VALID_INDICATOR.equals(that.EMAIL_VALID_INDICATOR));
    equal = equal && (this.INSERT_DTTM == null ? that.INSERT_DTTM == null : this.INSERT_DTTM.equals(that.INSERT_DTTM));
    equal = equal && (this.UPDATE_DTTM == null ? that.UPDATE_DTTM == null : this.UPDATE_DTTM.equals(that.UPDATE_DTTM));
    equal = equal && (this.LOAD_DW_ID == null ? that.LOAD_DW_ID == null : this.LOAD_DW_ID.equals(that.LOAD_DW_ID));
    equal = equal && (this.VERSION == null ? that.VERSION == null : this.VERSION.equals(that.VERSION));
    equal = equal && (this.EMAIL_DW_ID == null ? that.EMAIL_DW_ID == null : this.EMAIL_DW_ID.equals(that.EMAIL_DW_ID));
    equal = equal && (this.PREF_CAFE_DW_ID == null ? that.PREF_CAFE_DW_ID == null : this.PREF_CAFE_DW_ID.equals(that.PREF_CAFE_DW_ID));
    equal = equal && (this.UNIVERSAL_CNTL_GROUP_FLAG == null ? that.UNIVERSAL_CNTL_GROUP_FLAG == null : this.UNIVERSAL_CNTL_GROUP_FLAG.equals(that.UNIVERSAL_CNTL_GROUP_FLAG));
    equal = equal && (this.NON_JOURNAL_CNTL_GROUP_FLAG == null ? that.NON_JOURNAL_CNTL_GROUP_FLAG == null : this.NON_JOURNAL_CNTL_GROUP_FLAG.equals(that.NON_JOURNAL_CNTL_GROUP_FLAG));
    equal = equal && (this.MOBILE_PUSH_OPT == null ? that.MOBILE_PUSH_OPT == null : this.MOBILE_PUSH_OPT.equals(that.MOBILE_PUSH_OPT));
    equal = equal && (this.LOAD_DTTM == null ? that.LOAD_DTTM == null : this.LOAD_DTTM.equals(that.LOAD_DTTM));
    equal = equal && (this.LOAD_BY == null ? that.LOAD_BY == null : this.LOAD_BY.equals(that.LOAD_BY));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_loy_cust_stg)) {
      return false;
    }
    dim_loy_cust_stg that = (dim_loy_cust_stg) o;
    boolean equal = true;
    equal = equal && (this.Z_LOY_CUST_DW_ID == null ? that.Z_LOY_CUST_DW_ID == null : this.Z_LOY_CUST_DW_ID.equals(that.Z_LOY_CUST_DW_ID));
    equal = equal && (this.TITLE == null ? that.TITLE == null : this.TITLE.equals(that.TITLE));
    equal = equal && (this.FIRST_NAME == null ? that.FIRST_NAME == null : this.FIRST_NAME.equals(that.FIRST_NAME));
    equal = equal && (this.GENDER_CODE == null ? that.GENDER_CODE == null : this.GENDER_CODE.equals(that.GENDER_CODE));
    equal = equal && (this.HUB_CUST_ID == null ? that.HUB_CUST_ID == null : this.HUB_CUST_ID.equals(that.HUB_CUST_ID));
    equal = equal && (this.EMAIL_OPT_IN == null ? that.EMAIL_OPT_IN == null : this.EMAIL_OPT_IN.equals(that.EMAIL_OPT_IN));
    equal = equal && (this.WEB_REGISTRATION_DATE_DW_ID == null ? that.WEB_REGISTRATION_DATE_DW_ID == null : this.WEB_REGISTRATION_DATE_DW_ID.equals(that.WEB_REGISTRATION_DATE_DW_ID));
    equal = equal && (this.GATHER_PREFERENCE == null ? that.GATHER_PREFERENCE == null : this.GATHER_PREFERENCE.equals(that.GATHER_PREFERENCE));
    equal = equal && (this.FOOD_PREFERENCE == null ? that.FOOD_PREFERENCE == null : this.FOOD_PREFERENCE.equals(that.FOOD_PREFERENCE));
    equal = equal && (this.EMAIL_ADDR == null ? that.EMAIL_ADDR == null : this.EMAIL_ADDR.equals(that.EMAIL_ADDR));
    equal = equal && (this.EMAIL_VALID_INDICATOR == null ? that.EMAIL_VALID_INDICATOR == null : this.EMAIL_VALID_INDICATOR.equals(that.EMAIL_VALID_INDICATOR));
    equal = equal && (this.INSERT_DTTM == null ? that.INSERT_DTTM == null : this.INSERT_DTTM.equals(that.INSERT_DTTM));
    equal = equal && (this.UPDATE_DTTM == null ? that.UPDATE_DTTM == null : this.UPDATE_DTTM.equals(that.UPDATE_DTTM));
    equal = equal && (this.LOAD_DW_ID == null ? that.LOAD_DW_ID == null : this.LOAD_DW_ID.equals(that.LOAD_DW_ID));
    equal = equal && (this.VERSION == null ? that.VERSION == null : this.VERSION.equals(that.VERSION));
    equal = equal && (this.EMAIL_DW_ID == null ? that.EMAIL_DW_ID == null : this.EMAIL_DW_ID.equals(that.EMAIL_DW_ID));
    equal = equal && (this.PREF_CAFE_DW_ID == null ? that.PREF_CAFE_DW_ID == null : this.PREF_CAFE_DW_ID.equals(that.PREF_CAFE_DW_ID));
    equal = equal && (this.UNIVERSAL_CNTL_GROUP_FLAG == null ? that.UNIVERSAL_CNTL_GROUP_FLAG == null : this.UNIVERSAL_CNTL_GROUP_FLAG.equals(that.UNIVERSAL_CNTL_GROUP_FLAG));
    equal = equal && (this.NON_JOURNAL_CNTL_GROUP_FLAG == null ? that.NON_JOURNAL_CNTL_GROUP_FLAG == null : this.NON_JOURNAL_CNTL_GROUP_FLAG.equals(that.NON_JOURNAL_CNTL_GROUP_FLAG));
    equal = equal && (this.MOBILE_PUSH_OPT == null ? that.MOBILE_PUSH_OPT == null : this.MOBILE_PUSH_OPT.equals(that.MOBILE_PUSH_OPT));
    equal = equal && (this.LOAD_DTTM == null ? that.LOAD_DTTM == null : this.LOAD_DTTM.equals(that.LOAD_DTTM));
    equal = equal && (this.LOAD_BY == null ? that.LOAD_BY == null : this.LOAD_BY.equals(that.LOAD_BY));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Z_LOY_CUST_DW_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.TITLE = JdbcWritableBridge.readString(2, __dbResults);
    this.FIRST_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.GENDER_CODE = JdbcWritableBridge.readString(4, __dbResults);
    this.HUB_CUST_ID = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.EMAIL_OPT_IN = JdbcWritableBridge.readString(6, __dbResults);
    this.WEB_REGISTRATION_DATE_DW_ID = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.GATHER_PREFERENCE = JdbcWritableBridge.readString(8, __dbResults);
    this.FOOD_PREFERENCE = JdbcWritableBridge.readString(9, __dbResults);
    this.EMAIL_ADDR = JdbcWritableBridge.readString(10, __dbResults);
    this.EMAIL_VALID_INDICATOR = JdbcWritableBridge.readString(11, __dbResults);
    this.INSERT_DTTM = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.UPDATE_DTTM = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.LOAD_DW_ID = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.VERSION = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.EMAIL_DW_ID = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.PREF_CAFE_DW_ID = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.UNIVERSAL_CNTL_GROUP_FLAG = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.NON_JOURNAL_CNTL_GROUP_FLAG = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.MOBILE_PUSH_OPT = JdbcWritableBridge.readString(20, __dbResults);
    this.LOAD_DTTM = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.LOAD_BY = JdbcWritableBridge.readString(22, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Z_LOY_CUST_DW_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.TITLE = JdbcWritableBridge.readString(2, __dbResults);
    this.FIRST_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.GENDER_CODE = JdbcWritableBridge.readString(4, __dbResults);
    this.HUB_CUST_ID = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.EMAIL_OPT_IN = JdbcWritableBridge.readString(6, __dbResults);
    this.WEB_REGISTRATION_DATE_DW_ID = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.GATHER_PREFERENCE = JdbcWritableBridge.readString(8, __dbResults);
    this.FOOD_PREFERENCE = JdbcWritableBridge.readString(9, __dbResults);
    this.EMAIL_ADDR = JdbcWritableBridge.readString(10, __dbResults);
    this.EMAIL_VALID_INDICATOR = JdbcWritableBridge.readString(11, __dbResults);
    this.INSERT_DTTM = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.UPDATE_DTTM = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.LOAD_DW_ID = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.VERSION = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.EMAIL_DW_ID = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.PREF_CAFE_DW_ID = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.UNIVERSAL_CNTL_GROUP_FLAG = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.NON_JOURNAL_CNTL_GROUP_FLAG = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.MOBILE_PUSH_OPT = JdbcWritableBridge.readString(20, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(Z_LOY_CUST_DW_ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(TITLE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FIRST_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GENDER_CODE, 4 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HUB_CUST_ID, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(EMAIL_OPT_IN, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEB_REGISTRATION_DATE_DW_ID, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(GATHER_PREFERENCE, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FOOD_PREFERENCE, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EMAIL_ADDR, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EMAIL_VALID_INDICATOR, 11 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeTimestamp(INSERT_DTTM, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATE_DTTM, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOAD_DW_ID, 14 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VERSION, 15 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(EMAIL_DW_ID, 16 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PREF_CAFE_DW_ID, 17 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(UNIVERSAL_CNTL_GROUP_FLAG, 18 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NON_JOURNAL_CNTL_GROUP_FLAG, 19 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(MOBILE_PUSH_OPT, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOAD_DTTM, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_BY, 22 + __off, 12, __dbStmt);
    return 22;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(Z_LOY_CUST_DW_ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(TITLE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FIRST_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GENDER_CODE, 4 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HUB_CUST_ID, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(EMAIL_OPT_IN, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEB_REGISTRATION_DATE_DW_ID, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(GATHER_PREFERENCE, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FOOD_PREFERENCE, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EMAIL_ADDR, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EMAIL_VALID_INDICATOR, 11 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeTimestamp(INSERT_DTTM, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATE_DTTM, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOAD_DW_ID, 14 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VERSION, 15 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(EMAIL_DW_ID, 16 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PREF_CAFE_DW_ID, 17 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(UNIVERSAL_CNTL_GROUP_FLAG, 18 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NON_JOURNAL_CNTL_GROUP_FLAG, 19 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(MOBILE_PUSH_OPT, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOAD_DTTM, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_BY, 22 + __off, 12, __dbStmt);
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
        this.TITLE = null;
    } else {
    this.TITLE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FIRST_NAME = null;
    } else {
    this.FIRST_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.GENDER_CODE = null;
    } else {
    this.GENDER_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HUB_CUST_ID = null;
    } else {
    this.HUB_CUST_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EMAIL_OPT_IN = null;
    } else {
    this.EMAIL_OPT_IN = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEB_REGISTRATION_DATE_DW_ID = null;
    } else {
    this.WEB_REGISTRATION_DATE_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.GATHER_PREFERENCE = null;
    } else {
    this.GATHER_PREFERENCE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FOOD_PREFERENCE = null;
    } else {
    this.FOOD_PREFERENCE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EMAIL_ADDR = null;
    } else {
    this.EMAIL_ADDR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EMAIL_VALID_INDICATOR = null;
    } else {
    this.EMAIL_VALID_INDICATOR = Text.readString(__dataIn);
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
        this.EMAIL_DW_ID = null;
    } else {
    this.EMAIL_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PREF_CAFE_DW_ID = null;
    } else {
    this.PREF_CAFE_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.UNIVERSAL_CNTL_GROUP_FLAG = null;
    } else {
    this.UNIVERSAL_CNTL_GROUP_FLAG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NON_JOURNAL_CNTL_GROUP_FLAG = null;
    } else {
    this.NON_JOURNAL_CNTL_GROUP_FLAG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MOBILE_PUSH_OPT = null;
    } else {
    this.MOBILE_PUSH_OPT = Text.readString(__dataIn);
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
    if (null == this.TITLE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TITLE);
    }
    if (null == this.FIRST_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FIRST_NAME);
    }
    if (null == this.GENDER_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GENDER_CODE);
    }
    if (null == this.HUB_CUST_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HUB_CUST_ID, __dataOut);
    }
    if (null == this.EMAIL_OPT_IN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EMAIL_OPT_IN);
    }
    if (null == this.WEB_REGISTRATION_DATE_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEB_REGISTRATION_DATE_DW_ID, __dataOut);
    }
    if (null == this.GATHER_PREFERENCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GATHER_PREFERENCE);
    }
    if (null == this.FOOD_PREFERENCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FOOD_PREFERENCE);
    }
    if (null == this.EMAIL_ADDR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EMAIL_ADDR);
    }
    if (null == this.EMAIL_VALID_INDICATOR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EMAIL_VALID_INDICATOR);
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
    if (null == this.EMAIL_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.EMAIL_DW_ID, __dataOut);
    }
    if (null == this.PREF_CAFE_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PREF_CAFE_DW_ID, __dataOut);
    }
    if (null == this.UNIVERSAL_CNTL_GROUP_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.UNIVERSAL_CNTL_GROUP_FLAG, __dataOut);
    }
    if (null == this.NON_JOURNAL_CNTL_GROUP_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NON_JOURNAL_CNTL_GROUP_FLAG, __dataOut);
    }
    if (null == this.MOBILE_PUSH_OPT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MOBILE_PUSH_OPT);
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
    if (null == this.TITLE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TITLE);
    }
    if (null == this.FIRST_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FIRST_NAME);
    }
    if (null == this.GENDER_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GENDER_CODE);
    }
    if (null == this.HUB_CUST_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HUB_CUST_ID, __dataOut);
    }
    if (null == this.EMAIL_OPT_IN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EMAIL_OPT_IN);
    }
    if (null == this.WEB_REGISTRATION_DATE_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEB_REGISTRATION_DATE_DW_ID, __dataOut);
    }
    if (null == this.GATHER_PREFERENCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GATHER_PREFERENCE);
    }
    if (null == this.FOOD_PREFERENCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FOOD_PREFERENCE);
    }
    if (null == this.EMAIL_ADDR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EMAIL_ADDR);
    }
    if (null == this.EMAIL_VALID_INDICATOR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EMAIL_VALID_INDICATOR);
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
    if (null == this.EMAIL_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.EMAIL_DW_ID, __dataOut);
    }
    if (null == this.PREF_CAFE_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PREF_CAFE_DW_ID, __dataOut);
    }
    if (null == this.UNIVERSAL_CNTL_GROUP_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.UNIVERSAL_CNTL_GROUP_FLAG, __dataOut);
    }
    if (null == this.NON_JOURNAL_CNTL_GROUP_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NON_JOURNAL_CNTL_GROUP_FLAG, __dataOut);
    }
    if (null == this.MOBILE_PUSH_OPT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MOBILE_PUSH_OPT);
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
    __sb.append(FieldFormatter.escapeAndEnclose(TITLE==null?"\\N":TITLE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FIRST_NAME==null?"\\N":FIRST_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GENDER_CODE==null?"\\N":GENDER_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HUB_CUST_ID==null?"\\N":HUB_CUST_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EMAIL_OPT_IN==null?"\\N":EMAIL_OPT_IN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEB_REGISTRATION_DATE_DW_ID==null?"\\N":WEB_REGISTRATION_DATE_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GATHER_PREFERENCE==null?"\\N":GATHER_PREFERENCE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FOOD_PREFERENCE==null?"\\N":FOOD_PREFERENCE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EMAIL_ADDR==null?"\\N":EMAIL_ADDR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EMAIL_VALID_INDICATOR==null?"\\N":EMAIL_VALID_INDICATOR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INSERT_DTTM==null?"\\N":"" + INSERT_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UPDATE_DTTM==null?"\\N":"" + UPDATE_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOAD_DW_ID==null?"\\N":LOAD_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERSION==null?"\\N":VERSION.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EMAIL_DW_ID==null?"\\N":EMAIL_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PREF_CAFE_DW_ID==null?"\\N":PREF_CAFE_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UNIVERSAL_CNTL_GROUP_FLAG==null?"\\N":UNIVERSAL_CNTL_GROUP_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NON_JOURNAL_CNTL_GROUP_FLAG==null?"\\N":NON_JOURNAL_CNTL_GROUP_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MOBILE_PUSH_OPT==null?"\\N":MOBILE_PUSH_OPT, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(TITLE==null?"\\N":TITLE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FIRST_NAME==null?"\\N":FIRST_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GENDER_CODE==null?"\\N":GENDER_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HUB_CUST_ID==null?"\\N":HUB_CUST_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EMAIL_OPT_IN==null?"\\N":EMAIL_OPT_IN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEB_REGISTRATION_DATE_DW_ID==null?"\\N":WEB_REGISTRATION_DATE_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GATHER_PREFERENCE==null?"\\N":GATHER_PREFERENCE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FOOD_PREFERENCE==null?"\\N":FOOD_PREFERENCE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EMAIL_ADDR==null?"\\N":EMAIL_ADDR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EMAIL_VALID_INDICATOR==null?"\\N":EMAIL_VALID_INDICATOR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INSERT_DTTM==null?"\\N":"" + INSERT_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UPDATE_DTTM==null?"\\N":"" + UPDATE_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOAD_DW_ID==null?"\\N":LOAD_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERSION==null?"\\N":VERSION.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EMAIL_DW_ID==null?"\\N":EMAIL_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PREF_CAFE_DW_ID==null?"\\N":PREF_CAFE_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UNIVERSAL_CNTL_GROUP_FLAG==null?"\\N":UNIVERSAL_CNTL_GROUP_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NON_JOURNAL_CNTL_GROUP_FLAG==null?"\\N":NON_JOURNAL_CNTL_GROUP_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MOBILE_PUSH_OPT==null?"\\N":MOBILE_PUSH_OPT, delimiters));
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
    if (__cur_str.equals("null")) { this.TITLE = null; } else {
      this.TITLE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FIRST_NAME = null; } else {
      this.FIRST_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GENDER_CODE = null; } else {
      this.GENDER_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HUB_CUST_ID = null; } else {
      this.HUB_CUST_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EMAIL_OPT_IN = null; } else {
      this.EMAIL_OPT_IN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEB_REGISTRATION_DATE_DW_ID = null; } else {
      this.WEB_REGISTRATION_DATE_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GATHER_PREFERENCE = null; } else {
      this.GATHER_PREFERENCE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FOOD_PREFERENCE = null; } else {
      this.FOOD_PREFERENCE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EMAIL_ADDR = null; } else {
      this.EMAIL_ADDR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EMAIL_VALID_INDICATOR = null; } else {
      this.EMAIL_VALID_INDICATOR = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EMAIL_DW_ID = null; } else {
      this.EMAIL_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PREF_CAFE_DW_ID = null; } else {
      this.PREF_CAFE_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UNIVERSAL_CNTL_GROUP_FLAG = null; } else {
      this.UNIVERSAL_CNTL_GROUP_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NON_JOURNAL_CNTL_GROUP_FLAG = null; } else {
      this.NON_JOURNAL_CNTL_GROUP_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MOBILE_PUSH_OPT = null; } else {
      this.MOBILE_PUSH_OPT = __cur_str;
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
    if (__cur_str.equals("null")) { this.TITLE = null; } else {
      this.TITLE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FIRST_NAME = null; } else {
      this.FIRST_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GENDER_CODE = null; } else {
      this.GENDER_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HUB_CUST_ID = null; } else {
      this.HUB_CUST_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EMAIL_OPT_IN = null; } else {
      this.EMAIL_OPT_IN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WEB_REGISTRATION_DATE_DW_ID = null; } else {
      this.WEB_REGISTRATION_DATE_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GATHER_PREFERENCE = null; } else {
      this.GATHER_PREFERENCE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FOOD_PREFERENCE = null; } else {
      this.FOOD_PREFERENCE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EMAIL_ADDR = null; } else {
      this.EMAIL_ADDR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EMAIL_VALID_INDICATOR = null; } else {
      this.EMAIL_VALID_INDICATOR = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EMAIL_DW_ID = null; } else {
      this.EMAIL_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PREF_CAFE_DW_ID = null; } else {
      this.PREF_CAFE_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UNIVERSAL_CNTL_GROUP_FLAG = null; } else {
      this.UNIVERSAL_CNTL_GROUP_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NON_JOURNAL_CNTL_GROUP_FLAG = null; } else {
      this.NON_JOURNAL_CNTL_GROUP_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MOBILE_PUSH_OPT = null; } else {
      this.MOBILE_PUSH_OPT = __cur_str;
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
    dim_loy_cust_stg o = (dim_loy_cust_stg) super.clone();
    o.INSERT_DTTM = (o.INSERT_DTTM != null) ? (java.sql.Timestamp) o.INSERT_DTTM.clone() : null;
    o.UPDATE_DTTM = (o.UPDATE_DTTM != null) ? (java.sql.Timestamp) o.UPDATE_DTTM.clone() : null;
    o.LOAD_DTTM = (o.LOAD_DTTM != null) ? (java.sql.Timestamp) o.LOAD_DTTM.clone() : null;
    return o;
  }

  public void clone0(dim_loy_cust_stg o) throws CloneNotSupportedException {
    o.INSERT_DTTM = (o.INSERT_DTTM != null) ? (java.sql.Timestamp) o.INSERT_DTTM.clone() : null;
    o.UPDATE_DTTM = (o.UPDATE_DTTM != null) ? (java.sql.Timestamp) o.UPDATE_DTTM.clone() : null;
    o.LOAD_DTTM = (o.LOAD_DTTM != null) ? (java.sql.Timestamp) o.LOAD_DTTM.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Z_LOY_CUST_DW_ID", this.Z_LOY_CUST_DW_ID);
    __sqoop$field_map.put("TITLE", this.TITLE);
    __sqoop$field_map.put("FIRST_NAME", this.FIRST_NAME);
    __sqoop$field_map.put("GENDER_CODE", this.GENDER_CODE);
    __sqoop$field_map.put("HUB_CUST_ID", this.HUB_CUST_ID);
    __sqoop$field_map.put("EMAIL_OPT_IN", this.EMAIL_OPT_IN);
    __sqoop$field_map.put("WEB_REGISTRATION_DATE_DW_ID", this.WEB_REGISTRATION_DATE_DW_ID);
    __sqoop$field_map.put("GATHER_PREFERENCE", this.GATHER_PREFERENCE);
    __sqoop$field_map.put("FOOD_PREFERENCE", this.FOOD_PREFERENCE);
    __sqoop$field_map.put("EMAIL_ADDR", this.EMAIL_ADDR);
    __sqoop$field_map.put("EMAIL_VALID_INDICATOR", this.EMAIL_VALID_INDICATOR);
    __sqoop$field_map.put("INSERT_DTTM", this.INSERT_DTTM);
    __sqoop$field_map.put("UPDATE_DTTM", this.UPDATE_DTTM);
    __sqoop$field_map.put("LOAD_DW_ID", this.LOAD_DW_ID);
    __sqoop$field_map.put("VERSION", this.VERSION);
    __sqoop$field_map.put("EMAIL_DW_ID", this.EMAIL_DW_ID);
    __sqoop$field_map.put("PREF_CAFE_DW_ID", this.PREF_CAFE_DW_ID);
    __sqoop$field_map.put("UNIVERSAL_CNTL_GROUP_FLAG", this.UNIVERSAL_CNTL_GROUP_FLAG);
    __sqoop$field_map.put("NON_JOURNAL_CNTL_GROUP_FLAG", this.NON_JOURNAL_CNTL_GROUP_FLAG);
    __sqoop$field_map.put("MOBILE_PUSH_OPT", this.MOBILE_PUSH_OPT);
    __sqoop$field_map.put("LOAD_DTTM", this.LOAD_DTTM);
    __sqoop$field_map.put("LOAD_BY", this.LOAD_BY);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Z_LOY_CUST_DW_ID", this.Z_LOY_CUST_DW_ID);
    __sqoop$field_map.put("TITLE", this.TITLE);
    __sqoop$field_map.put("FIRST_NAME", this.FIRST_NAME);
    __sqoop$field_map.put("GENDER_CODE", this.GENDER_CODE);
    __sqoop$field_map.put("HUB_CUST_ID", this.HUB_CUST_ID);
    __sqoop$field_map.put("EMAIL_OPT_IN", this.EMAIL_OPT_IN);
    __sqoop$field_map.put("WEB_REGISTRATION_DATE_DW_ID", this.WEB_REGISTRATION_DATE_DW_ID);
    __sqoop$field_map.put("GATHER_PREFERENCE", this.GATHER_PREFERENCE);
    __sqoop$field_map.put("FOOD_PREFERENCE", this.FOOD_PREFERENCE);
    __sqoop$field_map.put("EMAIL_ADDR", this.EMAIL_ADDR);
    __sqoop$field_map.put("EMAIL_VALID_INDICATOR", this.EMAIL_VALID_INDICATOR);
    __sqoop$field_map.put("INSERT_DTTM", this.INSERT_DTTM);
    __sqoop$field_map.put("UPDATE_DTTM", this.UPDATE_DTTM);
    __sqoop$field_map.put("LOAD_DW_ID", this.LOAD_DW_ID);
    __sqoop$field_map.put("VERSION", this.VERSION);
    __sqoop$field_map.put("EMAIL_DW_ID", this.EMAIL_DW_ID);
    __sqoop$field_map.put("PREF_CAFE_DW_ID", this.PREF_CAFE_DW_ID);
    __sqoop$field_map.put("UNIVERSAL_CNTL_GROUP_FLAG", this.UNIVERSAL_CNTL_GROUP_FLAG);
    __sqoop$field_map.put("NON_JOURNAL_CNTL_GROUP_FLAG", this.NON_JOURNAL_CNTL_GROUP_FLAG);
    __sqoop$field_map.put("MOBILE_PUSH_OPT", this.MOBILE_PUSH_OPT);
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
