package packet;

public class OpcodeMsg {
	public static final int EVENT_HEART_BIT = 0;
	public static final int EVENT_ACCEPT_CONNECTION_NOT = 1;
	public static final int EMS_VERIFY_ACCOUNT_REQ = 2;
	public static final int EMS_VERIFY_ACCOUNT_ACK = 3;
	public static final int DB_EVENT_SERVER_INFO_REQ = 4;
	public static final int EMS_CLOSE_CONNECTION_NOT = 5;
	public static final int EMS_ADD_FRIEND_REQ = 6;
	public static final int EMS_ADD_FRIEND_ACK = 7;
	public static final int EMS_ADD_FRIEND_NOT = 8;
	public static final int EMS_ACCEPT_FRIEND_REQ = 9;
	public static final int EMS_ACCEPT_FRIEND_ACK = 10;
	public static final int EMS_ACCEPT_FRIEND_NOT = 11;
	public static final int EMS_UPDATE_FRIENDS_NOT = 12;
	public static final int EMS_UPDATE_FRIEND_NOT = 13;
	public static final int EMS_DELETE_FRIEND_REQ = 14;
	public static final int EMS_DELETE_FRIEND_ACK = 15;
	public static final int EMS_REJECT_FRIEND_REQ = 16;
	public static final int EMS_REJECT_FRIEND_ACK = 17;
	public static final int EMS_REJECT_FRIEND_NOT = 18;
	public static final int EMS_UPDATE_MYDATA_NOT = 19;
	public static final int EMS_CHAT_REQ = 20;
	public static final int EMS_CHAT_NOT = 21;
	public static final int EMS_LOGINNED_FRIEND_LIST_NOT = 22;
	public static final int EMS_BLOCK_FRIEND_REQ = 23;
	public static final int EMS_BLOCK_FRIEND_ACK = 24;
	public static final int EMS_UNBLOCK_FRIEND_REQ = 25;
	public static final int EMS_UNBLOCK_FRIEND_ACK = 26;
	public static final int EMS_LIVE_DATA_REQ = 27;
	public static final int EMS_KICK_NOT = 28;
	public static final int EMS_LOGON_REPORT_REQ = 29;
	public static final int EMS_FRIEND_NOT_EXIST_NOT = 30;
	public static final int EMS_S2_VERIFY_ACCOUNT_REQ = 31;
	public static final int EMS_S2_VERIFY_ACCOUNT_ACK = 32;
	public static final int EMS_S2_CLOSE_CONNECTION_NOT = 33;
	public static final int EMS_S2_ADD_FRIEND_REQ = 34; 
	public static final int EMS_S2_ADD_FRIEND_ACK = 35;
	public static final int EMS_S2_ADD_FRIEND_NOT = 36;
	public static final int EMS_S2_ACCEPT_FRIEND_REQ = 37;
	public static final int EMS_S2_ACCEPT_FRIEND_ACK = 38;
	public static final int EMS_S2_ACCEPT_FRIEND_NOT = 39;
	public static final int EMS_S2_UPDATE_FRIENDS_NOT = 40;
	public static final int EMS_S2_UPDATE_FRIEND_NOT = 41;
	public static final int EMS_S2_DELETE_FRIEND_REQ = 42;
	public static final int EMS_S2_DELETE_FRIEND_ACK = 43;
	public static final int EMS_S2_REJECT_FRIEND_REQ = 44;
	public static final int EMS_S2_REJECT_FRIEND_ACK = 45;
	public static final int EMS_S2_REJECT_FRIEND_NOT = 46;
	public static final int EMS_S2_UPDATE_MYDATA_NOT = 47;
	public static final int EMS_S2_CHAT_REQ = 48;
	public static final int EMS_S2_CHAT_NOT = 49;
	public static final int EMS_S2_LOGINNED_FRIEND_LIST_NOT = 50;
	public static final int EMS_S2_BLOCK_FRIEND_REQ = 51;
	public static final int EMS_S2_BLOCK_FRIEND_ACK = 52;
	public static final int EMS_S2_UNBLOCK_FRIEND_REQ = 53;
	public static final int EMS_S2_UNBLOCK_FRIEND_ACK = 54;
	public static final int EMS_S2_BLOCK_MOVE_FRIEND_REQ = 55;
	public static final int EMS_S2_BLOCK_MOVE_FRIEND_ACK = 56;
	public static final int EMS_S2_UNBLOCK_MOVE_FRIEND_REQ = 57;
	public static final int EMS_S2_UNBLOCK_MOVE_FRIEND_ACK = 58;
	public static final int EMS_S2_LIVE_DATA_REQ = 59;
	public static final int EMS_S2_KICK_NOT = 60;
	public static final int EMS_S2_LOGON_REPORT_REQ = 61;
	public static final int EMS_S2_FRIEND_NOT_EXIST_NOT = 62;
	public static final int EMS_S2_ADD_GROUP_REQ = 63;
	public static final int EMS_S2_ADD_GROUP_ACK = 64;
	public static final int EMS_S2_DELETE_GROUP_REQ = 65;
	public static final int EMS_S2_DELETE_GROUP_ACK = 66;
	public static final int EMS_S2_RENAME_GROUP_REQ = 67;
	public static final int EMS_S2_RENAME_GROUP_ACK = 68;
	public static final int EMS_S2_MOVE_FRIEND_TO_GROUP_REQ = 69;
	public static final int EMS_S2_MOVE_FRIEND_TO_GROUP_ACK = 70;
	public static final int EMS_S2_SET_EMOTICON_REQ = 71;
	public static final int EMS_S2_SET_EMOTICON_ACK = 72;
	public static final int EMS_S2_START_CHAT_REQ = 73;
	public static final int EMS_S2_START_CHAT_ACK = 74;
	public static final int EMS_S2_START_CHAT_NOT = 75;
	public static final int EMS_S2_LEAVE_CHAT_MEMBER_REQ = 76;
	public static final int EMS_S2_LEAVE_CHAT_MEMBER_ACK = 77;
	public static final int EMS_S2_LEAVE_CHAT_MEMBER_NOT = 78;
	public static final int EMS_S2_SEND_CHAT_REQ = 79;
	public static final int EMS_S2_SEND_CHAT_NOT = 80;
	public static final int EMS_S2_INVITE_CHAT_MEMBER_REQ = 81;
	public static final int EMS_S2_INVITE_CHAT_MEMBER_ACK = 82;
	public static final int EMS_S2_UPDATE_CHAT_MEMBER_NOT = 83;
	public static final int EMS_S2_UPDATE_MY_CHAT_COUNT_NOT = 84;
	public static final int EMS_S2_UPDATE_GUILD_MEMBER_REQ = 85;
	public static final int EMS_S2_UPDATE_GUILD_MEMBER_NOT = 86;
	public static final int EMS_S2_AUTO_GUILD_MESSAGE_REQ = 87;
	public static final int EMS_S2_AUTO_GUILD_MESSAGE_NOT = 88;
	public static final int EMS_S2_SEND_PAPER_REQ = 89;
	public static final int EMS_S2_SEND_PAPER_ACK = 90;
	public static final int EMS_S2_NEW_PAPER_NOT = 91;
	public static final int EMS_S2_PAPERBOX_FULL_NOT = 92;
	public static final int EMS_S2_LOAD_SENT_PAPERBOX_REQ = 93;
	public static final int EMS_S2_UPDATE_SENT_PAPERBOX_NOT = 94;
	public static final int EMS_S2_LOAD_RECV_PAPERBOX_REQ = 95;
	public static final int EMS_S2_UPDATE_RECV_PAPERBOX_NOT = 96;
	public static final int EMS_S2_NOCHANGE_SENT_PAPERBOX_NOT = 97;
	public static final int EMS_S2_NOCHANGE_RECV_PAPERBOX_NOT = 98;
	public static final int EMS_S2_READ_PAPER_REQ = 99;
	public static final int EMS_S2_READ_PAPER_ACK = 100;
	public static final int EMS_S2_DEL_SENT_PAPER_REQ = 101;
	public static final int EMS_S2_DEL_SENT_PAPER_ACK = 102;
	public static final int EMS_S2_DEL_RECV_PAPER_REQ = 103;
	public static final int EMS_S2_DEL_RECV_PAPER_ACK = 104;
	public static final int EMS_S2_SEAL_PAPER_REQ = 105;
	public static final int EMS_S2_SEAL_PAPER_ACK = 106;
	public static final int EMS_S2_NOT_CONNECT_NOT = 107;
	public static final int EMS_S2_ADD_FRIEND_FORCE_REQ = 108;
	public static final int EMS_S2_ADD_FRIEND_FORCE_ACK = 109;
	public static final int EMS_S2_ADD_FRIEND_FORCE_NOT = 110;
	public static final int EMS_S2_LOGOUT_LOG_NOT = 111;
	public static final int EMS_ADD_GUILD_MEMBER_LIST_REQ = 112;
	public static final int EMS_ADD_GUILD_MEMBER_LIST_ACK = 113;
	public static final int EMS_DEL_GUILD_MEMBER_LIST_REQ = 114;
	public static final int EMS_DEL_GUILD_MEMBER_LIST_ACK = 115;
	public static final int EMS_GUILD_ALL_MEMBER_LIST_REQ = 116;
	public static final int EMS_GUILD_ALL_MEMBER_LIST_ACK = 117;
	public static final int EVENT_EVENTID_SENTINEL = 118;
}
