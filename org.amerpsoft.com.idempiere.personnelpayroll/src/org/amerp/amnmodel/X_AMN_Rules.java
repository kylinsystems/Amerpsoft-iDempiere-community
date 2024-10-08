/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.amerp.amnmodel;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Model for AMN_Rules
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
public class X_AMN_Rules extends PO implements I_AMN_Rules, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190218L;

    /** Standard Constructor */
    public X_AMN_Rules (Properties ctx, int AMN_Rules_ID, String trxName)
    {
      super (ctx, AMN_Rules_ID, trxName);
      /** if (AMN_Rules_ID == 0)
        {
			setAMN_Rules_ID (0);
			setEntityType (null);
// @SQL=select get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) from dual
			setEventType (null);
			setName (null);
			setRuleType (null);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_AMN_Rules (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_AMN_Rules[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Payroll Rules and variables.
		@param AMN_Rules_ID Payroll Rules and variables	  */
	public void setAMN_Rules_ID (int AMN_Rules_ID)
	{
		if (AMN_Rules_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_AMN_Rules_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_AMN_Rules_ID, Integer.valueOf(AMN_Rules_ID));
	}

	/** Get Payroll Rules and variables.
		@return Payroll Rules and variables	  */
	public int getAMN_Rules_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AMN_Rules_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set AMN_Rules_UU.
		@param AMN_Rules_UU AMN_Rules_UU	  */
	public void setAMN_Rules_UU (String AMN_Rules_UU)
	{
		set_Value (COLUMNNAME_AMN_Rules_UU, AMN_Rules_UU);
	}

	/** Get AMN_Rules_UU.
		@return AMN_Rules_UU	  */
	public String getAMN_Rules_UU () 
	{
		return (String)get_Value(COLUMNNAME_AMN_Rules_UU);
	}

	/** AccessLevel AD_Reference_ID=5 */
	public static final int ACCESSLEVEL_AD_Reference_ID=5;
	/** Organization = 1 */
	public static final String ACCESSLEVEL_Organization = "1";
	/** Client+Organization = 3 */
	public static final String ACCESSLEVEL_ClientPlusOrganization = "3";
	/** System only = 4 */
	public static final String ACCESSLEVEL_SystemOnly = "4";
	/** All = 7 */
	public static final String ACCESSLEVEL_All = "7";
	/** System+Client = 6 */
	public static final String ACCESSLEVEL_SystemPlusClient = "6";
	/** Client only = 2 */
	public static final String ACCESSLEVEL_ClientOnly = "2";
	/** Set Data Access Level.
		@param AccessLevel 
		Access Level required
	  */
	public void setAccessLevel (String AccessLevel)
	{

		set_Value (COLUMNNAME_AccessLevel, AccessLevel);
	}

	/** Get Data Access Level.
		@return Access Level required
	  */
	public String getAccessLevel () 
	{
		return (String)get_Value(COLUMNNAME_AccessLevel);
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** EntityType AD_Reference_ID=389 */
	public static final int ENTITYTYPE_AD_Reference_ID=389;
	/** Set Entity Type.
		@param EntityType 
		Dictionary Entity Type; Determines ownership and synchronization
	  */
	public void setEntityType (String EntityType)
	{

		set_Value (COLUMNNAME_EntityType, EntityType);
	}

	/** Get Entity Type.
		@return Dictionary Entity Type; Determines ownership and synchronization
	  */
	public String getEntityType () 
	{
		return (String)get_Value(COLUMNNAME_EntityType);
	}

	/** EventType AD_Reference_ID=53236 */
	public static final int EVENTTYPE_AD_Reference_ID=53236;
	/** Callout = C */
	public static final String EVENTTYPE_Callout = "C";
	/** Process = P */
	public static final String EVENTTYPE_Process = "P";
	/** Model Validator Table Event = T */
	public static final String EVENTTYPE_ModelValidatorTableEvent = "T";
	/** Model Validator Document Event = D */
	public static final String EVENTTYPE_ModelValidatorDocumentEvent = "D";
	/** Model Validator Login Event = L */
	public static final String EVENTTYPE_ModelValidatorLoginEvent = "L";
	/** Human Resource & Payroll = H */
	public static final String EVENTTYPE_HumanResourcePayroll = "H";
	/** Measure for Performance Analysis = M */
	public static final String EVENTTYPE_MeasureForPerformanceAnalysis = "M";
	/** GL Reconciliation = R */
	public static final String EVENTTYPE_GLReconciliation = "R";
	/** Set Event Type.
		@param EventType 
		Type of Event
	  */
	public void setEventType (String EventType)
	{

		set_Value (COLUMNNAME_EventType, EventType);
	}

	/** Get Event Type.
		@return Type of Event
	  */
	public String getEventType () 
	{
		return (String)get_Value(COLUMNNAME_EventType);
	}

	/** Set Comment/Help.
		@param Help 
		Comment or Hint
	  */
	public void setHelp (String Help)
	{
		set_Value (COLUMNNAME_Help, Help);
	}

	/** Get Comment/Help.
		@return Comment or Hint
	  */
	public String getHelp () 
	{
		return (String)get_Value(COLUMNNAME_Help);
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getName());
    }

	/** RuleType AD_Reference_ID=53235 */
	public static final int RULETYPE_AD_Reference_ID=53235;
	/** Aspect Orient Program = A */
	public static final String RULETYPE_AspectOrientProgram = "A";
	/** JSR 223 Scripting APIs = S */
	public static final String RULETYPE_JSR223ScriptingAPIs = "S";
	/** JSR 94 Rule Engine API = R */
	public static final String RULETYPE_JSR94RuleEngineAPI = "R";
	/** SQL = Q */
	public static final String RULETYPE_SQL = "Q";
	/** Set Rule Type.
		@param RuleType Rule Type	  */
	public void setRuleType (String RuleType)
	{

		set_Value (COLUMNNAME_RuleType, RuleType);
	}

	/** Get Rule Type.
		@return Rule Type	  */
	public String getRuleType () 
	{
		return (String)get_Value(COLUMNNAME_RuleType);
	}

	/** Set Script.
		@param Script 
		Dynamic Java Language Script to calculate result
	  */
	public void setScript (String Script)
	{
		set_Value (COLUMNNAME_Script, Script);
	}

	/** Get Script.
		@return Dynamic Java Language Script to calculate result
	  */
	public String getScript () 
	{
		return (String)get_Value(COLUMNNAME_Script);
	}

	/** Set Search Key.
		@param Value 
		Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue () 
	{
		return (String)get_Value(COLUMNNAME_Value);
	}
}