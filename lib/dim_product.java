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

public class dim_product extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Z_PRODUCT_DW_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Z_PRODUCT_DW_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("PRODUCT_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PRODUCT_CODE = (java.math.BigDecimal)value;
      }
    });
    setters.put("PRODUCT_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PRODUCT_DESC = (String)value;
      }
    });
    setters.put("MAIN_GROUP_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_GROUP_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("MAIN_GROUP_CD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_GROUP_CD = (String)value;
      }
    });
    setters.put("MAIN_GROUP_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_GROUP_DESC = (String)value;
      }
    });
    setters.put("MAIN_CATEGORY_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_CATEGORY_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("MAIN_CATEGORY_CD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_CATEGORY_CD = (String)value;
      }
    });
    setters.put("MAIN_CATEGORY_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_CATEGORY_DESC = (String)value;
      }
    });
    setters.put("MAIN_SUB_CATEGORY_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_SUB_CATEGORY_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("MAIN_SUB_CATEGORY_CD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_SUB_CATEGORY_CD = (String)value;
      }
    });
    setters.put("MAIN_SUB_CATEGORY_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAIN_SUB_CATEGORY_DESC = (String)value;
      }
    });
    setters.put("CATERING_GROUP_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CATERING_GROUP_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("CATERING_GROUP_CD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CATERING_GROUP_CD = (String)value;
      }
    });
    setters.put("CATERING_GROUP_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CATERING_GROUP_DESC = (String)value;
      }
    });
    setters.put("CATERING_CATEGORY_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CATERING_CATEGORY_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("CATERING_CATEGORY_CD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CATERING_CATEGORY_CD = (String)value;
      }
    });
    setters.put("CATERING_CATEGORY_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CATERING_CATEGORY_DESC = (String)value;
      }
    });
    setters.put("CATERING_SUB_CATEGORY_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CATERING_SUB_CATEGORY_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("CATERING_SUB_CATEGORY_CD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CATERING_SUB_CATEGORY_CD = (String)value;
      }
    });
    setters.put("CATERING_SUB_CATEGORY_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CATERING_SUB_CATEGORY_DESC = (String)value;
      }
    });
    setters.put("ALT_GROUP_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ALT_GROUP_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("ALT_GROUP_CD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ALT_GROUP_CD = (String)value;
      }
    });
    setters.put("ALT_GROUP_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ALT_GROUP_DESC = (String)value;
      }
    });
    setters.put("ALT_CATEGORY_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ALT_CATEGORY_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("ALT_CATEGORY_CD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ALT_CATEGORY_CD = (String)value;
      }
    });
    setters.put("ALT_CATEGORY_DESC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ALT_CATEGORY_DESC = (String)value;
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
    setters.put("RUN_OUT_IND", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        RUN_OUT_IND = (String)value;
      }
    });
    setters.put("PANUP_SORT_ORDER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PANUP_SORT_ORDER = (String)value;
      }
    });
    setters.put("PRODUCT_PREP_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PRODUCT_PREP_FLAG = (java.math.BigDecimal)value;
      }
    });
    setters.put("FDF_INVOICED_ITEM_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FDF_INVOICED_ITEM_FLAG = (java.math.BigDecimal)value;
      }
    });
    setters.put("SAMPLE_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SAMPLE_FLAG = (java.math.BigDecimal)value;
      }
    });
    setters.put("ADD_ON_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ADD_ON_FLAG = (java.math.BigDecimal)value;
      }
    });
    setters.put("POS_MENU_ITEM_CD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        POS_MENU_ITEM_CD = (String)value;
      }
    });
    setters.put("ALT_POS_MENU_ITEM_CD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ALT_POS_MENU_ITEM_CD = (String)value;
      }
    });
    setters.put("ORACLE_INVENTORY_ITEM_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ORACLE_INVENTORY_ITEM_ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("REMARKS", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        REMARKS = (String)value;
      }
    });
    setters.put("CELEBRATION_PRODUCT_INDICATOR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CELEBRATION_PRODUCT_INDICATOR = (java.math.BigDecimal)value;
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
  public dim_product() {
    init0();
  }
  private java.math.BigDecimal Z_PRODUCT_DW_ID;
  public java.math.BigDecimal get_Z_PRODUCT_DW_ID() {
    return Z_PRODUCT_DW_ID;
  }
  public void set_Z_PRODUCT_DW_ID(java.math.BigDecimal Z_PRODUCT_DW_ID) {
    this.Z_PRODUCT_DW_ID = Z_PRODUCT_DW_ID;
  }
  public dim_product with_Z_PRODUCT_DW_ID(java.math.BigDecimal Z_PRODUCT_DW_ID) {
    this.Z_PRODUCT_DW_ID = Z_PRODUCT_DW_ID;
    return this;
  }
  private java.math.BigDecimal PRODUCT_CODE;
  public java.math.BigDecimal get_PRODUCT_CODE() {
    return PRODUCT_CODE;
  }
  public void set_PRODUCT_CODE(java.math.BigDecimal PRODUCT_CODE) {
    this.PRODUCT_CODE = PRODUCT_CODE;
  }
  public dim_product with_PRODUCT_CODE(java.math.BigDecimal PRODUCT_CODE) {
    this.PRODUCT_CODE = PRODUCT_CODE;
    return this;
  }
  private String PRODUCT_DESC;
  public String get_PRODUCT_DESC() {
    return PRODUCT_DESC;
  }
  public void set_PRODUCT_DESC(String PRODUCT_DESC) {
    this.PRODUCT_DESC = PRODUCT_DESC;
  }
  public dim_product with_PRODUCT_DESC(String PRODUCT_DESC) {
    this.PRODUCT_DESC = PRODUCT_DESC;
    return this;
  }
  private java.math.BigDecimal MAIN_GROUP_ID;
  public java.math.BigDecimal get_MAIN_GROUP_ID() {
    return MAIN_GROUP_ID;
  }
  public void set_MAIN_GROUP_ID(java.math.BigDecimal MAIN_GROUP_ID) {
    this.MAIN_GROUP_ID = MAIN_GROUP_ID;
  }
  public dim_product with_MAIN_GROUP_ID(java.math.BigDecimal MAIN_GROUP_ID) {
    this.MAIN_GROUP_ID = MAIN_GROUP_ID;
    return this;
  }
  private String MAIN_GROUP_CD;
  public String get_MAIN_GROUP_CD() {
    return MAIN_GROUP_CD;
  }
  public void set_MAIN_GROUP_CD(String MAIN_GROUP_CD) {
    this.MAIN_GROUP_CD = MAIN_GROUP_CD;
  }
  public dim_product with_MAIN_GROUP_CD(String MAIN_GROUP_CD) {
    this.MAIN_GROUP_CD = MAIN_GROUP_CD;
    return this;
  }
  private String MAIN_GROUP_DESC;
  public String get_MAIN_GROUP_DESC() {
    return MAIN_GROUP_DESC;
  }
  public void set_MAIN_GROUP_DESC(String MAIN_GROUP_DESC) {
    this.MAIN_GROUP_DESC = MAIN_GROUP_DESC;
  }
  public dim_product with_MAIN_GROUP_DESC(String MAIN_GROUP_DESC) {
    this.MAIN_GROUP_DESC = MAIN_GROUP_DESC;
    return this;
  }
  private java.math.BigDecimal MAIN_CATEGORY_ID;
  public java.math.BigDecimal get_MAIN_CATEGORY_ID() {
    return MAIN_CATEGORY_ID;
  }
  public void set_MAIN_CATEGORY_ID(java.math.BigDecimal MAIN_CATEGORY_ID) {
    this.MAIN_CATEGORY_ID = MAIN_CATEGORY_ID;
  }
  public dim_product with_MAIN_CATEGORY_ID(java.math.BigDecimal MAIN_CATEGORY_ID) {
    this.MAIN_CATEGORY_ID = MAIN_CATEGORY_ID;
    return this;
  }
  private String MAIN_CATEGORY_CD;
  public String get_MAIN_CATEGORY_CD() {
    return MAIN_CATEGORY_CD;
  }
  public void set_MAIN_CATEGORY_CD(String MAIN_CATEGORY_CD) {
    this.MAIN_CATEGORY_CD = MAIN_CATEGORY_CD;
  }
  public dim_product with_MAIN_CATEGORY_CD(String MAIN_CATEGORY_CD) {
    this.MAIN_CATEGORY_CD = MAIN_CATEGORY_CD;
    return this;
  }
  private String MAIN_CATEGORY_DESC;
  public String get_MAIN_CATEGORY_DESC() {
    return MAIN_CATEGORY_DESC;
  }
  public void set_MAIN_CATEGORY_DESC(String MAIN_CATEGORY_DESC) {
    this.MAIN_CATEGORY_DESC = MAIN_CATEGORY_DESC;
  }
  public dim_product with_MAIN_CATEGORY_DESC(String MAIN_CATEGORY_DESC) {
    this.MAIN_CATEGORY_DESC = MAIN_CATEGORY_DESC;
    return this;
  }
  private java.math.BigDecimal MAIN_SUB_CATEGORY_ID;
  public java.math.BigDecimal get_MAIN_SUB_CATEGORY_ID() {
    return MAIN_SUB_CATEGORY_ID;
  }
  public void set_MAIN_SUB_CATEGORY_ID(java.math.BigDecimal MAIN_SUB_CATEGORY_ID) {
    this.MAIN_SUB_CATEGORY_ID = MAIN_SUB_CATEGORY_ID;
  }
  public dim_product with_MAIN_SUB_CATEGORY_ID(java.math.BigDecimal MAIN_SUB_CATEGORY_ID) {
    this.MAIN_SUB_CATEGORY_ID = MAIN_SUB_CATEGORY_ID;
    return this;
  }
  private String MAIN_SUB_CATEGORY_CD;
  public String get_MAIN_SUB_CATEGORY_CD() {
    return MAIN_SUB_CATEGORY_CD;
  }
  public void set_MAIN_SUB_CATEGORY_CD(String MAIN_SUB_CATEGORY_CD) {
    this.MAIN_SUB_CATEGORY_CD = MAIN_SUB_CATEGORY_CD;
  }
  public dim_product with_MAIN_SUB_CATEGORY_CD(String MAIN_SUB_CATEGORY_CD) {
    this.MAIN_SUB_CATEGORY_CD = MAIN_SUB_CATEGORY_CD;
    return this;
  }
  private String MAIN_SUB_CATEGORY_DESC;
  public String get_MAIN_SUB_CATEGORY_DESC() {
    return MAIN_SUB_CATEGORY_DESC;
  }
  public void set_MAIN_SUB_CATEGORY_DESC(String MAIN_SUB_CATEGORY_DESC) {
    this.MAIN_SUB_CATEGORY_DESC = MAIN_SUB_CATEGORY_DESC;
  }
  public dim_product with_MAIN_SUB_CATEGORY_DESC(String MAIN_SUB_CATEGORY_DESC) {
    this.MAIN_SUB_CATEGORY_DESC = MAIN_SUB_CATEGORY_DESC;
    return this;
  }
  private java.math.BigDecimal CATERING_GROUP_ID;
  public java.math.BigDecimal get_CATERING_GROUP_ID() {
    return CATERING_GROUP_ID;
  }
  public void set_CATERING_GROUP_ID(java.math.BigDecimal CATERING_GROUP_ID) {
    this.CATERING_GROUP_ID = CATERING_GROUP_ID;
  }
  public dim_product with_CATERING_GROUP_ID(java.math.BigDecimal CATERING_GROUP_ID) {
    this.CATERING_GROUP_ID = CATERING_GROUP_ID;
    return this;
  }
  private String CATERING_GROUP_CD;
  public String get_CATERING_GROUP_CD() {
    return CATERING_GROUP_CD;
  }
  public void set_CATERING_GROUP_CD(String CATERING_GROUP_CD) {
    this.CATERING_GROUP_CD = CATERING_GROUP_CD;
  }
  public dim_product with_CATERING_GROUP_CD(String CATERING_GROUP_CD) {
    this.CATERING_GROUP_CD = CATERING_GROUP_CD;
    return this;
  }
  private String CATERING_GROUP_DESC;
  public String get_CATERING_GROUP_DESC() {
    return CATERING_GROUP_DESC;
  }
  public void set_CATERING_GROUP_DESC(String CATERING_GROUP_DESC) {
    this.CATERING_GROUP_DESC = CATERING_GROUP_DESC;
  }
  public dim_product with_CATERING_GROUP_DESC(String CATERING_GROUP_DESC) {
    this.CATERING_GROUP_DESC = CATERING_GROUP_DESC;
    return this;
  }
  private java.math.BigDecimal CATERING_CATEGORY_ID;
  public java.math.BigDecimal get_CATERING_CATEGORY_ID() {
    return CATERING_CATEGORY_ID;
  }
  public void set_CATERING_CATEGORY_ID(java.math.BigDecimal CATERING_CATEGORY_ID) {
    this.CATERING_CATEGORY_ID = CATERING_CATEGORY_ID;
  }
  public dim_product with_CATERING_CATEGORY_ID(java.math.BigDecimal CATERING_CATEGORY_ID) {
    this.CATERING_CATEGORY_ID = CATERING_CATEGORY_ID;
    return this;
  }
  private String CATERING_CATEGORY_CD;
  public String get_CATERING_CATEGORY_CD() {
    return CATERING_CATEGORY_CD;
  }
  public void set_CATERING_CATEGORY_CD(String CATERING_CATEGORY_CD) {
    this.CATERING_CATEGORY_CD = CATERING_CATEGORY_CD;
  }
  public dim_product with_CATERING_CATEGORY_CD(String CATERING_CATEGORY_CD) {
    this.CATERING_CATEGORY_CD = CATERING_CATEGORY_CD;
    return this;
  }
  private String CATERING_CATEGORY_DESC;
  public String get_CATERING_CATEGORY_DESC() {
    return CATERING_CATEGORY_DESC;
  }
  public void set_CATERING_CATEGORY_DESC(String CATERING_CATEGORY_DESC) {
    this.CATERING_CATEGORY_DESC = CATERING_CATEGORY_DESC;
  }
  public dim_product with_CATERING_CATEGORY_DESC(String CATERING_CATEGORY_DESC) {
    this.CATERING_CATEGORY_DESC = CATERING_CATEGORY_DESC;
    return this;
  }
  private java.math.BigDecimal CATERING_SUB_CATEGORY_ID;
  public java.math.BigDecimal get_CATERING_SUB_CATEGORY_ID() {
    return CATERING_SUB_CATEGORY_ID;
  }
  public void set_CATERING_SUB_CATEGORY_ID(java.math.BigDecimal CATERING_SUB_CATEGORY_ID) {
    this.CATERING_SUB_CATEGORY_ID = CATERING_SUB_CATEGORY_ID;
  }
  public dim_product with_CATERING_SUB_CATEGORY_ID(java.math.BigDecimal CATERING_SUB_CATEGORY_ID) {
    this.CATERING_SUB_CATEGORY_ID = CATERING_SUB_CATEGORY_ID;
    return this;
  }
  private String CATERING_SUB_CATEGORY_CD;
  public String get_CATERING_SUB_CATEGORY_CD() {
    return CATERING_SUB_CATEGORY_CD;
  }
  public void set_CATERING_SUB_CATEGORY_CD(String CATERING_SUB_CATEGORY_CD) {
    this.CATERING_SUB_CATEGORY_CD = CATERING_SUB_CATEGORY_CD;
  }
  public dim_product with_CATERING_SUB_CATEGORY_CD(String CATERING_SUB_CATEGORY_CD) {
    this.CATERING_SUB_CATEGORY_CD = CATERING_SUB_CATEGORY_CD;
    return this;
  }
  private String CATERING_SUB_CATEGORY_DESC;
  public String get_CATERING_SUB_CATEGORY_DESC() {
    return CATERING_SUB_CATEGORY_DESC;
  }
  public void set_CATERING_SUB_CATEGORY_DESC(String CATERING_SUB_CATEGORY_DESC) {
    this.CATERING_SUB_CATEGORY_DESC = CATERING_SUB_CATEGORY_DESC;
  }
  public dim_product with_CATERING_SUB_CATEGORY_DESC(String CATERING_SUB_CATEGORY_DESC) {
    this.CATERING_SUB_CATEGORY_DESC = CATERING_SUB_CATEGORY_DESC;
    return this;
  }
  private java.math.BigDecimal ALT_GROUP_ID;
  public java.math.BigDecimal get_ALT_GROUP_ID() {
    return ALT_GROUP_ID;
  }
  public void set_ALT_GROUP_ID(java.math.BigDecimal ALT_GROUP_ID) {
    this.ALT_GROUP_ID = ALT_GROUP_ID;
  }
  public dim_product with_ALT_GROUP_ID(java.math.BigDecimal ALT_GROUP_ID) {
    this.ALT_GROUP_ID = ALT_GROUP_ID;
    return this;
  }
  private String ALT_GROUP_CD;
  public String get_ALT_GROUP_CD() {
    return ALT_GROUP_CD;
  }
  public void set_ALT_GROUP_CD(String ALT_GROUP_CD) {
    this.ALT_GROUP_CD = ALT_GROUP_CD;
  }
  public dim_product with_ALT_GROUP_CD(String ALT_GROUP_CD) {
    this.ALT_GROUP_CD = ALT_GROUP_CD;
    return this;
  }
  private String ALT_GROUP_DESC;
  public String get_ALT_GROUP_DESC() {
    return ALT_GROUP_DESC;
  }
  public void set_ALT_GROUP_DESC(String ALT_GROUP_DESC) {
    this.ALT_GROUP_DESC = ALT_GROUP_DESC;
  }
  public dim_product with_ALT_GROUP_DESC(String ALT_GROUP_DESC) {
    this.ALT_GROUP_DESC = ALT_GROUP_DESC;
    return this;
  }
  private java.math.BigDecimal ALT_CATEGORY_ID;
  public java.math.BigDecimal get_ALT_CATEGORY_ID() {
    return ALT_CATEGORY_ID;
  }
  public void set_ALT_CATEGORY_ID(java.math.BigDecimal ALT_CATEGORY_ID) {
    this.ALT_CATEGORY_ID = ALT_CATEGORY_ID;
  }
  public dim_product with_ALT_CATEGORY_ID(java.math.BigDecimal ALT_CATEGORY_ID) {
    this.ALT_CATEGORY_ID = ALT_CATEGORY_ID;
    return this;
  }
  private String ALT_CATEGORY_CD;
  public String get_ALT_CATEGORY_CD() {
    return ALT_CATEGORY_CD;
  }
  public void set_ALT_CATEGORY_CD(String ALT_CATEGORY_CD) {
    this.ALT_CATEGORY_CD = ALT_CATEGORY_CD;
  }
  public dim_product with_ALT_CATEGORY_CD(String ALT_CATEGORY_CD) {
    this.ALT_CATEGORY_CD = ALT_CATEGORY_CD;
    return this;
  }
  private String ALT_CATEGORY_DESC;
  public String get_ALT_CATEGORY_DESC() {
    return ALT_CATEGORY_DESC;
  }
  public void set_ALT_CATEGORY_DESC(String ALT_CATEGORY_DESC) {
    this.ALT_CATEGORY_DESC = ALT_CATEGORY_DESC;
  }
  public dim_product with_ALT_CATEGORY_DESC(String ALT_CATEGORY_DESC) {
    this.ALT_CATEGORY_DESC = ALT_CATEGORY_DESC;
    return this;
  }
  private java.sql.Timestamp FILE_DTTM;
  public java.sql.Timestamp get_FILE_DTTM() {
    return FILE_DTTM;
  }
  public void set_FILE_DTTM(java.sql.Timestamp FILE_DTTM) {
    this.FILE_DTTM = FILE_DTTM;
  }
  public dim_product with_FILE_DTTM(java.sql.Timestamp FILE_DTTM) {
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
  public dim_product with_INSERT_DTTM(java.sql.Timestamp INSERT_DTTM) {
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
  public dim_product with_UPDATE_DTTM(java.sql.Timestamp UPDATE_DTTM) {
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
  public dim_product with_LOAD_DW_ID(java.math.BigDecimal LOAD_DW_ID) {
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
  public dim_product with_VERSION(java.math.BigDecimal VERSION) {
    this.VERSION = VERSION;
    return this;
  }
  private String RUN_OUT_IND;
  public String get_RUN_OUT_IND() {
    return RUN_OUT_IND;
  }
  public void set_RUN_OUT_IND(String RUN_OUT_IND) {
    this.RUN_OUT_IND = RUN_OUT_IND;
  }
  public dim_product with_RUN_OUT_IND(String RUN_OUT_IND) {
    this.RUN_OUT_IND = RUN_OUT_IND;
    return this;
  }
  private String PANUP_SORT_ORDER;
  public String get_PANUP_SORT_ORDER() {
    return PANUP_SORT_ORDER;
  }
  public void set_PANUP_SORT_ORDER(String PANUP_SORT_ORDER) {
    this.PANUP_SORT_ORDER = PANUP_SORT_ORDER;
  }
  public dim_product with_PANUP_SORT_ORDER(String PANUP_SORT_ORDER) {
    this.PANUP_SORT_ORDER = PANUP_SORT_ORDER;
    return this;
  }
  private java.math.BigDecimal PRODUCT_PREP_FLAG;
  public java.math.BigDecimal get_PRODUCT_PREP_FLAG() {
    return PRODUCT_PREP_FLAG;
  }
  public void set_PRODUCT_PREP_FLAG(java.math.BigDecimal PRODUCT_PREP_FLAG) {
    this.PRODUCT_PREP_FLAG = PRODUCT_PREP_FLAG;
  }
  public dim_product with_PRODUCT_PREP_FLAG(java.math.BigDecimal PRODUCT_PREP_FLAG) {
    this.PRODUCT_PREP_FLAG = PRODUCT_PREP_FLAG;
    return this;
  }
  private java.math.BigDecimal FDF_INVOICED_ITEM_FLAG;
  public java.math.BigDecimal get_FDF_INVOICED_ITEM_FLAG() {
    return FDF_INVOICED_ITEM_FLAG;
  }
  public void set_FDF_INVOICED_ITEM_FLAG(java.math.BigDecimal FDF_INVOICED_ITEM_FLAG) {
    this.FDF_INVOICED_ITEM_FLAG = FDF_INVOICED_ITEM_FLAG;
  }
  public dim_product with_FDF_INVOICED_ITEM_FLAG(java.math.BigDecimal FDF_INVOICED_ITEM_FLAG) {
    this.FDF_INVOICED_ITEM_FLAG = FDF_INVOICED_ITEM_FLAG;
    return this;
  }
  private java.math.BigDecimal SAMPLE_FLAG;
  public java.math.BigDecimal get_SAMPLE_FLAG() {
    return SAMPLE_FLAG;
  }
  public void set_SAMPLE_FLAG(java.math.BigDecimal SAMPLE_FLAG) {
    this.SAMPLE_FLAG = SAMPLE_FLAG;
  }
  public dim_product with_SAMPLE_FLAG(java.math.BigDecimal SAMPLE_FLAG) {
    this.SAMPLE_FLAG = SAMPLE_FLAG;
    return this;
  }
  private java.math.BigDecimal ADD_ON_FLAG;
  public java.math.BigDecimal get_ADD_ON_FLAG() {
    return ADD_ON_FLAG;
  }
  public void set_ADD_ON_FLAG(java.math.BigDecimal ADD_ON_FLAG) {
    this.ADD_ON_FLAG = ADD_ON_FLAG;
  }
  public dim_product with_ADD_ON_FLAG(java.math.BigDecimal ADD_ON_FLAG) {
    this.ADD_ON_FLAG = ADD_ON_FLAG;
    return this;
  }
  private String POS_MENU_ITEM_CD;
  public String get_POS_MENU_ITEM_CD() {
    return POS_MENU_ITEM_CD;
  }
  public void set_POS_MENU_ITEM_CD(String POS_MENU_ITEM_CD) {
    this.POS_MENU_ITEM_CD = POS_MENU_ITEM_CD;
  }
  public dim_product with_POS_MENU_ITEM_CD(String POS_MENU_ITEM_CD) {
    this.POS_MENU_ITEM_CD = POS_MENU_ITEM_CD;
    return this;
  }
  private String ALT_POS_MENU_ITEM_CD;
  public String get_ALT_POS_MENU_ITEM_CD() {
    return ALT_POS_MENU_ITEM_CD;
  }
  public void set_ALT_POS_MENU_ITEM_CD(String ALT_POS_MENU_ITEM_CD) {
    this.ALT_POS_MENU_ITEM_CD = ALT_POS_MENU_ITEM_CD;
  }
  public dim_product with_ALT_POS_MENU_ITEM_CD(String ALT_POS_MENU_ITEM_CD) {
    this.ALT_POS_MENU_ITEM_CD = ALT_POS_MENU_ITEM_CD;
    return this;
  }
  private java.math.BigDecimal ORACLE_INVENTORY_ITEM_ID;
  public java.math.BigDecimal get_ORACLE_INVENTORY_ITEM_ID() {
    return ORACLE_INVENTORY_ITEM_ID;
  }
  public void set_ORACLE_INVENTORY_ITEM_ID(java.math.BigDecimal ORACLE_INVENTORY_ITEM_ID) {
    this.ORACLE_INVENTORY_ITEM_ID = ORACLE_INVENTORY_ITEM_ID;
  }
  public dim_product with_ORACLE_INVENTORY_ITEM_ID(java.math.BigDecimal ORACLE_INVENTORY_ITEM_ID) {
    this.ORACLE_INVENTORY_ITEM_ID = ORACLE_INVENTORY_ITEM_ID;
    return this;
  }
  private String REMARKS;
  public String get_REMARKS() {
    return REMARKS;
  }
  public void set_REMARKS(String REMARKS) {
    this.REMARKS = REMARKS;
  }
  public dim_product with_REMARKS(String REMARKS) {
    this.REMARKS = REMARKS;
    return this;
  }
  private java.math.BigDecimal CELEBRATION_PRODUCT_INDICATOR;
  public java.math.BigDecimal get_CELEBRATION_PRODUCT_INDICATOR() {
    return CELEBRATION_PRODUCT_INDICATOR;
  }
  public void set_CELEBRATION_PRODUCT_INDICATOR(java.math.BigDecimal CELEBRATION_PRODUCT_INDICATOR) {
    this.CELEBRATION_PRODUCT_INDICATOR = CELEBRATION_PRODUCT_INDICATOR;
  }
  public dim_product with_CELEBRATION_PRODUCT_INDICATOR(java.math.BigDecimal CELEBRATION_PRODUCT_INDICATOR) {
    this.CELEBRATION_PRODUCT_INDICATOR = CELEBRATION_PRODUCT_INDICATOR;
    return this;
  }
  private java.sql.Timestamp LOAD_DTTM;
  public java.sql.Timestamp get_LOAD_DTTM() {
    return LOAD_DTTM;
  }
  public void set_LOAD_DTTM(java.sql.Timestamp LOAD_DTTM) {
    this.LOAD_DTTM = LOAD_DTTM;
  }
  public dim_product with_LOAD_DTTM(java.sql.Timestamp LOAD_DTTM) {
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
  public dim_product with_LOAD_BY(String LOAD_BY) {
    this.LOAD_BY = LOAD_BY;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_product)) {
      return false;
    }
    dim_product that = (dim_product) o;
    boolean equal = true;
    equal = equal && (this.Z_PRODUCT_DW_ID == null ? that.Z_PRODUCT_DW_ID == null : this.Z_PRODUCT_DW_ID.equals(that.Z_PRODUCT_DW_ID));
    equal = equal && (this.PRODUCT_CODE == null ? that.PRODUCT_CODE == null : this.PRODUCT_CODE.equals(that.PRODUCT_CODE));
    equal = equal && (this.PRODUCT_DESC == null ? that.PRODUCT_DESC == null : this.PRODUCT_DESC.equals(that.PRODUCT_DESC));
    equal = equal && (this.MAIN_GROUP_ID == null ? that.MAIN_GROUP_ID == null : this.MAIN_GROUP_ID.equals(that.MAIN_GROUP_ID));
    equal = equal && (this.MAIN_GROUP_CD == null ? that.MAIN_GROUP_CD == null : this.MAIN_GROUP_CD.equals(that.MAIN_GROUP_CD));
    equal = equal && (this.MAIN_GROUP_DESC == null ? that.MAIN_GROUP_DESC == null : this.MAIN_GROUP_DESC.equals(that.MAIN_GROUP_DESC));
    equal = equal && (this.MAIN_CATEGORY_ID == null ? that.MAIN_CATEGORY_ID == null : this.MAIN_CATEGORY_ID.equals(that.MAIN_CATEGORY_ID));
    equal = equal && (this.MAIN_CATEGORY_CD == null ? that.MAIN_CATEGORY_CD == null : this.MAIN_CATEGORY_CD.equals(that.MAIN_CATEGORY_CD));
    equal = equal && (this.MAIN_CATEGORY_DESC == null ? that.MAIN_CATEGORY_DESC == null : this.MAIN_CATEGORY_DESC.equals(that.MAIN_CATEGORY_DESC));
    equal = equal && (this.MAIN_SUB_CATEGORY_ID == null ? that.MAIN_SUB_CATEGORY_ID == null : this.MAIN_SUB_CATEGORY_ID.equals(that.MAIN_SUB_CATEGORY_ID));
    equal = equal && (this.MAIN_SUB_CATEGORY_CD == null ? that.MAIN_SUB_CATEGORY_CD == null : this.MAIN_SUB_CATEGORY_CD.equals(that.MAIN_SUB_CATEGORY_CD));
    equal = equal && (this.MAIN_SUB_CATEGORY_DESC == null ? that.MAIN_SUB_CATEGORY_DESC == null : this.MAIN_SUB_CATEGORY_DESC.equals(that.MAIN_SUB_CATEGORY_DESC));
    equal = equal && (this.CATERING_GROUP_ID == null ? that.CATERING_GROUP_ID == null : this.CATERING_GROUP_ID.equals(that.CATERING_GROUP_ID));
    equal = equal && (this.CATERING_GROUP_CD == null ? that.CATERING_GROUP_CD == null : this.CATERING_GROUP_CD.equals(that.CATERING_GROUP_CD));
    equal = equal && (this.CATERING_GROUP_DESC == null ? that.CATERING_GROUP_DESC == null : this.CATERING_GROUP_DESC.equals(that.CATERING_GROUP_DESC));
    equal = equal && (this.CATERING_CATEGORY_ID == null ? that.CATERING_CATEGORY_ID == null : this.CATERING_CATEGORY_ID.equals(that.CATERING_CATEGORY_ID));
    equal = equal && (this.CATERING_CATEGORY_CD == null ? that.CATERING_CATEGORY_CD == null : this.CATERING_CATEGORY_CD.equals(that.CATERING_CATEGORY_CD));
    equal = equal && (this.CATERING_CATEGORY_DESC == null ? that.CATERING_CATEGORY_DESC == null : this.CATERING_CATEGORY_DESC.equals(that.CATERING_CATEGORY_DESC));
    equal = equal && (this.CATERING_SUB_CATEGORY_ID == null ? that.CATERING_SUB_CATEGORY_ID == null : this.CATERING_SUB_CATEGORY_ID.equals(that.CATERING_SUB_CATEGORY_ID));
    equal = equal && (this.CATERING_SUB_CATEGORY_CD == null ? that.CATERING_SUB_CATEGORY_CD == null : this.CATERING_SUB_CATEGORY_CD.equals(that.CATERING_SUB_CATEGORY_CD));
    equal = equal && (this.CATERING_SUB_CATEGORY_DESC == null ? that.CATERING_SUB_CATEGORY_DESC == null : this.CATERING_SUB_CATEGORY_DESC.equals(that.CATERING_SUB_CATEGORY_DESC));
    equal = equal && (this.ALT_GROUP_ID == null ? that.ALT_GROUP_ID == null : this.ALT_GROUP_ID.equals(that.ALT_GROUP_ID));
    equal = equal && (this.ALT_GROUP_CD == null ? that.ALT_GROUP_CD == null : this.ALT_GROUP_CD.equals(that.ALT_GROUP_CD));
    equal = equal && (this.ALT_GROUP_DESC == null ? that.ALT_GROUP_DESC == null : this.ALT_GROUP_DESC.equals(that.ALT_GROUP_DESC));
    equal = equal && (this.ALT_CATEGORY_ID == null ? that.ALT_CATEGORY_ID == null : this.ALT_CATEGORY_ID.equals(that.ALT_CATEGORY_ID));
    equal = equal && (this.ALT_CATEGORY_CD == null ? that.ALT_CATEGORY_CD == null : this.ALT_CATEGORY_CD.equals(that.ALT_CATEGORY_CD));
    equal = equal && (this.ALT_CATEGORY_DESC == null ? that.ALT_CATEGORY_DESC == null : this.ALT_CATEGORY_DESC.equals(that.ALT_CATEGORY_DESC));
    equal = equal && (this.FILE_DTTM == null ? that.FILE_DTTM == null : this.FILE_DTTM.equals(that.FILE_DTTM));
    equal = equal && (this.INSERT_DTTM == null ? that.INSERT_DTTM == null : this.INSERT_DTTM.equals(that.INSERT_DTTM));
    equal = equal && (this.UPDATE_DTTM == null ? that.UPDATE_DTTM == null : this.UPDATE_DTTM.equals(that.UPDATE_DTTM));
    equal = equal && (this.LOAD_DW_ID == null ? that.LOAD_DW_ID == null : this.LOAD_DW_ID.equals(that.LOAD_DW_ID));
    equal = equal && (this.VERSION == null ? that.VERSION == null : this.VERSION.equals(that.VERSION));
    equal = equal && (this.RUN_OUT_IND == null ? that.RUN_OUT_IND == null : this.RUN_OUT_IND.equals(that.RUN_OUT_IND));
    equal = equal && (this.PANUP_SORT_ORDER == null ? that.PANUP_SORT_ORDER == null : this.PANUP_SORT_ORDER.equals(that.PANUP_SORT_ORDER));
    equal = equal && (this.PRODUCT_PREP_FLAG == null ? that.PRODUCT_PREP_FLAG == null : this.PRODUCT_PREP_FLAG.equals(that.PRODUCT_PREP_FLAG));
    equal = equal && (this.FDF_INVOICED_ITEM_FLAG == null ? that.FDF_INVOICED_ITEM_FLAG == null : this.FDF_INVOICED_ITEM_FLAG.equals(that.FDF_INVOICED_ITEM_FLAG));
    equal = equal && (this.SAMPLE_FLAG == null ? that.SAMPLE_FLAG == null : this.SAMPLE_FLAG.equals(that.SAMPLE_FLAG));
    equal = equal && (this.ADD_ON_FLAG == null ? that.ADD_ON_FLAG == null : this.ADD_ON_FLAG.equals(that.ADD_ON_FLAG));
    equal = equal && (this.POS_MENU_ITEM_CD == null ? that.POS_MENU_ITEM_CD == null : this.POS_MENU_ITEM_CD.equals(that.POS_MENU_ITEM_CD));
    equal = equal && (this.ALT_POS_MENU_ITEM_CD == null ? that.ALT_POS_MENU_ITEM_CD == null : this.ALT_POS_MENU_ITEM_CD.equals(that.ALT_POS_MENU_ITEM_CD));
    equal = equal && (this.ORACLE_INVENTORY_ITEM_ID == null ? that.ORACLE_INVENTORY_ITEM_ID == null : this.ORACLE_INVENTORY_ITEM_ID.equals(that.ORACLE_INVENTORY_ITEM_ID));
    equal = equal && (this.REMARKS == null ? that.REMARKS == null : this.REMARKS.equals(that.REMARKS));
    equal = equal && (this.CELEBRATION_PRODUCT_INDICATOR == null ? that.CELEBRATION_PRODUCT_INDICATOR == null : this.CELEBRATION_PRODUCT_INDICATOR.equals(that.CELEBRATION_PRODUCT_INDICATOR));
    equal = equal && (this.LOAD_DTTM == null ? that.LOAD_DTTM == null : this.LOAD_DTTM.equals(that.LOAD_DTTM));
    equal = equal && (this.LOAD_BY == null ? that.LOAD_BY == null : this.LOAD_BY.equals(that.LOAD_BY));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_product)) {
      return false;
    }
    dim_product that = (dim_product) o;
    boolean equal = true;
    equal = equal && (this.Z_PRODUCT_DW_ID == null ? that.Z_PRODUCT_DW_ID == null : this.Z_PRODUCT_DW_ID.equals(that.Z_PRODUCT_DW_ID));
    equal = equal && (this.PRODUCT_CODE == null ? that.PRODUCT_CODE == null : this.PRODUCT_CODE.equals(that.PRODUCT_CODE));
    equal = equal && (this.PRODUCT_DESC == null ? that.PRODUCT_DESC == null : this.PRODUCT_DESC.equals(that.PRODUCT_DESC));
    equal = equal && (this.MAIN_GROUP_ID == null ? that.MAIN_GROUP_ID == null : this.MAIN_GROUP_ID.equals(that.MAIN_GROUP_ID));
    equal = equal && (this.MAIN_GROUP_CD == null ? that.MAIN_GROUP_CD == null : this.MAIN_GROUP_CD.equals(that.MAIN_GROUP_CD));
    equal = equal && (this.MAIN_GROUP_DESC == null ? that.MAIN_GROUP_DESC == null : this.MAIN_GROUP_DESC.equals(that.MAIN_GROUP_DESC));
    equal = equal && (this.MAIN_CATEGORY_ID == null ? that.MAIN_CATEGORY_ID == null : this.MAIN_CATEGORY_ID.equals(that.MAIN_CATEGORY_ID));
    equal = equal && (this.MAIN_CATEGORY_CD == null ? that.MAIN_CATEGORY_CD == null : this.MAIN_CATEGORY_CD.equals(that.MAIN_CATEGORY_CD));
    equal = equal && (this.MAIN_CATEGORY_DESC == null ? that.MAIN_CATEGORY_DESC == null : this.MAIN_CATEGORY_DESC.equals(that.MAIN_CATEGORY_DESC));
    equal = equal && (this.MAIN_SUB_CATEGORY_ID == null ? that.MAIN_SUB_CATEGORY_ID == null : this.MAIN_SUB_CATEGORY_ID.equals(that.MAIN_SUB_CATEGORY_ID));
    equal = equal && (this.MAIN_SUB_CATEGORY_CD == null ? that.MAIN_SUB_CATEGORY_CD == null : this.MAIN_SUB_CATEGORY_CD.equals(that.MAIN_SUB_CATEGORY_CD));
    equal = equal && (this.MAIN_SUB_CATEGORY_DESC == null ? that.MAIN_SUB_CATEGORY_DESC == null : this.MAIN_SUB_CATEGORY_DESC.equals(that.MAIN_SUB_CATEGORY_DESC));
    equal = equal && (this.CATERING_GROUP_ID == null ? that.CATERING_GROUP_ID == null : this.CATERING_GROUP_ID.equals(that.CATERING_GROUP_ID));
    equal = equal && (this.CATERING_GROUP_CD == null ? that.CATERING_GROUP_CD == null : this.CATERING_GROUP_CD.equals(that.CATERING_GROUP_CD));
    equal = equal && (this.CATERING_GROUP_DESC == null ? that.CATERING_GROUP_DESC == null : this.CATERING_GROUP_DESC.equals(that.CATERING_GROUP_DESC));
    equal = equal && (this.CATERING_CATEGORY_ID == null ? that.CATERING_CATEGORY_ID == null : this.CATERING_CATEGORY_ID.equals(that.CATERING_CATEGORY_ID));
    equal = equal && (this.CATERING_CATEGORY_CD == null ? that.CATERING_CATEGORY_CD == null : this.CATERING_CATEGORY_CD.equals(that.CATERING_CATEGORY_CD));
    equal = equal && (this.CATERING_CATEGORY_DESC == null ? that.CATERING_CATEGORY_DESC == null : this.CATERING_CATEGORY_DESC.equals(that.CATERING_CATEGORY_DESC));
    equal = equal && (this.CATERING_SUB_CATEGORY_ID == null ? that.CATERING_SUB_CATEGORY_ID == null : this.CATERING_SUB_CATEGORY_ID.equals(that.CATERING_SUB_CATEGORY_ID));
    equal = equal && (this.CATERING_SUB_CATEGORY_CD == null ? that.CATERING_SUB_CATEGORY_CD == null : this.CATERING_SUB_CATEGORY_CD.equals(that.CATERING_SUB_CATEGORY_CD));
    equal = equal && (this.CATERING_SUB_CATEGORY_DESC == null ? that.CATERING_SUB_CATEGORY_DESC == null : this.CATERING_SUB_CATEGORY_DESC.equals(that.CATERING_SUB_CATEGORY_DESC));
    equal = equal && (this.ALT_GROUP_ID == null ? that.ALT_GROUP_ID == null : this.ALT_GROUP_ID.equals(that.ALT_GROUP_ID));
    equal = equal && (this.ALT_GROUP_CD == null ? that.ALT_GROUP_CD == null : this.ALT_GROUP_CD.equals(that.ALT_GROUP_CD));
    equal = equal && (this.ALT_GROUP_DESC == null ? that.ALT_GROUP_DESC == null : this.ALT_GROUP_DESC.equals(that.ALT_GROUP_DESC));
    equal = equal && (this.ALT_CATEGORY_ID == null ? that.ALT_CATEGORY_ID == null : this.ALT_CATEGORY_ID.equals(that.ALT_CATEGORY_ID));
    equal = equal && (this.ALT_CATEGORY_CD == null ? that.ALT_CATEGORY_CD == null : this.ALT_CATEGORY_CD.equals(that.ALT_CATEGORY_CD));
    equal = equal && (this.ALT_CATEGORY_DESC == null ? that.ALT_CATEGORY_DESC == null : this.ALT_CATEGORY_DESC.equals(that.ALT_CATEGORY_DESC));
    equal = equal && (this.FILE_DTTM == null ? that.FILE_DTTM == null : this.FILE_DTTM.equals(that.FILE_DTTM));
    equal = equal && (this.INSERT_DTTM == null ? that.INSERT_DTTM == null : this.INSERT_DTTM.equals(that.INSERT_DTTM));
    equal = equal && (this.UPDATE_DTTM == null ? that.UPDATE_DTTM == null : this.UPDATE_DTTM.equals(that.UPDATE_DTTM));
    equal = equal && (this.LOAD_DW_ID == null ? that.LOAD_DW_ID == null : this.LOAD_DW_ID.equals(that.LOAD_DW_ID));
    equal = equal && (this.VERSION == null ? that.VERSION == null : this.VERSION.equals(that.VERSION));
    equal = equal && (this.RUN_OUT_IND == null ? that.RUN_OUT_IND == null : this.RUN_OUT_IND.equals(that.RUN_OUT_IND));
    equal = equal && (this.PANUP_SORT_ORDER == null ? that.PANUP_SORT_ORDER == null : this.PANUP_SORT_ORDER.equals(that.PANUP_SORT_ORDER));
    equal = equal && (this.PRODUCT_PREP_FLAG == null ? that.PRODUCT_PREP_FLAG == null : this.PRODUCT_PREP_FLAG.equals(that.PRODUCT_PREP_FLAG));
    equal = equal && (this.FDF_INVOICED_ITEM_FLAG == null ? that.FDF_INVOICED_ITEM_FLAG == null : this.FDF_INVOICED_ITEM_FLAG.equals(that.FDF_INVOICED_ITEM_FLAG));
    equal = equal && (this.SAMPLE_FLAG == null ? that.SAMPLE_FLAG == null : this.SAMPLE_FLAG.equals(that.SAMPLE_FLAG));
    equal = equal && (this.ADD_ON_FLAG == null ? that.ADD_ON_FLAG == null : this.ADD_ON_FLAG.equals(that.ADD_ON_FLAG));
    equal = equal && (this.POS_MENU_ITEM_CD == null ? that.POS_MENU_ITEM_CD == null : this.POS_MENU_ITEM_CD.equals(that.POS_MENU_ITEM_CD));
    equal = equal && (this.ALT_POS_MENU_ITEM_CD == null ? that.ALT_POS_MENU_ITEM_CD == null : this.ALT_POS_MENU_ITEM_CD.equals(that.ALT_POS_MENU_ITEM_CD));
    equal = equal && (this.ORACLE_INVENTORY_ITEM_ID == null ? that.ORACLE_INVENTORY_ITEM_ID == null : this.ORACLE_INVENTORY_ITEM_ID.equals(that.ORACLE_INVENTORY_ITEM_ID));
    equal = equal && (this.REMARKS == null ? that.REMARKS == null : this.REMARKS.equals(that.REMARKS));
    equal = equal && (this.CELEBRATION_PRODUCT_INDICATOR == null ? that.CELEBRATION_PRODUCT_INDICATOR == null : this.CELEBRATION_PRODUCT_INDICATOR.equals(that.CELEBRATION_PRODUCT_INDICATOR));
    equal = equal && (this.LOAD_DTTM == null ? that.LOAD_DTTM == null : this.LOAD_DTTM.equals(that.LOAD_DTTM));
    equal = equal && (this.LOAD_BY == null ? that.LOAD_BY == null : this.LOAD_BY.equals(that.LOAD_BY));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Z_PRODUCT_DW_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.PRODUCT_CODE = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.PRODUCT_DESC = JdbcWritableBridge.readString(3, __dbResults);
    this.MAIN_GROUP_ID = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.MAIN_GROUP_CD = JdbcWritableBridge.readString(5, __dbResults);
    this.MAIN_GROUP_DESC = JdbcWritableBridge.readString(6, __dbResults);
    this.MAIN_CATEGORY_ID = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.MAIN_CATEGORY_CD = JdbcWritableBridge.readString(8, __dbResults);
    this.MAIN_CATEGORY_DESC = JdbcWritableBridge.readString(9, __dbResults);
    this.MAIN_SUB_CATEGORY_ID = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.MAIN_SUB_CATEGORY_CD = JdbcWritableBridge.readString(11, __dbResults);
    this.MAIN_SUB_CATEGORY_DESC = JdbcWritableBridge.readString(12, __dbResults);
    this.CATERING_GROUP_ID = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.CATERING_GROUP_CD = JdbcWritableBridge.readString(14, __dbResults);
    this.CATERING_GROUP_DESC = JdbcWritableBridge.readString(15, __dbResults);
    this.CATERING_CATEGORY_ID = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.CATERING_CATEGORY_CD = JdbcWritableBridge.readString(17, __dbResults);
    this.CATERING_CATEGORY_DESC = JdbcWritableBridge.readString(18, __dbResults);
    this.CATERING_SUB_CATEGORY_ID = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.CATERING_SUB_CATEGORY_CD = JdbcWritableBridge.readString(20, __dbResults);
    this.CATERING_SUB_CATEGORY_DESC = JdbcWritableBridge.readString(21, __dbResults);
    this.ALT_GROUP_ID = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.ALT_GROUP_CD = JdbcWritableBridge.readString(23, __dbResults);
    this.ALT_GROUP_DESC = JdbcWritableBridge.readString(24, __dbResults);
    this.ALT_CATEGORY_ID = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.ALT_CATEGORY_CD = JdbcWritableBridge.readString(26, __dbResults);
    this.ALT_CATEGORY_DESC = JdbcWritableBridge.readString(27, __dbResults);
    this.FILE_DTTM = JdbcWritableBridge.readTimestamp(28, __dbResults);
    this.INSERT_DTTM = JdbcWritableBridge.readTimestamp(29, __dbResults);
    this.UPDATE_DTTM = JdbcWritableBridge.readTimestamp(30, __dbResults);
    this.LOAD_DW_ID = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.VERSION = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.RUN_OUT_IND = JdbcWritableBridge.readString(33, __dbResults);
    this.PANUP_SORT_ORDER = JdbcWritableBridge.readString(34, __dbResults);
    this.PRODUCT_PREP_FLAG = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.FDF_INVOICED_ITEM_FLAG = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.SAMPLE_FLAG = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.ADD_ON_FLAG = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.POS_MENU_ITEM_CD = JdbcWritableBridge.readString(39, __dbResults);
    this.ALT_POS_MENU_ITEM_CD = JdbcWritableBridge.readString(40, __dbResults);
    this.ORACLE_INVENTORY_ITEM_ID = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.REMARKS = JdbcWritableBridge.readString(42, __dbResults);
    this.CELEBRATION_PRODUCT_INDICATOR = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.LOAD_DTTM = JdbcWritableBridge.readTimestamp(44, __dbResults);
    this.LOAD_BY = JdbcWritableBridge.readString(45, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Z_PRODUCT_DW_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.PRODUCT_CODE = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.PRODUCT_DESC = JdbcWritableBridge.readString(3, __dbResults);
    this.MAIN_GROUP_ID = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.MAIN_GROUP_CD = JdbcWritableBridge.readString(5, __dbResults);
    this.MAIN_GROUP_DESC = JdbcWritableBridge.readString(6, __dbResults);
    this.MAIN_CATEGORY_ID = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.MAIN_CATEGORY_CD = JdbcWritableBridge.readString(8, __dbResults);
    this.MAIN_CATEGORY_DESC = JdbcWritableBridge.readString(9, __dbResults);
    this.MAIN_SUB_CATEGORY_ID = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.MAIN_SUB_CATEGORY_CD = JdbcWritableBridge.readString(11, __dbResults);
    this.MAIN_SUB_CATEGORY_DESC = JdbcWritableBridge.readString(12, __dbResults);
    this.CATERING_GROUP_ID = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.CATERING_GROUP_CD = JdbcWritableBridge.readString(14, __dbResults);
    this.CATERING_GROUP_DESC = JdbcWritableBridge.readString(15, __dbResults);
    this.CATERING_CATEGORY_ID = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.CATERING_CATEGORY_CD = JdbcWritableBridge.readString(17, __dbResults);
    this.CATERING_CATEGORY_DESC = JdbcWritableBridge.readString(18, __dbResults);
    this.CATERING_SUB_CATEGORY_ID = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.CATERING_SUB_CATEGORY_CD = JdbcWritableBridge.readString(20, __dbResults);
    this.CATERING_SUB_CATEGORY_DESC = JdbcWritableBridge.readString(21, __dbResults);
    this.ALT_GROUP_ID = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.ALT_GROUP_CD = JdbcWritableBridge.readString(23, __dbResults);
    this.ALT_GROUP_DESC = JdbcWritableBridge.readString(24, __dbResults);
    this.ALT_CATEGORY_ID = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.ALT_CATEGORY_CD = JdbcWritableBridge.readString(26, __dbResults);
    this.ALT_CATEGORY_DESC = JdbcWritableBridge.readString(27, __dbResults);
    this.FILE_DTTM = JdbcWritableBridge.readTimestamp(28, __dbResults);
    this.INSERT_DTTM = JdbcWritableBridge.readTimestamp(29, __dbResults);
    this.UPDATE_DTTM = JdbcWritableBridge.readTimestamp(30, __dbResults);
    this.LOAD_DW_ID = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.VERSION = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.RUN_OUT_IND = JdbcWritableBridge.readString(33, __dbResults);
    this.PANUP_SORT_ORDER = JdbcWritableBridge.readString(34, __dbResults);
    this.PRODUCT_PREP_FLAG = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.FDF_INVOICED_ITEM_FLAG = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.SAMPLE_FLAG = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.ADD_ON_FLAG = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.POS_MENU_ITEM_CD = JdbcWritableBridge.readString(39, __dbResults);
    this.ALT_POS_MENU_ITEM_CD = JdbcWritableBridge.readString(40, __dbResults);
    this.ORACLE_INVENTORY_ITEM_ID = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.REMARKS = JdbcWritableBridge.readString(42, __dbResults);
    this.CELEBRATION_PRODUCT_INDICATOR = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.LOAD_DTTM = JdbcWritableBridge.readTimestamp(44, __dbResults);
    this.LOAD_BY = JdbcWritableBridge.readString(45, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(Z_PRODUCT_DW_ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PRODUCT_CODE, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(PRODUCT_DESC, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MAIN_GROUP_ID, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_GROUP_CD, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_GROUP_DESC, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MAIN_CATEGORY_ID, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_CATEGORY_CD, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_CATEGORY_DESC, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MAIN_SUB_CATEGORY_ID, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_SUB_CATEGORY_CD, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_SUB_CATEGORY_DESC, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CATERING_GROUP_ID, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(CATERING_GROUP_CD, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CATERING_GROUP_DESC, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CATERING_CATEGORY_ID, 16 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(CATERING_CATEGORY_CD, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CATERING_CATEGORY_DESC, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CATERING_SUB_CATEGORY_ID, 19 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(CATERING_SUB_CATEGORY_CD, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CATERING_SUB_CATEGORY_DESC, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ALT_GROUP_ID, 22 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(ALT_GROUP_CD, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ALT_GROUP_DESC, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ALT_CATEGORY_ID, 25 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(ALT_CATEGORY_CD, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ALT_CATEGORY_DESC, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FILE_DTTM, 28 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(INSERT_DTTM, 29 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATE_DTTM, 30 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOAD_DW_ID, 31 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VERSION, 32 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(RUN_OUT_IND, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PANUP_SORT_ORDER, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PRODUCT_PREP_FLAG, 35 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FDF_INVOICED_ITEM_FLAG, 36 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SAMPLE_FLAG, 37 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ADD_ON_FLAG, 38 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(POS_MENU_ITEM_CD, 39 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ALT_POS_MENU_ITEM_CD, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ORACLE_INVENTORY_ITEM_ID, 41 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(REMARKS, 42 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CELEBRATION_PRODUCT_INDICATOR, 43 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOAD_DTTM, 44 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_BY, 45 + __off, 12, __dbStmt);
    return 45;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(Z_PRODUCT_DW_ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PRODUCT_CODE, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(PRODUCT_DESC, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MAIN_GROUP_ID, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_GROUP_CD, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_GROUP_DESC, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MAIN_CATEGORY_ID, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_CATEGORY_CD, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_CATEGORY_DESC, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MAIN_SUB_CATEGORY_ID, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_SUB_CATEGORY_CD, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAIN_SUB_CATEGORY_DESC, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CATERING_GROUP_ID, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(CATERING_GROUP_CD, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CATERING_GROUP_DESC, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CATERING_CATEGORY_ID, 16 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(CATERING_CATEGORY_CD, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CATERING_CATEGORY_DESC, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CATERING_SUB_CATEGORY_ID, 19 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(CATERING_SUB_CATEGORY_CD, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CATERING_SUB_CATEGORY_DESC, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ALT_GROUP_ID, 22 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(ALT_GROUP_CD, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ALT_GROUP_DESC, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ALT_CATEGORY_ID, 25 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(ALT_CATEGORY_CD, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ALT_CATEGORY_DESC, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FILE_DTTM, 28 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(INSERT_DTTM, 29 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATE_DTTM, 30 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOAD_DW_ID, 31 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VERSION, 32 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(RUN_OUT_IND, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PANUP_SORT_ORDER, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PRODUCT_PREP_FLAG, 35 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FDF_INVOICED_ITEM_FLAG, 36 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SAMPLE_FLAG, 37 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ADD_ON_FLAG, 38 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(POS_MENU_ITEM_CD, 39 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ALT_POS_MENU_ITEM_CD, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ORACLE_INVENTORY_ITEM_ID, 41 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(REMARKS, 42 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CELEBRATION_PRODUCT_INDICATOR, 43 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOAD_DTTM, 44 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_BY, 45 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.Z_PRODUCT_DW_ID = null;
    } else {
    this.Z_PRODUCT_DW_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PRODUCT_CODE = null;
    } else {
    this.PRODUCT_CODE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PRODUCT_DESC = null;
    } else {
    this.PRODUCT_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_GROUP_ID = null;
    } else {
    this.MAIN_GROUP_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_GROUP_CD = null;
    } else {
    this.MAIN_GROUP_CD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_GROUP_DESC = null;
    } else {
    this.MAIN_GROUP_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_CATEGORY_ID = null;
    } else {
    this.MAIN_CATEGORY_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_CATEGORY_CD = null;
    } else {
    this.MAIN_CATEGORY_CD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_CATEGORY_DESC = null;
    } else {
    this.MAIN_CATEGORY_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_SUB_CATEGORY_ID = null;
    } else {
    this.MAIN_SUB_CATEGORY_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_SUB_CATEGORY_CD = null;
    } else {
    this.MAIN_SUB_CATEGORY_CD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_SUB_CATEGORY_DESC = null;
    } else {
    this.MAIN_SUB_CATEGORY_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CATERING_GROUP_ID = null;
    } else {
    this.CATERING_GROUP_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CATERING_GROUP_CD = null;
    } else {
    this.CATERING_GROUP_CD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CATERING_GROUP_DESC = null;
    } else {
    this.CATERING_GROUP_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CATERING_CATEGORY_ID = null;
    } else {
    this.CATERING_CATEGORY_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CATERING_CATEGORY_CD = null;
    } else {
    this.CATERING_CATEGORY_CD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CATERING_CATEGORY_DESC = null;
    } else {
    this.CATERING_CATEGORY_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CATERING_SUB_CATEGORY_ID = null;
    } else {
    this.CATERING_SUB_CATEGORY_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CATERING_SUB_CATEGORY_CD = null;
    } else {
    this.CATERING_SUB_CATEGORY_CD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CATERING_SUB_CATEGORY_DESC = null;
    } else {
    this.CATERING_SUB_CATEGORY_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ALT_GROUP_ID = null;
    } else {
    this.ALT_GROUP_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ALT_GROUP_CD = null;
    } else {
    this.ALT_GROUP_CD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ALT_GROUP_DESC = null;
    } else {
    this.ALT_GROUP_DESC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ALT_CATEGORY_ID = null;
    } else {
    this.ALT_CATEGORY_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ALT_CATEGORY_CD = null;
    } else {
    this.ALT_CATEGORY_CD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ALT_CATEGORY_DESC = null;
    } else {
    this.ALT_CATEGORY_DESC = Text.readString(__dataIn);
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
        this.RUN_OUT_IND = null;
    } else {
    this.RUN_OUT_IND = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PANUP_SORT_ORDER = null;
    } else {
    this.PANUP_SORT_ORDER = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PRODUCT_PREP_FLAG = null;
    } else {
    this.PRODUCT_PREP_FLAG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FDF_INVOICED_ITEM_FLAG = null;
    } else {
    this.FDF_INVOICED_ITEM_FLAG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SAMPLE_FLAG = null;
    } else {
    this.SAMPLE_FLAG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ADD_ON_FLAG = null;
    } else {
    this.ADD_ON_FLAG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.POS_MENU_ITEM_CD = null;
    } else {
    this.POS_MENU_ITEM_CD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ALT_POS_MENU_ITEM_CD = null;
    } else {
    this.ALT_POS_MENU_ITEM_CD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ORACLE_INVENTORY_ITEM_ID = null;
    } else {
    this.ORACLE_INVENTORY_ITEM_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REMARKS = null;
    } else {
    this.REMARKS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CELEBRATION_PRODUCT_INDICATOR = null;
    } else {
    this.CELEBRATION_PRODUCT_INDICATOR = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.Z_PRODUCT_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Z_PRODUCT_DW_ID, __dataOut);
    }
    if (null == this.PRODUCT_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PRODUCT_CODE, __dataOut);
    }
    if (null == this.PRODUCT_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PRODUCT_DESC);
    }
    if (null == this.MAIN_GROUP_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MAIN_GROUP_ID, __dataOut);
    }
    if (null == this.MAIN_GROUP_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_GROUP_CD);
    }
    if (null == this.MAIN_GROUP_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_GROUP_DESC);
    }
    if (null == this.MAIN_CATEGORY_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MAIN_CATEGORY_ID, __dataOut);
    }
    if (null == this.MAIN_CATEGORY_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_CATEGORY_CD);
    }
    if (null == this.MAIN_CATEGORY_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_CATEGORY_DESC);
    }
    if (null == this.MAIN_SUB_CATEGORY_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MAIN_SUB_CATEGORY_ID, __dataOut);
    }
    if (null == this.MAIN_SUB_CATEGORY_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_SUB_CATEGORY_CD);
    }
    if (null == this.MAIN_SUB_CATEGORY_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_SUB_CATEGORY_DESC);
    }
    if (null == this.CATERING_GROUP_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CATERING_GROUP_ID, __dataOut);
    }
    if (null == this.CATERING_GROUP_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CATERING_GROUP_CD);
    }
    if (null == this.CATERING_GROUP_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CATERING_GROUP_DESC);
    }
    if (null == this.CATERING_CATEGORY_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CATERING_CATEGORY_ID, __dataOut);
    }
    if (null == this.CATERING_CATEGORY_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CATERING_CATEGORY_CD);
    }
    if (null == this.CATERING_CATEGORY_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CATERING_CATEGORY_DESC);
    }
    if (null == this.CATERING_SUB_CATEGORY_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CATERING_SUB_CATEGORY_ID, __dataOut);
    }
    if (null == this.CATERING_SUB_CATEGORY_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CATERING_SUB_CATEGORY_CD);
    }
    if (null == this.CATERING_SUB_CATEGORY_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CATERING_SUB_CATEGORY_DESC);
    }
    if (null == this.ALT_GROUP_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ALT_GROUP_ID, __dataOut);
    }
    if (null == this.ALT_GROUP_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ALT_GROUP_CD);
    }
    if (null == this.ALT_GROUP_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ALT_GROUP_DESC);
    }
    if (null == this.ALT_CATEGORY_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ALT_CATEGORY_ID, __dataOut);
    }
    if (null == this.ALT_CATEGORY_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ALT_CATEGORY_CD);
    }
    if (null == this.ALT_CATEGORY_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ALT_CATEGORY_DESC);
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
    if (null == this.RUN_OUT_IND) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, RUN_OUT_IND);
    }
    if (null == this.PANUP_SORT_ORDER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PANUP_SORT_ORDER);
    }
    if (null == this.PRODUCT_PREP_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PRODUCT_PREP_FLAG, __dataOut);
    }
    if (null == this.FDF_INVOICED_ITEM_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FDF_INVOICED_ITEM_FLAG, __dataOut);
    }
    if (null == this.SAMPLE_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SAMPLE_FLAG, __dataOut);
    }
    if (null == this.ADD_ON_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ADD_ON_FLAG, __dataOut);
    }
    if (null == this.POS_MENU_ITEM_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POS_MENU_ITEM_CD);
    }
    if (null == this.ALT_POS_MENU_ITEM_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ALT_POS_MENU_ITEM_CD);
    }
    if (null == this.ORACLE_INVENTORY_ITEM_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ORACLE_INVENTORY_ITEM_ID, __dataOut);
    }
    if (null == this.REMARKS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REMARKS);
    }
    if (null == this.CELEBRATION_PRODUCT_INDICATOR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CELEBRATION_PRODUCT_INDICATOR, __dataOut);
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
    if (null == this.Z_PRODUCT_DW_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Z_PRODUCT_DW_ID, __dataOut);
    }
    if (null == this.PRODUCT_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PRODUCT_CODE, __dataOut);
    }
    if (null == this.PRODUCT_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PRODUCT_DESC);
    }
    if (null == this.MAIN_GROUP_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MAIN_GROUP_ID, __dataOut);
    }
    if (null == this.MAIN_GROUP_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_GROUP_CD);
    }
    if (null == this.MAIN_GROUP_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_GROUP_DESC);
    }
    if (null == this.MAIN_CATEGORY_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MAIN_CATEGORY_ID, __dataOut);
    }
    if (null == this.MAIN_CATEGORY_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_CATEGORY_CD);
    }
    if (null == this.MAIN_CATEGORY_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_CATEGORY_DESC);
    }
    if (null == this.MAIN_SUB_CATEGORY_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MAIN_SUB_CATEGORY_ID, __dataOut);
    }
    if (null == this.MAIN_SUB_CATEGORY_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_SUB_CATEGORY_CD);
    }
    if (null == this.MAIN_SUB_CATEGORY_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAIN_SUB_CATEGORY_DESC);
    }
    if (null == this.CATERING_GROUP_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CATERING_GROUP_ID, __dataOut);
    }
    if (null == this.CATERING_GROUP_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CATERING_GROUP_CD);
    }
    if (null == this.CATERING_GROUP_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CATERING_GROUP_DESC);
    }
    if (null == this.CATERING_CATEGORY_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CATERING_CATEGORY_ID, __dataOut);
    }
    if (null == this.CATERING_CATEGORY_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CATERING_CATEGORY_CD);
    }
    if (null == this.CATERING_CATEGORY_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CATERING_CATEGORY_DESC);
    }
    if (null == this.CATERING_SUB_CATEGORY_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CATERING_SUB_CATEGORY_ID, __dataOut);
    }
    if (null == this.CATERING_SUB_CATEGORY_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CATERING_SUB_CATEGORY_CD);
    }
    if (null == this.CATERING_SUB_CATEGORY_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CATERING_SUB_CATEGORY_DESC);
    }
    if (null == this.ALT_GROUP_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ALT_GROUP_ID, __dataOut);
    }
    if (null == this.ALT_GROUP_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ALT_GROUP_CD);
    }
    if (null == this.ALT_GROUP_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ALT_GROUP_DESC);
    }
    if (null == this.ALT_CATEGORY_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ALT_CATEGORY_ID, __dataOut);
    }
    if (null == this.ALT_CATEGORY_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ALT_CATEGORY_CD);
    }
    if (null == this.ALT_CATEGORY_DESC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ALT_CATEGORY_DESC);
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
    if (null == this.RUN_OUT_IND) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, RUN_OUT_IND);
    }
    if (null == this.PANUP_SORT_ORDER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PANUP_SORT_ORDER);
    }
    if (null == this.PRODUCT_PREP_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PRODUCT_PREP_FLAG, __dataOut);
    }
    if (null == this.FDF_INVOICED_ITEM_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FDF_INVOICED_ITEM_FLAG, __dataOut);
    }
    if (null == this.SAMPLE_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SAMPLE_FLAG, __dataOut);
    }
    if (null == this.ADD_ON_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ADD_ON_FLAG, __dataOut);
    }
    if (null == this.POS_MENU_ITEM_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POS_MENU_ITEM_CD);
    }
    if (null == this.ALT_POS_MENU_ITEM_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ALT_POS_MENU_ITEM_CD);
    }
    if (null == this.ORACLE_INVENTORY_ITEM_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ORACLE_INVENTORY_ITEM_ID, __dataOut);
    }
    if (null == this.REMARKS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REMARKS);
    }
    if (null == this.CELEBRATION_PRODUCT_INDICATOR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CELEBRATION_PRODUCT_INDICATOR, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(Z_PRODUCT_DW_ID==null?"\\N":Z_PRODUCT_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRODUCT_CODE==null?"\\N":PRODUCT_CODE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRODUCT_DESC==null?"\\N":PRODUCT_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAIN_GROUP_ID==null?"\\N":MAIN_GROUP_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAIN_GROUP_CD==null?"\\N":MAIN_GROUP_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAIN_GROUP_DESC==null?"\\N":MAIN_GROUP_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAIN_CATEGORY_ID==null?"\\N":MAIN_CATEGORY_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAIN_CATEGORY_CD==null?"\\N":MAIN_CATEGORY_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAIN_CATEGORY_DESC==null?"\\N":MAIN_CATEGORY_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAIN_SUB_CATEGORY_ID==null?"\\N":MAIN_SUB_CATEGORY_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAIN_SUB_CATEGORY_CD==null?"\\N":MAIN_SUB_CATEGORY_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAIN_SUB_CATEGORY_DESC==null?"\\N":MAIN_SUB_CATEGORY_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CATERING_GROUP_ID==null?"\\N":CATERING_GROUP_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CATERING_GROUP_CD==null?"\\N":CATERING_GROUP_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CATERING_GROUP_DESC==null?"\\N":CATERING_GROUP_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CATERING_CATEGORY_ID==null?"\\N":CATERING_CATEGORY_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CATERING_CATEGORY_CD==null?"\\N":CATERING_CATEGORY_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CATERING_CATEGORY_DESC==null?"\\N":CATERING_CATEGORY_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CATERING_SUB_CATEGORY_ID==null?"\\N":CATERING_SUB_CATEGORY_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CATERING_SUB_CATEGORY_CD==null?"\\N":CATERING_SUB_CATEGORY_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CATERING_SUB_CATEGORY_DESC==null?"\\N":CATERING_SUB_CATEGORY_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALT_GROUP_ID==null?"\\N":ALT_GROUP_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALT_GROUP_CD==null?"\\N":ALT_GROUP_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALT_GROUP_DESC==null?"\\N":ALT_GROUP_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALT_CATEGORY_ID==null?"\\N":ALT_CATEGORY_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALT_CATEGORY_CD==null?"\\N":ALT_CATEGORY_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALT_CATEGORY_DESC==null?"\\N":ALT_CATEGORY_DESC, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(RUN_OUT_IND==null?"\\N":RUN_OUT_IND, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PANUP_SORT_ORDER==null?"\\N":PANUP_SORT_ORDER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRODUCT_PREP_FLAG==null?"\\N":PRODUCT_PREP_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDF_INVOICED_ITEM_FLAG==null?"\\N":FDF_INVOICED_ITEM_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SAMPLE_FLAG==null?"\\N":SAMPLE_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ADD_ON_FLAG==null?"\\N":ADD_ON_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POS_MENU_ITEM_CD==null?"\\N":POS_MENU_ITEM_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALT_POS_MENU_ITEM_CD==null?"\\N":ALT_POS_MENU_ITEM_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ORACLE_INVENTORY_ITEM_ID==null?"\\N":ORACLE_INVENTORY_ITEM_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REMARKS==null?"\\N":REMARKS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CELEBRATION_PRODUCT_INDICATOR==null?"\\N":CELEBRATION_PRODUCT_INDICATOR.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(Z_PRODUCT_DW_ID==null?"\\N":Z_PRODUCT_DW_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRODUCT_CODE==null?"\\N":PRODUCT_CODE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRODUCT_DESC==null?"\\N":PRODUCT_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAIN_GROUP_ID==null?"\\N":MAIN_GROUP_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAIN_GROUP_CD==null?"\\N":MAIN_GROUP_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAIN_GROUP_DESC==null?"\\N":MAIN_GROUP_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAIN_CATEGORY_ID==null?"\\N":MAIN_CATEGORY_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAIN_CATEGORY_CD==null?"\\N":MAIN_CATEGORY_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAIN_CATEGORY_DESC==null?"\\N":MAIN_CATEGORY_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAIN_SUB_CATEGORY_ID==null?"\\N":MAIN_SUB_CATEGORY_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAIN_SUB_CATEGORY_CD==null?"\\N":MAIN_SUB_CATEGORY_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAIN_SUB_CATEGORY_DESC==null?"\\N":MAIN_SUB_CATEGORY_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CATERING_GROUP_ID==null?"\\N":CATERING_GROUP_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CATERING_GROUP_CD==null?"\\N":CATERING_GROUP_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CATERING_GROUP_DESC==null?"\\N":CATERING_GROUP_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CATERING_CATEGORY_ID==null?"\\N":CATERING_CATEGORY_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CATERING_CATEGORY_CD==null?"\\N":CATERING_CATEGORY_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CATERING_CATEGORY_DESC==null?"\\N":CATERING_CATEGORY_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CATERING_SUB_CATEGORY_ID==null?"\\N":CATERING_SUB_CATEGORY_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CATERING_SUB_CATEGORY_CD==null?"\\N":CATERING_SUB_CATEGORY_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CATERING_SUB_CATEGORY_DESC==null?"\\N":CATERING_SUB_CATEGORY_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALT_GROUP_ID==null?"\\N":ALT_GROUP_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALT_GROUP_CD==null?"\\N":ALT_GROUP_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALT_GROUP_DESC==null?"\\N":ALT_GROUP_DESC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALT_CATEGORY_ID==null?"\\N":ALT_CATEGORY_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALT_CATEGORY_CD==null?"\\N":ALT_CATEGORY_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALT_CATEGORY_DESC==null?"\\N":ALT_CATEGORY_DESC, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(RUN_OUT_IND==null?"\\N":RUN_OUT_IND, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PANUP_SORT_ORDER==null?"\\N":PANUP_SORT_ORDER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRODUCT_PREP_FLAG==null?"\\N":PRODUCT_PREP_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDF_INVOICED_ITEM_FLAG==null?"\\N":FDF_INVOICED_ITEM_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SAMPLE_FLAG==null?"\\N":SAMPLE_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ADD_ON_FLAG==null?"\\N":ADD_ON_FLAG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POS_MENU_ITEM_CD==null?"\\N":POS_MENU_ITEM_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALT_POS_MENU_ITEM_CD==null?"\\N":ALT_POS_MENU_ITEM_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ORACLE_INVENTORY_ITEM_ID==null?"\\N":ORACLE_INVENTORY_ITEM_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REMARKS==null?"\\N":REMARKS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CELEBRATION_PRODUCT_INDICATOR==null?"\\N":CELEBRATION_PRODUCT_INDICATOR.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Z_PRODUCT_DW_ID = null; } else {
      this.Z_PRODUCT_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PRODUCT_CODE = null; } else {
      this.PRODUCT_CODE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PRODUCT_DESC = null; } else {
      this.PRODUCT_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MAIN_GROUP_ID = null; } else {
      this.MAIN_GROUP_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_GROUP_CD = null; } else {
      this.MAIN_GROUP_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_GROUP_DESC = null; } else {
      this.MAIN_GROUP_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MAIN_CATEGORY_ID = null; } else {
      this.MAIN_CATEGORY_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_CATEGORY_CD = null; } else {
      this.MAIN_CATEGORY_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_CATEGORY_DESC = null; } else {
      this.MAIN_CATEGORY_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MAIN_SUB_CATEGORY_ID = null; } else {
      this.MAIN_SUB_CATEGORY_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_SUB_CATEGORY_CD = null; } else {
      this.MAIN_SUB_CATEGORY_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_SUB_CATEGORY_DESC = null; } else {
      this.MAIN_SUB_CATEGORY_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CATERING_GROUP_ID = null; } else {
      this.CATERING_GROUP_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CATERING_GROUP_CD = null; } else {
      this.CATERING_GROUP_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CATERING_GROUP_DESC = null; } else {
      this.CATERING_GROUP_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CATERING_CATEGORY_ID = null; } else {
      this.CATERING_CATEGORY_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CATERING_CATEGORY_CD = null; } else {
      this.CATERING_CATEGORY_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CATERING_CATEGORY_DESC = null; } else {
      this.CATERING_CATEGORY_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CATERING_SUB_CATEGORY_ID = null; } else {
      this.CATERING_SUB_CATEGORY_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CATERING_SUB_CATEGORY_CD = null; } else {
      this.CATERING_SUB_CATEGORY_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CATERING_SUB_CATEGORY_DESC = null; } else {
      this.CATERING_SUB_CATEGORY_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ALT_GROUP_ID = null; } else {
      this.ALT_GROUP_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ALT_GROUP_CD = null; } else {
      this.ALT_GROUP_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ALT_GROUP_DESC = null; } else {
      this.ALT_GROUP_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ALT_CATEGORY_ID = null; } else {
      this.ALT_CATEGORY_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ALT_CATEGORY_CD = null; } else {
      this.ALT_CATEGORY_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ALT_CATEGORY_DESC = null; } else {
      this.ALT_CATEGORY_DESC = __cur_str;
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
    if (__cur_str.equals("null")) { this.RUN_OUT_IND = null; } else {
      this.RUN_OUT_IND = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PANUP_SORT_ORDER = null; } else {
      this.PANUP_SORT_ORDER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PRODUCT_PREP_FLAG = null; } else {
      this.PRODUCT_PREP_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDF_INVOICED_ITEM_FLAG = null; } else {
      this.FDF_INVOICED_ITEM_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SAMPLE_FLAG = null; } else {
      this.SAMPLE_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ADD_ON_FLAG = null; } else {
      this.ADD_ON_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POS_MENU_ITEM_CD = null; } else {
      this.POS_MENU_ITEM_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ALT_POS_MENU_ITEM_CD = null; } else {
      this.ALT_POS_MENU_ITEM_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ORACLE_INVENTORY_ITEM_ID = null; } else {
      this.ORACLE_INVENTORY_ITEM_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.REMARKS = null; } else {
      this.REMARKS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CELEBRATION_PRODUCT_INDICATOR = null; } else {
      this.CELEBRATION_PRODUCT_INDICATOR = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Z_PRODUCT_DW_ID = null; } else {
      this.Z_PRODUCT_DW_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PRODUCT_CODE = null; } else {
      this.PRODUCT_CODE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PRODUCT_DESC = null; } else {
      this.PRODUCT_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MAIN_GROUP_ID = null; } else {
      this.MAIN_GROUP_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_GROUP_CD = null; } else {
      this.MAIN_GROUP_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_GROUP_DESC = null; } else {
      this.MAIN_GROUP_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MAIN_CATEGORY_ID = null; } else {
      this.MAIN_CATEGORY_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_CATEGORY_CD = null; } else {
      this.MAIN_CATEGORY_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_CATEGORY_DESC = null; } else {
      this.MAIN_CATEGORY_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MAIN_SUB_CATEGORY_ID = null; } else {
      this.MAIN_SUB_CATEGORY_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_SUB_CATEGORY_CD = null; } else {
      this.MAIN_SUB_CATEGORY_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAIN_SUB_CATEGORY_DESC = null; } else {
      this.MAIN_SUB_CATEGORY_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CATERING_GROUP_ID = null; } else {
      this.CATERING_GROUP_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CATERING_GROUP_CD = null; } else {
      this.CATERING_GROUP_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CATERING_GROUP_DESC = null; } else {
      this.CATERING_GROUP_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CATERING_CATEGORY_ID = null; } else {
      this.CATERING_CATEGORY_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CATERING_CATEGORY_CD = null; } else {
      this.CATERING_CATEGORY_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CATERING_CATEGORY_DESC = null; } else {
      this.CATERING_CATEGORY_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CATERING_SUB_CATEGORY_ID = null; } else {
      this.CATERING_SUB_CATEGORY_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CATERING_SUB_CATEGORY_CD = null; } else {
      this.CATERING_SUB_CATEGORY_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CATERING_SUB_CATEGORY_DESC = null; } else {
      this.CATERING_SUB_CATEGORY_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ALT_GROUP_ID = null; } else {
      this.ALT_GROUP_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ALT_GROUP_CD = null; } else {
      this.ALT_GROUP_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ALT_GROUP_DESC = null; } else {
      this.ALT_GROUP_DESC = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ALT_CATEGORY_ID = null; } else {
      this.ALT_CATEGORY_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ALT_CATEGORY_CD = null; } else {
      this.ALT_CATEGORY_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ALT_CATEGORY_DESC = null; } else {
      this.ALT_CATEGORY_DESC = __cur_str;
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
    if (__cur_str.equals("null")) { this.RUN_OUT_IND = null; } else {
      this.RUN_OUT_IND = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PANUP_SORT_ORDER = null; } else {
      this.PANUP_SORT_ORDER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PRODUCT_PREP_FLAG = null; } else {
      this.PRODUCT_PREP_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDF_INVOICED_ITEM_FLAG = null; } else {
      this.FDF_INVOICED_ITEM_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SAMPLE_FLAG = null; } else {
      this.SAMPLE_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ADD_ON_FLAG = null; } else {
      this.ADD_ON_FLAG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POS_MENU_ITEM_CD = null; } else {
      this.POS_MENU_ITEM_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ALT_POS_MENU_ITEM_CD = null; } else {
      this.ALT_POS_MENU_ITEM_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ORACLE_INVENTORY_ITEM_ID = null; } else {
      this.ORACLE_INVENTORY_ITEM_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.REMARKS = null; } else {
      this.REMARKS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CELEBRATION_PRODUCT_INDICATOR = null; } else {
      this.CELEBRATION_PRODUCT_INDICATOR = new java.math.BigDecimal(__cur_str);
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
    dim_product o = (dim_product) super.clone();
    o.FILE_DTTM = (o.FILE_DTTM != null) ? (java.sql.Timestamp) o.FILE_DTTM.clone() : null;
    o.INSERT_DTTM = (o.INSERT_DTTM != null) ? (java.sql.Timestamp) o.INSERT_DTTM.clone() : null;
    o.UPDATE_DTTM = (o.UPDATE_DTTM != null) ? (java.sql.Timestamp) o.UPDATE_DTTM.clone() : null;
    o.LOAD_DTTM = (o.LOAD_DTTM != null) ? (java.sql.Timestamp) o.LOAD_DTTM.clone() : null;
    return o;
  }

  public void clone0(dim_product o) throws CloneNotSupportedException {
    o.FILE_DTTM = (o.FILE_DTTM != null) ? (java.sql.Timestamp) o.FILE_DTTM.clone() : null;
    o.INSERT_DTTM = (o.INSERT_DTTM != null) ? (java.sql.Timestamp) o.INSERT_DTTM.clone() : null;
    o.UPDATE_DTTM = (o.UPDATE_DTTM != null) ? (java.sql.Timestamp) o.UPDATE_DTTM.clone() : null;
    o.LOAD_DTTM = (o.LOAD_DTTM != null) ? (java.sql.Timestamp) o.LOAD_DTTM.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Z_PRODUCT_DW_ID", this.Z_PRODUCT_DW_ID);
    __sqoop$field_map.put("PRODUCT_CODE", this.PRODUCT_CODE);
    __sqoop$field_map.put("PRODUCT_DESC", this.PRODUCT_DESC);
    __sqoop$field_map.put("MAIN_GROUP_ID", this.MAIN_GROUP_ID);
    __sqoop$field_map.put("MAIN_GROUP_CD", this.MAIN_GROUP_CD);
    __sqoop$field_map.put("MAIN_GROUP_DESC", this.MAIN_GROUP_DESC);
    __sqoop$field_map.put("MAIN_CATEGORY_ID", this.MAIN_CATEGORY_ID);
    __sqoop$field_map.put("MAIN_CATEGORY_CD", this.MAIN_CATEGORY_CD);
    __sqoop$field_map.put("MAIN_CATEGORY_DESC", this.MAIN_CATEGORY_DESC);
    __sqoop$field_map.put("MAIN_SUB_CATEGORY_ID", this.MAIN_SUB_CATEGORY_ID);
    __sqoop$field_map.put("MAIN_SUB_CATEGORY_CD", this.MAIN_SUB_CATEGORY_CD);
    __sqoop$field_map.put("MAIN_SUB_CATEGORY_DESC", this.MAIN_SUB_CATEGORY_DESC);
    __sqoop$field_map.put("CATERING_GROUP_ID", this.CATERING_GROUP_ID);
    __sqoop$field_map.put("CATERING_GROUP_CD", this.CATERING_GROUP_CD);
    __sqoop$field_map.put("CATERING_GROUP_DESC", this.CATERING_GROUP_DESC);
    __sqoop$field_map.put("CATERING_CATEGORY_ID", this.CATERING_CATEGORY_ID);
    __sqoop$field_map.put("CATERING_CATEGORY_CD", this.CATERING_CATEGORY_CD);
    __sqoop$field_map.put("CATERING_CATEGORY_DESC", this.CATERING_CATEGORY_DESC);
    __sqoop$field_map.put("CATERING_SUB_CATEGORY_ID", this.CATERING_SUB_CATEGORY_ID);
    __sqoop$field_map.put("CATERING_SUB_CATEGORY_CD", this.CATERING_SUB_CATEGORY_CD);
    __sqoop$field_map.put("CATERING_SUB_CATEGORY_DESC", this.CATERING_SUB_CATEGORY_DESC);
    __sqoop$field_map.put("ALT_GROUP_ID", this.ALT_GROUP_ID);
    __sqoop$field_map.put("ALT_GROUP_CD", this.ALT_GROUP_CD);
    __sqoop$field_map.put("ALT_GROUP_DESC", this.ALT_GROUP_DESC);
    __sqoop$field_map.put("ALT_CATEGORY_ID", this.ALT_CATEGORY_ID);
    __sqoop$field_map.put("ALT_CATEGORY_CD", this.ALT_CATEGORY_CD);
    __sqoop$field_map.put("ALT_CATEGORY_DESC", this.ALT_CATEGORY_DESC);
    __sqoop$field_map.put("FILE_DTTM", this.FILE_DTTM);
    __sqoop$field_map.put("INSERT_DTTM", this.INSERT_DTTM);
    __sqoop$field_map.put("UPDATE_DTTM", this.UPDATE_DTTM);
    __sqoop$field_map.put("LOAD_DW_ID", this.LOAD_DW_ID);
    __sqoop$field_map.put("VERSION", this.VERSION);
    __sqoop$field_map.put("RUN_OUT_IND", this.RUN_OUT_IND);
    __sqoop$field_map.put("PANUP_SORT_ORDER", this.PANUP_SORT_ORDER);
    __sqoop$field_map.put("PRODUCT_PREP_FLAG", this.PRODUCT_PREP_FLAG);
    __sqoop$field_map.put("FDF_INVOICED_ITEM_FLAG", this.FDF_INVOICED_ITEM_FLAG);
    __sqoop$field_map.put("SAMPLE_FLAG", this.SAMPLE_FLAG);
    __sqoop$field_map.put("ADD_ON_FLAG", this.ADD_ON_FLAG);
    __sqoop$field_map.put("POS_MENU_ITEM_CD", this.POS_MENU_ITEM_CD);
    __sqoop$field_map.put("ALT_POS_MENU_ITEM_CD", this.ALT_POS_MENU_ITEM_CD);
    __sqoop$field_map.put("ORACLE_INVENTORY_ITEM_ID", this.ORACLE_INVENTORY_ITEM_ID);
    __sqoop$field_map.put("REMARKS", this.REMARKS);
    __sqoop$field_map.put("CELEBRATION_PRODUCT_INDICATOR", this.CELEBRATION_PRODUCT_INDICATOR);
    __sqoop$field_map.put("LOAD_DTTM", this.LOAD_DTTM);
    __sqoop$field_map.put("LOAD_BY", this.LOAD_BY);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Z_PRODUCT_DW_ID", this.Z_PRODUCT_DW_ID);
    __sqoop$field_map.put("PRODUCT_CODE", this.PRODUCT_CODE);
    __sqoop$field_map.put("PRODUCT_DESC", this.PRODUCT_DESC);
    __sqoop$field_map.put("MAIN_GROUP_ID", this.MAIN_GROUP_ID);
    __sqoop$field_map.put("MAIN_GROUP_CD", this.MAIN_GROUP_CD);
    __sqoop$field_map.put("MAIN_GROUP_DESC", this.MAIN_GROUP_DESC);
    __sqoop$field_map.put("MAIN_CATEGORY_ID", this.MAIN_CATEGORY_ID);
    __sqoop$field_map.put("MAIN_CATEGORY_CD", this.MAIN_CATEGORY_CD);
    __sqoop$field_map.put("MAIN_CATEGORY_DESC", this.MAIN_CATEGORY_DESC);
    __sqoop$field_map.put("MAIN_SUB_CATEGORY_ID", this.MAIN_SUB_CATEGORY_ID);
    __sqoop$field_map.put("MAIN_SUB_CATEGORY_CD", this.MAIN_SUB_CATEGORY_CD);
    __sqoop$field_map.put("MAIN_SUB_CATEGORY_DESC", this.MAIN_SUB_CATEGORY_DESC);
    __sqoop$field_map.put("CATERING_GROUP_ID", this.CATERING_GROUP_ID);
    __sqoop$field_map.put("CATERING_GROUP_CD", this.CATERING_GROUP_CD);
    __sqoop$field_map.put("CATERING_GROUP_DESC", this.CATERING_GROUP_DESC);
    __sqoop$field_map.put("CATERING_CATEGORY_ID", this.CATERING_CATEGORY_ID);
    __sqoop$field_map.put("CATERING_CATEGORY_CD", this.CATERING_CATEGORY_CD);
    __sqoop$field_map.put("CATERING_CATEGORY_DESC", this.CATERING_CATEGORY_DESC);
    __sqoop$field_map.put("CATERING_SUB_CATEGORY_ID", this.CATERING_SUB_CATEGORY_ID);
    __sqoop$field_map.put("CATERING_SUB_CATEGORY_CD", this.CATERING_SUB_CATEGORY_CD);
    __sqoop$field_map.put("CATERING_SUB_CATEGORY_DESC", this.CATERING_SUB_CATEGORY_DESC);
    __sqoop$field_map.put("ALT_GROUP_ID", this.ALT_GROUP_ID);
    __sqoop$field_map.put("ALT_GROUP_CD", this.ALT_GROUP_CD);
    __sqoop$field_map.put("ALT_GROUP_DESC", this.ALT_GROUP_DESC);
    __sqoop$field_map.put("ALT_CATEGORY_ID", this.ALT_CATEGORY_ID);
    __sqoop$field_map.put("ALT_CATEGORY_CD", this.ALT_CATEGORY_CD);
    __sqoop$field_map.put("ALT_CATEGORY_DESC", this.ALT_CATEGORY_DESC);
    __sqoop$field_map.put("FILE_DTTM", this.FILE_DTTM);
    __sqoop$field_map.put("INSERT_DTTM", this.INSERT_DTTM);
    __sqoop$field_map.put("UPDATE_DTTM", this.UPDATE_DTTM);
    __sqoop$field_map.put("LOAD_DW_ID", this.LOAD_DW_ID);
    __sqoop$field_map.put("VERSION", this.VERSION);
    __sqoop$field_map.put("RUN_OUT_IND", this.RUN_OUT_IND);
    __sqoop$field_map.put("PANUP_SORT_ORDER", this.PANUP_SORT_ORDER);
    __sqoop$field_map.put("PRODUCT_PREP_FLAG", this.PRODUCT_PREP_FLAG);
    __sqoop$field_map.put("FDF_INVOICED_ITEM_FLAG", this.FDF_INVOICED_ITEM_FLAG);
    __sqoop$field_map.put("SAMPLE_FLAG", this.SAMPLE_FLAG);
    __sqoop$field_map.put("ADD_ON_FLAG", this.ADD_ON_FLAG);
    __sqoop$field_map.put("POS_MENU_ITEM_CD", this.POS_MENU_ITEM_CD);
    __sqoop$field_map.put("ALT_POS_MENU_ITEM_CD", this.ALT_POS_MENU_ITEM_CD);
    __sqoop$field_map.put("ORACLE_INVENTORY_ITEM_ID", this.ORACLE_INVENTORY_ITEM_ID);
    __sqoop$field_map.put("REMARKS", this.REMARKS);
    __sqoop$field_map.put("CELEBRATION_PRODUCT_INDICATOR", this.CELEBRATION_PRODUCT_INDICATOR);
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
