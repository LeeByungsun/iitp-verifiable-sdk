package com.iitp.icon;

import java.util.Collections;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PublicKeyVo{
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("type")
    @Expose
    public Object type;
    @SerializedName("created")
    @Expose
    public Integer created;
    @SerializedName("publicKeyBase64")
    @Expose
    public String publicKeyBase64;
    @SerializedName("revoked")
    @Expose
    public Integer revoked;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    @SuppressWarnings("unchecked")
	public List<String> getType(){
    	if (type instanceof String) {
    		return Collections.singletonList((String)type);
    	}
    	else if (type instanceof List && ((List<?>)type).size() > 0 && ((List<?>)type).get(0) instanceof String) {
    		return (List<String>)type;
    	}
    	return null;
    }
    
    public void setType(Object type){
        this.type = type;
    }
    
    public Integer getCreated(){
        return created;
    }

    public void setCreated(Integer created){
        this.created = created;
    }

    public String getPublicKeyBase64(){
        return publicKeyBase64;
    }

    public void setPublicKeyBase64(String publicKeyBase64){
        this.publicKeyBase64 = publicKeyBase64;
    }

    public Integer getRevoked(){
        return revoked;
    }

    public void setRevoked(Integer revoked){
        this.revoked = revoked;
    }
}
