package com.ipmonitoring.ipmonitoringapp.model;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@Table(name = "ip_addresses")
public class IpAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String location;
    private String ip;

    @Column(nullable = false)
    private String status = "Unknown";

    @Column(name = "last_checked")
    private LocalDateTime lastChecked;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public String getIp() { return ip; }
    public void setIp(String ip) { this.ip = ip; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public LocalDateTime getLastChecked() { return lastChecked; }
    public void setLastChecked(LocalDateTime lastChecked) { this.lastChecked = lastChecked; }
}
