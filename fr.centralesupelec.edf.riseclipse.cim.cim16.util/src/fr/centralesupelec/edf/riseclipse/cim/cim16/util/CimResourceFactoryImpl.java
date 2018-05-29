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

import fr.centralesupelec.edf.riseclipse.cim.cim16.util.CimResourceHandler;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @generated NOT
 */
public abstract class CimResourceFactoryImpl extends fr.centralesupelec.edf.riseclipse.cim.util.cimxml.CimResourceFactoryImpl {

    @Override
    protected CimResourceHandler createCimResourceHandler() {
        return new CimResourceHandler();
    }

} //CimResourceFactoryImpl
