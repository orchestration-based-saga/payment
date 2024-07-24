package com.saga.payment.infra.model;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "MerchantProduct")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MerchantProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "merchant_inventory_id")
    Integer merchantInventoryId;
    String name;
    String description;
    String ean;
    Integer product;
    Boolean serviceable;
    Boolean bulky;
    @OneToOne
    @JoinColumn(name = "pickup_address", referencedColumnName = "id")
    MerchantAddressEntity pickupAddress;
    @OneToOne
    @JoinColumn(name = "return_address", referencedColumnName = "id")
    MerchantAddressEntity returnAddress;
    Integer stockLevel;
    Integer reservedLevel;
}
