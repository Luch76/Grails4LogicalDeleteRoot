package com.oci.luch.domain;

import gorm.logical.delete.LogicalDelete
import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class LuchGrails4LogDel implements LogicalDelete<LuchGrails4LogDel> {
    String name, author;

    static constraints = {
    }

    static mapping = {
        id generator: 'uuid'
    }
}
