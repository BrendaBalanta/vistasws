/**
 * Docente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.uniajc.model;

public class Docente  implements java.io.Serializable {
    private java.lang.String fechafin;

    private java.lang.String fechainicio;

    private com.uniajc.model.Persona p;

    private java.lang.String status;

    public Docente() {
    }

    public Docente(
           java.lang.String fechafin,
           java.lang.String fechainicio,
           com.uniajc.model.Persona p,
           java.lang.String status) {
           this.fechafin = fechafin;
           this.fechainicio = fechainicio;
           this.p = p;
           this.status = status;
    }


    /**
     * Gets the fechafin value for this Docente.
     * 
     * @return fechafin
     */
    public java.lang.String getFechafin() {
        return fechafin;
    }


    /**
     * Sets the fechafin value for this Docente.
     * 
     * @param fechafin
     */
    public void setFechafin(java.lang.String fechafin) {
        this.fechafin = fechafin;
    }


    /**
     * Gets the fechainicio value for this Docente.
     * 
     * @return fechainicio
     */
    public java.lang.String getFechainicio() {
        return fechainicio;
    }


    /**
     * Sets the fechainicio value for this Docente.
     * 
     * @param fechainicio
     */
    public void setFechainicio(java.lang.String fechainicio) {
        this.fechainicio = fechainicio;
    }


    /**
     * Gets the p value for this Docente.
     * 
     * @return p
     */
    public com.uniajc.model.Persona getP() {
        return p;
    }


    /**
     * Sets the p value for this Docente.
     * 
     * @param p
     */
    public void setP(com.uniajc.model.Persona p) {
        this.p = p;
    }


    /**
     * Gets the status value for this Docente.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Docente.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Docente)) return false;
        Docente other = (Docente) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fechafin==null && other.getFechafin()==null) || 
             (this.fechafin!=null &&
              this.fechafin.equals(other.getFechafin()))) &&
            ((this.fechainicio==null && other.getFechainicio()==null) || 
             (this.fechainicio!=null &&
              this.fechainicio.equals(other.getFechainicio()))) &&
            ((this.p==null && other.getP()==null) || 
             (this.p!=null &&
              this.p.equals(other.getP()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFechafin() != null) {
            _hashCode += getFechafin().hashCode();
        }
        if (getFechainicio() != null) {
            _hashCode += getFechainicio().hashCode();
        }
        if (getP() != null) {
            _hashCode += getP().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Docente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.uniajc.com", "Docente"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechafin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.uniajc.com", "fechafin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechainicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.uniajc.com", "fechainicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("p");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.uniajc.com", "p"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.uniajc.com", "Persona"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.uniajc.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
