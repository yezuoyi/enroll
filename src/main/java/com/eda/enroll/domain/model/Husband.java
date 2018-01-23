package com.eda.enroll.domain.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class Husband implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hid;

    @NonNull@Column(nullable = false)
    private String name;

	@OneToOne(targetEntity = Wife.class, cascade = { CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "wife_id",referencedColumnName = "wid")
    private Wife wife;

    public Husband(){
    }

    public Husband(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "hid=" + hid +
                ", name='" + name + '\'' +
                ", wife=" + wife +
                '}';
    }
}