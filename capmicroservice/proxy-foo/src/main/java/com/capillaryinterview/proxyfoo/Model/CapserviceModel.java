package com.capillaryinterview.proxyfoo.Model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
public class CapserviceModel {
    long id;

    String myServiceName;

}

