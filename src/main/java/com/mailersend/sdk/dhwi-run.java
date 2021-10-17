import com.mailersend.sdk.Email;
import com.mailersend.sdk.MailerSend;
import com.mailersend.sdk.MailerSendResponse;
import com.mailersend.sdk.exceptions.MailerSendException;

public void sendEmail() {

    Email email = new Email();

    email.setFrom("inputData.sender-name", "actions@biteback2030.com");

    Recipient recipient = new Recipient("Joe Krug", "socialmedia@biteback2030.com");

    email.addRecipient(recipient);

    email.setTemplateId("vywj2lpp5pl7oqzd");

    email.addVariable(recipient, "sender", "inputData.sender-name");
    email.addVariable(recipient, "recipient", "Joe Krug");
    email.addVariable(recipient, "email-body", "inputData.message");

    MailerSend ms = new MailerSend();

    ms.setToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIxIiwianRpIjoiZTYzYTgyMjRlZGIzMDc2NzIxNTIzYjE3ODQ3YzdmNDRkNTU2ODJlOWMzOWZiMDYwMTEyY2ZjZGMxNTIyMjEzYzIwOTVjYzE4ZTcyMWUzODEiLCJpYXQiOjE2MzQ0Nzg4NzYuNTU4MzUyLCJuYmYiOjE2MzQ0Nzg4NzYuNTU4MzU1LCJleHAiOjQ3OTAxNTI0NzYuNTA1NTY0LCJzdWIiOiIxNDIyMSIsInNjb3BlcyI6WyJlbWFpbF9mdWxsIiwiZG9tYWluc19mdWxsIiwiYWN0aXZpdHlfZnVsbCIsImFuYWx5dGljc19mdWxsIiwidG9rZW5zX2Z1bGwiLCJ3ZWJob29rc19mdWxsIiwidGVtcGxhdGVzX2Z1bGwiLCJzdXBwcmVzc2lvbnNfZnVsbCJdfQ.FXMoLrQ6pgvSSqqlAHng8HsyXhcFuBYUdXD5L-Zin0THdyo5_0-m4Gyg-IfRYp2_T4mWh7_w8JZbJn7vR248kBjio6WPdAL5z0iRcatfaohNeGL4BV8OpkO_3Akt9ux8Plegt8sCNAq_t92ZKlASmdOHzt6_ExlVsE-0f193h_2Yy1E_oRg-PMotyRNn1H3xpcX3PC6fJeR7Dp89jFgXBMopkq7H77GfiTvLED55AgX6NbEEAj5eV0_jCbo0zNGCOavmzrXiM1qR6jKlz-68SoxdQcOhw9Cfj3vXWgPh8dW4rCqISUuHVl_IYGFhZj6KT7pJy6f2dNeux5XfGR8fPmV-oY58F-pXUUugkfvclmqHiqhQeNUHuGoDd1TsA1zZJKKKpPmDnK8wdAX3ngS8WYX9kCxVT4XsSNSoqyfWYZGT3-pcVXWJjfyE-28pXl0Ig-oaHv618ge4VMk5-1KQDUFOEYDKL_u-OpOyir4ADG7FRce2s_vok_Qaf4lNj-vM64trJafFUJ6kg4pVlvU3VCwAN6Kbp7F8MLIJvAE7kPlShuk1BZKAWLnXkaa303FFfvaQWBqREi2Q4jd937hGQL_atOuQ7wy_8OWSp4nm5OzqwTSZAboOZzFHJB6qybgb806yPq7rSE8UoGW7NMhYeSVxGqhg4wbCEfof47bFfmE");

    try {
        MailerSendResponse response = ms.send(email);
        System.out.println(response.messageId);
    } catch (MailerSendException e) {
        e.printStackTrace();
    }
}
