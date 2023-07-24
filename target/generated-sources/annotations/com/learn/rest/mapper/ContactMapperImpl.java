package com.learn.rest.mapper;

import com.learn.rest.dto.ContactDto;
import com.learn.rest.entity.Contact;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-25T04:05:05+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
@Component
public class ContactMapperImpl implements ContactMapper {

    @Override
    public Contact contactDtoToContact(ContactDto contactDto) {
        if ( contactDto == null ) {
            return null;
        }

        Contact contact = new Contact();

        contact.setContactId( contactDto.getContactId() );
        contact.setFirstName( contactDto.getFirstName() );
        contact.setLastName( contactDto.getLastName() );
        contact.setMobile( contactDto.getMobile() );
        contact.setEmail( contactDto.getEmail() );
        contact.setContactGroup( contactDto.getContactGroup() );

        return contact;
    }

    @Override
    public ContactDto contactToContactDto(Contact contact) {
        if ( contact == null ) {
            return null;
        }

        ContactDto contactDto = new ContactDto();

        contactDto.setContactId( contact.getContactId() );
        contactDto.setFirstName( contact.getFirstName() );
        contactDto.setLastName( contact.getLastName() );
        contactDto.setMobile( contact.getMobile() );
        contactDto.setEmail( contact.getEmail() );
        contactDto.setContactGroup( contact.getContactGroup() );

        return contactDto;
    }

    @Override
    public List<ContactDto> contactsToContactDtos(List<Contact> contacts) {
        if ( contacts == null ) {
            return null;
        }

        List<ContactDto> list = new ArrayList<ContactDto>( contacts.size() );
        for ( Contact contact : contacts ) {
            list.add( contactToContactDto( contact ) );
        }

        return list;
    }

    @Override
    public List<Contact> contactDtosToContacts(List<ContactDto> contactDtos) {
        if ( contactDtos == null ) {
            return null;
        }

        List<Contact> list = new ArrayList<Contact>( contactDtos.size() );
        for ( ContactDto contactDto : contactDtos ) {
            list.add( contactDtoToContact( contactDto ) );
        }

        return list;
    }
}
