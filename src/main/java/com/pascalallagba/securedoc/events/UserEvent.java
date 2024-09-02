package com.pascalallagba.securedoc;

import com.pascalallagba.securedoc.entity.UserEntity;
import com.pascalallagba.securedoc.enumerations.EventType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
public class UserEvent {
    private UserEntity user;
    private EventType eventType;
    private Map<?,?> data;
}
