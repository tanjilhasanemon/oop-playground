package com.example.midterm_2331024_sec6;

import java.time.LocalDate;

public class PetMonitor {
   private String petId, petType;
   private float petTempCels;
   private LocalDate lastChekupDate;
   boolean vaccinated;
   String healthstatus;

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public float getPetTempCels() {
        return petTempCels;
    }

    public void setPetTempCels(float petTempCels) {
        this.petTempCels = petTempCels;
    }

    public LocalDate getLastChekupDate() {
        return lastChekupDate;
    }

    public void setLastChekupDate(LocalDate lastChekupDate) {
        this.lastChekupDate = lastChekupDate;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    @Override
    public String toString() {
        return "PetMonitor{" +
                "petId='" + petId + '\'' +
                ", petType='" + petType + '\'' +
                ", petTempCels=" + petTempCels +
                ", lastChekupDate=" + lastChekupDate +
                ", vaccinated=" + vaccinated +
                '}';
    }

    public PetMonitor(String petId, String petType, float petTempCels, LocalDate lastChekupDate, boolean vaccinated) {
        this.petId = petId;
        this.petType = petType;
        this.petTempCels = petTempCels;
        this.lastChekupDate = lastChekupDate;
        this.vaccinated = vaccinated;


    public void assignHealthStatus()
    {
        if ((petTempCels >40) || (petTempCels < 36)){
            healthstatus = "Critical";
        } else if ((petTempCels >40.5) || (petTempCels < 39.6)) {
            healthstatus = "Slight Fever";

        }else healthstatus = "Normal";

        }
        return;


    }
}
