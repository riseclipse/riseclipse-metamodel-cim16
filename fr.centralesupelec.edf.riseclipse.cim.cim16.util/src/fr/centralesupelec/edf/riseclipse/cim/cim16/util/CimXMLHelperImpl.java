/**
 *  Copyright (c) 2018 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec
 *      EDF R&D
 *  Contacts:
 *      dominique.marcadet@centralesupelec.fr
 *      aurelie.dehouck-neveu@edf.fr
 *  Web site:
 *      http://wdi.supelec.fr/software/RiseClipse/
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim16.util;


public class CimXMLHelperImpl extends fr.centralesupelec.edf.riseclipse.cim.util.cimxml.CimXMLHelperImpl {

    public CimXMLHelperImpl( CimResourceImpl cimResourceImpl ) {
        super( cimResourceImpl );
    }

    @Override
    public String getURI( String prefix ) {
        String uri = super.getURI( prefix );
        if( CimConstants.cimURISharp.equals( uri )) return CimConstants.cimURI;
        return uri;
    }

}