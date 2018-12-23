package application;



import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Play {
	final static String WORDS[]= 
		{
			"abyss","abate","acquiesce","affable","affliction",
			"affluent","agitate","ambiguous","annex","aqueous",
			"arduous","aroma","atone","avarice","bellicose",
			"calisthenics","captor","concoct","dangle","deprive",
			"diligent","disrobe","docile","doleful","drought",
			"dubious","dumbfound","efface","enchant","endeavor",
			"endorse","enthral","exploit","extensive","extol",
			"flimsy","fraud","gaudy","ghastly","grumble","harass",
			"heretic","impediment","indigenous",
			"insatiate","intrepid","irate","jeopardy","leash","liaison","loaf",
			"lucrative","lustrous","malign","muddle","mend","mirth","nausea",
			"neglect","nocturnal","obese","obsolete","perch","pervade",
			"petulant","pillage","presumptuous","quashed","quenching",
			"refurbished","rejoicing","retocent","reverberate","rigor",
			"rotundity","salvage","shatter","shunned","sketchy","sporadic",
			"stiled","strive","subsequent","succumb","taciturn","tantalize",
			"tentative","torpid","treacherous","tremor","tyro","uproar",
			"vanity","vehemence","vigilance","vindicate","voluptuous","wan","wile","wrinkle"
			
		};
	
	final static String GAPS[][]= {
			{"a_ys_","_b_ss","a__ss"},
			{"ab_t_","_b_te","__ate"},
			{"ac_u__sce","a_qu___ce","a_q_i_sce"},
			{"a__able","_ffab_e","af_a_le"},
			{"a___ic_ion","_f_l_cti_n","_ffli_t_on"},
			{"a__lu_nt","af__u_nt","_ff_u_nt"},
			{"ag_t_te","_gi__te","a_i_a_e"},
			{"a_b_gu_u_","am_i_g__us","_m_i_uo_s"},
			{"_nn_x","an__x","an_e_"},
			{"aqu_o_s","a_u_ous","_q_eo_s"},
			{"ar__o_s","_r_uo_us","a_du_u_"},
			{"ar_ma","a_o_a","a_oma"},
			{"_to_e","_t_ne","at__e"},
			{"a__ri_e","a_ar_ce","a_a_ic"},
			{"be__icose","bel__co_e","b_ll_co_e"},
			{"cal__the_i_s","c_lis_h_nic_","cal___he_ics"},
			{"c_pt_r","_ap__r","c_p__r"},
			{"co_c_ct","c__co_t","con_o_t"},
			{"d_ngl_","d__gle","_a_gle"},
			{"_ep_i_e","d_pr_v_","d_p_i_e"},
			{"d_l_ge_t","di_ig_nt","_i_ige_t"},
			{"d_s_ob_","di_r_be","d_sr_be"},
			{"d_ci_e","d_ci_e","_o_ile"},
			{"_o_efu_","do_ef_l","d_l_f_l"},
			{"dr_u_ht","_r_ug_t","d__ug_t"},
			{"d_b_o_s","du_io_s","_u_i_us"},
			{"du_b_ou_d","du__f_un_","_u_b_oun_"},
			{"ef_a_e","_f_ac_","e__ac_"},
			{"e_c__nt","e_ch_nt","e__ha_t"},
			{"e_de_vo_","e__ea_or","_n_e_o_"},
			{"e_dor_e","_nd__se","en_o_s_"},
			{"e_thr_l","_nt__al","en_h__l"},
			{"_x_lo_t","ex_l__t","__plo_t"},
			{"_xten_iv_","e_t__si_e","__ten_i_e"},
			{"e_to_","e_t_l","_xt_l"},
			{"fl_ms_","f_im_y","fl_m_y"},
			{"f__ud","_r_ud","fr_u_"},
			{"g_u_y","_a_dy","g_ud_"},
			{"gh_s_ly","g_a_tl_","g_a_t_y"},
			{"_ru_bl_","gr_mb_e","g_um_le"},
			{"h_ras_","_ar_ss","_ar_ss"},
			{"h_re_i_","he_e_ic","_er_tic"},
			{"i_pe_im_nt","_mp_di_en_","im__d_me_t"},
			{"_nd__en_us","i_d_ge_ou_","_nd_gen___s"},
			{"i_s_t_ate","_ns_tia_e","i_s_ti_te"},
			{"i_t_ep_d","_n_r_pid","i_t__pi_"},
			{"_ra_e","i_a_e","i_r_t_"},
			{"_eo_a_dy","j_op_rd_","j_o_a_dy"},
			{"_ea_h","l_as_","l_a_h"},
			{"li_is_n","_ia_so_","l_ai_on"},
			{"lo_f","l_af","l_a_"},
			{"l_cr__i_e","l_c_at_ve","l_cr_t_ve"},
			{"l_s_ro_s","lu_t_ou_","l_s_rou_"},
			{"mal__n","m_l_gn","_al_gn"},
			{"m_d_le","mu_d_e","m_dd_e"},
			{"me_d","_en_","m_n_"},
			{"m_rt_","_ir_h","m_r_h"},
			{"_au_e_","n_us_a","n_u_se_"},
			{"n_gl_ct","_eg_ec_","n_g_ec_"},
			{"no_t_r_al","_oc_ur_al","n_c_t_r_n__"},
			{"ob__e","o__se","o_e_e"},
			{"ob_ol_t_","__so_ete","o_s_le_e"},
			{"pe__h","p_rc_","p_rc_"},
			{"p_rva__","_erv__e","p_r_a_e"},
			{"pe__la_t","p_t_l_nt","pe_u_an_"},
			{"p_l__ge","p_ll_ge","p_l_ag_"},
			{"pre_um__uo_s","_re_um_tu_us","pr_s_m_pt__us"},
			{"_uas__d","q_as_ed","q_ash_d"},
			{"q_en__ing","_uen_hin_","qu_n__in_"},
			{"r__urbi__ed","r_fu_bi_he_","re_u_b_sh_d"},
			{"r__oi_ing","rej__ci_g","r_jo_c_ng"},
			{"_et__en_","r_t_ce_t","re_oc_nt"},
			{"_ev__ber_te","r_ve_b_r__e","r_v_rb_ra_e"},
			{"r_g_r","_ig_r","r_g_r"},
			{"r_tu__it_","r_tun_i_y","r_t_ndi_y"},
			{"s_lv_g_","_a_vage","s_lv_ge"},
			{"s__tt_r","s_att_r","sh_t_er"},
			{"sh_nn__","s_u_n_d","shu__ed"},
			{"s_et_h_","s_et_hy","s_e_ch_"},
			{"sp_ra_ic","s_or_di_","sp_r_d_c"},
			{"s_ile_","s_i_le_","st_led"},
			{"st_iv_","_t_iv_","s_ri_e"},
			{"su_se_ue_t","s_bs_q__nt","s_b_eq_en_"},
			{"su_cum_","_uc_u_b","s_cc_m_"},
			{"tac_t__n","_ac_t_rn","t_c_tu_n"},
			{"ta_ta_i_e","_an_al_ze","t_n_a_iz_"},
			{"te_ta__ve","_en_a__ve","t_n_at_ve"},
			{"t_rp_d","t_r_id","_or_id"},
			{"tr__ch__ous","t_ech_r_us","_r_ch_ro_s"},
			{"tr_m_r","t_em_r","t_em_r"},
			{"t_r_","_yr_","t__o"},
			{"u_r_ar","u_ro_r","u_r_ar"},
			{"va_i_y","_an_t_","v_n_ty"},
			{"v__eme_ce","_ehe_en_e","_eh_eme_ce"},
			{"vig_la__e","","v_g_lan_e"},
			{"v_nd_c__e","_in_ic_te","v__d_cate"},
			{"v_lu_t__us","_ol_pt__us","vo_up_uo_s"},
			{"wa_","_an","w_n"},
			{"w_le","w_l_","_il_"},
			{"wr_nk_e","w_in_le","_ri_k_e"},
					 };
	
	static boolean GOTIT[] = new boolean[100];
	static Text show = new Text("");
	
	static TextField t1 = new TextField();
	static boolean t=false;
	static Scene scene;
	static int r;
	static int score;
	static Text showRightorWrong = new Text(" ");
	
	public static void display(Stage window,Scene scene1) {
		for(int i=0;i<100;i++)
		{
			GOTIT[i]=false;
		}
		window.setTitle("Guess.............");
		show.setStyle("-fx-font: 24 arial");
		show.minHeight(50);
		showRightorWrong.setText(" ");
		
		Button check = new Button("Check");
	    Button goback = new Button("Menu");
		VBox vbox = new VBox();
		VBox vbox2 = new VBox();
		//VBox vbox3 = new VBox();
		score=0;
		Text showScore = new Text("\t Score:     " + score);
		showScore.setStyle("-fx-font: 14 calibri");
		
		
		vbox2.getChildren().addAll(showScore,showRightorWrong);
		vbox.getChildren().addAll(show,t1,check,goback);
		vbox.setAlignment(Pos.CENTER);
		vbox2.setAlignment(Pos.TOP_RIGHT);
	
		vbox.setSpacing(4);
		BorderPane pane = new BorderPane();
		pane.setTop(vbox2);
		pane.setCenter(vbox);
		
		
		//ASHOL KAAJ MAMA!
			 r = TextUpdate(show);
		check.setOnAction(e->
			{
					verifies(r,t1);
					t1.clear();
					r=TextUpdate(show);
					
					showScore.setText("\t Score:     " + score);
					if(HighScore.getScore()==100 | score==100)
				 		GAMEOVER.display(window);
			});
			
		
		goback.setOnAction(e->
							{window.setScene(scene1);
							 window.setTitle("Spelling Game");
							});
				
		scene = new Scene(pane,300,300);
		window.setScene(scene);
		
		
	}
	
	private static int TextUpdate(Text show)
	{
		
		int first = randomgap1();
		show.setText(GAPS[first][randomgap2()]);
		return first;
	}
	
	
	
	private static void verifies(int firstindex,TextField t1)
	{
		String input = t1.getText();
		
		//FINALLY I CAN ACCESS THIS !!!!
		if(input.equals(WORDS[firstindex]))
		{
			GOTIT[firstindex] = true;
			if(score>=HighScore.getScore())
				HighScore.increase();	
			score++;
			showRightorWrong.setFill(Color.CADETBLUE);;
			showRightorWrong.setText("Right!\t");
			showRightorWrong.setStyle("-fx-font: 15 arial");
			
			
		}
		
		else {
			GOTIT[firstindex]=false;
			showRightorWrong.setFill(Color.RED);
			showRightorWrong.setText("Wrong!\t");
			showRightorWrong.setStyle("-fx-font: 15 arial");
		
		}
	}
	
/*	private static boolean checkgotit() {
		for(int i=0;i<100;i++)
		{
			if(GOTIT[i]==false)
				return false;
		}
		return true;
	}
*/
	
	private static int randomgap1() 
	{
		int random=(int)(Math.random()*100);
		while((random>99 || random<0) || GOTIT[random]==true)
		{
			random=(int)(Math.random()*10);
		}
		/*int random = 0;
		while(GOTIT[random]==true)
		{
			
			random++;
		}*/
		
		return random;
	}
	
	private static int randomgap2()
	{
		int random=(int)(Math.random()*10);
		while(random>2 || random<0)
		{
			random=(int)(Math.random()*10);
		}
		return random;
	}
	

}
