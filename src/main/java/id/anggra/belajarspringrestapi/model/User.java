package id.anggra.belajarspringrestapi.model;

import lombok.Data;

@Data
public class User
{
    private long ID;
    private String name;
    private String email;
    private String password;
}
