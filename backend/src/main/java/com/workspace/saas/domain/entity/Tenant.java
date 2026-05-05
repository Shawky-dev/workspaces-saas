package com.workspace.saas.domain.entity;

@Entity
public class Tenant {

    @Id
    @Size(max = 30)
    @Column(name = "tenant_id")
    private String tenantId;

    @Size(max = 30)
    @Column(name = "db")
    private String db;

    @Size(max = 30)
    @Column(name = "password")
    private String password;

    @Size(max = 256)
    @Column(name = "url")
    private String url;

}
