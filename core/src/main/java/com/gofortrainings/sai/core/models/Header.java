package com.gofortrainings.sai.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptabes=Resource.class)
public class Header {
@ValueMapValue	
private String Name;

public String getName() {
	return Name;
}
/