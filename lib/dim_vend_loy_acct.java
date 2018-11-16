// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 29 17:02:15 GMT 2017
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

public class dim_vend_loy_acct extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("VEND_LOY_ACCT_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        VEND_LOY_ACCT_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("VEND_ACCT_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        VEND_ACCT_CODE = (java.math.BigDecimal)value;
      }
    });
    setters.put("VEND_USER_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        VEND_USER_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("VEND_ACCT_ACTIVATE_DATE_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        VEND_ACCT_ACTIVATE_DATE_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("VEND_ACCT_REGISTER_DATE_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        VEND_ACCT_REGISTER_DATE_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("VEND_ACCT_SUSPEND_DATE_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        VEND_ACCT_SUSPEND_DATE_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("VEND_ACCT_EXPIRE_DATE_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        VEND_ACCT_EXPIRE_DATE_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("VEND_ACCT_TERMINATE_DATE_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        VEND_ACCT_TERMINATE_DATE_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("HUB_CUST_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HUB_CUST_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("FIRST_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FIRST_NAME = (String)value;
      }
    });
    setters.put("LAST_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LAST_NAME = (String)value;
      }
    });
    setters.put("MIDDLE_INITIAL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MIDDLE_INITIAL = (String)value;
      }
    });
    setters.put("SALUTATION", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SALUTATION = (String)value;
      }
    });
    setters.put("IS_JUVENILE_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        IS_JUVENILE_FLAG = (java.math.BigDecimal)value;
      }
    });
    setters.put("CUR_LOY_TIER_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CUR_LOY_TIER_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("ACTIVATED_CAFE_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ACTIVATED_CAFE_DW_ID = (java.math.BigDecimal)value;
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
    setters.put("VEND_PROV_ENROLL_STORE_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        VEND_PROV_ENROLL_STORE_CODE = (String)value;
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
  public dim_vend_loy_acct() {
    init0();
  }
  private java.math.BigDecimal VEND_LOY_ACCT_DW_ID;
  public java.math.BigDecimal get_VEND_LOY_ACCT_DW_ID() {
    return VEND_LOY_ACCT_DW_ID;
  }
  public void set_VEND_LOY_ACCT_DW_ID(java.math.BigDecimal VEND_LOY_ACCT_DW_ID) {
    this.VEND_LOY_ACCT_DW_ID = VEND_LOY_ACCT_DW_ID;
  }
  public dim_vend_loy_acct with_VEND_LOY_ACCT_DW_ID(java.math.BigDecimal VEND_LOY_ACCT_DW_ID) {
    this.VEND_LOY_ACCT_DW_ID = VEND_LOY_ACCT_DW_ID;
    return this;
  }
  private java.math.BigDecimal VEND_ACCT_CODE;
  public java.math.BigDecimal get_VEND_ACCT_CODE() {
    return VEND_ACCT_CODE;
  }
  public void set_VEND_ACCT_CODE(java.math.BigDecimal VEND_ACCT_CODE) {
    this.VEND_ACCT_CODE = VEND_ACCT_CODE;
  }
  public dim_vend_loy_acct with_VEND_ACCT_CODE(java.math.BigDecimal VEND_ACCT_CODE) {
    this.VEND_ACCT_CODE = VEND_ACCT_CODE;
    return this;
  }
  private java.math.BigDecimal VEND_USER_ID;
  public java.math.BigDecimal get_VEND_USER_ID() {
    return VEND_USER_ID;
  }
  public void set_VEND_USER_ID(java.math.BigDecimal VEND_USER_ID) {
    this.VEND_USER_ID = VEND_USER_ID;
  }
  public dim_vend_loy_acct with_VEND_USER_ID(java.math.BigDecimal VEND_USER_ID) {
    this.VEND_USER_ID = VEND_USER_ID;
    return this;
  }
  private java.math.BigDecimal VEND_ACCT_ACTIVATE_DATE_DW_ID;
  public java.math.BigDecimal get_VEND_ACCT_ACTIVATE_DATE_DW_ID() {
    return VEND_ACCT_ACTIVATE_DATE_DW_ID;
  }
  public void set_VEND_ACCT_ACTIVATE_DATE_DW_ID(java.math.BigDecimal VEND_ACCT_ACTIVATE_DATE_DW_ID) {
    this.VEND_ACCT_ACTIVATE_DATE_DW_ID = VEND_ACCT_ACTIVATE_DATE_DW_ID;
  }
  public dim_vend_loy_acct with_VEND_ACCT_ACTIVATE_DATE_DW_ID(java.math.BigDecimal VEND_ACCT_ACTIVATE_DATE_DW_ID) {
    this.VEND_ACCT_ACTIVATE_DATE_DW_ID = VEND_ACCT_ACTIVATE_DATE_DW_ID;
    return this;
  }
  private java.math.BigDecimal VEND_ACCT_REGISTER_DATE_DW_ID;
  public java.math.BigDecimal get_VEND_ACCT_REGISTER_DATE_DW_ID() {
    return VEND_ACCT_REGISTER_DATE_DW_ID;
  }
  public void set_VEND_ACCT_REGISTER_DATE_DW_ID(java.math.BigDecimal VEND_ACCT_REGISTER_DATE_DW_ID) {
    this.VEND_ACCT_REGISTER_DATE_DW_ID = VEND_ACCT_REGISTER_DATE_DW_ID;
  }
  public dim_vend_loy_acct with_VEND_ACCT_REGISTER_DATE_DW_ID(java.math.BigDecimal VEND_ACCT_REGISTER_DATE_DW_ID) {
    this.VEND_ACCT_REGISTER_DATE_DW_ID = VEND_ACCT_REGISTER_DATE_DW_ID;
    return this;
  }
  private java.math.BigDecimal VEND_ACCT_SUSPEND_DATE_DW_ID;
  public java.math.BigDecimal get_VEND_ACCT_SUSPEND_DATE_DW_ID() {
    return VEND_ACCT_SUSPEND_DATE_DW_ID;
  }
  public void set_VEND_ACCT_SUSPEND_DATE_DW_ID(java.math.BigDecimal VEND_ACCT_SUSPEND_DATE_DW_ID) {
    this.VEND_ACCT_SUSPEND_DATE_DW_ID = VEND_ACCT_SUSPEND_DATE_DW_ID;
  }
  public dim_vend_loy_acct with_VEND_ACCT_SUSPEND_DATE_DW_ID(java.math.BigDecimal VEND_ACCT_SUSPEND_DATE_DW_ID) {
    this.VEND_ACCT_SUSPEND_DATE_DW_ID = VEND_ACCT_SUSPEND_DATE_DW_ID;
    return this;
  }
  private java.math.BigDecimal VEND_ACCT_EXPIRE_DATE_DW_ID;
  public java.math.BigDecimal get_VEND_ACCT_EXPIRE_DATE_DW_ID() {
    return VEND_ACCT_EXPIRE_DATE_DW_ID;
  }
  public void set_VEND_ACCT_EXPIRE_DATE_DW_ID(java.math.BigDecimal VEND_ACCT_EXPIRE_DATE_DW_ID) {
    this.VEND_ACCT_EXPIRE_DATE_DW_ID = VEND_ACCT_EXPIRE_DATE_DW_ID;
  }
  public dim_vend_loy_acct with_VEND_ACCT_EXPIRE_DATE_DW_ID(java.math.BigDecimal VEND_ACCT_EXPIRE_DATE_DW_ID) {
    this.VEND_ACCT_EXPIRE_DATE_DW_ID = VEND_ACCT_EXPIRE_DATE_DW_ID;
    return this;
  }
  private java.math.BigDecimal VEND_ACCT_TERMINATE_DATE_DW_ID;
  public java.math.BigDecimal get_VEND_ACCT_TERMINATE_DATE_DW_ID() {
    return VEND_ACCT_TERMINATE_DATE_DW_ID;
  }
  public void set_VEND_ACCT_TERMINATE_DATE_DW_ID(java.math.BigDecimal VEND_ACCT_TERMINATE_DATE_DW_ID) {
    this.VEND_ACCT_TERMINATE_DATE_DW_ID = VEND_ACCT_TERMINATE_DATE_DW_ID;
  }
  public dim_vend_loy_acct with_VEND_ACCT_TERMINATE_DATE_DW_ID(java.math.BigDecimal VEND_ACCT_TERMINATE_DATE_DW_ID) {
    this.VEND_ACCT_TERMINATE_DATE_DW_ID = VEND_ACCT_TERMINATE_DATE_DW_ID;
    return this;
  }
  private java.math.BigDecimal HUB_CUST_ID;
  public java.math.BigDecimal get_HUB_CUST_ID() {
    return HUB_CUST_ID;
  }
  public void set_HUB_CUST_ID(java.math.BigDecimal HUB_CUST_ID) {
    this.HUB_CUST_ID = HUB_CUST_ID;
  }
  public dim_vend_loy_acct with_HUB_CUST_ID(java.math.BigDecimal HUB_CUST_ID) {
    this.HUB_CUST_ID = HUB_CUST_ID;
    return this;
  }
  private String FIRST_NAME;
  public String get_FIRST_NAME() {
    return FIRST_NAME;
  }
  public void set_FIRST_NAME(String FIRST_NAME) {
    this.FIRST_NAME = FIRST_NAME;
  }
  public dim_vend_loy_acct with_FIRST_NAME(String FIRST_NAME) {
    this.FIRST_NAME = FIRST_NAME;
    return this;
  }
  private String LAST_NAME;
  public String get_LAST_NAME() {
    return LAST_NAME;
  }
  public void set_LAST_NAME(String LAST_NAME) {
    this.LAST_NAME = LAST_NAME;
  }
  public dim_vend_loy_acct with_LAST_NAME(String LAST_NAME) {
    this.LAST_NAME = LAST_NAME;
    return this;
  }
  private String MIDDLE_INITIAL;
  public String get_MIDDLE_INITIAL() {
    return MIDDLE_INITIAL;
  }
  public void set_MIDDLE_INITIAL(String MIDDLE_INITIAL) {
    this.MIDDLE_INITIAL = MIDDLE_INITIAL;
  }
  public dim_vend_loy_acct with_MIDDLE_INITIAL(String MIDDLE_INITIAL) {
    this.MIDDLE_INITIAL = MIDDLE_INITIAL;
    return this;
  }
  private String SALUTATION;
  public String get_SALUTATION() {
    return SALUTATION;
  }
  public void set_SALUTATION(String SALUTATION) {
    this.SALUTATION = SALUTATION;
  }
  public dim_vend_loy_acct with_SALUTATION(String SALUTATION) {
    this.SALUTATION = SALUTATION;
    return this;
  }
  private java.math.BigDecimal IS_JUVENILE_FLAG;
  public java.math.BigDecimal get_IS_JUVENILE_FLAG() {
    return IS_JUVENILE_FLAG;
  }
  public void set_IS_JUVENILE_FLAG(java.math.BigDecimal IS_JUVENILE_FLAG) {
    this.IS_JUVENILE_FLAG = IS_JUVENILE_FLAG;
  }
  public dim_vend_loy_acct with_IS_JUVENILE_FLAG(java.math.BigDecimal IS_JUVENILE_FLAG) {
    this.IS_JUVENILE_FLAG = IS_JUVENILE_FLAG;
    return this;
  }
  private java.math.BigDecimal CUR_LOY_TIER_DW_ID;
  public java.math.BigDecimal get_CUR_LOY_TIER_DW_ID() {
    return CUR_LOY_TIER_DW_ID;
  }
  public void set_CUR_LOY_TIER_DW_ID(java.math.BigDecimal CUR_LOY_TIER_DW_ID) {
    this.CUR_LOY_TIER_DW_ID = CUR_LOY_TIER_DW_ID;
  }
  public dim_vend_loy_acct with_CUR_LOY_TIER_DW_ID(java.math.BigDecimal CUR_LOY_TIER_DW_ID) {
    this.CUR_LOY_TIER_DW_ID = CUR_LOY_TIER_DW_ID;
    return this;
  }
  private java.math.BigDecimal ACTIVATED_CAFE_DW_ID;
  public java.math.BigDecimal get_ACTIVATED_CAFE_DW_ID() {
    return ACTIVATED_CAFE_DW_ID;
  }
  public void set_ACTIVATED_CAFE_DW_ID(java.math.BigDecimal ACTIVATED_CAFE_DW_ID) {
    this.ACTIVATED_CAFE_DW_ID = ACTIVATED_CAFE_DW_ID;
  }
  public dim_vend_loy_acct with_ACTIVATED_CAFE_DW_ID(java.math.BigDecimal ACTIVATED_CAFE_DW_ID) {
    this.ACTIVATED_CAFE_DW_ID = ACTIVATED_CAFE_DW_ID;
    return this;
  }
  private java.sql.Timestamp INSERT_DTTM;
  public java.sql.Timestamp get_INSERT_DTTM() {
    return INSERT_DTTM;
  }
  public void set_INSERT_DTTM(java.sql.Timestamp INSERT_DTTM) {
    this.INSERT_DTTM = INSERT_DTTM;
  }
  public dim_vend_loy_acct with_INSERT_DTTM(java.sql.Timestamp INSERT_DTTM) {
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
  public dim_vend_loy_acct with_UPDATE_DTTM(java.sql.Timestamp UPDATE_DTTM) {
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
  public dim_vend_loy_acct with_LOAD_DW_ID(java.math.BigDecimal LOAD_DW_ID) {
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
  public dim_vend_loy_acct with_VERSION(java.math.BigDecimal VERSION) {
    this.VERSION = VERSION;
    return this;
  }
  private String VEND_PROV_ENROLL_STORE_CODE;
  public String get_VEND_PROV_ENROLL_STORE_CODE() {
    return VEND_PROV_ENROLL_STORE_CODE;
  }
  public void set_VEND_PROV_ENROLL_STORE_CODE(String VEND_PROV_ENROLL_STORE_CODE) {
    this.VEND_PROV_ENROLL_STORE_CODE = VEND_PROV_ENROLL_STORE_CODE;
  }
  public dim_vend_loy_acct with_VEND_PROV_ENROLL_STORE_CODE(String VEND_PROV_ENROLL_STORE_CODE) {
    this.VEND_PROV_ENROLL_STORE_CODE = VEND_PROV_ENROLL_STORE_CODE;
    return this;
  }
  private java.sql.Timestamp LOAD_DTTM;
  public java.sql.Timestamp get_LOAD_DTTM() {
    return LOAD_DTTM;
  }
  public void set_LOAD_DTTM(java.sql.Timestamp LOAD_DTTM) {
    this.LOAD_DTTM = LOAD_DTTM;
  }
  public dim_vend_loy_acct with_LOAD_DTTM(java.sql.Timestamp LOAD_DTTM) {
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
  public dim_vend_loy_acct with_LOAD_BY(String LOAD_BY) {
    this.LOAD_BY = LOAD_BY;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_vend_loy_acct)) {
      return false;
    }
    dim_vend_loy_acct that = (dim_vend_loy_acct) o;
    boolean equal = true;
    equal = equal && (this.VEND_LOY_ACCT_DW_ID == null ? that.VEND_LOY_ACCT_DW_ID == null : this.VEND_LOY_ACCT_DW_ID.equals(that.VEND_LOY_ACCT_DW_ID));
    equal = equal && (this.VEND_ACCT_CODE == null ? that.VEND_ACCT_CODE == null : this.VEND_ACCT_CODE.equals(that.VEND_ACCT_CODE));
    equal = equal && (this.VEND_USER_ID == null ? that.VEND_USER_ID == null : this.VEND_USER_ID.equals(that.VEND_USER_ID));
    equal = equal && (this.VEND_ACCT_ACTIVATE_DATE_DW_ID == null ? that.VEND_ACCT_ACTIVATE_DATE_DW_ID == null : this.VEND_ACCT_ACTIVATE_DATE_DW_ID.equals(that.VEND_ACCT_ACTIVATE_DATE_DW_ID));
    equal = equal && (this.VEND_ACCT_REGISTER_DATE_DW_ID == null ? that.VEND_ACCT_REGISTER_DATE_DW_ID == null : this.VEND_ACCT_REGISTER_DATE_DW_ID.equals(that.VEND_ACCT_REGISTER_DATE_DW_ID));
    equal = equal && (this.VEND_ACCT_SUSPEND_DATE_DW_ID == null ? that.VEND_ACCT_SUSPEND_DATE_DW_ID == null : this.VEND_ACCT_SUSPEND_DATE_DW_ID.equals(that.VEND_ACCT_SUSPEND_DATE_DW_ID));
    equal = equal && (this.VEND_ACCT_EXPIRE_DATE_DW_ID == null ? that.VEND_ACCT_EXPIRE_DATE_DW_ID == null : this.VEND_ACCT_EXPIRE_DATE_DW_ID.equals(that.VEND_ACCT_EXPIRE_DATE_DW_ID));
    equal = equal && (this.VEND_ACCT_TERMINATE_DATE_DW_ID == null ? that.VEND_ACCT_TERMINATE_DATE_DW_ID == null : this.VEND_ACCT_TERMINATE_DATE_DW_ID.equals(that.VEND_ACCT_TERMINATE_DATE_DW_ID));
    equal = equal && (this.HUB_CUST_ID == null ? that.HUB_CUST_ID == null : this.HUB_CUST_ID.equals(that.HUB_CUST_ID));
    equal = equal && (this.FIRST_NAME == null ? that.FIRST_NAME == null : this.FIRST_NAME.equals(that.FIRST_NAME));
    equal = equal && (this.LAST_NAME == null ? that.LAST_NAME == null : this.LAST_NAME.equals(that.LAST_NAME));
    equal = equal && (this.MIDDLE_INITIAL == null ? that.MIDDLE_INITIAL == null : this.MIDDLE_INITIAL.equals(that.MIDDLE_INITIAL));
    equal = equal && (this.SALUTATION == null ? that.SALUTATION == null : this.SALUTATION.equals(that.SALUTATION));
    equal = equal && (this.IS_JUVENILE_FLAG == null ? that.IS_JUVENILE_FLAG == null : this.IS_JUVENILE_FLAG.equals(that.IS_JUVENILE_FLAG));
    equal = equal && (this.CUR_LOY_TIER_DW_ID == null ? that.CUR_LOY_TIER_DW_ID == null : this.CUR_LOY_TIER_DW_ID.equals(that.CUR_LOY_TIER_DW_ID));
    equal = equal && (this.ACTIVATED_CAFE_DW_ID == null ? that.ACTIVATED_CAFE_DW_ID == null : this.ACTIVATED_CAFE_DW_ID.equals(that.ACTIVATED_CAFE_DW_ID));
    equal = equal && (this.INSERT_DTTM == null ? that.INSERT_DTTM == null : this.INSERT_DTTM.equals(that.INSERT_DTTM));
    equal = equal && (this.UPDATE_DTTM == null ? that.UPDATE_DTTM == null : this.UPDATE_DTTM.equals(that.UPDATE_DTTM));
    equal = equal && (this.LOAD_DW_ID == null ? that.LOAD_DW_ID == null : this.LOAD_DW_ID.equals(that.LOAD_DW_ID));
    equal = equal && (this.VERSION == null ? that.VERSION == null : this.VERSION.equals(that.VERSION));
    equal = equal && (this.VEND_PROV_ENROLL_STORE_CODE == null ? that.VEND_PROV_ENROLL_STORE_CODE == null : this.VEND_PROV_ENROLL_STORE_CODE.equals(that.VEND_PROV_ENROLL_STORE_CODE));
    equal = equal && (this.LOAD_DTTM == null ? that.LOAD_DTTM == null : this.LOAD_DTTM.equals(that.LOAD_DTTM));
    equal = equal && (this.LOAD_BY == null ? that.LOAD_BY == null : this.LOAD_BY.equals(that.LOAD_BY));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_vend_loy_acct)) {
      return false;
    }
    dim_vend_loy_acct that = (dim_vend_loy_acct) o;
    boolean equal = true;
    equal = equal && (this.VEND_LOY_ACCT_DW_ID == null ? that.VEND_LOY_ACCT_DW_ID == null : this.VEND_LOY_ACCT_DW_ID.equals(that.VEND_LOY_ACCT_DW_ID));
    equal = equal && (this.VEND_ACCT_CODE == null ? that.VEND_ACCT_CODE == null : this.VEND_ACCT_CODE.equals(that.VEND_ACCT_CODE));
    equal = equal && (this.VEND_USER_ID == null ? that.VEND_USER_ID == null : this.VEND_USER_ID.equals(that.VEND_USER_ID));
    equal = equal && (this.VEND_ACCT_ACTIVATE_DATE_DW_ID == null ? that.VEND_ACCT_ACTIVATE_DATE_DW_ID == null : this.VEND_ACCT_ACTIVATE_DATE_DW_ID.equals(that.VEND_ACCT_ACTIVATE_DATE_DW_ID));
    equal = equal && (this.VEND_ACCT_REGISTER_DATE_DW_ID == null ? that.VEND_ACCT_REGISTER_DATE_DW_ID == null : this.VEND_ACCT_REGISTER_DATE_DW_ID.equals(that.VEND_ACCT_REGISTER_DATE_DW_ID));
    equal = equal && (this.VEND_ACCT_SUSPEND_DATE_DW_ID == null ? that.VEND_ACCT_SUSPEND_DATE_DW_ID == null : this.VEND_ACCT_SUSPEND_DATE_DW_ID.equals(that.VEND_ACCT_SUSPEND_DATE_DW_ID));
    equal = equal && (this.VEND_ACCT_EXPIRE_DATE_DW_ID == null ? that.VEND_ACCT_EXPIRE_DATE_DW_ID == null : this.VEND_ACCT_EXPIRE_DATE_DW_ID.equals(that.VEND_ACCT_EXPIRE_DATE_DW_ID));
    equal = equal && (this.VEND_ACCT_TERMINATE_DATE_DW_ID == null ? that.VEND_ACCT_TERMINATE_DATE_DW_ID == null : this.VEND_ACCT_TERMINATE_DATE_DW_ID.equals(that.VEND_ACCT_TERMINATE_DATE_DW_ID));
    equal = equal && (this.HUB_CUST_ID == null ? that.HUB_CUST_ID == null : this.HUB_CUST_ID.equals(that.HUB_CUST_ID));
    equal = equal && (this.FIRST_NAME == null ? that.FIRST_NAME == null : this.FIRST_NAME.equals(that.FIRST_NAME));
    equal = equal && (this.LAST_NAME == null ? that.LAST_NAME == null : this.LAST_NAME.equals(that.LAST_NAME));
    equal = equal && (this.MIDDLE_INITIAL == null ? that.MIDDLE_INITIAL == null : this.MIDDLE_INITIAL.equals(that.MIDDLE_INITIAL));
    equal = equal && (this.SALUTATION == null ? that.SALUTATION == null : this.SALUTATION.equals(that.SALUTATION));
    equal = equal && (this.IS_JUVENILE_FLAG == null ? that.IS_JUVENILE_FLAG == null : this.IS_JUVENILE_FLAG.equals(that.IS_JUVENILE_FLAG));
    equal = equal && (this.CUR_LOY_TIER_DW_ID == null ? that.CUR_LOY_TIER_DW_ID == null : this.CUR_LOY_TIER_DW_ID.equals(that.CUR_LOY_TIER_DW_ID));
    equal = equal && (this.ACTIVATED_CAFE_DW_ID == null ? that.ACTIVATED_CAFE_DW_ID == null : this.ACTIVATED_CAFE_DW_ID.equals(that.ACTIVATED_CAFE_DW_ID));
    equal = equal && (this.INSERT_DTTM == null ? that.INSERT_DTTM == null : this.INSERT_DTTM.equals(that.INSERT_DTTM));
    equal = equal && (this.UPDATE_DTTM == null ? that.UPDATE_DTTM == null : this.UPDATE_DTTM.equals(that.UPDATE_DTTM));
    equal = equal && (this.LOAD_DW_ID == null ? that.LOAD_DW_ID == null : this.LOAD_DW_ID.equals(that.LOAD_DW_ID));
    equal = equal && (this.VERSION == null ? that.VERSION == null : this.VERSION.equals(that.VERSION));
    equal = equal && (this.VEND_PROV_ENROLL_STORE_CODE == null ? that.VEND_PROV_ENROLL_STORE_CODE == null : this.VEND_PROV_ENROLL_STORE_CODE.equals(that.VEND_PROV_ENROLL_STORE_CODE));
    equal = equal && (this.LOAD_DTTM == null ? that.LOAD_DTTM == null : this.LOAD_DTTM.equals(that.LOAD_DTTM));
    equal = equal && (this.LOAD_BY == null ? that.LOAD_BY == null : this.LOAD_BY.equals(that.LOAD_BY));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.VEND_LOY_ACCT_DW_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.VEND_ACCT_CODE = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.VEND_USER_ID = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.VEND_ACCT_ACTIVATE_DATE_DW_ID = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.VEND_ACCT_REGISTER_DATE_DW_ID = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.VEND_ACCT_SUSPEND_DATE_DW_ID = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.VEND_ACCT_EXPIRE_DATE_DW_ID = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.VEND_ACCT_TERMINATE_DATE_DW_ID = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.HUB_CUST_ID = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.FIRST_NAME = JdbcWritableBridge.readString(10, __dbResults);
    this.LAST_NAME = JdbcWritableBridge.readString(11, __dbResults);
    this.MIDDLE_INITIAL = JdbcWritableBridge.readString(12, __dbResults);
    this.SALUTATION = JdbcWritableBridge.readString(13, __dbResults);
    this.IS_JUVENILE_FLAG = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.CUR_LOY_TIER_DW_ID = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.ACTIVATED_CAFE_DW_ID = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.INSERT_DTTM = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.UPDATE_DTTM = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.LOAD_DW_ID = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.VERSION = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.VEND_PROV_ENROLL_STORE_CODE = JdbcWritableBridge.readString(21, __dbResults);
    this.LOAD_DTTM = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.LOAD_BY = JdbcWritableBridge.readString(23, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.VEND_LOY_ACCT_DW_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.VEND_ACCT_CODE = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.VEND_USER_ID = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.VEND_ACCT_ACTIVATE_DATE_DW_ID = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.VEND_ACCT_REGISTER_DATE_DW_ID = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.VEND_ACCT_SUSPEND_DATE_DW_ID = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.VEND_ACCT_EXPIRE_DATE_DW_ID = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.VEND_ACCT_TERMINATE_DATE_DW_ID = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.HUB_CUST_ID = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.FIRST_NAME = JdbcWritableBridge.readString(10, __dbResults);
    this.LAST_NAME = JdbcWritableBridge.readString(11, __dbResults);
    this.MIDDLE_INITIAL = JdbcWritableBridge.readString(12, __dbResults);
    this.SALUTATION = JdbcWritableBridge.readString(13, __dbResults);
    this.IS_JUVENILE_FLAG = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.CUR_LOY_TIER_DW_ID = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.ACTIVATED_CAFE_DW_ID = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.INSERT_DTTM = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.UPDATE_DTTM = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.LOAD_DW_ID = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.VERSION = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.VEND_PROV_ENROLL_STORE_CODE = JdbcWritableBridge.readString(21, __dbResults);
    this.LOAD_DTTM = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.LOAD_BY = JdbcWritableBridge.readString(23, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(VEND_LOY_ACCT_DW_ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VEND_ACCT_CODE, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VEND_USER_ID, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VEND_ACCT_ACTIVATE_DATE_DW_ID, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VEND_ACCT_REGISTER_DATE_DW_ID, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VEND_ACCT_SUSPEND_DATE_DW_ID, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VEND_ACCT_EXPIRE_DATE_DW_ID, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VEND_ACCT_TERMINATE_DATE_DW_ID, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HUB_CUST_ID, 9 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(FIRST_NAME, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LAST_NAME, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MIDDLE_INITIAL, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SALUTATION, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(IS_JUVENILE_FLAG, 14 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CUR_LOY_TIER_DW_ID, 15 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ACTIVATED_CAFE_DW_ID, 16 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(INSERT_DTTM, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATE_DTTM, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOAD_DW_ID, 19 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VERSION, 20 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(VEND_PROV_ENROLL_STORE_CODE, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOAD_DTTM, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_BY, 23 + __off, 12, __dbStmt);
    return 23;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(VEND_LOY_ACCT_DW_ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VEND_ACCT_CODE, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VEND_USER_ID, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VEND_ACCT_ACTIVATE_DATE_DW_ID, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VEND_ACCT_REGISTER_DATE_DW_ID, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VEND_ACCT_SUSPEND_DATE_DW_ID, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VEND_ACCT_EXPIRE_DATE_DW_ID, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VEND_ACCT_TERMINATE_DATE_DW_ID, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HUB_CUST_ID, 9 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(FIRST_NAME, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LAST_NAME, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MIDDLE_INITIAL, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SALUTATION, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(IS_JUVENILE_FLAG, 14 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CUR_LOY_TIER_DW_ID, 15 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ACTIVATED_CAFE_DW_ID, 16 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(INSERT_DTTM, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATE_DTTM, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOAD_DW_ID, 19 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VERSION, 20 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(VEND_PROV_ENROLL_STORE_CODE, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOAD_DTTM, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_BY, 23 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.VEND_LOY_ACCT_DW_ID = null;
    } else {
    this.VEND_LOY_ACCT_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VEND_ACCT_CODE = null;
    } else {
    this.VEND_ACCT_CODE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VEND_USER_ID = null;
    } else {
    this.VEND_USER_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VEND_ACCT_ACTIVATE_DATE_DW_ID = null;
    } else {
    this.VEND_ACCT_ACTIVATE_DATE_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VEND_ACCT_REGISTER_DATE_DW_ID = null;
    } else {
    this.VEND_ACCT_REGISTER_DATE_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VEND_ACCT_SUSPEND_DATE_DW_ID = null;
    } else {
    this.VEND_ACCT_SUSPEND_DATE_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VEND_ACCT_EXPIRE_DATE_DW_ID = null;
    } else {
    this.VEND_ACCT_EXPIRE_DATE_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VEND_ACCT_TERMINATE_DATE_DW_ID = null;
    } else {
    this.VEND_ACCT_TERMINATE_DATE_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HUB_CUST_ID = null;
    } else {
    this.HUB_CUST_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FIRST_NAME = null;
    } else {
    this.FIRST_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LAST_NAME = null;
    } else {
    this.LAST_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MIDDLE_INITIAL = null;
    } else {
    this.MIDDLE_INITIAL = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SALUTATION = null;
    } else {
    this.SALUTATION = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.IS_JUVENILE_FLAG = null;
    } else {
    this.IS_JUVENILE_FLAG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CUR_LOY_TIER_DW_ID = null;
    } else {
    this.CUR_LOY_TIER_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ACTIVATED_CAFE_DW_ID = null;
    } else {
    this.ACTIVATED_CAFE_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.VEND_PROV_ENROLL_STORE_CODE = null;
    } else {
    this.VEND_PROV_ENROLL_STORE_CODE = Text.readString(__dataIn);
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
    if (null == this.VEND_LOY_ACCT_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VEND_LOY_ACCT_DW_ID, __dataOut);
    }
    if (null == this.VEND_ACCT_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VEND_ACCT_CODE, __dataOut);
    }
    if (null == this.VEND_USER_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VEND_USER_ID, __dataOut);
    }
    if (null == this.VEND_ACCT_ACTIVATE_DATE_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VEND_ACCT_ACTIVATE_DATE_DW_ID, __dataOut);
    }
    if (null == this.VEND_ACCT_REGISTER_DATE_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VEND_ACCT_REGISTER_DATE_DW_ID, __dataOut);
    }
    if (null == this.VEND_ACCT_SUSPEND_DATE_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VEND_ACCT_SUSPEND_DATE_DW_ID, __dataOut);
    }
    if (null == this.VEND_ACCT_EXPIRE_DATE_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VEND_ACCT_EXPIRE_DATE_DW_ID, __dataOut);
    }
    if (null == this.VEND_ACCT_TERMINATE_DATE_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VEND_ACCT_TERMINATE_DATE_DW_ID, __dataOut);
    }
    if (null == this.HUB_CUST_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HUB_CUST_ID, __dataOut);
    }
    if (null == this.FIRST_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FIRST_NAME);
    }
    if (null == this.LAST_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LAST_NAME);
    }
    if (null == this.MIDDLE_INITIAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MIDDLE_INITIAL);
    }
    if (null == this.SALUTATION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SALUTATION);
    }
    if (null == this.IS_JUVENILE_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.IS_JUVENILE_FLAG, __dataOut);
    }
    if (null == this.CUR_LOY_TIER_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CUR_LOY_TIER_DW_ID, __dataOut);
    }
    if (null == this.ACTIVATED_CAFE_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ACTIVATED_CAFE_DW_ID, __dataOut);
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
    if (null == this.VEND_PROV_ENROLL_STORE_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VEND_PROV_ENROLL_STORE_CODE);
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
    if (null == this.VEND_LOY_ACCT_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VEND_LOY_ACCT_DW_ID, __dataOut);
    }
    if (null == this.VEND_ACCT_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VEND_ACCT_CODE, __dataOut);
    }
    if (null == this.VEND_USER_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VEND_USER_ID, __dataOut);
    }
    if (null == this.VEND_ACCT_ACTIVATE_DATE_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VEND_ACCT_ACTIVATE_DATE_DW_ID, __dataOut);
    }
    if (null == this.VEND_ACCT_REGISTER_DATE_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VEND_ACCT_REGISTER_DATE_DW_ID, __dataOut);
    }
    if (null == this.VEND_ACCT_SUSPEND_DATE_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VEND_ACCT_SUSPEND_DATE_DW_ID, __dataOut);
    }
    if (null == this.VEND_ACCT_EXPIRE_DATE_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VEND_ACCT_EXPIRE_DATE_DW_ID, __dataOut);
    }
    if (null == this.VEND_ACCT_TERMINATE_DATE_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VEND_ACCT_TERMINATE_DATE_DW_ID, __dataOut);
    }
    if (null == this.HUB_CUST_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HUB_CUST_ID, __dataOut);
    }
    if (null == this.FIRST_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FIRST_NAME);
    }
    if (null == this.LAST_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LAST_NAME);
    }
    if (null == this.MIDDLE_INITIAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MIDDLE_INITIAL);
    }
    if (null == this.SALUTATION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SALUTATION);
    }
    if (null == this.IS_JUVENILE_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.IS_JUVENILE_FLAG, __dataOut);
    }
    if (null == this.CUR_LOY_TIER_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CUR_LOY_TIER_DW_ID, __dataOut);
    }
    if (null == this.ACTIVATED_CAFE_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ACTIVATED_CAFE_DW_ID, __dataOut);
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
    if (null == this.VEND_PROV_ENROLL_STORE_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VEND_PROV_ENROLL_STORE_CODE);
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
    __sb.append(FieldFormatter.escapeAndEnclose(VEND_LOY_ACCT_DW_ID==null?"\\N":VEND_LOY_ACCT_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VEND_ACCT_CODE==null?"\\N":VEND_ACCT_CODE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VEND_USER_ID==null?"\\N":VEND_USER_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VEND_ACCT_ACTIVATE_DATE_DW_ID==null?"\\N":VEND_ACCT_ACTIVATE_DATE_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VEND_ACCT_REGISTER_DATE_DW_ID==null?"\\N":VEND_ACCT_REGISTER_DATE_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VEND_ACCT_SUSPEND_DATE_DW_ID==null?"\\N":VEND_ACCT_SUSPEND_DATE_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VEND_ACCT_EXPIRE_DATE_DW_ID==null?"\\N":VEND_ACCT_EXPIRE_DATE_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VEND_ACCT_TERMINATE_DATE_DW_ID==null?"\\N":VEND_ACCT_TERMINATE_DATE_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HUB_CUST_ID==null?"\\N":HUB_CUST_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FIRST_NAME==null?"\\N":FIRST_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAST_NAME==null?"\\N":LAST_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MIDDLE_INITIAL==null?"\\N":MIDDLE_INITIAL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SALUTATION==null?"\\N":SALUTATION, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IS_JUVENILE_FLAG==null?"\\N":IS_JUVENILE_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUR_LOY_TIER_DW_ID==null?"\\N":CUR_LOY_TIER_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACTIVATED_CAFE_DW_ID==null?"\\N":ACTIVATED_CAFE_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INSERT_DTTM==null?"\\N":"" + INSERT_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UPDATE_DTTM==null?"\\N":"" + UPDATE_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOAD_DW_ID==null?"\\N":LOAD_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERSION==null?"\\N":VERSION.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VEND_PROV_ENROLL_STORE_CODE==null?"\\N":VEND_PROV_ENROLL_STORE_CODE, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(VEND_LOY_ACCT_DW_ID==null?"\\N":VEND_LOY_ACCT_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VEND_ACCT_CODE==null?"\\N":VEND_ACCT_CODE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VEND_USER_ID==null?"\\N":VEND_USER_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VEND_ACCT_ACTIVATE_DATE_DW_ID==null?"\\N":VEND_ACCT_ACTIVATE_DATE_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VEND_ACCT_REGISTER_DATE_DW_ID==null?"\\N":VEND_ACCT_REGISTER_DATE_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VEND_ACCT_SUSPEND_DATE_DW_ID==null?"\\N":VEND_ACCT_SUSPEND_DATE_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VEND_ACCT_EXPIRE_DATE_DW_ID==null?"\\N":VEND_ACCT_EXPIRE_DATE_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VEND_ACCT_TERMINATE_DATE_DW_ID==null?"\\N":VEND_ACCT_TERMINATE_DATE_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HUB_CUST_ID==null?"\\N":HUB_CUST_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FIRST_NAME==null?"\\N":FIRST_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAST_NAME==null?"\\N":LAST_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MIDDLE_INITIAL==null?"\\N":MIDDLE_INITIAL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SALUTATION==null?"\\N":SALUTATION, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IS_JUVENILE_FLAG==null?"\\N":IS_JUVENILE_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUR_LOY_TIER_DW_ID==null?"\\N":CUR_LOY_TIER_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACTIVATED_CAFE_DW_ID==null?"\\N":ACTIVATED_CAFE_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INSERT_DTTM==null?"\\N":"" + INSERT_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UPDATE_DTTM==null?"\\N":"" + UPDATE_DTTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOAD_DW_ID==null?"\\N":LOAD_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERSION==null?"\\N":VERSION.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VEND_PROV_ENROLL_STORE_CODE==null?"\\N":VEND_PROV_ENROLL_STORE_CODE, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VEND_LOY_ACCT_DW_ID = null; } else {
      this.VEND_LOY_ACCT_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VEND_ACCT_CODE = null; } else {
      this.VEND_ACCT_CODE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VEND_USER_ID = null; } else {
      this.VEND_USER_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VEND_ACCT_ACTIVATE_DATE_DW_ID = null; } else {
      this.VEND_ACCT_ACTIVATE_DATE_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VEND_ACCT_REGISTER_DATE_DW_ID = null; } else {
      this.VEND_ACCT_REGISTER_DATE_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VEND_ACCT_SUSPEND_DATE_DW_ID = null; } else {
      this.VEND_ACCT_SUSPEND_DATE_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VEND_ACCT_EXPIRE_DATE_DW_ID = null; } else {
      this.VEND_ACCT_EXPIRE_DATE_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VEND_ACCT_TERMINATE_DATE_DW_ID = null; } else {
      this.VEND_ACCT_TERMINATE_DATE_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HUB_CUST_ID = null; } else {
      this.HUB_CUST_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FIRST_NAME = null; } else {
      this.FIRST_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LAST_NAME = null; } else {
      this.LAST_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MIDDLE_INITIAL = null; } else {
      this.MIDDLE_INITIAL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SALUTATION = null; } else {
      this.SALUTATION = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.IS_JUVENILE_FLAG = null; } else {
      this.IS_JUVENILE_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CUR_LOY_TIER_DW_ID = null; } else {
      this.CUR_LOY_TIER_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ACTIVATED_CAFE_DW_ID = null; } else {
      this.ACTIVATED_CAFE_DW_ID = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.VEND_PROV_ENROLL_STORE_CODE = null; } else {
      this.VEND_PROV_ENROLL_STORE_CODE = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VEND_LOY_ACCT_DW_ID = null; } else {
      this.VEND_LOY_ACCT_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VEND_ACCT_CODE = null; } else {
      this.VEND_ACCT_CODE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VEND_USER_ID = null; } else {
      this.VEND_USER_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VEND_ACCT_ACTIVATE_DATE_DW_ID = null; } else {
      this.VEND_ACCT_ACTIVATE_DATE_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VEND_ACCT_REGISTER_DATE_DW_ID = null; } else {
      this.VEND_ACCT_REGISTER_DATE_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VEND_ACCT_SUSPEND_DATE_DW_ID = null; } else {
      this.VEND_ACCT_SUSPEND_DATE_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VEND_ACCT_EXPIRE_DATE_DW_ID = null; } else {
      this.VEND_ACCT_EXPIRE_DATE_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VEND_ACCT_TERMINATE_DATE_DW_ID = null; } else {
      this.VEND_ACCT_TERMINATE_DATE_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HUB_CUST_ID = null; } else {
      this.HUB_CUST_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FIRST_NAME = null; } else {
      this.FIRST_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LAST_NAME = null; } else {
      this.LAST_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MIDDLE_INITIAL = null; } else {
      this.MIDDLE_INITIAL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SALUTATION = null; } else {
      this.SALUTATION = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.IS_JUVENILE_FLAG = null; } else {
      this.IS_JUVENILE_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CUR_LOY_TIER_DW_ID = null; } else {
      this.CUR_LOY_TIER_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ACTIVATED_CAFE_DW_ID = null; } else {
      this.ACTIVATED_CAFE_DW_ID = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.VEND_PROV_ENROLL_STORE_CODE = null; } else {
      this.VEND_PROV_ENROLL_STORE_CODE = __cur_str;
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
    dim_vend_loy_acct o = (dim_vend_loy_acct) super.clone();
    o.INSERT_DTTM = (o.INSERT_DTTM != null) ? (java.sql.Timestamp) o.INSERT_DTTM.clone() : null;
    o.UPDATE_DTTM = (o.UPDATE_DTTM != null) ? (java.sql.Timestamp) o.UPDATE_DTTM.clone() : null;
    o.LOAD_DTTM = (o.LOAD_DTTM != null) ? (java.sql.Timestamp) o.LOAD_DTTM.clone() : null;
    return o;
  }

  public void clone0(dim_vend_loy_acct o) throws CloneNotSupportedException {
    o.INSERT_DTTM = (o.INSERT_DTTM != null) ? (java.sql.Timestamp) o.INSERT_DTTM.clone() : null;
    o.UPDATE_DTTM = (o.UPDATE_DTTM != null) ? (java.sql.Timestamp) o.UPDATE_DTTM.clone() : null;
    o.LOAD_DTTM = (o.LOAD_DTTM != null) ? (java.sql.Timestamp) o.LOAD_DTTM.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("VEND_LOY_ACCT_DW_ID", this.VEND_LOY_ACCT_DW_ID);
    __sqoop$field_map.put("VEND_ACCT_CODE", this.VEND_ACCT_CODE);
    __sqoop$field_map.put("VEND_USER_ID", this.VEND_USER_ID);
    __sqoop$field_map.put("VEND_ACCT_ACTIVATE_DATE_DW_ID", this.VEND_ACCT_ACTIVATE_DATE_DW_ID);
    __sqoop$field_map.put("VEND_ACCT_REGISTER_DATE_DW_ID", this.VEND_ACCT_REGISTER_DATE_DW_ID);
    __sqoop$field_map.put("VEND_ACCT_SUSPEND_DATE_DW_ID", this.VEND_ACCT_SUSPEND_DATE_DW_ID);
    __sqoop$field_map.put("VEND_ACCT_EXPIRE_DATE_DW_ID", this.VEND_ACCT_EXPIRE_DATE_DW_ID);
    __sqoop$field_map.put("VEND_ACCT_TERMINATE_DATE_DW_ID", this.VEND_ACCT_TERMINATE_DATE_DW_ID);
    __sqoop$field_map.put("HUB_CUST_ID", this.HUB_CUST_ID);
    __sqoop$field_map.put("FIRST_NAME", this.FIRST_NAME);
    __sqoop$field_map.put("LAST_NAME", this.LAST_NAME);
    __sqoop$field_map.put("MIDDLE_INITIAL", this.MIDDLE_INITIAL);
    __sqoop$field_map.put("SALUTATION", this.SALUTATION);
    __sqoop$field_map.put("IS_JUVENILE_FLAG", this.IS_JUVENILE_FLAG);
    __sqoop$field_map.put("CUR_LOY_TIER_DW_ID", this.CUR_LOY_TIER_DW_ID);
    __sqoop$field_map.put("ACTIVATED_CAFE_DW_ID", this.ACTIVATED_CAFE_DW_ID);
    __sqoop$field_map.put("INSERT_DTTM", this.INSERT_DTTM);
    __sqoop$field_map.put("UPDATE_DTTM", this.UPDATE_DTTM);
    __sqoop$field_map.put("LOAD_DW_ID", this.LOAD_DW_ID);
    __sqoop$field_map.put("VERSION", this.VERSION);
    __sqoop$field_map.put("VEND_PROV_ENROLL_STORE_CODE", this.VEND_PROV_ENROLL_STORE_CODE);
    __sqoop$field_map.put("LOAD_DTTM", this.LOAD_DTTM);
    __sqoop$field_map.put("LOAD_BY", this.LOAD_BY);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("VEND_LOY_ACCT_DW_ID", this.VEND_LOY_ACCT_DW_ID);
    __sqoop$field_map.put("VEND_ACCT_CODE", this.VEND_ACCT_CODE);
    __sqoop$field_map.put("VEND_USER_ID", this.VEND_USER_ID);
    __sqoop$field_map.put("VEND_ACCT_ACTIVATE_DATE_DW_ID", this.VEND_ACCT_ACTIVATE_DATE_DW_ID);
    __sqoop$field_map.put("VEND_ACCT_REGISTER_DATE_DW_ID", this.VEND_ACCT_REGISTER_DATE_DW_ID);
    __sqoop$field_map.put("VEND_ACCT_SUSPEND_DATE_DW_ID", this.VEND_ACCT_SUSPEND_DATE_DW_ID);
    __sqoop$field_map.put("VEND_ACCT_EXPIRE_DATE_DW_ID", this.VEND_ACCT_EXPIRE_DATE_DW_ID);
    __sqoop$field_map.put("VEND_ACCT_TERMINATE_DATE_DW_ID", this.VEND_ACCT_TERMINATE_DATE_DW_ID);
    __sqoop$field_map.put("HUB_CUST_ID", this.HUB_CUST_ID);
    __sqoop$field_map.put("FIRST_NAME", this.FIRST_NAME);
    __sqoop$field_map.put("LAST_NAME", this.LAST_NAME);
    __sqoop$field_map.put("MIDDLE_INITIAL", this.MIDDLE_INITIAL);
    __sqoop$field_map.put("SALUTATION", this.SALUTATION);
    __sqoop$field_map.put("IS_JUVENILE_FLAG", this.IS_JUVENILE_FLAG);
    __sqoop$field_map.put("CUR_LOY_TIER_DW_ID", this.CUR_LOY_TIER_DW_ID);
    __sqoop$field_map.put("ACTIVATED_CAFE_DW_ID", this.ACTIVATED_CAFE_DW_ID);
    __sqoop$field_map.put("INSERT_DTTM", this.INSERT_DTTM);
    __sqoop$field_map.put("UPDATE_DTTM", this.UPDATE_DTTM);
    __sqoop$field_map.put("LOAD_DW_ID", this.LOAD_DW_ID);
    __sqoop$field_map.put("VERSION", this.VERSION);
    __sqoop$field_map.put("VEND_PROV_ENROLL_STORE_CODE", this.VEND_PROV_ENROLL_STORE_CODE);
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
