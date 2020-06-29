
package com.in28minutes.courses;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XmlStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="XmlStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="FAILURE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "XmlStatus")
@XmlEnum
public enum XmlStatus {

    SUCCESS,
    FAILURE;

    public String value() {
        return name();
    }

    public static XmlStatus fromValue(String v) {
        return valueOf(v);
    }

}
