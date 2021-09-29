package com.oci.luch.domain

import grails.gorm.services.Service

@Service(LuchGrails4LogDel)
interface LuchGrails4LogDelService {

    LuchGrails4LogDel get(Serializable id)

    List<LuchGrails4LogDel> list(Map args)

    Long count()

    void delete(Serializable id)

    LuchGrails4LogDel save(LuchGrails4LogDel luchGrails4LogDel)

}