FROM reg.vip.blibee.com/customization/w_idss_display_cristina_gray-prod:latest
RUN mv /home/w/www/default.wormpex.com_prod/ DEPLOY_PATH && touch /RSYNC_FILE_MD5 
    && mv /home/w/tools_prod /home/w/tools 
COPY * RSYNC_DST/ 
