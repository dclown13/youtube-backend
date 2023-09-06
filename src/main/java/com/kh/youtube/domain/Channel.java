package com.kh.youtube.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Channel {

    private int channelCode;
    private String channelName;
    private	String channelDesc;
    private String channelDate;
    private String memberId;
    private Member member;

}
