package com.oci.luch.domain

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class LuchGrails4LogDelController {

    LuchGrails4LogDelService luchGrails4LogDelService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def myDomainList() {
        Integer listCount;
        def list;

        list = LuchGrails4LogDel.list();

        render "List size ${list.size()}";
    }

    def myDomainFindAll() {
        Integer listCount;
        def list;

        list = LuchGrails4LogDel.findAll();

        render "List size ${list.size()}";
    }


    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond luchGrails4LogDelService.list(params), model:[luchGrails4LogDelCount: luchGrails4LogDelService.count()]
    }

    def show(String id) {
        respond luchGrails4LogDelService.get(id)
    }

    def create() {
        respond new LuchGrails4LogDel(params)
    }

    def save(LuchGrails4LogDel luchGrails4LogDel) {
        if (luchGrails4LogDel == null) {
            notFound()
            return
        }

        try {
            luchGrails4LogDelService.save(luchGrails4LogDel)
        } catch (ValidationException e) {
            respond luchGrails4LogDel.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'luchGrails4LogDel.label', default: 'LuchGrails4LogDel'), luchGrails4LogDel.id])
                redirect luchGrails4LogDel
            }
            '*' { respond luchGrails4LogDel, [status: CREATED] }
        }
    }

    def edit(String id) {
        respond luchGrails4LogDelService.get(id)
    }

    def update(LuchGrails4LogDel luchGrails4LogDel) {
        if (luchGrails4LogDel == null) {
            notFound()
            return
        }

        try {
            luchGrails4LogDelService.save(luchGrails4LogDel)
        } catch (ValidationException e) {
            respond luchGrails4LogDel.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'luchGrails4LogDel.label', default: 'LuchGrails4LogDel'), luchGrails4LogDel.id])
                redirect luchGrails4LogDel
            }
            '*'{ respond luchGrails4LogDel, [status: OK] }
        }
    }

    def delete(String id) {
        if (id == null) {
            notFound()
            return
        }

        luchGrails4LogDelService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'luchGrails4LogDel.label', default: 'LuchGrails4LogDel'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'luchGrails4LogDel.label', default: 'LuchGrails4LogDel'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
