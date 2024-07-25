package com.fyp.shareddomain.event;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlatStateChanged {

    private String flatId;
    private String status = "changed";

}
