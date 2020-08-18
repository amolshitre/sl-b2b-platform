package com.newco.marketplace.dto.vo.ledger;

import com.sears.os.vo.SerializableBaseVO;

public class LuOwnerEntityType extends SerializableBaseVO{

    /**
	 * 
	 */
	private static final long serialVersionUID = 8891295967997959554L;
	/**
     * This field was generated by Abator for iBATIS. This field corresponds to the database column lu_owner_entity_type.id
     * @abatorgenerated  Fri Aug 17 14:37:17 CDT 2007
     */
    private Integer id;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database column lu_owner_entity_type.type
     * @abatorgenerated  Fri Aug 17 14:37:17 CDT 2007
     */
    private String type;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database column lu_owner_entity_type.descr
     * @abatorgenerated  Fri Aug 17 14:37:17 CDT 2007
     */
    private String descr;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database column lu_owner_entity_type.sort_order
     * @abatorgenerated  Fri Aug 17 14:37:17 CDT 2007
     */
    private Integer sort_order;

    /**
     * This method was generated by Abator for iBATIS. This method returns the value of the database column lu_owner_entity_type.id
     * @return  the value of lu_owner_entity_type.id
     * @abatorgenerated  Fri Aug 17 14:37:17 CDT 2007
     */
    public Integer getId() {
	return id;
    }

    /**
     * This method was generated by Abator for iBATIS. This method sets the value of the database column lu_owner_entity_type.id
     * @param id  the value for lu_owner_entity_type.id
     * @abatorgenerated  Fri Aug 17 14:37:17 CDT 2007
     */
    public void setId(Integer id) {
	this.id = id;
    }

    /**
     * This method was generated by Abator for iBATIS. This method returns the value of the database column lu_owner_entity_type.type
     * @return  the value of lu_owner_entity_type.type
     * @abatorgenerated  Fri Aug 17 14:37:17 CDT 2007
     */
    public String getType() {
	return type;
    }

    /**
     * This method was generated by Abator for iBATIS. This method sets the value of the database column lu_owner_entity_type.type
     * @param type  the value for lu_owner_entity_type.type
     * @abatorgenerated  Fri Aug 17 14:37:17 CDT 2007
     */
    public void setType(String type) {
	this.type = type;
    }

    /**
     * This method was generated by Abator for iBATIS. This method returns the value of the database column lu_owner_entity_type.descr
     * @return  the value of lu_owner_entity_type.descr
     * @abatorgenerated  Fri Aug 17 14:37:17 CDT 2007
     */
    public String getDescr() {
	return descr;
    }

    /**
     * This method was generated by Abator for iBATIS. This method sets the value of the database column lu_owner_entity_type.descr
     * @param descr  the value for lu_owner_entity_type.descr
     * @abatorgenerated  Fri Aug 17 14:37:17 CDT 2007
     */
    public void setDescr(String descr) {
	this.descr = descr;
    }

    /**
     * This method was generated by Abator for iBATIS. This method returns the value of the database column lu_owner_entity_type.sort_order
     * @return  the value of lu_owner_entity_type.sort_order
     * @abatorgenerated  Fri Aug 17 14:37:17 CDT 2007
     */
    public Integer getSort_order() {
	return sort_order;
    }

    /**
     * This method was generated by Abator for iBATIS. This method sets the value of the database column lu_owner_entity_type.sort_order
     * @param sort_order  the value for lu_owner_entity_type.sort_order
     * @abatorgenerated  Fri Aug 17 14:37:17 CDT 2007
     */
    public void setSort_order(Integer sort_order) {
	this.sort_order = sort_order;
    }
}