/*-
 *******************************************************************************
 * Copyright (c) 2011, 2016 Diamond Light Source Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    See git history
 *******************************************************************************/

package uk.ac.diamond.ispyb.api;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * Details of the group that data collections belong to
 */
@Generated("uk.ac.diamond.ispyb.generator.BeanGenerator")
public class DataCollectionGroup {
    private Long id = null;
    private Long sessionId;
    private String proposalCode;
    private Long proposalNumber;
    private Long sessionNumber;
    private Long sampleId = null;
    private String sampleBarcode;
    private String experimenttype;
    private Timestamp starttime;
    private Timestamp endtime;
    private String crystalClass;
    private String detectorMode;
    private String actualSampleBarcode;
    private Integer actualSampleSlotInContainer = null;
    private String actualContainerBarcode;
    private Integer actualContainerSlotInSC = null;
    private String comments;
    private String xtalSnapshotFullPath;
    private String scanParameters;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public String getProposalCode() {
        return this.proposalCode;
    }

    public void setProposalCode(String proposalCode) {
        this.proposalCode = proposalCode;
    }

    public Long getProposalNumber() {
        return this.proposalNumber;
    }

    public void setProposalNumber(Long proposalNumber) {
        this.proposalNumber = proposalNumber;
    }

    public Long getSessionNumber() {
        return this.sessionNumber;
    }

    public void setSessionNumber(Long sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    public Long getSampleId() {
        return this.sampleId;
    }

    public void setSampleId(Long sampleId) {
        this.sampleId = sampleId;
    }

    public String getSampleBarcode() {
        return this.sampleBarcode;
    }

    public void setSampleBarcode(String sampleBarcode) {
        this.sampleBarcode = sampleBarcode;
    }

    public String getExperimenttype() {
        return this.experimenttype;
    }

    public void setExperimenttype(String experimenttype) {
        this.experimenttype = experimenttype;
    }

    public Timestamp getStarttime() {
        return this.starttime;
    }

    public void setStarttime(Timestamp starttime) {
        this.starttime = starttime;
    }

    public Timestamp getEndtime() {
        return this.endtime;
    }

    public void setEndtime(Timestamp endtime) {
        this.endtime = endtime;
    }

    public String getCrystalClass() {
        return this.crystalClass;
    }

    public void setCrystalClass(String crystalClass) {
        this.crystalClass = crystalClass;
    }

    public String getDetectorMode() {
        return this.detectorMode;
    }

    public void setDetectorMode(String detectorMode) {
        this.detectorMode = detectorMode;
    }

    public String getActualSampleBarcode() {
        return this.actualSampleBarcode;
    }

    public void setActualSampleBarcode(String actualSampleBarcode) {
        this.actualSampleBarcode = actualSampleBarcode;
    }

    public Integer getActualSampleSlotInContainer() {
        return this.actualSampleSlotInContainer;
    }

    public void setActualSampleSlotInContainer(Integer actualSampleSlotInContainer) {
        this.actualSampleSlotInContainer = actualSampleSlotInContainer;
    }

    public String getActualContainerBarcode() {
        return this.actualContainerBarcode;
    }

    public void setActualContainerBarcode(String actualContainerBarcode) {
        this.actualContainerBarcode = actualContainerBarcode;
    }

    public Integer getActualContainerSlotInSC() {
        return this.actualContainerSlotInSC;
    }

    public void setActualContainerSlotInSC(Integer actualContainerSlotInSC) {
        this.actualContainerSlotInSC = actualContainerSlotInSC;
    }

    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getXtalSnapshotFullPath() {
        return this.xtalSnapshotFullPath;
    }

    public void setXtalSnapshotFullPath(String xtalSnapshotFullPath) {
        this.xtalSnapshotFullPath = xtalSnapshotFullPath;
    }

    public String getScanParameters() {
        return this.scanParameters;
    }

    public void setScanParameters(String scanParameters) {
        this.scanParameters = scanParameters;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

}
