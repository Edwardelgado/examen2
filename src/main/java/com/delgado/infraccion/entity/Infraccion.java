package com.delgado.infraccion.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="infracciones")

public class Infraccion {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
		
	@Column(unique = true,nullable = false, length = 8)
	private String dni;	
	
	@Column(nullable = false, updatable = false)
	private Date fecha;
	
	@Column(nullable = false, length = 3)
	private String falta;	
	
	@Column(nullable = false, length = 200)
	private String infraccion;
	
	@Column(nullable = true, length = 255)
	private String descripcion;
	
	@Column(name="created_at",nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createdAt;
	
	@Column(name="updated_at",nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updatedAt;
	
	@Column(name="activo",nullable = false)
	private Boolean activo;
}
