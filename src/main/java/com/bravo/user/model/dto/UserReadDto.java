package com.bravo.user.model.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.bravo.user.dao.model.UserRole;
import lombok.Data;

@Data
public class UserReadDto {

  private String id;
  private String name;
  private String firstName;
  private String middleName;
  private String lastName;
  private String phoneNumber;
  private String email;
  private String userRole;
  private LocalDateTime updated;
}
