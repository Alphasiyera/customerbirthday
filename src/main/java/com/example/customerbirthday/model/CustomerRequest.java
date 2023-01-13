package com.example.customerbirthday.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.loader.plan.build.internal.LoadGraphLoadPlanBuildingStrategy;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest {
    private Long customerId;
    private String firstName;
    private String lastName;

}
