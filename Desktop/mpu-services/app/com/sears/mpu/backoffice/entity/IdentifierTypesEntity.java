package com.sears.mpu.backoffice.entity;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name="identifier_types")

public class IdentifierTypesEntity implements Serializable {
		
		@Id
		@GeneratedValue( strategy=GenerationType.IDENTITY )
		private int identifier_type_id;
		/**
		 * @return the identifier_type_id
		 */
		public int getIdentifier_type_id() {
			return identifier_type_id;
		}

		/**
		 * @param identifier_type_id the identifier_type_id to set
		 */
		public void setIdentifier_type_id(int identifier_type_id) {
			this.identifier_type_id = identifier_type_id;
		}

		private String identifierDesc;

		/**
		 * @return the identifierDesc
		 */
		public String getIdentifierDesc() {
			return identifierDesc;
		}

		/**
		 * @param identifierDesc the identifierDesc to set
		 */
		public void setIdentifierDesc(String identifierDesc) {
			this.identifierDesc = identifierDesc;
		}
		
		//TODO need to discuss this table/entity with team
		
	
	}

