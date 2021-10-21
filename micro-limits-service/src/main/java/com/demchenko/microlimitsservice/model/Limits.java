package com.demchenko.microlimitsservice.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Limits {
    private int minimum;
    private int maximum;
}
