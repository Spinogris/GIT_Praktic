package com.gorin.homedoc.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "Menu")
public class Menu {

    @Id
    @JdbcTypeCode(SqlTypes.BINARY)
    @Column(name = "package_id")
    private UUID id;

    @Column(name = "package")
    private String packageName;

    @Column(name = "size")
    private String size;



}
class NewFolder{
    private void newName(){

    }
}

class Newfile {
    private  void selectFile (){

    }

    private void scannerAccess(){

    }
}

class Select {
    private void delete(){

    }
    private void copy(){

    }
    private void passt(){

    }
    private void send(){

    }
    private void rename(){

    }
}

class FileRider{
    private void appSelect(){

    }
}