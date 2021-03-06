package com.capstone.CircleSearch.Model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InterestInputDTO {
    private String user_id;
    private String user_interest1;
    private String user_interest2;
}
