#!/bin/bash

LOG_DIR="/var/log/myapp"
MAX_LOG_SIZE="5000000"  # 5MB
MAX_LOG_AGE=30           # 30 days

rotate_logs() {
    for log_file in "$LOG_DIR"/*.log; do
        if [[ $(stat -c %s "$log_file") -gt $MAX_LOG_SIZE ]]; then
            mv "$log_file" "${log_file}.$(date '+%Y%m%d_%H%M%S')"
            gzip "${log_file}.$(date '+%Y%m%d_%H%M%S')"
            echo "Rotated log: $log_file"
        fi
    done
}

clean_old_logs() {
    find "$LOG_DIR" -name "*.gz" -mtime +$MAX_LOG_AGE -exec rm {} \;
    echo "Cleaned up old logs"
}

rotate_logs
clean_old_logs
