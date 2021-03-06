/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package vehiclemanager.model;
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Vehicle extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Vehicle\",\"namespace\":\"vehiclemanager.model\",\"fields\":[{\"name\":\"registrationNo\",\"type\":\"string\"},{\"name\":\"manufactureName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"modelNo\",\"type\":\"string\"},{\"name\":\"driverName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"driverMobile\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence registrationNo;
  @Deprecated public java.lang.CharSequence manufactureName;
  @Deprecated public java.lang.CharSequence modelNo;
  @Deprecated public java.lang.CharSequence driverName;
  @Deprecated public java.lang.CharSequence driverMobile;

  /**
   * Default constructor.
   */
  public Vehicle() {}

  /**
   * All-args constructor.
   */
  public Vehicle(java.lang.CharSequence registrationNo, java.lang.CharSequence manufactureName, java.lang.CharSequence modelNo, java.lang.CharSequence driverName, java.lang.CharSequence driverMobile) {
    this.registrationNo = registrationNo;
    this.manufactureName = manufactureName;
    this.modelNo = modelNo;
    this.driverName = driverName;
    this.driverMobile = driverMobile;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return registrationNo;
    case 1: return manufactureName;
    case 2: return modelNo;
    case 3: return driverName;
    case 4: return driverMobile;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: registrationNo = (java.lang.CharSequence)value$; break;
    case 1: manufactureName = (java.lang.CharSequence)value$; break;
    case 2: modelNo = (java.lang.CharSequence)value$; break;
    case 3: driverName = (java.lang.CharSequence)value$; break;
    case 4: driverMobile = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'registrationNo' field.
   */
  public java.lang.CharSequence getRegistrationNo() {
    return registrationNo;
  }

  /**
   * Sets the value of the 'registrationNo' field.
   * @param value the value to set.
   */
  public void setRegistrationNo(java.lang.CharSequence value) {
    this.registrationNo = value;
  }

  /**
   * Gets the value of the 'manufactureName' field.
   */
  public java.lang.CharSequence getManufactureName() {
    return manufactureName;
  }

  /**
   * Sets the value of the 'manufactureName' field.
   * @param value the value to set.
   */
  public void setManufactureName(java.lang.CharSequence value) {
    this.manufactureName = value;
  }

  /**
   * Gets the value of the 'modelNo' field.
   */
  public java.lang.CharSequence getModelNo() {
    return modelNo;
  }

  /**
   * Sets the value of the 'modelNo' field.
   * @param value the value to set.
   */
  public void setModelNo(java.lang.CharSequence value) {
    this.modelNo = value;
  }

  /**
   * Gets the value of the 'driverName' field.
   */
  public java.lang.CharSequence getDriverName() {
    return driverName;
  }

  /**
   * Sets the value of the 'driverName' field.
   * @param value the value to set.
   */
  public void setDriverName(java.lang.CharSequence value) {
    this.driverName = value;
  }

  /**
   * Gets the value of the 'driverMobile' field.
   */
  public java.lang.CharSequence getDriverMobile() {
    return driverMobile;
  }

  /**
   * Sets the value of the 'driverMobile' field.
   * @param value the value to set.
   */
  public void setDriverMobile(java.lang.CharSequence value) {
    this.driverMobile = value;
  }

  /** Creates a new Vehicle RecordBuilder */
  public static vehiclemanager.model.Vehicle.Builder newBuilder() {
    return new vehiclemanager.model.Vehicle.Builder();
  }
  
  /** Creates a new Vehicle RecordBuilder by copying an existing Builder */
  public static vehiclemanager.model.Vehicle.Builder newBuilder(vehiclemanager.model.Vehicle.Builder other) {
    return new vehiclemanager.model.Vehicle.Builder(other);
  }
  
  /** Creates a new Vehicle RecordBuilder by copying an existing Vehicle instance */
  public static vehiclemanager.model.Vehicle.Builder newBuilder(vehiclemanager.model.Vehicle other) {
    return new vehiclemanager.model.Vehicle.Builder(other);
  }
  
  /**
   * RecordBuilder for Vehicle instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Vehicle>
    implements org.apache.avro.data.RecordBuilder<Vehicle> {

    private java.lang.CharSequence registrationNo;
    private java.lang.CharSequence manufactureName;
    private java.lang.CharSequence modelNo;
    private java.lang.CharSequence driverName;
    private java.lang.CharSequence driverMobile;

    /** Creates a new Builder */
    private Builder() {
      super(vehiclemanager.model.Vehicle.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(vehiclemanager.model.Vehicle.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Vehicle instance */
    private Builder(vehiclemanager.model.Vehicle other) {
            super(vehiclemanager.model.Vehicle.SCHEMA$);
      if (isValidValue(fields()[0], other.registrationNo)) {
        this.registrationNo = data().deepCopy(fields()[0].schema(), other.registrationNo);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.manufactureName)) {
        this.manufactureName = data().deepCopy(fields()[1].schema(), other.manufactureName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.modelNo)) {
        this.modelNo = data().deepCopy(fields()[2].schema(), other.modelNo);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.driverName)) {
        this.driverName = data().deepCopy(fields()[3].schema(), other.driverName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.driverMobile)) {
        this.driverMobile = data().deepCopy(fields()[4].schema(), other.driverMobile);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'registrationNo' field */
    public java.lang.CharSequence getRegistrationNo() {
      return registrationNo;
    }
    
    /** Sets the value of the 'registrationNo' field */
    public vehiclemanager.model.Vehicle.Builder setRegistrationNo(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.registrationNo = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'registrationNo' field has been set */
    public boolean hasRegistrationNo() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'registrationNo' field */
    public vehiclemanager.model.Vehicle.Builder clearRegistrationNo() {
      registrationNo = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'manufactureName' field */
    public java.lang.CharSequence getManufactureName() {
      return manufactureName;
    }
    
    /** Sets the value of the 'manufactureName' field */
    public vehiclemanager.model.Vehicle.Builder setManufactureName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.manufactureName = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'manufactureName' field has been set */
    public boolean hasManufactureName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'manufactureName' field */
    public vehiclemanager.model.Vehicle.Builder clearManufactureName() {
      manufactureName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'modelNo' field */
    public java.lang.CharSequence getModelNo() {
      return modelNo;
    }
    
    /** Sets the value of the 'modelNo' field */
    public vehiclemanager.model.Vehicle.Builder setModelNo(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.modelNo = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'modelNo' field has been set */
    public boolean hasModelNo() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'modelNo' field */
    public vehiclemanager.model.Vehicle.Builder clearModelNo() {
      modelNo = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'driverName' field */
    public java.lang.CharSequence getDriverName() {
      return driverName;
    }
    
    /** Sets the value of the 'driverName' field */
    public vehiclemanager.model.Vehicle.Builder setDriverName(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.driverName = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'driverName' field has been set */
    public boolean hasDriverName() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'driverName' field */
    public vehiclemanager.model.Vehicle.Builder clearDriverName() {
      driverName = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'driverMobile' field */
    public java.lang.CharSequence getDriverMobile() {
      return driverMobile;
    }
    
    /** Sets the value of the 'driverMobile' field */
    public vehiclemanager.model.Vehicle.Builder setDriverMobile(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.driverMobile = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'driverMobile' field has been set */
    public boolean hasDriverMobile() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'driverMobile' field */
    public vehiclemanager.model.Vehicle.Builder clearDriverMobile() {
      driverMobile = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public Vehicle build() {
      try {
        Vehicle record = new Vehicle();
        record.registrationNo = fieldSetFlags()[0] ? this.registrationNo : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.manufactureName = fieldSetFlags()[1] ? this.manufactureName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.modelNo = fieldSetFlags()[2] ? this.modelNo : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.driverName = fieldSetFlags()[3] ? this.driverName : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.driverMobile = fieldSetFlags()[4] ? this.driverMobile : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
