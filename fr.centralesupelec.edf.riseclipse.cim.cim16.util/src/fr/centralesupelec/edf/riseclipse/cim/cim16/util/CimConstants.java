/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim16.util;


public class CimConstants extends fr.centralesupelec.edf.riseclipse.cim.util.cimxml.CimConstants {

    // CimPackage is specific to each concrete Cim16 metamodel, so we cannot get it here,
    // but we prefer to have a generic Cim16 package
    //public static final String cimURI = CimPackage.eNS_URI;
    public static final String cimURI = "http://iec.ch/TC57/2013/CIM-schema-cim16";
    public static final String cimURISharp = cimURI + "#";
}
