package com.eda.enroll.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class Wife implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer wid;

    @NonNull@Column(nullable = false)
    private String name;

    public Wife(){
    }

    public Wife(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "wid=" + wid +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode(){
        return wid;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Wife))
            return  false;
        Wife wife = (Wife) obj;
        if(wife.getWid() == this.wid)
            return true;
        else
            return false;
    }
}
