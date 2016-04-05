package com.alwaysmoveforward.oauth.datalayer.tableentities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by acorrea on 11/30/2015.
 */
/// <summary>
/// A class representing an OAUth consumer
/// </summary>
@Entity
@Table(name="Consumers")
public class ConsumerEntity implements Serializable {
    /// <summary>
    /// Gets or sets the consumer key
    /// </summary>
    @Id
    @Column(name = "ConsumerKey")
    private String consumerKey;
    public String getConsumerKey() {
        return this.consumerKey;
    }
    public void setConsumerKey(String value) {
        this.consumerKey = value;
    }

    /// <summary>
    /// Gets or sets the consumer secret
    /// </summary>
    @Column(name = "ConsumerSecret")
    private String consumerSecret;
    public String getConsumerSecret() {
        return this.consumerSecret;
    }
    public void setConsumerSecret(String value) {
        this.consumerSecret = value;
    }

    /// <summary>
    /// Gets or sets the Public Key
    /// </summary>
    @Column(name = "PublicKey")
    private String publicKey;
    public String getPublicKey() {
        return this.publicKey;
    }
    public void setPublicKey(String value) {
        this.publicKey = value;
    }

    /// <summary>
    /// Gets or sets the contact email.
    /// </summary>
    @Column(name = "ContactEmail")
    private String contactEmail;
    public String getContactEmail() {
        return this.contactEmail;
    }
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    /// <summary>
    /// Gets or sets the name of the consumer
    /// </summary>
    @Column(name = "Name")
    private String name;
    public String getName() {
        return this.name;
    }
    public void setName(String value) {
        this.name = value;
    }

    /// <summary>
    /// Gets or sets if the access tokens should be auto granted
    /// </summary>
    @Column(name = "AutoGrant")
    private Boolean autoGrant;
    public Boolean getAutoGrant() {
        return this.autoGrant;
    }
    public void setAutoGrant(Boolean value) {
        this.autoGrant = value;
    }

    /// <summary>
    /// Gets or sets how many hours before an access token expires for this consumer
    /// </summary>
    @Column(name = "AccessTokenLifetime")
    private Integer accessTokenLifetime;
    public Integer getAccessTokenLifetime() {
        return this.accessTokenLifetime;
    }
    public void setAccessTokenLifetime(Integer value) {
        this.accessTokenLifetime = value;
    }

    @Override
    public int hashCode() {
        return getConsumerKey().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof ConsumerEntity)) {
            return false;
        }
        ConsumerEntity other = (ConsumerEntity) obj;
        return getConsumerKey().equals(other.getConsumerKey());
    }
}
