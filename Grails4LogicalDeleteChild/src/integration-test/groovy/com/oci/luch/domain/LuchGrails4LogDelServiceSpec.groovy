package com.oci.luch.domain

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class LuchGrails4LogDelServiceSpec extends Specification {

    LuchGrails4LogDelService luchGrails4LogDelService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new LuchGrails4LogDel(...).save(flush: true, failOnError: true)
        //new LuchGrails4LogDel(...).save(flush: true, failOnError: true)
        //LuchGrails4LogDel luchGrails4LogDel = new LuchGrails4LogDel(...).save(flush: true, failOnError: true)
        //new LuchGrails4LogDel(...).save(flush: true, failOnError: true)
        //new LuchGrails4LogDel(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //luchGrails4LogDel.id
    }

    void "test get"() {
        setupData()

        expect:
        luchGrails4LogDelService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<LuchGrails4LogDel> luchGrails4LogDelList = luchGrails4LogDelService.list(max: 2, offset: 2)

        then:
        luchGrails4LogDelList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        luchGrails4LogDelService.count() == 5
    }

    void "test delete"() {
        Long luchGrails4LogDelId = setupData()

        expect:
        luchGrails4LogDelService.count() == 5

        when:
        luchGrails4LogDelService.delete(luchGrails4LogDelId)
        sessionFactory.currentSession.flush()

        then:
        luchGrails4LogDelService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        LuchGrails4LogDel luchGrails4LogDel = new LuchGrails4LogDel()
        luchGrails4LogDelService.save(luchGrails4LogDel)

        then:
        luchGrails4LogDel.id != null
    }
}
